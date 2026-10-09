package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLDataType}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtldatatype">Apple documentation</a>
 */
public enum MTLDataType {
    None(0L),
    Struct(1L),
    Array(2L),
    Float(3L),
    Float2(4L),
    Float3(5L),
    Float4(6L),
    Float2x2(7L),
    Float2x3(8L),
    Float2x4(9L),
    Float3x2(10L),
    Float3x3(11L),
    Float3x4(12L),
    Float4x2(13L),
    Float4x3(14L),
    Float4x4(15L),
    Half(16L),
    Half2(17L),
    Half3(18L),
    Half4(19L),
    Half2x2(20L),
    Half2x3(21L),
    Half2x4(22L),
    Half3x2(23L),
    Half3x3(24L),
    Half3x4(25L),
    Half4x2(26L),
    Half4x3(27L),
    Half4x4(28L),
    Int(29L),
    Int2(30L),
    Int3(31L),
    Int4(32L),
    UInt(33L),
    UInt2(34L),
    UInt3(35L),
    UInt4(36L),
    Short(37L),
    Short2(38L),
    Short3(39L),
    Short4(40L),
    UShort(41L),
    UShort2(42L),
    UShort3(43L),
    UShort4(44L),
    Char(45L),
    Char2(46L),
    Char3(47L),
    Char4(48L),
    UChar(49L),
    UChar2(50L),
    UChar3(51L),
    UChar4(52L),
    Bool(53L),
    Bool2(54L),
    Bool3(55L),
    Bool4(56L),
    Texture(58L),
    Sampler(59L),
    Pointer(60L),
    R8Unorm(62L),
    R8Snorm(63L),
    R16Unorm(64L),
    R16Snorm(65L),
    RG8Unorm(66L),
    RG8Snorm(67L),
    RG16Unorm(68L),
    RG16Snorm(69L),
    RGBA8Unorm(70L),
    RGBA8Unorm_sRGB(71L),
    RGBA8Snorm(72L),
    RGBA16Unorm(73L),
    RGBA16Snorm(74L),
    RGB10A2Unorm(75L),
    RG11B10Float(76L),
    RGB9E5Float(77L),
    RenderPipeline(78L),
    ComputePipeline(79L),
    IndirectCommandBuffer(80L),
    Long(81L),
    Long2(82L),
    Long3(83L),
    Long4(84L),
    ULong(85L),
    ULong2(86L),
    ULong3(87L),
    ULong4(88L),
    VisibleFunctionTable(115L),
    IntersectionFunctionTable(116L),
    PrimitiveAccelerationStructure(117L),
    InstanceAccelerationStructure(118L),
    BFloat(121L),
    BFloat2(122L),
    BFloat3(123L),
    BFloat4(124L),
    DepthStencilState(139L),
    Tensor(140L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public final long value;

    MTLDataType(final long value) {
        this.value = value;
    }

    public static MTLDataType of(final long value) {
        if ((int) value == value) {
            switch ((int) value) {
                case 0: return None;
                case 1: return Struct;
                case 2: return Array;
                case 3: return Float;
                case 4: return Float2;
                case 5: return Float3;
                case 6: return Float4;
                case 7: return Float2x2;
                case 8: return Float2x3;
                case 9: return Float2x4;
                case 10: return Float3x2;
                case 11: return Float3x3;
                case 12: return Float3x4;
                case 13: return Float4x2;
                case 14: return Float4x3;
                case 15: return Float4x4;
                case 16: return Half;
                case 17: return Half2;
                case 18: return Half3;
                case 19: return Half4;
                case 20: return Half2x2;
                case 21: return Half2x3;
                case 22: return Half2x4;
                case 23: return Half3x2;
                case 24: return Half3x3;
                case 25: return Half3x4;
                case 26: return Half4x2;
                case 27: return Half4x3;
                case 28: return Half4x4;
                case 29: return Int;
                case 30: return Int2;
                case 31: return Int3;
                case 32: return Int4;
                case 33: return UInt;
                case 34: return UInt2;
                case 35: return UInt3;
                case 36: return UInt4;
                case 37: return Short;
                case 38: return Short2;
                case 39: return Short3;
                case 40: return Short4;
                case 41: return UShort;
                case 42: return UShort2;
                case 43: return UShort3;
                case 44: return UShort4;
                case 45: return Char;
                case 46: return Char2;
                case 47: return Char3;
                case 48: return Char4;
                case 49: return UChar;
                case 50: return UChar2;
                case 51: return UChar3;
                case 52: return UChar4;
                case 53: return Bool;
                case 54: return Bool2;
                case 55: return Bool3;
                case 56: return Bool4;
                case 58: return Texture;
                case 59: return Sampler;
                case 60: return Pointer;
                case 62: return R8Unorm;
                case 63: return R8Snorm;
                case 64: return R16Unorm;
                case 65: return R16Snorm;
                case 66: return RG8Unorm;
                case 67: return RG8Snorm;
                case 68: return RG16Unorm;
                case 69: return RG16Snorm;
                case 70: return RGBA8Unorm;
                case 71: return RGBA8Unorm_sRGB;
                case 72: return RGBA8Snorm;
                case 73: return RGBA16Unorm;
                case 74: return RGBA16Snorm;
                case 75: return RGB10A2Unorm;
                case 76: return RG11B10Float;
                case 77: return RGB9E5Float;
                case 78: return RenderPipeline;
                case 79: return ComputePipeline;
                case 80: return IndirectCommandBuffer;
                case 81: return Long;
                case 82: return Long2;
                case 83: return Long3;
                case 84: return Long4;
                case 85: return ULong;
                case 86: return ULong2;
                case 87: return ULong3;
                case 88: return ULong4;
                case 115: return VisibleFunctionTable;
                case 116: return IntersectionFunctionTable;
                case 117: return PrimitiveAccelerationStructure;
                case 118: return InstanceAccelerationStructure;
                case 121: return BFloat;
                case 122: return BFloat2;
                case 123: return BFloat3;
                case 124: return BFloat4;
                case 139: return DepthStencilState;
                case 140: return Tensor;
            }
        }
        throw new IllegalArgumentException("Unknown MTLDataType: " + value);
    }
}
