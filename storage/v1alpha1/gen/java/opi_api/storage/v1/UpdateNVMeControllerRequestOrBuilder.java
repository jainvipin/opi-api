// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_nvme_pcie.proto

package opi_api.storage.v1;

public interface UpdateNVMeControllerRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.UpdateNVMeControllerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.opi_api.storage.v1.NVMeController nv_me_controller = 1;</code>
   * @return Whether the nvMeController field is set.
   */
  boolean hasNvMeController();
  /**
   * <code>.opi_api.storage.v1.NVMeController nv_me_controller = 1;</code>
   * @return The nvMeController.
   */
  opi_api.storage.v1.NVMeController getNvMeController();
  /**
   * <code>.opi_api.storage.v1.NVMeController nv_me_controller = 1;</code>
   */
  opi_api.storage.v1.NVMeControllerOrBuilder getNvMeControllerOrBuilder();

  /**
   * <pre>
   * The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}