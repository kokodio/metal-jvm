package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLAttributeFormat}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlattributeformat">Apple documentation</a>
 */
public enum MTLAttributeFormat {
    Invalid(0L),
    UChar2(1L),
    UChar3(2L),
    UChar4(3L),
    Char2(4L),
    Char3(5L),
    Char4(6L),
    UChar2Normalized(7L),
    UChar3Normalized(8L),
    UChar4Normalized(9L),
    Char2Normalized(10L),
    Char3Normalized(11L),
    Char4Normalized(12L),
    UShort2(13L),
    UShort3(14L),
    UShort4(15L),
    Short2(16L),
    Short3(17L),
    Short4(18L),
    UShort2Normalized(19L),
    UShort3Normalized(20L),
    UShort4Normalized(21L),
    Short2Normalized(22L),
    Short3Normalized(23L),
    Short4Normalized(24L),
    Half2(25L),
    Half3(26L),
    Half4(27L),
    Float(28L),
    Float2(29L),
    Float3(30L),
    Float4(31L),
    Int(32L),
    Int2(33L),
    Int3(34L),
    Int4(35L),
    UInt(36L),
    UInt2(37L),
    UInt3(38L),
    UInt4(39L),
    Int1010102Normalized(40L),
    UInt1010102Normalized(41L),
    UChar4Normalized_BGRA(42L),
    UChar(45L),
    Char(46L),
    UCharNormalized(47L),
    CharNormalized(48L),
    UShort(49L),
    Short(50L),
    UShortNormalized(51L),
    ShortNormalized(52L),
    Half(53L),
    FloatRG11B10(54L),
    FloatRGB9E5(55L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public final long value;

    MTLAttributeFormat(final long value) {
        this.value = value;
    }

    public static MTLAttributeFormat of(final long value) {
        if ((int) value == value) {
            switch ((int) value) {
                case 0: return Invalid;
                case 1: return UChar2;
                case 2: return UChar3;
                case 3: return UChar4;
                case 4: return Char2;
                case 5: return Char3;
                case 6: return Char4;
                case 7: return UChar2Normalized;
                case 8: return UChar3Normalized;
                case 9: return UChar4Normalized;
                case 10: return Char2Normalized;
                case 11: return Char3Normalized;
                case 12: return Char4Normalized;
                case 13: return UShort2;
                case 14: return UShort3;
                case 15: return UShort4;
                case 16: return Short2;
                case 17: return Short3;
                case 18: return Short4;
                case 19: return UShort2Normalized;
                case 20: return UShort3Normalized;
                case 21: return UShort4Normalized;
                case 22: return Short2Normalized;
                case 23: return Short3Normalized;
                case 24: return Short4Normalized;
                case 25: return Half2;
                case 26: return Half3;
                case 27: return Half4;
                case 28: return Float;
                case 29: return Float2;
                case 30: return Float3;
                case 31: return Float4;
                case 32: return Int;
                case 33: return Int2;
                case 34: return Int3;
                case 35: return Int4;
                case 36: return UInt;
                case 37: return UInt2;
                case 38: return UInt3;
                case 39: return UInt4;
                case 40: return Int1010102Normalized;
                case 41: return UInt1010102Normalized;
                case 42: return UChar4Normalized_BGRA;
                case 45: return UChar;
                case 46: return Char;
                case 47: return UCharNormalized;
                case 48: return CharNormalized;
                case 49: return UShort;
                case 50: return Short;
                case 51: return UShortNormalized;
                case 52: return ShortNormalized;
                case 53: return Half;
                case 54: return FloatRG11B10;
                case 55: return FloatRGB9E5;
            }
        }
        throw new IllegalArgumentException("Unknown MTLAttributeFormat: " + value);
    }
}
