// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: openconfig_interfaces.proto

package opi_api.network.v1alpha1;

public interface UpdateNetInterfaceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.v1alpha1.UpdateNetInterfaceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Interface update settings
   * </pre>
   *
   * <code>.opi_api.network.v1alpha1.NetInterface net_interface = 1;</code>
   * @return Whether the netInterface field is set.
   */
  boolean hasNetInterface();
  /**
   * <pre>
   * Interface update settings
   * </pre>
   *
   * <code>.opi_api.network.v1alpha1.NetInterface net_interface = 1;</code>
   * @return The netInterface.
   */
  opi_api.network.v1alpha1.NetInterface getNetInterface();
  /**
   * <pre>
   * Interface update settings
   * </pre>
   *
   * <code>.opi_api.network.v1alpha1.NetInterface net_interface = 1;</code>
   */
  opi_api.network.v1alpha1.NetInterfaceOrBuilder getNetInterfaceOrBuilder();

  /**
   * <pre>
   * list of fields to update
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * list of fields to update
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * list of fields to update
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}