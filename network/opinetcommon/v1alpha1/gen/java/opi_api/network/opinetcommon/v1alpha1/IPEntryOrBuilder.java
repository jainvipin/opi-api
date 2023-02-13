// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: networktypes.proto

package opi_api.network.opinetcommon.v1alpha1;

public interface IPEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.opinetcommon.v1alpha1.IPEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * IP prefix
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix prefix = 1;</code>
   * @return Whether the prefix field is set.
   */
  boolean hasPrefix();
  /**
   * <pre>
   * IP prefix
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix prefix = 1;</code>
   * @return The prefix.
   */
  opi_api.network.opinetcommon.v1alpha1.IPPrefix getPrefix();
  /**
   * <pre>
   * IP prefix
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix prefix = 1;</code>
   */
  opi_api.network.opinetcommon.v1alpha1.IPPrefixOrBuilder getPrefixOrBuilder();

  /**
   * <pre>
   * IP range
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.AddressRange range = 2;</code>
   * @return Whether the range field is set.
   */
  boolean hasRange();
  /**
   * <pre>
   * IP range
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.AddressRange range = 2;</code>
   * @return The range.
   */
  opi_api.network.opinetcommon.v1alpha1.AddressRange getRange();
  /**
   * <pre>
   * IP range
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.AddressRange range = 2;</code>
   */
  opi_api.network.opinetcommon.v1alpha1.AddressRangeOrBuilder getRangeOrBuilder();

  /**
   * <pre>
   * tag that represents IP addres/pfx/range, range:1-4294967294
   * </pre>
   *
   * <code>int32 tag = 3;</code>
   * @return Whether the tag field is set.
   */
  boolean hasTag();
  /**
   * <pre>
   * tag that represents IP addres/pfx/range, range:1-4294967294
   * </pre>
   *
   * <code>int32 tag = 3;</code>
   * @return The tag.
   */
  int getTag();

  public opi_api.network.opinetcommon.v1alpha1.IPEntry.IpEntryCase getIpEntryCase();
}