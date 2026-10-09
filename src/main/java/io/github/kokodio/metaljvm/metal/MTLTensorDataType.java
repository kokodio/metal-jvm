package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLTensorDataType}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtltensordatatype">Apple documentation</a>
 */
public enum MTLTensorDataType {
    None(0L),
    Float32(3L),
    Float16(16L),
    BFloat16(121L),
    Int8(45L),
    UInt8(49L),
    Int16(37L),
    UInt16(41L),
    Int32(29L),
    UInt32(33L),
    Int4(143L),
    UInt4(144L),
    MetalFloat8UE8M0(145L),
    UInt2(149L),
    Int2(150L),
    MetalFloat8E5M2(141L),
    MetalFloat8E4M3(142L),
    MetalFloat4E2M1(148L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public final long value;

    MTLTensorDataType(final long value) {
        this.value = value;
    }

    public static MTLTensorDataType of(final long value) {
        if ((int) value == value) {
            switch ((int) value) {
                case 0: return None;
                case 3: return Float32;
                case 16: return Float16;
                case 121: return BFloat16;
                case 45: return Int8;
                case 49: return UInt8;
                case 37: return Int16;
                case 41: return UInt16;
                case 29: return Int32;
                case 33: return UInt32;
                case 143: return Int4;
                case 144: return UInt4;
                case 145: return MetalFloat8UE8M0;
                case 149: return UInt2;
                case 150: return Int2;
                case 141: return MetalFloat8E5M2;
                case 142: return MetalFloat8E4M3;
                case 148: return MetalFloat4E2M1;
            }
        }
        throw new IllegalArgumentException("Unknown MTLTensorDataType: " + value);
    }
}
