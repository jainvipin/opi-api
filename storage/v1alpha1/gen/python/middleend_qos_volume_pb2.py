# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: middleend_qos_volume.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


import opicommon_pb2 as opicommon__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1amiddleend_qos_volume.proto\x12\x12opi_api.storage.v1\x1a\x0fopicommon.proto\x1a\x17google/api/client.proto\x1a\x19google/api/resource.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a google/protobuf/field_mask.proto\"\xfb\x01\n\tQosVolume\x12\x35\n\x04name\x18\x01 \x01(\tB\'\xe0\x41\x03\xe0\x41\x05\xfa\x41\x1e\n\x1copi_api.storage.v1/QosVolume\x12\x1c\n\x0fvolume_name_ref\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12/\n\tmin_limit\x18\x03 \x01(\x0b\x32\x1c.opi_api.storage.v1.QosLimit\x12/\n\tmax_limit\x18\x04 \x01(\x0b\x32\x1c.opi_api.storage.v1.QosLimit:7\xea\x41\x34\n storage.opiproject.org/QosVolume\x12\x10volumes/{volume}\"g\n\x16\x43reateQosVolumeRequest\x12\x36\n\nqos_volume\x18\x01 \x01(\x0b\x32\x1d.opi_api.storage.v1.QosVolumeB\x03\xe0\x41\x02\x12\x15\n\rqos_volume_id\x18\x02 \x01(\t\"c\n\x16\x44\x65leteQosVolumeRequest\x12\x32\n\x04name\x18\x01 \x01(\tB$\xe0\x41\x02\xfa\x41\x1e\n\x1copi_api.storage.v1/QosVolume\x12\x15\n\rallow_missing\x18\x02 \x01(\x08\"\x93\x01\n\x16UpdateQosVolumeRequest\x12\x31\n\nqos_volume\x18\x01 \x01(\x0b\x32\x1d.opi_api.storage.v1.QosVolume\x12/\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12\x15\n\rallow_missing\x18\x03 \x01(\x08\"t\n\x15ListQosVolumesRequest\x12\x34\n\x06parent\x18\x01 \x01(\tB$\xe0\x41\x02\xfa\x41\x1e\n\x1copi_api.storage.v1/QosVolume\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\"e\n\x16ListQosVolumesResponse\x12\x32\n\x0bqos_volumes\x18\x01 \x03(\x0b\x32\x1d.opi_api.storage.v1.QosVolume\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"I\n\x13GetQosVolumeRequest\x12\x32\n\x04name\x18\x01 \x01(\tB$\xe0\x41\x02\xfa\x41\x1e\n\x1copi_api.storage.v1/QosVolume\"K\n\x15StatsQosVolumeRequest\x12\x32\n\x04name\x18\x01 \x01(\tB$\xe0\x41\x02\xfa\x41\x1e\n\x1copi_api.storage.v1/QosVolume\"H\n\x16StatsQosVolumeResponse\x12.\n\x05stats\x18\x01 \x01(\x0b\x32\x1f.opi_api.storage.v1.VolumeStats2\x8c\x07\n\x19MiddleendQosVolumeService\x12\x98\x01\n\x0f\x43reateQosVolume\x12*.opi_api.storage.v1.CreateQosVolumeRequest\x1a\x1d.opi_api.storage.v1.QosVolume\":\x82\xd3\xe4\x93\x02\x19\"\x0b/v1/volumes:\nqos_volume\xda\x41\x18qos_volume,qos_volume_id\x12}\n\x0f\x44\x65leteQosVolume\x12*.opi_api.storage.v1.DeleteQosVolumeRequest\x1a\x16.google.protobuf.Empty\"&\x82\xd3\xe4\x93\x02\x19*\x17/v1/{name=QosVolumes/*}\xda\x41\x04name\x12\xab\x01\n\x0fUpdateQosVolume\x12*.opi_api.storage.v1.UpdateQosVolumeRequest\x1a\x1d.opi_api.storage.v1.QosVolume\"M\x82\xd3\xe4\x93\x02.2 /v1/{qos_volume.name=subsystems}:\nqos_volume\xda\x41\x16qos_volume,update_mask\x12\x8e\x01\n\x0eListQosVolumes\x12).opi_api.storage.v1.ListQosVolumesRequest\x1a*.opi_api.storage.v1.ListQosVolumesResponse\"%\x82\xd3\xe4\x93\x02\x16\x12\x14/v1/{parent=volumes}\xda\x41\x06parent\x12~\n\x0cGetQosVolume\x12\'.opi_api.storage.v1.GetQosVolumeRequest\x1a\x1d.opi_api.storage.v1.QosVolume\"&\x82\xd3\xe4\x93\x02\x19\x12\x17/v1/{name=QosVolumes/*}\xda\x41\x04name\x12\x95\x01\n\x0eStatsQosVolume\x12).opi_api.storage.v1.StatsQosVolumeRequest\x1a*.opi_api.storage.v1.StatsQosVolumeResponse\",\x82\xd3\xe4\x93\x02\x1f\x12\x1d/v1/{name=QosVolumes/*}:stats\xda\x41\x04nameBf\n\x12opi_api.storage.v1B\x17MiddleendQosVolumeProtoP\x01Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/gob\x06proto3')



_QOSVOLUME = DESCRIPTOR.message_types_by_name['QosVolume']
_CREATEQOSVOLUMEREQUEST = DESCRIPTOR.message_types_by_name['CreateQosVolumeRequest']
_DELETEQOSVOLUMEREQUEST = DESCRIPTOR.message_types_by_name['DeleteQosVolumeRequest']
_UPDATEQOSVOLUMEREQUEST = DESCRIPTOR.message_types_by_name['UpdateQosVolumeRequest']
_LISTQOSVOLUMESREQUEST = DESCRIPTOR.message_types_by_name['ListQosVolumesRequest']
_LISTQOSVOLUMESRESPONSE = DESCRIPTOR.message_types_by_name['ListQosVolumesResponse']
_GETQOSVOLUMEREQUEST = DESCRIPTOR.message_types_by_name['GetQosVolumeRequest']
_STATSQOSVOLUMEREQUEST = DESCRIPTOR.message_types_by_name['StatsQosVolumeRequest']
_STATSQOSVOLUMERESPONSE = DESCRIPTOR.message_types_by_name['StatsQosVolumeResponse']
QosVolume = _reflection.GeneratedProtocolMessageType('QosVolume', (_message.Message,), {
  'DESCRIPTOR' : _QOSVOLUME,
  '__module__' : 'middleend_qos_volume_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.QosVolume)
  })
_sym_db.RegisterMessage(QosVolume)

CreateQosVolumeRequest = _reflection.GeneratedProtocolMessageType('CreateQosVolumeRequest', (_message.Message,), {
  'DESCRIPTOR' : _CREATEQOSVOLUMEREQUEST,
  '__module__' : 'middleend_qos_volume_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.CreateQosVolumeRequest)
  })
_sym_db.RegisterMessage(CreateQosVolumeRequest)

DeleteQosVolumeRequest = _reflection.GeneratedProtocolMessageType('DeleteQosVolumeRequest', (_message.Message,), {
  'DESCRIPTOR' : _DELETEQOSVOLUMEREQUEST,
  '__module__' : 'middleend_qos_volume_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.DeleteQosVolumeRequest)
  })
_sym_db.RegisterMessage(DeleteQosVolumeRequest)

UpdateQosVolumeRequest = _reflection.GeneratedProtocolMessageType('UpdateQosVolumeRequest', (_message.Message,), {
  'DESCRIPTOR' : _UPDATEQOSVOLUMEREQUEST,
  '__module__' : 'middleend_qos_volume_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.UpdateQosVolumeRequest)
  })
_sym_db.RegisterMessage(UpdateQosVolumeRequest)

ListQosVolumesRequest = _reflection.GeneratedProtocolMessageType('ListQosVolumesRequest', (_message.Message,), {
  'DESCRIPTOR' : _LISTQOSVOLUMESREQUEST,
  '__module__' : 'middleend_qos_volume_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListQosVolumesRequest)
  })
_sym_db.RegisterMessage(ListQosVolumesRequest)

ListQosVolumesResponse = _reflection.GeneratedProtocolMessageType('ListQosVolumesResponse', (_message.Message,), {
  'DESCRIPTOR' : _LISTQOSVOLUMESRESPONSE,
  '__module__' : 'middleend_qos_volume_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListQosVolumesResponse)
  })
_sym_db.RegisterMessage(ListQosVolumesResponse)

GetQosVolumeRequest = _reflection.GeneratedProtocolMessageType('GetQosVolumeRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETQOSVOLUMEREQUEST,
  '__module__' : 'middleend_qos_volume_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.GetQosVolumeRequest)
  })
