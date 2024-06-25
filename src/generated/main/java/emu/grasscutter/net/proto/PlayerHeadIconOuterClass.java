// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerHeadIcon.proto

package emu.grasscutter.net.proto;

public final class PlayerHeadIconOuterClass {
  private PlayerHeadIconOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerHeadIconOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerHeadIcon)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 unkint = 4;</code>
     * @return The unkint.
     */
    int getUnkint();

    /**
     * <code>uint32 uid = 10;</code>
     * @return The uid.
     */
    int getUid();
  }
  /**
   * Protobuf type {@code PlayerHeadIcon}
   */
  public static final class PlayerHeadIcon extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerHeadIcon)
      PlayerHeadIconOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerHeadIcon.newBuilder() to construct.
    private PlayerHeadIcon(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerHeadIcon() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerHeadIcon();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerHeadIcon(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 32: {

              unkint_ = input.readUInt32();
              break;
            }
            case 80: {

              uid_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PlayerHeadIconOuterClass.internal_static_PlayerHeadIcon_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PlayerHeadIconOuterClass.internal_static_PlayerHeadIcon_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PlayerHeadIconOuterClass.PlayerHeadIcon.class, emu.grasscutter.net.proto.PlayerHeadIconOuterClass.PlayerHeadIcon.Builder.class);
    }

    public static final int UNKINT_FIELD_NUMBER = 4;
    private int unkint_;
    /**
     * <code>uint32 unkint = 4;</code>
     * @return The unkint.
     */
    @java.lang.Override
    public int getUnkint() {
      return unkint_;
    }

    public static final int UID_FIELD_NUMBER = 10;
    private int uid_;
    /**
     * <code>uint32 uid = 10;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (unkint_ != 0) {
        output.writeUInt32(4, unkint_);
      }
      if (uid_ != 0) {
        output.writeUInt32(10, uid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unkint_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, unkint_);
      }
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, uid_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.PlayerHeadIconOuterClass.PlayerHeadIcon)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PlayerHeadIconOuterClass.PlayerHeadIcon other = (emu.grasscutter.net.proto.PlayerHeadIconOuterClass.PlayerHeadIcon) obj;

      if (getUnkint()
          != other.getUnkint()) return false;
      if (getUid()
          != other.getUid()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + UNKINT_FIELD_NUMBER;
      hash = (53 * hash) + getUnkint();
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PlayerHeadIconOuterClass.PlayerHeadIcon parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerHeadIconOuterClass.PlayerHeadIcon parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerHeadIconOuterClass.PlayerHeadIcon parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerHeadIconOuterClass.PlayerHeadIcon parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerHeadIconOuterClass.PlayerHeadIcon parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerHeadIconOuterClass.PlayerHeadIcon parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerHeadIconOuterClass.PlayerHeadIcon parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerHeadIconOuterClass.PlayerHeadIcon parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerHeadIconOuterClass.PlayerHeadIcon parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerHeadIconOuterClass.PlayerHeadIcon parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerHeadIconOuterClass.PlayerHeadIcon parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerHeadIconOuterClass.PlayerHeadIcon parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.PlayerHeadIconOuterClass.PlayerHeadIcon prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code PlayerHeadIcon}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerHeadIcon)
        emu.grasscutter.net.proto.PlayerHeadIconOuterClass.PlayerHeadIconOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlayerHeadIconOuterClass.internal_static_PlayerHeadIcon_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PlayerHeadIconOuterClass.internal_static_PlayerHeadIcon_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PlayerHeadIconOuterClass.PlayerHeadIcon.class, emu.grasscutter.net.proto.PlayerHeadIconOuterClass.PlayerHeadIcon.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PlayerHeadIconOuterClass.PlayerHeadIcon.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unkint_ = 0;

        uid_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PlayerHeadIconOuterClass.internal_static_PlayerHeadIcon_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerHeadIconOuterClass.PlayerHeadIcon getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PlayerHeadIconOuterClass.PlayerHeadIcon.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerHeadIconOuterClass.PlayerHeadIcon build() {
        emu.grasscutter.net.proto.PlayerHeadIconOuterClass.PlayerHeadIcon result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerHeadIconOuterClass.PlayerHeadIcon buildPartial() {
        emu.grasscutter.net.proto.PlayerHeadIconOuterClass.PlayerHeadIcon result = new emu.grasscutter.net.proto.PlayerHeadIconOuterClass.PlayerHeadIcon(this);
        result.unkint_ = unkint_;
        result.uid_ = uid_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.PlayerHeadIconOuterClass.PlayerHeadIcon) {
          return mergeFrom((emu.grasscutter.net.proto.PlayerHeadIconOuterClass.PlayerHeadIcon)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PlayerHeadIconOuterClass.PlayerHeadIcon other) {
        if (other == emu.grasscutter.net.proto.PlayerHeadIconOuterClass.PlayerHeadIcon.getDefaultInstance()) return this;
        if (other.getUnkint() != 0) {
          setUnkint(other.getUnkint());
        }
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.PlayerHeadIconOuterClass.PlayerHeadIcon parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PlayerHeadIconOuterClass.PlayerHeadIcon) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int unkint_ ;
      /**
       * <code>uint32 unkint = 4;</code>
       * @return The unkint.
       */
      @java.lang.Override
      public int getUnkint() {
        return unkint_;
      }
      /**
       * <code>uint32 unkint = 4;</code>
       * @param value The unkint to set.
       * @return This builder for chaining.
       */
      public Builder setUnkint(int value) {
        
        unkint_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 unkint = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnkint() {
        
        unkint_ = 0;
        onChanged();
        return this;
      }

      private int uid_ ;
      /**
       * <code>uint32 uid = 10;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 10;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:PlayerHeadIcon)
    }

    // @@protoc_insertion_point(class_scope:PlayerHeadIcon)
    private static final emu.grasscutter.net.proto.PlayerHeadIconOuterClass.PlayerHeadIcon DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PlayerHeadIconOuterClass.PlayerHeadIcon();
    }

    public static emu.grasscutter.net.proto.PlayerHeadIconOuterClass.PlayerHeadIcon getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerHeadIcon>
        PARSER = new com.google.protobuf.AbstractParser<PlayerHeadIcon>() {
      @java.lang.Override
      public PlayerHeadIcon parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerHeadIcon(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayerHeadIcon> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerHeadIcon> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerHeadIconOuterClass.PlayerHeadIcon getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerHeadIcon_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerHeadIcon_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024PlayerHeadIcon.proto\"-\n\016PlayerHeadIcon" +
      "\022\016\n\006unkint\030\004 \001(\r\022\013\n\003uid\030\n \001(\rB\033\n\031emu.gra" +
      "sscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PlayerHeadIcon_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerHeadIcon_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerHeadIcon_descriptor,
        new java.lang.String[] { "Unkint", "Uid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}