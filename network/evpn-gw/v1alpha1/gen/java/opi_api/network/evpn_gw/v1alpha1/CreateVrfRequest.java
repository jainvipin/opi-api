// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: l3_xpu_infra_mgr.proto

package opi_api.network.evpn_gw.v1alpha1;

/**
 * <pre>
 * CreateVrfRequest structure
 * </pre>
 *
 * Protobuf type {@code opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest}
 */
public final class CreateVrfRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest)
    CreateVrfRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateVrfRequest.newBuilder() to construct.
  private CreateVrfRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateVrfRequest() {
    vrfId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateVrfRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateVrfRequest(
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
            java.lang.String s = input.readStringRequireUtf8();

            vrfId_ = s;
            break;
          }
          case 18: {
            opi_api.network.evpn_gw.v1alpha1.Vrf.Builder subBuilder = null;
            if (vrf_ != null) {
              subBuilder = vrf_.toBuilder();
            }
            vrf_ = input.readMessage(opi_api.network.evpn_gw.v1alpha1.Vrf.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(vrf_);
              vrf_ = subBuilder.buildPartial();
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
    return opi_api.network.evpn_gw.v1alpha1.L3XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_CreateVrfRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.evpn_gw.v1alpha1.L3XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_CreateVrfRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest.class, opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest.Builder.class);
  }

  public static final int VRF_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object vrfId_;
  /**
   * <pre>
   * The ID to use for the vrf, which will become the final component of
   * the vrf's resource name.
   * This value should be 4-63 characters, and valid characters
   * are /[a-z][0-9]-/.
   * If this is not provided the system will auto-generate it.
   * </pre>
   *
   * <code>string vrf_id = 1;</code>
   * @return The vrfId.
   */
  @java.lang.Override
  public java.lang.String getVrfId() {
    java.lang.Object ref = vrfId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      vrfId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The ID to use for the vrf, which will become the final component of
   * the vrf's resource name.
   * This value should be 4-63 characters, and valid characters
   * are /[a-z][0-9]-/.
   * If this is not provided the system will auto-generate it.
   * </pre>
   *
   * <code>string vrf_id = 1;</code>
   * @return The bytes for vrfId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVrfIdBytes() {
    java.lang.Object ref = vrfId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      vrfId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VRF_FIELD_NUMBER = 2;
  private opi_api.network.evpn_gw.v1alpha1.Vrf vrf_;
  /**
   * <pre>
   * The vrf to create
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.Vrf vrf = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the vrf field is set.
   */
  @java.lang.Override
  public boolean hasVrf() {
    return vrf_ != null;
  }
  /**
   * <pre>
   * The vrf to create
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.Vrf vrf = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The vrf.
   */
  @java.lang.Override
  public opi_api.network.evpn_gw.v1alpha1.Vrf getVrf() {
    return vrf_ == null ? opi_api.network.evpn_gw.v1alpha1.Vrf.getDefaultInstance() : vrf_;
  }
  /**
   * <pre>
   * The vrf to create
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.Vrf vrf = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public opi_api.network.evpn_gw.v1alpha1.VrfOrBuilder getVrfOrBuilder() {
    return getVrf();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vrfId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, vrfId_);
    }
    if (vrf_ != null) {
      output.writeMessage(2, getVrf());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vrfId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, vrfId_);
    }
    if (vrf_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getVrf());
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
    if (!(obj instanceof opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest)) {
      return super.equals(obj);
    }
    opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest other = (opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest) obj;

    if (!getVrfId()
        .equals(other.getVrfId())) return false;
    if (hasVrf() != other.hasVrf()) return false;
    if (hasVrf()) {
      if (!getVrf()
          .equals(other.getVrf())) return false;
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
    hash = (37 * hash) + VRF_ID_FIELD_NUMBER;
    hash = (53 * hash) + getVrfId().hashCode();
    if (hasVrf()) {
      hash = (37 * hash) + VRF_FIELD_NUMBER;
      hash = (53 * hash) + getVrf().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest parseFrom(
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
  public static Builder newBuilder(opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest prototype) {
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
   * CreateVrfRequest structure
   * </pre>
   *
   * Protobuf type {@code opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest)
      opi_api.network.evpn_gw.v1alpha1.CreateVrfRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.evpn_gw.v1alpha1.L3XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_CreateVrfRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.evpn_gw.v1alpha1.L3XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_CreateVrfRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest.class, opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest.Builder.class);
    }

    // Construct using opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest.newBuilder()
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
      vrfId_ = "";

      if (vrfBuilder_ == null) {
        vrf_ = null;
      } else {
        vrf_ = null;
        vrfBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.evpn_gw.v1alpha1.L3XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_CreateVrfRequest_descriptor;
    }

    @java.lang.Override
    public opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest getDefaultInstanceForType() {
      return opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest build() {
      opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest buildPartial() {
      opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest result = new opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest(this);
      result.vrfId_ = vrfId_;
      if (vrfBuilder_ == null) {
        result.vrf_ = vrf_;
      } else {
        result.vrf_ = vrfBuilder_.build();
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
      if (other instanceof opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest) {
        return mergeFrom((opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest other) {
      if (other == opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest.getDefaultInstance()) return this;
      if (!other.getVrfId().isEmpty()) {
        vrfId_ = other.vrfId_;
        onChanged();
      }
      if (other.hasVrf()) {
        mergeVrf(other.getVrf());
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
      opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object vrfId_ = "";
    /**
     * <pre>
     * The ID to use for the vrf, which will become the final component of
     * the vrf's resource name.
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * If this is not provided the system will auto-generate it.
     * </pre>
     *
     * <code>string vrf_id = 1;</code>
     * @return The vrfId.
     */
    public java.lang.String getVrfId() {
      java.lang.Object ref = vrfId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        vrfId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The ID to use for the vrf, which will become the final component of
     * the vrf's resource name.
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * If this is not provided the system will auto-generate it.
     * </pre>
     *
     * <code>string vrf_id = 1;</code>
     * @return The bytes for vrfId.
     */
    public com.google.protobuf.ByteString
        getVrfIdBytes() {
      java.lang.Object ref = vrfId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        vrfId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The ID to use for the vrf, which will become the final component of
     * the vrf's resource name.
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * If this is not provided the system will auto-generate it.
     * </pre>
     *
     * <code>string vrf_id = 1;</code>
     * @param value The vrfId to set.
     * @return This builder for chaining.
     */
    public Builder setVrfId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      vrfId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID to use for the vrf, which will become the final component of
     * the vrf's resource name.
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * If this is not provided the system will auto-generate it.
     * </pre>
     *
     * <code>string vrf_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearVrfId() {
      
      vrfId_ = getDefaultInstance().getVrfId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID to use for the vrf, which will become the final component of
     * the vrf's resource name.
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * If this is not provided the system will auto-generate it.
     * </pre>
     *
     * <code>string vrf_id = 1;</code>
     * @param value The bytes for vrfId to set.
     * @return This builder for chaining.
     */
    public Builder setVrfIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      vrfId_ = value;
      onChanged();
      return this;
    }

    private opi_api.network.evpn_gw.v1alpha1.Vrf vrf_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.evpn_gw.v1alpha1.Vrf, opi_api.network.evpn_gw.v1alpha1.Vrf.Builder, opi_api.network.evpn_gw.v1alpha1.VrfOrBuilder> vrfBuilder_;
    /**
     * <pre>
     * The vrf to create
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.Vrf vrf = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the vrf field is set.
     */
    public boolean hasVrf() {
      return vrfBuilder_ != null || vrf_ != null;
    }
    /**
     * <pre>
     * The vrf to create
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.Vrf vrf = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The vrf.
     */
    public opi_api.network.evpn_gw.v1alpha1.Vrf getVrf() {
      if (vrfBuilder_ == null) {
        return vrf_ == null ? opi_api.network.evpn_gw.v1alpha1.Vrf.getDefaultInstance() : vrf_;
      } else {
        return vrfBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The vrf to create
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.Vrf vrf = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setVrf(opi_api.network.evpn_gw.v1alpha1.Vrf value) {
      if (vrfBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        vrf_ = value;
        onChanged();
      } else {
        vrfBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The vrf to create
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.Vrf vrf = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setVrf(
        opi_api.network.evpn_gw.v1alpha1.Vrf.Builder builderForValue) {
      if (vrfBuilder_ == null) {
        vrf_ = builderForValue.build();
        onChanged();
      } else {
        vrfBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The vrf to create
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.Vrf vrf = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeVrf(opi_api.network.evpn_gw.v1alpha1.Vrf value) {
      if (vrfBuilder_ == null) {
        if (vrf_ != null) {
          vrf_ =
            opi_api.network.evpn_gw.v1alpha1.Vrf.newBuilder(vrf_).mergeFrom(value).buildPartial();
        } else {
          vrf_ = value;
        }
        onChanged();
      } else {
        vrfBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The vrf to create
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.Vrf vrf = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearVrf() {
      if (vrfBuilder_ == null) {
        vrf_ = null;
        onChanged();
      } else {
        vrf_ = null;
        vrfBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The vrf to create
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.Vrf vrf = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.network.evpn_gw.v1alpha1.Vrf.Builder getVrfBuilder() {
      
      onChanged();
      return getVrfFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The vrf to create
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.Vrf vrf = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.network.evpn_gw.v1alpha1.VrfOrBuilder getVrfOrBuilder() {
      if (vrfBuilder_ != null) {
        return vrfBuilder_.getMessageOrBuilder();
      } else {
        return vrf_ == null ?
            opi_api.network.evpn_gw.v1alpha1.Vrf.getDefaultInstance() : vrf_;
      }
    }
    /**
     * <pre>
     * The vrf to create
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.Vrf vrf = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.evpn_gw.v1alpha1.Vrf, opi_api.network.evpn_gw.v1alpha1.Vrf.Builder, opi_api.network.evpn_gw.v1alpha1.VrfOrBuilder> 
        getVrfFieldBuilder() {
      if (vrfBuilder_ == null) {
        vrfBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.network.evpn_gw.v1alpha1.Vrf, opi_api.network.evpn_gw.v1alpha1.Vrf.Builder, opi_api.network.evpn_gw.v1alpha1.VrfOrBuilder>(
                getVrf(),
                getParentForChildren(),
                isClean());
        vrf_ = null;
      }
      return vrfBuilder_;
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


    // @@protoc_insertion_point(builder_scope:opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest)
  private static final opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest();
  }

  public static opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateVrfRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateVrfRequest>() {
    @java.lang.Override
    public CreateVrfRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateVrfRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateVrfRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateVrfRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