_sym_db.RegisterMessage(GetQosVolumeRequest)

StatsQosVolumeRequest = _reflection.GeneratedProtocolMessageType('StatsQosVolumeRequest', (_message.Message,), {
  'DESCRIPTOR' : _STATSQOSVOLUMEREQUEST,
  '__module__' : 'middleend_qos_volume_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.StatsQosVolumeRequest)
  })
_sym_db.RegisterMessage(StatsQosVolumeRequest)

StatsQosVolumeResponse = _reflection.GeneratedProtocolMessageType('StatsQosVolumeResponse', (_message.Message,), {
  'DESCRIPTOR' : _STATSQOSVOLUMERESPONSE,
  '__module__' : 'middleend_qos_volume_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.StatsQosVolumeResponse)
  })
_sym_db.RegisterMessage(StatsQosVolumeResponse)

_MIDDLEENDQOSVOLUMESERVICE = DESCRIPTOR.services_by_name['MiddleendQosVolumeService']
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\022opi_api.storage.v1B\027MiddleendQosVolumeProtoP\001Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/go'
  _QOSVOLUME.fields_by_name['name']._options = None
  _QOSVOLUME.fields_by_name['name']._serialized_options = b'\340A\003\340A\005\372A\036\n\034opi_api.storage.v1/QosVolume'
  _QOSVOLUME.fields_by_name['volume_name_ref']._options = None
  _QOSVOLUME.fields_by_name['volume_name_ref']._serialized_options = b'\340A\002'
  _QOSVOLUME._options = None
  _QOSVOLUME._serialized_options = b'\352A4\n storage.opiproject.org/QosVolume\022\020volumes/{volume}'
  _CREATEQOSVOLUMEREQUEST.fields_by_name['qos_volume']._options = None
  _CREATEQOSVOLUMEREQUEST.fields_by_name['qos_volume']._serialized_options = b'\340A\002'
  _DELETEQOSVOLUMEREQUEST.fields_by_name['name']._options = None
  _DELETEQOSVOLUMEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\036\n\034opi_api.storage.v1/QosVolume'
  _LISTQOSVOLUMESREQUEST.fields_by_name['parent']._options = None
  _LISTQOSVOLUMESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\036\n\034opi_api.storage.v1/QosVolume'
  _GETQOSVOLUMEREQUEST.fields_by_name['name']._options = None
  _GETQOSVOLUMEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\036\n\034opi_api.storage.v1/QosVolume'
  _STATSQOSVOLUMEREQUEST.fields_by_name['name']._options = None
  _STATSQOSVOLUMEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\036\n\034opi_api.storage.v1/QosVolume'
  _MIDDLEENDQOSVOLUMESERVICE.methods_by_name['CreateQosVolume']._options = None
  _MIDDLEENDQOSVOLUMESERVICE.methods_by_name['CreateQosVolume']._serialized_options = b'\202\323\344\223\002\031\"\013/v1/volumes:\nqos_volume\332A\030qos_volume,qos_volume_id'
  _MIDDLEENDQOSVOLUMESERVICE.methods_by_name['DeleteQosVolume']._options = None
  _MIDDLEENDQOSVOLUMESERVICE.methods_by_name['DeleteQosVolume']._serialized_options = b'\202\323\344\223\002\031*\027/v1/{name=QosVolumes/*}\332A\004name'
  _MIDDLEENDQOSVOLUMESERVICE.methods_by_name['UpdateQosVolume']._options = None
  _MIDDLEENDQOSVOLUMESERVICE.methods_by_name['UpdateQosVolume']._serialized_options = b'\202\323\344\223\002.2 /v1/{qos_volume.name=subsystems}:\nqos_volume\332A\026qos_volume,update_mask'
  _MIDDLEENDQOSVOLUMESERVICE.methods_by_name['ListQosVolumes']._options = None
  _MIDDLEENDQOSVOLUMESERVICE.methods_by_name['ListQosVolumes']._serialized_options = b'\202\323\344\223\002\026\022\024/v1/{parent=volumes}\332A\006parent'
  _MIDDLEENDQOSVOLUMESERVICE.methods_by_name['GetQosVolume']._options = None
  _MIDDLEENDQOSVOLUMESERVICE.methods_by_name['GetQosVolume']._serialized_options = b'\202\323\344\223\002\031\022\027/v1/{name=QosVolumes/*}\332A\004name'
  _MIDDLEENDQOSVOLUMESERVICE.methods_by_name['StatsQosVolume']._options = None
  _MIDDLEENDQOSVOLUMESERVICE.methods_by_name['StatsQosVolume']._serialized_options = b'\202\323\344\223\002\037\022\035/v1/{name=QosVolumes/*}:stats\332A\004name'
  _QOSVOLUME._serialized_start=246
  _QOSVOLUME._serialized_end=497
  _CREATEQOSVOLUMEREQUEST._serialized_start=499
  _CREATEQOSVOLUMEREQUEST._serialized_end=602
  _DELETEQOSVOLUMEREQUEST._serialized_start=604
  _DELETEQOSVOLUMEREQUEST._serialized_end=703
  _UPDATEQOSVOLUMEREQUEST._serialized_start=706
  _UPDATEQOSVOLUMEREQUEST._serialized_end=853
  _LISTQOSVOLUMESREQUEST._serialized_start=855
  _LISTQOSVOLUMESREQUEST._serialized_end=971
  _LISTQOSVOLUMESRESPONSE._serialized_start=973
  _LISTQOSVOLUMESRESPONSE._serialized_end=1074
  _GETQOSVOLUMEREQUEST._serialized_start=1076
  _GETQOSVOLUMEREQUEST._serialized_end=1149
  _STATSQOSVOLUMEREQUEST._serialized_start=1151
  _STATSQOSVOLUMEREQUEST._serialized_end=1226
  _STATSQOSVOLUMERESPONSE._serialized_start=1228
  _STATSQOSVOLUMERESPONSE._serialized_end=1300
  _MIDDLEENDQOSVOLUMESERVICE._serialized_start=1303
  _MIDDLEENDQOSVOLUMESERVICE._serialized_end=2211
# @@protoc_insertion_point(module_scope)
