// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: port.proto

package opi_api.network.cloud.v1alpha1;

/**
 * <pre>
 * Forward Error Correction
 * </pre>
 *
 * Protobuf enum {@code opi_api.network.cloud.v1alpha1.PortFecType}
 */
public enum PortFecType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Disable FEC
   * </pre>
   *
   * <code>PORT_FEC_TYPE_UNSPECIFIED = 0;</code>
   */
  PORT_FEC_TYPE_UNSPECIFIED(0),
  /**
   * <pre>
   * FireCode (FC) FEC
   * </pre>
   *
   * <code>PORT_FEC_TYPE_FC = 1;</code>
   */
  PORT_FEC_TYPE_FC(1),
  /**
   * <pre>
   * ReedSolomon (RS) FEC
   * </pre>
   *
   * <code>PORT_FEC_TYPE_RS = 2;</code>
   */
  PORT_FEC_TYPE_RS(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Disable FEC
   * </pre>
   *
   * <code>PORT_FEC_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int PORT_FEC_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * FireCode (FC) FEC
   * </pre>
   *
   * <code>PORT_FEC_TYPE_FC = 1;</code>
   */
  public static final int PORT_FEC_TYPE_FC_VALUE = 1;
  /**
   * <pre>
   * ReedSolomon (RS) FEC
   * </pre>
   *
   * <code>PORT_FEC_TYPE_RS = 2;</code>
   */
  public static final int PORT_FEC_TYPE_RS_VALUE = 2;


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
  public static PortFecType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PortFecType forNumber(int value) {
    switch (value) {
      case 0: return PORT_FEC_TYPE_UNSPECIFIED;
      case 1: return PORT_FEC_TYPE_FC;
      case 2: return PORT_FEC_TYPE_RS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PortFecType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PortFecType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PortFecType>() {
          public PortFecType findValueByNumber(int number) {
            return PortFecType.forNumber(number);
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
    return opi_api.network.cloud.v1alpha1.PortProto.getDescriptor().getEnumTypes().get(8);
  }

  private static final PortFecType[] VALUES = values();

  public static PortFecType valueOf(
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

  private PortFecType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:opi_api.network.cloud.v1alpha1.PortFecType)
}

