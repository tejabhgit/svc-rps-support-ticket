package com.hp.rps.svc.supportticket.services;

import com.example.grpc.server.grpcserver.AddTicketRequest;
import com.example.grpc.server.grpcserver.CategoryGrpc;
import com.example.grpc.server.grpcserver.DeleteTicketRequest;
import com.example.grpc.server.grpcserver.FindAllTicketsRequest;
import com.example.grpc.server.grpcserver.GetTicketByIdRequest;
import com.example.grpc.server.grpcserver.MetaInfoGrpc;
import com.example.grpc.server.grpcserver.PageableGrpc;
import com.example.grpc.server.grpcserver.TicketContentGrpc;
import com.example.grpc.server.grpcserver.UpdateOneTicketByIDRequest;
import com.hp.rps.svc.supportticket.config.JaegerConfiguration;
import com.hp.rps.svc.supportticket.errorhandling.custom.RecordNotFoundException;
import com.hp.rps.svc.supportticket.errorhandling.custom.ValidationFailedException;
import com.hp.rps.svc.supportticket.model.Category;
import com.hp.rps.svc.supportticket.model.MetaInfo;
import com.hp.rps.svc.supportticket.model.Ticket;
import com.hp.rps.svc.supportticket.repository.TicketRepository;
import com.hp.rps.svc.supportticket.util.CommonUtil;
import io.micrometer.core.annotation.Timed;
import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.Tracer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@Service
public class TicketService {

    private TicketRepository ticketRepository;
    private static final String INSTRUMENTATION_LIBRARY = " com.hp.rps.svc.supportticket.services.TicketService";


    @Autowired
    public void TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public TicketListResponse getPagedTicketResponse(FindAllTicketsRequest request) {
        Page<Ticket> pagedResult = null;
        //validations
        /*if (!TicketServiceValidator.validateFindAllRequest(request)) {
            throw new ValidationFailedException("validation exception sortBy parm cannot be null");
        }*/

        pagedResult = findAllPagedResponse(request, pagedResult);
        if (pagedResult.isEmpty()) {
            throw new RecordNotFoundException("No Records Found");
        }
        var pageableGrpc = PageableGrpc.newBuilder()
                .setLast(pagedResult.isLast())
                .setTotalElements(pagedResult.getTotalElements())
                .setTotalPages(pagedResult.getTotalPages())
                .setNumberOfElements(pagedResult.getNumberOfElements())
                .setFirst(pagedResult.isFirst())
                .setNumber(pagedResult.getNumber())
                .setEmpty(pagedResult.isEmpty()).build();

        List<TicketContentGrpc.Builder> listTicketResponse = new ArrayList<TicketContentGrpc.Builder>();
        List<Ticket> listTicketPage = pagedResult.getContent();
        listTicketPage.stream().filter(Objects::nonNull)
                .map(ticketPage -> {
                    TicketContentGrpc.Builder ticketContentGrpc = buildTicketResponse(ticketPage);
                    listTicketResponse.add(ticketContentGrpc);
                    return listTicketResponse;
                })
                .collect(Collectors.toList());
        TicketListResponse ticketListResponse = TicketListResponse.builder()
                .pageableGrpc(pageableGrpc)
                .TicketContentList(listTicketResponse)
                .build();
        return ticketListResponse;
    }

    public TicketContentGrpc.Builder getTicketById(GetTicketByIdRequest request) {
        log.info("Fetching Ticket by Ticket id : {} or support Ticket id: {}", request.getId(), request.getSupportTicketId());
        var ticket = findByRequest(CommonUtil.nullCheckUuid(request.getId()), request.getSupportTicketId()).orElseThrow(RecordNotFoundException::new);
        TicketContentGrpc.Builder ticketContentGrpc = buildTicketResponse(ticket);
        return ticketContentGrpc;
    }

