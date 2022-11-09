// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_nvme_tcp.proto

package opi_api.storage.v1;

public interface NVMfRemoteControllerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.NVMfRemoteController)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>.opi_api.storage.v1.NvmeTransportType trtype = 2;</code>
   * @return The enum numeric value on the wire for trtype.
   */
  int getTrtypeValue();
  /**
   * <code>.opi_api.storage.v1.NvmeTransportType trtype = 2;</code>
   * @return The trtype.
   */
  opi_api.storage.v1.NvmeTransportType getTrtype();

  /**
   * <code>.opi_api.storage.v1.NvmeAddressFamily adrfam = 3;</code>
   * @return The enum numeric value on the wire for adrfam.
   */
  int getAdrfamValue();
  /**
   * <code>.opi_api.storage.v1.NvmeAddressFamily adrfam = 3;</code>
   * @return The adrfam.
   */
  opi_api.storage.v1.NvmeAddressFamily getAdrfam();

  /**
   * <code>string traddr = 4;</code>
   * @return The traddr.
   */
  java.lang.String getTraddr();
  /**
   * <code>string traddr = 4;</code>
   * @return The bytes for traddr.
   */
  com.google.protobuf.ByteString
      getTraddrBytes();

  /**
   * <code>int64 trsvcid = 5;</code>
   * @return The trsvcid.
   */
  long getTrsvcid();

  /**
   * <code>string subnqn = 6;</code>
   * @return The subnqn.
   */
  java.lang.String getSubnqn();
  /**
   * <code>string subnqn = 6;</code>
   * @return The bytes for subnqn.
   */
  com.google.protobuf.ByteString
      getSubnqnBytes();

  /**
   * <code>bool hdgst = 7;</code>
   * @return The hdgst.
   */
  boolean getHdgst();

  /**
   * <code>bool ddgst = 8;</code>
   * @return The ddgst.
   */
  boolean getDdgst();

  /**
   * <code>.opi_api.storage.v1.NvmeMultipath multipath = 9;</code>
   * @return The enum numeric value on the wire for multipath.
   */
  int getMultipathValue();
  /**
   * <code>.opi_api.storage.v1.NvmeMultipath multipath = 9;</code>
   * @return The multipath.
   */
  opi_api.storage.v1.NvmeMultipath getMultipath();

  /**
   * <code>int64 io_queues_count = 10;</code>
   * @return The ioQueuesCount.
   */
  long getIoQueuesCount();

  /**
   * <code>int64 queue_size = 11;</code>
   * @return The queueSize.
   */
  long getQueueSize();
}