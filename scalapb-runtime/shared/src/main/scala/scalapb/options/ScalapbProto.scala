// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package scalapb.options

object ScalapbProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
    com.google.protobuf.descriptor.DescriptorProtoCompanion
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      scalapb.options.ScalaPbOptions,
      scalapb.options.MessageOptions,
      scalapb.options.FieldOptions,
      scalapb.options.EnumOptions,
      scalapb.options.EnumValueOptions,
      scalapb.options.OneofOptions
    )
  private lazy val ProtoBytes: Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.immutable.Seq(
  """ChVzY2FsYXBiL3NjYWxhcGIucHJvdG8SB3NjYWxhcGIaIGdvb2dsZS9wcm90b2J1Zi9kZXNjcmlwdG9yLnByb3RvIqcKCg5TY
  2FsYVBiT3B0aW9ucxIzCgxwYWNrYWdlX25hbWUYASABKAlCEOI/DRILcGFja2FnZU5hbWVSC3BhY2thZ2VOYW1lEjMKDGZsYXRfc
  GFja2FnZRgCIAEoCEIQ4j8NEgtmbGF0UGFja2FnZVILZmxhdFBhY2thZ2USIwoGaW1wb3J0GAMgAygJQgviPwgSBmltcG9ydFIGa
  W1wb3J0EikKCHByZWFtYmxlGAQgAygJQg3iPwoSCHByZWFtYmxlUghwcmVhbWJsZRIwCgtzaW5nbGVfZmlsZRgFIAEoCEIP4j8ME
  gpzaW5nbGVGaWxlUgpzaW5nbGVGaWxlEkwKFW5vX3ByaW1pdGl2ZV93cmFwcGVycxgHIAEoCEIY4j8VEhNub1ByaW1pdGl2ZVdyY
  XBwZXJzUhNub1ByaW1pdGl2ZVdyYXBwZXJzEkUKEnByaW1pdGl2ZV93cmFwcGVycxgGIAEoCEIW4j8TEhFwcmltaXRpdmVXcmFwc
  GVyc1IRcHJpbWl0aXZlV3JhcHBlcnMSPAoPY29sbGVjdGlvbl90eXBlGAggASgJQhPiPxASDmNvbGxlY3Rpb25UeXBlUg5jb2xsZ
  WN0aW9uVHlwZRJYChdwcmVzZXJ2ZV91bmtub3duX2ZpZWxkcxgJIAEoCDoEdHJ1ZUIa4j8XEhVwcmVzZXJ2ZVVua25vd25GaWVsZ
  HNSFXByZXNlcnZlVW5rbm93bkZpZWxkcxIwCgtvYmplY3RfbmFtZRgKIAEoCUIP4j8MEgpvYmplY3ROYW1lUgpvYmplY3ROYW1lE
  kYKBXNjb3BlGAsgASgOMiQuc2NhbGFwYi5TY2FsYVBiT3B0aW9ucy5PcHRpb25zU2NvcGVCCuI/BxIFc2NvcGVSBXNjb3BlEikKB
  mxlbnNlcxgMIAEoCDoEdHJ1ZUIL4j8IEgZsZW5zZXNSBmxlbnNlcxJQChdyZXRhaW5fc291cmNlX2NvZGVfaW5mbxgNIAEoCEIZ4
  j8WEhRyZXRhaW5Tb3VyY2VDb2RlSW5mb1IUcmV0YWluU291cmNlQ29kZUluZm8SJwoIbWFwX3R5cGUYDiABKAlCDOI/CRIHbWFwV
  HlwZVIHbWFwVHlwZRJpCiBub19kZWZhdWx0X3ZhbHVlc19pbl9jb25zdHJ1Y3RvchgPIAEoCEIh4j8eEhxub0RlZmF1bHRWYWx1Z
  XNJbkNvbnN0cnVjdG9yUhxub0RlZmF1bHRWYWx1ZXNJbkNvbnN0cnVjdG9yEmkKEWVudW1fdmFsdWVfbmFtaW5nGBAgASgOMicuc
  2NhbGFwYi5TY2FsYVBiT3B0aW9ucy5FbnVtVmFsdWVOYW1pbmdCFOI/ERIPZW51bVZhbHVlTmFtaW5nUg9lbnVtVmFsdWVOYW1pb
  mcSRwoRZW51bV9zdHJpcF9wcmVmaXgYESABKAg6BWZhbHNlQhTiPxESD2VudW1TdHJpcFByZWZpeFIPZW51bVN0cmlwUHJlZml4E
  mIKHXRlc3Rfb25seV9ub19qYXZhX2NvbnZlcnNpb25zGKGNBiABKAhCHuI/GxIZdGVzdE9ubHlOb0phdmFDb252ZXJzaW9uc1IZd
  GVzdE9ubHlOb0phdmFDb252ZXJzaW9ucyIlCgxPcHRpb25zU2NvcGUSCAoERklMRRAAEgsKB1BBQ0tBR0UQASIyCg9FbnVtVmFsd
  WVOYW1pbmcSDwoLQVNfSU5fUFJPVE8QABIOCgpDQU1FTF9DQVNFEAEijQMKDk1lc3NhZ2VPcHRpb25zEiYKB2V4dGVuZHMYASADK
  AlCDOI/CRIHZXh0ZW5kc1IHZXh0ZW5kcxJCChFjb21wYW5pb25fZXh0ZW5kcxgCIAMoCUIV4j8SEhBjb21wYW5pb25FeHRlbmRzU
  hBjb21wYW5pb25FeHRlbmRzEjIKC2Fubm90YXRpb25zGAMgAygJQhDiPw0SC2Fubm90YXRpb25zUgthbm5vdGF0aW9ucxIdCgR0e
  XBlGAQgASgJQgniPwYSBHR5cGVSBHR5cGUSTgoVY29tcGFuaW9uX2Fubm90YXRpb25zGAUgAygJQhniPxYSFGNvbXBhbmlvbkFub
  m90YXRpb25zUhRjb21wYW5pb25Bbm5vdGF0aW9ucxJJChRzZWFsZWRfb25lb2ZfZXh0ZW5kcxgGIAMoCUIX4j8UEhJzZWFsZWRPb
  mVvZkV4dGVuZHNSEnNlYWxlZE9uZW9mRXh0ZW5kcxIhCgZub19ib3gYByABKAhCCuI/BxIFbm9Cb3hSBW5vQm94IvICCgxGaWVsZ
  E9wdGlvbnMSHQoEdHlwZRgBIAEoCUIJ4j8GEgR0eXBlUgR0eXBlEi0KCnNjYWxhX25hbWUYAiABKAlCDuI/CxIJc2NhbGFOYW1lU
  glzY2FsYU5hbWUSPAoPY29sbGVjdGlvbl90eXBlGAMgASgJQhPiPxASDmNvbGxlY3Rpb25UeXBlUg5jb2xsZWN0aW9uVHlwZRInC
  ghrZXlfdHlwZRgEIAEoCUIM4j8JEgdrZXlUeXBlUgdrZXlUeXBlEi0KCnZhbHVlX3R5cGUYBSABKAlCDuI/CxIJdmFsdWVUeXBlU
  gl2YWx1ZVR5cGUSMgoLYW5ub3RhdGlvbnMYBiADKAlCEOI/DRILYW5ub3RhdGlvbnNSC2Fubm90YXRpb25zEicKCG1hcF90eXBlG
  AcgASgJQgziPwkSB21hcFR5cGVSB21hcFR5cGUSIQoGbm9fYm94GB4gASgIQgriPwcSBW5vQm94UgVub0JveCKYAQoLRW51bU9wd
  GlvbnMSJgoHZXh0ZW5kcxgBIAMoCUIM4j8JEgdleHRlbmRzUgdleHRlbmRzEkIKEWNvbXBhbmlvbl9leHRlbmRzGAIgAygJQhXiP
  xISEGNvbXBhbmlvbkV4dGVuZHNSEGNvbXBhbmlvbkV4dGVuZHMSHQoEdHlwZRgDIAEoCUIJ4j8GEgR0eXBlUgR0eXBlImkKEEVud
  W1WYWx1ZU9wdGlvbnMSJgoHZXh0ZW5kcxgBIAMoCUIM4j8JEgdleHRlbmRzUgdleHRlbmRzEi0KCnNjYWxhX25hbWUYAiABKAlCD
  uI/CxIJc2NhbGFOYW1lUglzY2FsYU5hbWUiNgoMT25lb2ZPcHRpb25zEiYKB2V4dGVuZHMYASADKAlCDOI/CRIHZXh0ZW5kc1IHZ
  Xh0ZW5kczpQCgdvcHRpb25zEhwuZ29vZ2xlLnByb3RvYnVmLkZpbGVPcHRpb25zGPwHIAEoCzIXLnNjYWxhcGIuU2NhbGFQYk9wd
  GlvbnNSB29wdGlvbnM6UwoHbWVzc2FnZRIfLmdvb2dsZS5wcm90b2J1Zi5NZXNzYWdlT3B0aW9ucxj8ByABKAsyFy5zY2FsYXBiL
  k1lc3NhZ2VPcHRpb25zUgdtZXNzYWdlOksKBWZpZWxkEh0uZ29vZ2xlLnByb3RvYnVmLkZpZWxkT3B0aW9ucxj8ByABKAsyFS5zY
  2FsYXBiLkZpZWxkT3B0aW9uc1IFZmllbGQ6VgoMZW51bV9vcHRpb25zEhwuZ29vZ2xlLnByb3RvYnVmLkVudW1PcHRpb25zGPwHI
  AEoCzIULnNjYWxhcGIuRW51bU9wdGlvbnNSC2VudW1PcHRpb25zOlwKCmVudW1fdmFsdWUSIS5nb29nbGUucHJvdG9idWYuRW51b
  VZhbHVlT3B0aW9ucxj8ByABKAsyGS5zY2FsYXBiLkVudW1WYWx1ZU9wdGlvbnNSCWVudW1WYWx1ZTpLCgVvbmVvZhIdLmdvb2dsZ
  S5wcm90b2J1Zi5PbmVvZk9wdGlvbnMY/AcgASgLMhUuc2NhbGFwYi5PbmVvZk9wdGlvbnNSBW9uZW9mQicKD3NjYWxhcGIub3B0a
  W9uc+I/EwoPc2NhbGFwYi5vcHRpb25zEAE="""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, Array(
      com.google.protobuf.descriptor.DescriptorProtoCompanion.javaDescriptor
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
  val options: _root_.scalapb.GeneratedExtension[com.google.protobuf.descriptor.FileOptions, _root_.scala.Option[scalapb.options.ScalaPbOptions]] =
    _root_.scalapb.GeneratedExtension.forOptionalUnknownMessageField(1020, _root_.scalapb.UnknownFieldSet.Field.lengthDelimitedLens)({__valueIn => _root_.scalapb.GeneratedExtension.readMessageFromByteString(scalapb.options.ScalaPbOptions)(__valueIn)}, {__valueIn => __valueIn.toByteString})
  val message: _root_.scalapb.GeneratedExtension[com.google.protobuf.descriptor.MessageOptions, _root_.scala.Option[scalapb.options.MessageOptions]] =
    _root_.scalapb.GeneratedExtension.forOptionalUnknownMessageField(1020, _root_.scalapb.UnknownFieldSet.Field.lengthDelimitedLens)({__valueIn => _root_.scalapb.GeneratedExtension.readMessageFromByteString(scalapb.options.MessageOptions)(__valueIn)}, {__valueIn => __valueIn.toByteString})
  val field: _root_.scalapb.GeneratedExtension[com.google.protobuf.descriptor.FieldOptions, _root_.scala.Option[scalapb.options.FieldOptions]] =
    _root_.scalapb.GeneratedExtension.forOptionalUnknownMessageField(1020, _root_.scalapb.UnknownFieldSet.Field.lengthDelimitedLens)({__valueIn => _root_.scalapb.GeneratedExtension.readMessageFromByteString(scalapb.options.FieldOptions)(__valueIn)}, {__valueIn => __valueIn.toByteString})
  val enumOptions: _root_.scalapb.GeneratedExtension[com.google.protobuf.descriptor.EnumOptions, _root_.scala.Option[scalapb.options.EnumOptions]] =
    _root_.scalapb.GeneratedExtension.forOptionalUnknownMessageField(1020, _root_.scalapb.UnknownFieldSet.Field.lengthDelimitedLens)({__valueIn => _root_.scalapb.GeneratedExtension.readMessageFromByteString(scalapb.options.EnumOptions)(__valueIn)}, {__valueIn => __valueIn.toByteString})
  val enumValue: _root_.scalapb.GeneratedExtension[com.google.protobuf.descriptor.EnumValueOptions, _root_.scala.Option[scalapb.options.EnumValueOptions]] =
    _root_.scalapb.GeneratedExtension.forOptionalUnknownMessageField(1020, _root_.scalapb.UnknownFieldSet.Field.lengthDelimitedLens)({__valueIn => _root_.scalapb.GeneratedExtension.readMessageFromByteString(scalapb.options.EnumValueOptions)(__valueIn)}, {__valueIn => __valueIn.toByteString})
  val oneof: _root_.scalapb.GeneratedExtension[com.google.protobuf.descriptor.OneofOptions, _root_.scala.Option[scalapb.options.OneofOptions]] =
    _root_.scalapb.GeneratedExtension.forOptionalUnknownMessageField(1020, _root_.scalapb.UnknownFieldSet.Field.lengthDelimitedLens)({__valueIn => _root_.scalapb.GeneratedExtension.readMessageFromByteString(scalapb.options.OneofOptions)(__valueIn)}, {__valueIn => __valueIn.toByteString})
}