    public void addTicket(AddTicketRequest request) {
        log.info("Creating a Support Ticket resource {}", request.getDeviceId());
        OpenTelemetry openTelemetry = JaegerConfiguration.initOpenTelemetry("localhost", 14250);
        Tracer tracer = openTelemetry.getTracer(INSTRUMENTATION_LIBRARY);
        Span span = tracer.spanBuilder("Start my wonderful use case").startSpan();
        log.info("TraceID : {}", span.getSpanContext().getTraceIdAsHexString());
        log.info("SpanId : {}", span.getSpanContext().getSpanIdAsHexString());
       span.addEvent("Event 0");
        doWork();
        span.addEvent("Event 1");
        span.end();
        myWonderfulUseCase();
        var ticket = buildTicketEntity(request);
        insert(ticket);
        log.info("Successfully added a Support Ticket resource {}", ticket.getId().toString());
    }

    @Timed
    public void deleteTicket(DeleteTicketRequest request) {
        log.info("Deleting Ticket by Ticket id : {}", request.getId());
        //log.info("Creating a Support Ticket resource {}", request.getDeviceId());
        OpenTelemetry openTelemetry = JaegerConfiguration.initOpenTelemetry("localhost", 14250);
        Tracer tracer = openTelemetry.getTracer(INSTRUMENTATION_LIBRARY);
        Span span = tracer.spanBuilder("Start my wonderful use case").startSpan();
        log.info("TraceID : {}", span.getSpanContext().getTraceIdAsHexString());
        log.info("SpanId : {}", span.getSpanContext().getSpanIdAsHexString());
        span.addEvent("Event 0");
        doWork();
        span.addEvent("Event 1");
        span.end();
        myWonderfulUseCase();
        deleteTicket(CommonUtil.nullCheckUuid(request.getId()));
    }

    public TicketContentGrpc.Builder buildTicketResponse(Ticket ticket) {
        CategoryGrpc.Builder categoryGrpc = CategoryGrpc.newBuilder();
        MetaInfoGrpc.Builder metaInfoGrpc = MetaInfoGrpc.newBuilder();

        if (Objects.nonNull(ticket.getCategory())) {
            Optional.ofNullable(ticket.getCategory().getName()).ifPresent(categoryGrpc::setName);
            Optional.ofNullable(ticket.getCategory().getDescription()).ifPresent(categoryGrpc::setDescription);
            categoryGrpc.build();
        }
        if (Objects.nonNull(ticket.getMetaInfo())) {
            Optional.ofNullable(ticket.getMetaInfo().getCreatedDate()).ifPresent(createDt -> metaInfoGrpc.setCreatedDate(createDt.toString()));
            Optional.ofNullable(ticket.getMetaInfo().getIssueOpened()).ifPresent(issDt -> metaInfoGrpc.setIssueOpened(issDt.toString()));
            Optional.ofNullable(ticket.getMetaInfo().getLastModifiedDate()).ifPresent(lstMdDt -> metaInfoGrpc.setLastModifiedDate(lstMdDt.toString()));
            Optional.ofNullable(ticket.getMetaInfo().getDeletedDate()).ifPresent(delDte -> metaInfoGrpc.setDeletedDate(delDte.toString()));
            Optional.ofNullable(ticket.getMetaInfo().getCreatedBy()).ifPresent(crtBy -> metaInfoGrpc.setCreatedBy(crtBy.toString()));
            Optional.ofNullable(ticket.getMetaInfo().getLastModifiedBy()).ifPresent(lstModBy -> metaInfoGrpc.setLastModifiedBy(lstModBy.toString()));
            Optional.ofNullable(ticket.getMetaInfo().getDeletedBy()).ifPresent(delBy -> metaInfoGrpc.setDeletedBy(delBy.toString()));
            Optional.ofNullable(ticket.getMetaInfo().getIssueClosed()).ifPresent(issClDt -> metaInfoGrpc.setIssueClosed(issClDt.toString()));
           // metaInfoGrpc.setVersion(ticket.getMetaInfo().getVersion());
            metaInfoGrpc.build();
        }
        TicketContentGrpc.Builder ticketResponseGrpc = TicketContentGrpc.newBuilder();
        Optional.ofNullable(ticket.getId().toString()).ifPresent(ticketResponseGrpc::setId);
        Optional.ofNullable(ticket.getCurrentAgentUserId().toString()).ifPresent(ticketResponseGrpc::setCurrentAgentUserId);
        Optional.ofNullable(ticket.getDeviceId().toString()).ifPresent(ticketResponseGrpc::setDeviceId);

        if (Objects.nonNull(ticket.getCategory())) {
            ticketResponseGrpc.setCategory(categoryGrpc);
        }
        if (Objects.nonNull(ticket.getMetaInfo())) {
            ticketResponseGrpc.setMetaInfo(metaInfoGrpc);
        }
        Optional.ofNullable(ticket.getState()).ifPresent(ticketResponseGrpc::setState);
        Optional.ofNullable(ticket.getState()).ifPresent(ticketResponseGrpc::setDescription);
        Optional.ofNullable(ticket.getDescription()).ifPresent(ticketResponseGrpc::setSupportTicketId);
        ticketResponseGrpc.build();
        return ticketResponseGrpc;
    }

