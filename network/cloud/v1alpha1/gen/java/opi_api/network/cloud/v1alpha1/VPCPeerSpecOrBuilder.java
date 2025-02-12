// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vpc.proto

package opi_api.network.cloud.v1alpha1;

public interface VPCPeerSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.VPCPeerSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * unique key/identifier of VPC1
   * </pre>
   *
   * <code>string vpc1_name_ref = 1;</code>
   * @return The vpc1NameRef.
   */
  java.lang.String getVpc1NameRef();
  /**
   * <pre>
   * unique key/identifier of VPC1
   * </pre>
   *
   * <code>string vpc1_name_ref = 1;</code>
   * @return The bytes for vpc1NameRef.
   */
  com.google.protobuf.ByteString
      getVpc1NameRefBytes();

  /**
   * <pre>
   * unique key/identifier of VPC2
   * </pre>
   *
   * <code>string vpc2_name_ref = 2;</code>
   * @return The vpc2NameRef.
   */
  java.lang.String getVpc2NameRef();
  /**
   * <pre>
   * unique key/identifier of VPC2
   * </pre>
   *
   * <code>string vpc2_name_ref = 2;</code>
   * @return The bytes for vpc2NameRef.
   */
  com.google.protobuf.ByteString
      getVpc2NameRefBytes();
}
