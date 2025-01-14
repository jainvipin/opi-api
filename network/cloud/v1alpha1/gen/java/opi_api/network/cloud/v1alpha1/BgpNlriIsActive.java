// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bgp.proto

package opi_api.network.cloud.v1alpha1;

/**
 * <pre>
 * NLRI active values
 * </pre>
 *
 * Protobuf enum {@code opi_api.network.cloud.v1alpha1.BgpNlriIsActive}
 */
public enum BgpNlriIsActive
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * unspecified
   * </pre>
   *
   * <code>BGP_NLRI_IS_ACTIVE_UNSPECIFIED = 0;</code>
   */
  BGP_NLRI_IS_ACTIVE_UNSPECIFIED(0),
  /**
   * <pre>
   * not tracked
   * </pre>
   *
   * <code>BGP_NLRI_IS_ACTIVE_NOT_TRACKED = 1;</code>
   */
  BGP_NLRI_IS_ACTIVE_NOT_TRACKED(1),
  /**
   * <pre>
   * inactive
   * </pre>
   *
   * <code>BGP_NLRI_IS_ACTIVE_INACTIVE = 2;</code>
   */
  BGP_NLRI_IS_ACTIVE_INACTIVE(2),
  /**
   * <pre>
   * active
   * </pre>
   *
   * <code>BGP_NLRI_IS_ACTIVE_ACTIVE = 3;</code>
   */
  BGP_NLRI_IS_ACTIVE_ACTIVE(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * unspecified
   * </pre>
   *
   * <code>BGP_NLRI_IS_ACTIVE_UNSPECIFIED = 0;</code>
   */
  public static final int BGP_NLRI_IS_ACTIVE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * not tracked
   * </pre>
   *
   * <code>BGP_NLRI_IS_ACTIVE_NOT_TRACKED = 1;</code>
   */
  public static final int BGP_NLRI_IS_ACTIVE_NOT_TRACKED_VALUE = 1;
  /**
   * <pre>
   * inactive
   * </pre>
   *
   * <code>BGP_NLRI_IS_ACTIVE_INACTIVE = 2;</code>
   */
  public static final int BGP_NLRI_IS_ACTIVE_INACTIVE_VALUE = 2;
  /**
   * <pre>
   * active
   * </pre>
   *
   * <code>BGP_NLRI_IS_ACTIVE_ACTIVE = 3;</code>
   */
  public static final int BGP_NLRI_IS_ACTIVE_ACTIVE_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static BgpNlriIsActive valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static BgpNlriIsActive forNumber(int value) {
    switch (value) {
      case 0: return BGP_NLRI_IS_ACTIVE_UNSPECIFIED;
      case 1: return BGP_NLRI_IS_ACTIVE_NOT_TRACKED;
      case 2: return BGP_NLRI_IS_ACTIVE_INACTIVE;
      case 3: return BGP_NLRI_IS_ACTIVE_ACTIVE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<BgpNlriIsActive>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      BgpNlriIsActive> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<BgpNlriIsActive>() {
          public BgpNlriIsActive findValueByNumber(int number) {
            return BgpNlriIsActive.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return opi_api.network.cloud.v1alpha1.BGPProto.getDescriptor().getEnumTypes().get(10);
  }

  private static final BgpNlriIsActive[] VALUES = values();

  public static BgpNlriIsActive valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private BgpNlriIsActive(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:opi_api.network.cloud.v1alpha1.BgpNlriIsActive)
}