    private Ticket buildTicketEntity(AddTicketRequest request) {
        MetaInfo metaInfo = MetaInfo.builder()
                .build();

        var category = Category.builder()
                .description(request.getDescription())
                .name(request.getCategory()).build();
        var ticket = Ticket.builder()
                .supportTicketId(CommonUtil.generateIncrementalNumber())
                .description("Ticket Support is being worked_HARDCODED")
                .state("Active_HARDCODED")
                .deviceId(CommonUtil.nullCheckUuid(request.getDeviceId()))
                .currentAgentUserId(CommonUtil.nullCheckUuid("d4db0a66-c1f9-4005-99d4-83d79a17fe9f"))
                .metaInfo(metaInfo)
                .category(category)
                .build();
        return ticket;
    }

    public void updateTicket(UpdateOneTicketByIDRequest request) {
            log.info("Fetching Ticket by Ticket id : {} or support Ticket id: {}", request.getTicket().getId(), request.getTicket().getSupportTicketId());
            var ticketDtoResponse = findByRequest(CommonUtil.nullCheckUuid(request.getTicket().getId()), request.getTicket().getSupportTicketId()).orElseThrow(RecordNotFoundException::new);
            mapRequestToResponseAndUpdateTicket(request, ticketDtoResponse);
    }

    private void mapRequestToResponseAndUpdateTicket(UpdateOneTicketByIDRequest request, Ticket ticketDtoResponse) {
        Ticket.TicketBuilder ticket = Ticket.builder();
}


    public Optional<Ticket> findByRequest(UUID uuid, String supportTicketId){
        return ticketRepository.findByIdOrSupportTicketId(uuid, supportTicketId);
    }

    public void insert(Ticket ticket){
        ticketRepository.save(ticket);
    }

    public void update(Ticket ticket){
        ticketRepository.save(ticket);
    }

    public void deleteTicket(UUID uuid) {
        ticketRepository.deleteById(uuid);
    }

    public Page<Ticket> findAllPagedResponse(FindAllTicketsRequest request, Page<Ticket> pagedResult) {
        var paging = PageRequest.of(request.getPage(), request.getSize(), Sort.by(request.getSortBy()));
        pagedResult = Objects.nonNull(paging) ? ticketRepository.findAll(paging) : ticketRepository.findAll(Pageable.unpaged());
        return pagedResult;
    }

    public List<Ticket> getAllByExample(Ticket ticket){
        var example = Example.of(ticket);
        return ticketRepository.findAll(example);
    }


    private void myWonderfulUseCase() {
        // Generate a span

    }

    private void doWork() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // do the right thing here
        }
    }
}