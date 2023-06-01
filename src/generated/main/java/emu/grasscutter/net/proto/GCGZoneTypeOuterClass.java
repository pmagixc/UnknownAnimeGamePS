// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGZoneType.proto

package emu.grasscutter.net.proto;

public final class GCGZoneTypeOuterClass {
  private GCGZoneTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * Obf: NCIFINONGOL
   * </pre>
   *
   * Protobuf enum {@code GCGZoneType}
   */
  public enum GCGZoneType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>GCG_ZONE_INVALID = 0;</code>
     */
    GCG_ZONE_INVALID(0),
    /**
     * <code>GCG_ZONE_DECK = 1;</code>
     */
    GCG_ZONE_DECK(1),
    /**
     * <code>GCG_ZONE_HAND = 2;</code>
     */
    GCG_ZONE_HAND(2),
    /**
     * <code>GCG_ZONE_CHARACTER = 3;</code>
     */
    GCG_ZONE_CHARACTER(3),
    /**
     * <code>GCG_ZONE_MODIFY = 4;</code>
     */
    GCG_ZONE_MODIFY(4),
    /**
     * <code>GCG_ZONE_SUMMON = 5;</code>
     */
    GCG_ZONE_SUMMON(5),
    /**
     * <code>GCG_ZONE_ASSIST = 7;</code>
     */
    GCG_ZONE_ASSIST(7),
    /**
     * <code>GCG_ZONE_ONSTAGE = 8;</code>
     */
    GCG_ZONE_ONSTAGE(8),
    /**
     * <code>GCG_ZONE_RULE = 9;</code>
     */
    GCG_ZONE_RULE(9),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>GCG_ZONE_INVALID = 0;</code>
     */
    public static final int GCG_ZONE_INVALID_VALUE = 0;
    /**
     * <code>GCG_ZONE_DECK = 1;</code>
     */
    public static final int GCG_ZONE_DECK_VALUE = 1;
    /**
     * <code>GCG_ZONE_HAND = 2;</code>
     */
    public static final int GCG_ZONE_HAND_VALUE = 2;
    /**
     * <code>GCG_ZONE_CHARACTER = 3;</code>
     */
    public static final int GCG_ZONE_CHARACTER_VALUE = 3;
    /**
     * <code>GCG_ZONE_MODIFY = 4;</code>
     */
    public static final int GCG_ZONE_MODIFY_VALUE = 4;
    /**
     * <code>GCG_ZONE_SUMMON = 5;</code>
     */
    public static final int GCG_ZONE_SUMMON_VALUE = 5;
    /**
     * <code>GCG_ZONE_ASSIST = 7;</code>
     */
    public static final int GCG_ZONE_ASSIST_VALUE = 7;
    /**
     * <code>GCG_ZONE_ONSTAGE = 8;</code>
     */
    public static final int GCG_ZONE_ONSTAGE_VALUE = 8;
    /**
     * <code>GCG_ZONE_RULE = 9;</code>
     */
    public static final int GCG_ZONE_RULE_VALUE = 9;


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
    public static GCGZoneType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static GCGZoneType forNumber(int value) {
      switch (value) {
        case 0: return GCG_ZONE_INVALID;
        case 1: return GCG_ZONE_DECK;
        case 2: return GCG_ZONE_HAND;
        case 3: return GCG_ZONE_CHARACTER;
        case 4: return GCG_ZONE_MODIFY;
        case 5: return GCG_ZONE_SUMMON;
        case 7: return GCG_ZONE_ASSIST;
        case 8: return GCG_ZONE_ONSTAGE;
        case 9: return GCG_ZONE_RULE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GCGZoneType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        GCGZoneType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GCGZoneType>() {
            public GCGZoneType findValueByNumber(int number) {
              return GCGZoneType.forNumber(number);
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
      return emu.grasscutter.net.proto.GCGZoneTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final GCGZoneType[] VALUES = values();

    public static GCGZoneType valueOf(
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

    private GCGZoneType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:GCGZoneType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021GCGZoneType.proto*\311\001\n\013GCGZoneType\022\024\n\020G" +
      "CG_ZONE_INVALID\020\000\022\021\n\rGCG_ZONE_DECK\020\001\022\021\n\r" +
      "GCG_ZONE_HAND\020\002\022\026\n\022GCG_ZONE_CHARACTER\020\003\022" +
      "\023\n\017GCG_ZONE_MODIFY\020\004\022\023\n\017GCG_ZONE_SUMMON\020" +
      "\005\022\023\n\017GCG_ZONE_ASSIST\020\007\022\024\n\020GCG_ZONE_ONSTA" +
      "GE\020\010\022\021\n\rGCG_ZONE_RULE\020\tB\033\n\031emu.grasscutt" +
      "er.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}