// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rps/domains/library/v1/book_api.proto

package com.rps.domains.library.v1;

/**
 * Protobuf type {@code rps.domains.library.v1.UpdateOneBookByIDRequest}
 */
public final class UpdateOneBookByIDRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rps.domains.library.v1.UpdateOneBookByIDRequest)
    UpdateOneBookByIDRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateOneBookByIDRequest.newBuilder() to construct.
  private UpdateOneBookByIDRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateOneBookByIDRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateOneBookByIDRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateOneBookByIDRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.rps.types.request.v1.Update.Builder subBuilder = null;
            if (updateParams_ != null) {
              subBuilder = updateParams_.toBuilder();
            }
            updateParams_ = input.readMessage(com.rps.types.request.v1.Update.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(updateParams_);
              updateParams_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.rps.domains.library.v1.BookApiProto.internal_static_rps_domains_library_v1_UpdateOneBookByIDRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.rps.domains.library.v1.BookApiProto.internal_static_rps_domains_library_v1_UpdateOneBookByIDRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.rps.domains.library.v1.UpdateOneBookByIDRequest.class, com.rps.domains.library.v1.UpdateOneBookByIDRequest.Builder.class);
  }

  public static final int UPDATE_PARAMS_FIELD_NUMBER = 1;
  private com.rps.types.request.v1.Update updateParams_;
  /**
   * <code>.rps.types.request.v1.Update update_params = 1 [json_name = "updateParams"];</code>
   * @return Whether the updateParams field is set.
   */
  @java.lang.Override
  public boolean hasUpdateParams() {
    return updateParams_ != null;
  }
  /**
   * <code>.rps.types.request.v1.Update update_params = 1 [json_name = "updateParams"];</code>
   * @return The updateParams.
   */
  @java.lang.Override
  public com.rps.types.request.v1.Update getUpdateParams() {
    return updateParams_ == null ? com.rps.types.request.v1.Update.getDefaultInstance() : updateParams_;
  }
  /**
   * <code>.rps.types.request.v1.Update update_params = 1 [json_name = "updateParams"];</code>
   */
  @java.lang.Override
  public com.rps.types.request.v1.UpdateOrBuilder getUpdateParamsOrBuilder() {
    return getUpdateParams();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (updateParams_ != null) {
      output.writeMessage(1, getUpdateParams());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (updateParams_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getUpdateParams());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.rps.domains.library.v1.UpdateOneBookByIDRequest)) {
      return super.equals(obj);
    }
    com.rps.domains.library.v1.UpdateOneBookByIDRequest other = (com.rps.domains.library.v1.UpdateOneBookByIDRequest) obj;

    if (hasUpdateParams() != other.hasUpdateParams()) return false;
    if (hasUpdateParams()) {
      if (!getUpdateParams()
          .equals(other.getUpdateParams())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasUpdateParams()) {
      hash = (37 * hash) + UPDATE_PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateParams().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.rps.domains.library.v1.UpdateOneBookByIDRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rps.domains.library.v1.UpdateOneBookByIDRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rps.domains.library.v1.UpdateOneBookByIDRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rps.domains.library.v1.UpdateOneBookByIDRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rps.domains.library.v1.UpdateOneBookByIDRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rps.domains.library.v1.UpdateOneBookByIDRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rps.domains.library.v1.UpdateOneBookByIDRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.rps.domains.library.v1.UpdateOneBookByIDRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.rps.domains.library.v1.UpdateOneBookByIDRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.rps.domains.library.v1.UpdateOneBookByIDRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.rps.domains.library.v1.UpdateOneBookByIDRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.rps.domains.library.v1.UpdateOneBookByIDRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.rps.domains.library.v1.UpdateOneBookByIDRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code rps.domains.library.v1.UpdateOneBookByIDRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rps.domains.library.v1.UpdateOneBookByIDRequest)
      com.rps.domains.library.v1.UpdateOneBookByIDRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.rps.domains.library.v1.BookApiProto.internal_static_rps_domains_library_v1_UpdateOneBookByIDRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.rps.domains.library.v1.BookApiProto.internal_static_rps_domains_library_v1_UpdateOneBookByIDRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.rps.domains.library.v1.UpdateOneBookByIDRequest.class, com.rps.domains.library.v1.UpdateOneBookByIDRequest.Builder.class);
    }

    // Construct using com.rps.domains.library.v1.UpdateOneBookByIDRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (updateParamsBuilder_ == null) {
        updateParams_ = null;
      } else {
        updateParams_ = null;
        updateParamsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.rps.domains.library.v1.BookApiProto.internal_static_rps_domains_library_v1_UpdateOneBookByIDRequest_descriptor;
    }

    @java.lang.Override
    public com.rps.domains.library.v1.UpdateOneBookByIDRequest getDefaultInstanceForType() {
      return com.rps.domains.library.v1.UpdateOneBookByIDRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.rps.domains.library.v1.UpdateOneBookByIDRequest build() {
      com.rps.domains.library.v1.UpdateOneBookByIDRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.rps.domains.library.v1.UpdateOneBookByIDRequest buildPartial() {
      com.rps.domains.library.v1.UpdateOneBookByIDRequest result = new com.rps.domains.library.v1.UpdateOneBookByIDRequest(this);
      if (updateParamsBuilder_ == null) {
        result.updateParams_ = updateParams_;
      } else {
        result.updateParams_ = updateParamsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.rps.domains.library.v1.UpdateOneBookByIDRequest) {
        return mergeFrom((com.rps.domains.library.v1.UpdateOneBookByIDRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.rps.domains.library.v1.UpdateOneBookByIDRequest other) {
      if (other == com.rps.domains.library.v1.UpdateOneBookByIDRequest.getDefaultInstance()) return this;
      if (other.hasUpdateParams()) {
        mergeUpdateParams(other.getUpdateParams());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.rps.domains.library.v1.UpdateOneBookByIDRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.rps.domains.library.v1.UpdateOneBookByIDRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.rps.types.request.v1.Update updateParams_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.rps.types.request.v1.Update, com.rps.types.request.v1.Update.Builder, com.rps.types.request.v1.UpdateOrBuilder> updateParamsBuilder_;
    /**
     * <code>.rps.types.request.v1.Update update_params = 1 [json_name = "updateParams"];</code>
     * @return Whether the updateParams field is set.
     */
    public boolean hasUpdateParams() {
      return updateParamsBuilder_ != null || updateParams_ != null;
    }
    /**
     * <code>.rps.types.request.v1.Update update_params = 1 [json_name = "updateParams"];</code>
     * @return The updateParams.
     */
    public com.rps.types.request.v1.Update getUpdateParams() {
      if (updateParamsBuilder_ == null) {
        return updateParams_ == null ? com.rps.types.request.v1.Update.getDefaultInstance() : updateParams_;
      } else {
        return updateParamsBuilder_.getMessage();
      }
    }
    /**
     * <code>.rps.types.request.v1.Update update_params = 1 [json_name = "updateParams"];</code>
     */
    public Builder setUpdateParams(com.rps.types.request.v1.Update value) {
      if (updateParamsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateParams_ = value;
        onChanged();
      } else {
        updateParamsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.rps.types.request.v1.Update update_params = 1 [json_name = "updateParams"];</code>
     */
    public Builder setUpdateParams(
        com.rps.types.request.v1.Update.Builder builderForValue) {
      if (updateParamsBuilder_ == null) {
        updateParams_ = builderForValue.build();
        onChanged();
      } else {
        updateParamsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.rps.types.request.v1.Update update_params = 1 [json_name = "updateParams"];</code>
     */
    public Builder mergeUpdateParams(com.rps.types.request.v1.Update value) {
      if (updateParamsBuilder_ == null) {
        if (updateParams_ != null) {
          updateParams_ =
            com.rps.types.request.v1.Update.newBuilder(updateParams_).mergeFrom(value).buildPartial();
        } else {
          updateParams_ = value;
        }
        onChanged();
      } else {
        updateParamsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.rps.types.request.v1.Update update_params = 1 [json_name = "updateParams"];</code>
     */
    public Builder clearUpdateParams() {
      if (updateParamsBuilder_ == null) {
        updateParams_ = null;
        onChanged();
      } else {
        updateParams_ = null;
        updateParamsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.rps.types.request.v1.Update update_params = 1 [json_name = "updateParams"];</code>
     */
    public com.rps.types.request.v1.Update.Builder getUpdateParamsBuilder() {
      
      onChanged();
      return getUpdateParamsFieldBuilder().getBuilder();
    }
    /**
     * <code>.rps.types.request.v1.Update update_params = 1 [json_name = "updateParams"];</code>
     */
    public com.rps.types.request.v1.UpdateOrBuilder getUpdateParamsOrBuilder() {
      if (updateParamsBuilder_ != null) {
        return updateParamsBuilder_.getMessageOrBuilder();
      } else {
        return updateParams_ == null ?
            com.rps.types.request.v1.Update.getDefaultInstance() : updateParams_;
      }
    }
    /**
     * <code>.rps.types.request.v1.Update update_params = 1 [json_name = "updateParams"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.rps.types.request.v1.Update, com.rps.types.request.v1.Update.Builder, com.rps.types.request.v1.UpdateOrBuilder> 
        getUpdateParamsFieldBuilder() {
      if (updateParamsBuilder_ == null) {
        updateParamsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.rps.types.request.v1.Update, com.rps.types.request.v1.Update.Builder, com.rps.types.request.v1.UpdateOrBuilder>(
                getUpdateParams(),
                getParentForChildren(),
                isClean());
        updateParams_ = null;
      }
      return updateParamsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:rps.domains.library.v1.UpdateOneBookByIDRequest)
  }

  // @@protoc_insertion_point(class_scope:rps.domains.library.v1.UpdateOneBookByIDRequest)
  private static final com.rps.domains.library.v1.UpdateOneBookByIDRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.rps.domains.library.v1.UpdateOneBookByIDRequest();
  }

  public static com.rps.domains.library.v1.UpdateOneBookByIDRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateOneBookByIDRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateOneBookByIDRequest>() {
    @java.lang.Override
    public UpdateOneBookByIDRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateOneBookByIDRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateOneBookByIDRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateOneBookByIDRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.rps.domains.library.v1.UpdateOneBookByIDRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

