// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rps/types/request/v1/update.proto

package com.rps.types.request.v1;

public final class UpdateProto {
  private UpdateProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rps_types_request_v1_Update_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rps_types_request_v1_Update_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!rps/types/request/v1/update.proto\022\024rps" +
      ".types.request.v1\032\024gogoproto/gogo.proto\"" +
      "\235\001\n\006Update\022\037\n\013update_mask\030\001 \003(\tR\nupdateM" +
      "ask\022#\n\rvalidate_only\030\002 \001(\010R\014validateOnly" +
      "\022,\n\nrequest_id\030\003 \001(\tB\r\342\336\037\tRequestIDR\treq" +
      "uestId\022\037\n\013skip_result\030\004 \001(\010R\nskipResultB" +
      "\257\001\n\030com.rps.types.request.v1B\013UpdateProt" +
      "oP\001ZPgithub.azc.ext.hp.com/hp-rps/api-rp" +
      "s-proto-go/api/rps/types/request/v1;requ" +
      "estv1\242\002\003RTR\252\002\024Rps.Types.Request.V1\312\002\024Rps" +
      "\\Types\\Request\\V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.GoGoProtos.getDescriptor(),
        });
    internal_static_rps_types_request_v1_Update_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_rps_types_request_v1_Update_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rps_types_request_v1_Update_descriptor,
        new java.lang.String[] { "UpdateMask", "ValidateOnly", "RequestId", "SkipResult", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.customname);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
