// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: l3_xpu_infra_mgr.proto

package opi_api.network.evpn_gw.v1alpha1;

/**
 * <pre>
 * CreateSviRequest structure
 * </pre>
 *
 * Protobuf type {@code opi_api.network.evpn_gw.v1alpha1.CreateSviRequest}
 */
public final class CreateSviRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.evpn_gw.v1alpha1.CreateSviRequest)
    CreateSviRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateSviRequest.newBuilder() to construct.
  private CreateSviRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateSviRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateSviRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateSviRequest(
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
            opi_api.network.evpn_gw.v1alpha1.Svi.Builder subBuilder = null;
            if (svi_ != null) {
              subBuilder = svi_.toBuilder();
            }
            svi_ = input.readMessage(opi_api.network.evpn_gw.v1alpha1.Svi.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(svi_);
              svi_ = subBuilder.buildPartial();
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
    return opi_api.network.evpn_gw.v1alpha1.L3XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_CreateSviRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.evpn_gw.v1alpha1.L3XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_CreateSviRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.evpn_gw.v1alpha1.CreateSviRequest.class, opi_api.network.evpn_gw.v1alpha1.CreateSviRequest.Builder.class);
  }

  public static final int SVI_FIELD_NUMBER = 1;
  private opi_api.network.evpn_gw.v1alpha1.Svi svi_;
  /**
   * <pre>
   * The Svi to create
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.Svi svi = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the svi field is set.
   */
  @java.lang.Override
  public boolean hasSvi() {
    return svi_ != null;
  }
  /**
   * <pre>
   * The Svi to create
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.Svi svi = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The svi.
   */
  @java.lang.Override
  public opi_api.network.evpn_gw.v1alpha1.Svi getSvi() {
    return svi_ == null ? opi_api.network.evpn_gw.v1alpha1.Svi.getDefaultInstance() : svi_;
  }
  /**
   * <pre>
   * The Svi to create
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.Svi svi = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public opi_api.network.evpn_gw.v1alpha1.SviOrBuilder getSviOrBuilder() {
    return getSvi();
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
    if (svi_ != null) {
      output.writeMessage(1, getSvi());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (svi_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSvi());
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
    if (!(obj instanceof opi_api.network.evpn_gw.v1alpha1.CreateSviRequest)) {
      return super.equals(obj);
    }
    opi_api.network.evpn_gw.v1alpha1.CreateSviRequest other = (opi_api.network.evpn_gw.v1alpha1.CreateSviRequest) obj;

    if (hasSvi() != other.hasSvi()) return false;
    if (hasSvi()) {
      if (!getSvi()
          .equals(other.getSvi())) return false;
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
    if (hasSvi()) {
      hash = (37 * hash) + SVI_FIELD_NUMBER;
      hash = (53 * hash) + getSvi().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.evpn_gw.v1alpha1.CreateSviRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.evpn_gw.v1alpha1.CreateSviRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.CreateSviRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.evpn_gw.v1alpha1.CreateSviRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.CreateSviRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.evpn_gw.v1alpha1.CreateSviRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.CreateSviRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.evpn_gw.v1alpha1.CreateSviRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.CreateSviRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.evpn_gw.v1alpha1.CreateSviRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.CreateSviRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.evpn_gw.v1alpha1.CreateSviRequest parseFrom(
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
  public static Builder newBuilder(opi_api.network.evpn_gw.v1alpha1.CreateSviRequest prototype) {
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
   * CreateSviRequest structure
   * </pre>
   *
   * Protobuf type {@code opi_api.network.evpn_gw.v1alpha1.CreateSviRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.evpn_gw.v1alpha1.CreateSviRequest)
      opi_api.network.evpn_gw.v1alpha1.CreateSviRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.evpn_gw.v1alpha1.L3XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_CreateSviRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.evpn_gw.v1alpha1.L3XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_CreateSviRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.evpn_gw.v1alpha1.CreateSviRequest.class, opi_api.network.evpn_gw.v1alpha1.CreateSviRequest.Builder.class);
    }

    // Construct using opi_api.network.evpn_gw.v1alpha1.CreateSviRequest.newBuilder()
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
      if (sviBuilder_ == null) {
        svi_ = null;
      } else {
        svi_ = null;
        sviBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.evpn_gw.v1alpha1.L3XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_CreateSviRequest_descriptor;
    }

    @java.lang.Override
    public opi_api.network.evpn_gw.v1alpha1.CreateSviRequest getDefaultInstanceForType() {
      return opi_api.network.evpn_gw.v1alpha1.CreateSviRequest.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.evpn_gw.v1alpha1.CreateSviRequest build() {
      opi_api.network.evpn_gw.v1alpha1.CreateSviRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.evpn_gw.v1alpha1.CreateSviRequest buildPartial() {
      opi_api.network.evpn_gw.v1alpha1.CreateSviRequest result = new opi_api.network.evpn_gw.v1alpha1.CreateSviRequest(this);
      if (sviBuilder_ == null) {
        result.svi_ = svi_;
      } else {
        result.svi_ = sviBuilder_.build();
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
      if (other instanceof opi_api.network.evpn_gw.v1alpha1.CreateSviRequest) {
        return mergeFrom((opi_api.network.evpn_gw.v1alpha1.CreateSviRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.evpn_gw.v1alpha1.CreateSviRequest other) {
      if (other == opi_api.network.evpn_gw.v1alpha1.CreateSviRequest.getDefaultInstance()) return this;
      if (other.hasSvi()) {
        mergeSvi(other.getSvi());
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
      opi_api.network.evpn_gw.v1alpha1.CreateSviRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.evpn_gw.v1alpha1.CreateSviRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private opi_api.network.evpn_gw.v1alpha1.Svi svi_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.evpn_gw.v1alpha1.Svi, opi_api.network.evpn_gw.v1alpha1.Svi.Builder, opi_api.network.evpn_gw.v1alpha1.SviOrBuilder> sviBuilder_;
    /**
     * <pre>
     * The Svi to create
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.Svi svi = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the svi field is set.
     */
    public boolean hasSvi() {
      return sviBuilder_ != null || svi_ != null;
    }
    /**
     * <pre>
     * The Svi to create
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.Svi svi = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The svi.
     */
    public opi_api.network.evpn_gw.v1alpha1.Svi getSvi() {
      if (sviBuilder_ == null) {
        return svi_ == null ? opi_api.network.evpn_gw.v1alpha1.Svi.getDefaultInstance() : svi_;
      } else {
        return sviBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The Svi to create
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.Svi svi = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSvi(opi_api.network.evpn_gw.v1alpha1.Svi value) {
      if (sviBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        svi_ = value;
        onChanged();
      } else {
        sviBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The Svi to create
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.Svi svi = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSvi(
        opi_api.network.evpn_gw.v1alpha1.Svi.Builder builderForValue) {
      if (sviBuilder_ == null) {
        svi_ = builderForValue.build();
        onChanged();
      } else {
        sviBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The Svi to create
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.Svi svi = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeSvi(opi_api.network.evpn_gw.v1alpha1.Svi value) {
      if (sviBuilder_ == null) {
        if (svi_ != null) {
          svi_ =
            opi_api.network.evpn_gw.v1alpha1.Svi.newBuilder(svi_).mergeFrom(value).buildPartial();
        } else {
          svi_ = value;
        }
        onChanged();
      } else {
        sviBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The Svi to create
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.Svi svi = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearSvi() {
      if (sviBuilder_ == null) {
        svi_ = null;
        onChanged();
      } else {
        svi_ = null;
        sviBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The Svi to create
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.Svi svi = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.network.evpn_gw.v1alpha1.Svi.Builder getSviBuilder() {
      
      onChanged();
      return getSviFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The Svi to create
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.Svi svi = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.network.evpn_gw.v1alpha1.SviOrBuilder getSviOrBuilder() {
      if (sviBuilder_ != null) {
        return sviBuilder_.getMessageOrBuilder();
      } else {
        return svi_ == null ?
            opi_api.network.evpn_gw.v1alpha1.Svi.getDefaultInstance() : svi_;
      }
    }
    /**
     * <pre>
     * The Svi to create
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.Svi svi = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.evpn_gw.v1alpha1.Svi, opi_api.network.evpn_gw.v1alpha1.Svi.Builder, opi_api.network.evpn_gw.v1alpha1.SviOrBuilder> 
        getSviFieldBuilder() {
      if (sviBuilder_ == null) {
        sviBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.network.evpn_gw.v1alpha1.Svi, opi_api.network.evpn_gw.v1alpha1.Svi.Builder, opi_api.network.evpn_gw.v1alpha1.SviOrBuilder>(
                getSvi(),
                getParentForChildren(),
                isClean());
        svi_ = null;
      }
      return sviBuilder_;
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


    // @@protoc_insertion_point(builder_scope:opi_api.network.evpn_gw.v1alpha1.CreateSviRequest)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.evpn_gw.v1alpha1.CreateSviRequest)
  private static final opi_api.network.evpn_gw.v1alpha1.CreateSviRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.evpn_gw.v1alpha1.CreateSviRequest();
  }

  public static opi_api.network.evpn_gw.v1alpha1.CreateSviRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateSviRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateSviRequest>() {
    @java.lang.Override
    public CreateSviRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateSviRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateSviRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateSviRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.evpn_gw.v1alpha1.CreateSviRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

