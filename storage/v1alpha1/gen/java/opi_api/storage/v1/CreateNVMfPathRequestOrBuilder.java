// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_nvme_tcp.proto

package opi_api.storage.v1;

public interface CreateNVMfPathRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.CreateNVMfPathRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.opi_api.storage.v1.NVMfPath nv_mf_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the nvMfPath field is set.
   */
  boolean hasNvMfPath();
  /**
   * <code>.opi_api.storage.v1.NVMfPath nv_mf_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The nvMfPath.
   */
  opi_api.storage.v1.NVMfPath getNvMfPath();
  /**
   * <code>.opi_api.storage.v1.NVMfPath nv_mf_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  opi_api.storage.v1.NVMfPathOrBuilder getNvMfPathOrBuilder();

  /**
   * <code>string nv_mf_path_id = 2;</code>
   * @return The nvMfPathId.
   */
  java.lang.String getNvMfPathId();
  /**
   * <code>string nv_mf_path_id = 2;</code>
   * @return The bytes for nvMfPathId.
   */
  com.google.protobuf.ByteString
      getNvMfPathIdBytes();
}