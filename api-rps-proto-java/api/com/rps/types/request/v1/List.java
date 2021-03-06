// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rps/types/request/v1/list.proto

package com.rps.types.request.v1;

/**
 * <pre>
 * Generic list params inplemented by all CRUD style list methods.
 * </pre>
 *
 * Protobuf type {@code rps.types.request.v1.List}
 */
public final class List extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rps.types.request.v1.List)
    ListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use List.newBuilder() to construct.
  private List(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private List() {
    order_ = "";
    fieldMask_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new List();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private List(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            java.lang.String s = input.readStringRequireUtf8();

            order_ = s;
            break;
          }
          case 16: {

            itemLimit_ = input.readInt64();
            break;
          }
          case 24: {

            pageOffset_ = input.readInt64();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              fieldMask_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            fieldMask_.add(s);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        fieldMask_ = fieldMask_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.rps.types.request.v1.ListProto.internal_static_rps_types_request_v1_List_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.rps.types.request.v1.ListProto.internal_static_rps_types_request_v1_List_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.rps.types.request.v1.List.class, com.rps.types.request.v1.List.Builder.class);
  }

  public static final int ORDER_FIELD_NUMBER = 1;
  private volatile java.lang.Object order_;
  /**
   * <pre>
   * A document that defines the sort order of the result set.
   * Items are by default retuned in the stored order,
   * but it is not guaranteed to be that they are in the inserted order.
   * They are not sorted by the _id field. Sometimes it can be look like it is
   * sorted by the insertion order but it can change in another request. It is not reliable.
   * </pre>
   *
   * <code>string order = 1 [json_name = "order"];</code>
   * @return The order.
   */
  @java.lang.Override
  public java.lang.String getOrder() {
    java.lang.Object ref = order_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      order_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A document that defines the sort order of the result set.
   * Items are by default retuned in the stored order,
   * but it is not guaranteed to be that they are in the inserted order.
   * They are not sorted by the _id field. Sometimes it can be look like it is
   * sorted by the insertion order but it can change in another request. It is not reliable.
   * </pre>
   *
   * <code>string order = 1 [json_name = "order"];</code>
   * @return The bytes for order.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOrderBytes() {
    java.lang.Object ref = order_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      order_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ITEM_LIMIT_FIELD_NUMBER = 2;
  private long itemLimit_;
  /**
   * <pre>
   * Maximum number of items to return.
   * Defaults to 50, Maximum allowed is 50
   * </pre>
   *
   * <code>int64 item_limit = 2 [json_name = "itemLimit"];</code>
   * @return The itemLimit.
   */
  @java.lang.Override
  public long getItemLimit() {
    return itemLimit_;
  }

  public static final int PAGE_OFFSET_FIELD_NUMBER = 3;
  private long pageOffset_;
  /**
   * <pre>
   * Page offset.
   * Defaults to 0
   * </pre>
   *
   * <code>int64 page_offset = 3 [json_name = "pageOffset"];</code>
   * @return The pageOffset.
   */
  @java.lang.Override
  public long getPageOffset() {
    return pageOffset_;
  }

  public static final int FIELD_MASK_FIELD_NUMBER = 4;
  private com.google.protobuf.LazyStringList fieldMask_;
  /**
   * <pre>
   * List of fields to populate from the resource in the result.
   * If empty all fields will be populated.
   * ID is always populated
   * </pre>
   *
   * <code>repeated string field_mask = 4 [json_name = "fieldMask"];</code>
   * @return A list containing the fieldMask.
   */
  public com.google.protobuf.ProtocolStringList
      getFieldMaskList() {
    return fieldMask_;
  }
  /**
   * <pre>
   * List of fields to populate from the resource in the result.
   * If empty all fields will be populated.
   * ID is always populated
   * </pre>
   *
   * <code>repeated string field_mask = 4 [json_name = "fieldMask"];</code>
   * @return The count of fieldMask.
   */
  public int getFieldMaskCount() {
    return fieldMask_.size();
  }
  /**
   * <pre>
   * List of fields to populate from the resource in the result.
   * If empty all fields will be populated.
   * ID is always populated
   * </pre>
   *
   * <code>repeated string field_mask = 4 [json_name = "fieldMask"];</code>
   * @param index The index of the element to return.
   * @return The fieldMask at the given index.
   */
  public java.lang.String getFieldMask(int index) {
    return fieldMask_.get(index);
  }
  /**
   * <pre>
   * List of fields to populate from the resource in the result.
   * If empty all fields will be populated.
   * ID is always populated
   * </pre>
   *
   * <code>repeated string field_mask = 4 [json_name = "fieldMask"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the fieldMask at the given index.
   */
  public com.google.protobuf.ByteString
      getFieldMaskBytes(int index) {
    return fieldMask_.getByteString(index);
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
    if (!getOrderBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, order_);
    }
    if (itemLimit_ != 0L) {
      output.writeInt64(2, itemLimit_);
    }
    if (pageOffset_ != 0L) {
      output.writeInt64(3, pageOffset_);
    }
    for (int i = 0; i < fieldMask_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, fieldMask_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getOrderBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, order_);
    }
    if (itemLimit_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, itemLimit_);
    }
    if (pageOffset_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, pageOffset_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < fieldMask_.size(); i++) {
        dataSize += computeStringSizeNoTag(fieldMask_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getFieldMaskList().size();
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
    if (!(obj instanceof com.rps.types.request.v1.List)) {
      return super.equals(obj);
    }
    com.rps.types.request.v1.List other = (com.rps.types.request.v1.List) obj;

    if (!getOrder()
        .equals(other.getOrder())) return false;
    if (getItemLimit()
        != other.getItemLimit()) return false;
    if (getPageOffset()
        != other.getPageOffset()) return false;
    if (!getFieldMaskList()
        .equals(other.getFieldMaskList())) return false;
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
    hash = (37 * hash) + ORDER_FIELD_NUMBER;
    hash = (53 * hash) + getOrder().hashCode();
    hash = (37 * hash) + ITEM_LIMIT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getItemLimit());
    hash = (37 * hash) + PAGE_OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPageOffset());
    if (getFieldMaskCount() > 0) {
      hash = (37 * hash) + FIELD_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getFieldMaskList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.rps.types.request.v1.List parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rps.types.request.v1.List parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rps.types.request.v1.List parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rps.types.request.v1.List parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rps.types.request.v1.List parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rps.types.request.v1.List parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rps.types.request.v1.List parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.rps.types.request.v1.List parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.rps.types.request.v1.List parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.rps.types.request.v1.List parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.rps.types.request.v1.List parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.rps.types.request.v1.List parseFrom(
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
  public static Builder newBuilder(com.rps.types.request.v1.List prototype) {
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
   * <pre>
   * Generic list params inplemented by all CRUD style list methods.
   * </pre>
   *
   * Protobuf type {@code rps.types.request.v1.List}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rps.types.request.v1.List)
      com.rps.types.request.v1.ListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.rps.types.request.v1.ListProto.internal_static_rps_types_request_v1_List_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.rps.types.request.v1.ListProto.internal_static_rps_types_request_v1_List_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.rps.types.request.v1.List.class, com.rps.types.request.v1.List.Builder.class);
    }

    // Construct using com.rps.types.request.v1.List.newBuilder()
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
      order_ = "";

      itemLimit_ = 0L;

      pageOffset_ = 0L;

      fieldMask_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.rps.types.request.v1.ListProto.internal_static_rps_types_request_v1_List_descriptor;
    }

    @java.lang.Override
    public com.rps.types.request.v1.List getDefaultInstanceForType() {
      return com.rps.types.request.v1.List.getDefaultInstance();
    }

    @java.lang.Override
    public com.rps.types.request.v1.List build() {
      com.rps.types.request.v1.List result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.rps.types.request.v1.List buildPartial() {
      com.rps.types.request.v1.List result = new com.rps.types.request.v1.List(this);
      int from_bitField0_ = bitField0_;
      result.order_ = order_;
      result.itemLimit_ = itemLimit_;
      result.pageOffset_ = pageOffset_;
      if (((bitField0_ & 0x00000001) != 0)) {
        fieldMask_ = fieldMask_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.fieldMask_ = fieldMask_;
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
      if (other instanceof com.rps.types.request.v1.List) {
        return mergeFrom((com.rps.types.request.v1.List)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.rps.types.request.v1.List other) {
      if (other == com.rps.types.request.v1.List.getDefaultInstance()) return this;
      if (!other.getOrder().isEmpty()) {
        order_ = other.order_;
        onChanged();
      }
      if (other.getItemLimit() != 0L) {
        setItemLimit(other.getItemLimit());
      }
      if (other.getPageOffset() != 0L) {
        setPageOffset(other.getPageOffset());
      }
      if (!other.fieldMask_.isEmpty()) {
        if (fieldMask_.isEmpty()) {
          fieldMask_ = other.fieldMask_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureFieldMaskIsMutable();
          fieldMask_.addAll(other.fieldMask_);
        }
        onChanged();
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
      com.rps.types.request.v1.List parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.rps.types.request.v1.List) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object order_ = "";
    /**
     * <pre>
     * A document that defines the sort order of the result set.
     * Items are by default retuned in the stored order,
     * but it is not guaranteed to be that they are in the inserted order.
     * They are not sorted by the _id field. Sometimes it can be look like it is
     * sorted by the insertion order but it can change in another request. It is not reliable.
     * </pre>
     *
     * <code>string order = 1 [json_name = "order"];</code>
     * @return The order.
     */
    public java.lang.String getOrder() {
      java.lang.Object ref = order_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        order_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A document that defines the sort order of the result set.
     * Items are by default retuned in the stored order,
     * but it is not guaranteed to be that they are in the inserted order.
     * They are not sorted by the _id field. Sometimes it can be look like it is
     * sorted by the insertion order but it can change in another request. It is not reliable.
     * </pre>
     *
     * <code>string order = 1 [json_name = "order"];</code>
     * @return The bytes for order.
     */
    public com.google.protobuf.ByteString
        getOrderBytes() {
      java.lang.Object ref = order_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        order_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A document that defines the sort order of the result set.
     * Items are by default retuned in the stored order,
     * but it is not guaranteed to be that they are in the inserted order.
     * They are not sorted by the _id field. Sometimes it can be look like it is
     * sorted by the insertion order but it can change in another request. It is not reliable.
     * </pre>
     *
     * <code>string order = 1 [json_name = "order"];</code>
     * @param value The order to set.
     * @return This builder for chaining.
     */
    public Builder setOrder(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      order_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A document that defines the sort order of the result set.
     * Items are by default retuned in the stored order,
     * but it is not guaranteed to be that they are in the inserted order.
     * They are not sorted by the _id field. Sometimes it can be look like it is
     * sorted by the insertion order but it can change in another request. It is not reliable.
     * </pre>
     *
     * <code>string order = 1 [json_name = "order"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOrder() {
      
      order_ = getDefaultInstance().getOrder();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A document that defines the sort order of the result set.
     * Items are by default retuned in the stored order,
     * but it is not guaranteed to be that they are in the inserted order.
     * They are not sorted by the _id field. Sometimes it can be look like it is
     * sorted by the insertion order but it can change in another request. It is not reliable.
     * </pre>
     *
     * <code>string order = 1 [json_name = "order"];</code>
     * @param value The bytes for order to set.
     * @return This builder for chaining.
     */
    public Builder setOrderBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      order_ = value;
      onChanged();
      return this;
    }

    private long itemLimit_ ;
    /**
     * <pre>
     * Maximum number of items to return.
     * Defaults to 50, Maximum allowed is 50
     * </pre>
     *
     * <code>int64 item_limit = 2 [json_name = "itemLimit"];</code>
     * @return The itemLimit.
     */
    @java.lang.Override
    public long getItemLimit() {
      return itemLimit_;
    }
    /**
     * <pre>
     * Maximum number of items to return.
     * Defaults to 50, Maximum allowed is 50
     * </pre>
     *
     * <code>int64 item_limit = 2 [json_name = "itemLimit"];</code>
     * @param value The itemLimit to set.
     * @return This builder for chaining.
     */
    public Builder setItemLimit(long value) {
      
      itemLimit_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Maximum number of items to return.
     * Defaults to 50, Maximum allowed is 50
     * </pre>
     *
     * <code>int64 item_limit = 2 [json_name = "itemLimit"];</code>
     * @return This builder for chaining.
     */
    public Builder clearItemLimit() {
      
      itemLimit_ = 0L;
      onChanged();
      return this;
    }

    private long pageOffset_ ;
    /**
     * <pre>
     * Page offset.
     * Defaults to 0
     * </pre>
     *
     * <code>int64 page_offset = 3 [json_name = "pageOffset"];</code>
     * @return The pageOffset.
     */
    @java.lang.Override
    public long getPageOffset() {
      return pageOffset_;
    }
    /**
     * <pre>
     * Page offset.
     * Defaults to 0
     * </pre>
     *
     * <code>int64 page_offset = 3 [json_name = "pageOffset"];</code>
     * @param value The pageOffset to set.
     * @return This builder for chaining.
     */
    public Builder setPageOffset(long value) {
      
      pageOffset_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Page offset.
     * Defaults to 0
     * </pre>
     *
     * <code>int64 page_offset = 3 [json_name = "pageOffset"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPageOffset() {
      
      pageOffset_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList fieldMask_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureFieldMaskIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        fieldMask_ = new com.google.protobuf.LazyStringArrayList(fieldMask_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * List of fields to populate from the resource in the result.
     * If empty all fields will be populated.
     * ID is always populated
     * </pre>
     *
     * <code>repeated string field_mask = 4 [json_name = "fieldMask"];</code>
     * @return A list containing the fieldMask.
     */
    public com.google.protobuf.ProtocolStringList
        getFieldMaskList() {
      return fieldMask_.getUnmodifiableView();
    }
    /**
     * <pre>
     * List of fields to populate from the resource in the result.
     * If empty all fields will be populated.
     * ID is always populated
     * </pre>
     *
     * <code>repeated string field_mask = 4 [json_name = "fieldMask"];</code>
     * @return The count of fieldMask.
     */
    public int getFieldMaskCount() {
      return fieldMask_.size();
    }
    /**
     * <pre>
     * List of fields to populate from the resource in the result.
     * If empty all fields will be populated.
     * ID is always populated
     * </pre>
     *
     * <code>repeated string field_mask = 4 [json_name = "fieldMask"];</code>
     * @param index The index of the element to return.
     * @return The fieldMask at the given index.
     */
    public java.lang.String getFieldMask(int index) {
      return fieldMask_.get(index);
    }
    /**
     * <pre>
     * List of fields to populate from the resource in the result.
     * If empty all fields will be populated.
     * ID is always populated
     * </pre>
     *
     * <code>repeated string field_mask = 4 [json_name = "fieldMask"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the fieldMask at the given index.
     */
    public com.google.protobuf.ByteString
        getFieldMaskBytes(int index) {
      return fieldMask_.getByteString(index);
    }
    /**
     * <pre>
     * List of fields to populate from the resource in the result.
     * If empty all fields will be populated.
     * ID is always populated
     * </pre>
     *
     * <code>repeated string field_mask = 4 [json_name = "fieldMask"];</code>
     * @param index The index to set the value at.
     * @param value The fieldMask to set.
     * @return This builder for chaining.
     */
    public Builder setFieldMask(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureFieldMaskIsMutable();
      fieldMask_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of fields to populate from the resource in the result.
     * If empty all fields will be populated.
     * ID is always populated
     * </pre>
     *
     * <code>repeated string field_mask = 4 [json_name = "fieldMask"];</code>
     * @param value The fieldMask to add.
     * @return This builder for chaining.
     */
    public Builder addFieldMask(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureFieldMaskIsMutable();
      fieldMask_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of fields to populate from the resource in the result.
     * If empty all fields will be populated.
     * ID is always populated
     * </pre>
     *
     * <code>repeated string field_mask = 4 [json_name = "fieldMask"];</code>
     * @param values The fieldMask to add.
     * @return This builder for chaining.
     */
    public Builder addAllFieldMask(
        java.lang.Iterable<java.lang.String> values) {
      ensureFieldMaskIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, fieldMask_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of fields to populate from the resource in the result.
     * If empty all fields will be populated.
     * ID is always populated
     * </pre>
     *
     * <code>repeated string field_mask = 4 [json_name = "fieldMask"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFieldMask() {
      fieldMask_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of fields to populate from the resource in the result.
     * If empty all fields will be populated.
     * ID is always populated
     * </pre>
     *
     * <code>repeated string field_mask = 4 [json_name = "fieldMask"];</code>
     * @param value The bytes of the fieldMask to add.
     * @return This builder for chaining.
     */
    public Builder addFieldMaskBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureFieldMaskIsMutable();
      fieldMask_.add(value);
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:rps.types.request.v1.List)
  }

  // @@protoc_insertion_point(class_scope:rps.types.request.v1.List)
  private static final com.rps.types.request.v1.List DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.rps.types.request.v1.List();
  }

  public static com.rps.types.request.v1.List getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<List>
      PARSER = new com.google.protobuf.AbstractParser<List>() {
    @java.lang.Override
    public List parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new List(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<List> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<List> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.rps.types.request.v1.List getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

