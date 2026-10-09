package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLFeatureSet}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlfeatureset">Apple documentation</a>
 */
public enum MTLFeatureSet {
    _iOS_GPUFamily1_v1(0L),
    _iOS_GPUFamily2_v1(1L),
    _iOS_GPUFamily1_v2(2L),
    _iOS_GPUFamily2_v2(3L),
    _iOS_GPUFamily3_v1(4L),
    _iOS_GPUFamily1_v3(5L),
    _iOS_GPUFamily2_v3(6L),
    _iOS_GPUFamily3_v2(7L),
    _iOS_GPUFamily1_v4(8L),
    _iOS_GPUFamily2_v4(9L),
    _iOS_GPUFamily3_v3(10L),
    _iOS_GPUFamily4_v1(11L),
    _iOS_GPUFamily1_v5(12L),
    _iOS_GPUFamily2_v5(13L),
    _iOS_GPUFamily3_v4(14L),
    _iOS_GPUFamily4_v2(15L),
    _iOS_GPUFamily5_v1(16L),
    _macOS_GPUFamily1_v1(10000L),
    _OSX_GPUFamily1_v1(10000L),
    _macOS_GPUFamily1_v2(10001L),
    _OSX_GPUFamily1_v2(10001L),
    _macOS_ReadWriteTextureTier2(10002L),
    _OSX_ReadWriteTextureTier2(10002L),
    _macOS_GPUFamily1_v3(10003L),
    _macOS_GPUFamily1_v4(10004L),
    _macOS_GPUFamily2_v1(10005L),
    _tvOS_GPUFamily1_v1(30000L),
    _TVOS_GPUFamily1_v1(30000L),
    _tvOS_GPUFamily1_v2(30001L),
    _tvOS_GPUFamily1_v3(30002L),
    _tvOS_GPUFamily2_v1(30003L),
    _tvOS_GPUFamily1_v4(30004L),
    _tvOS_GPUFamily2_v2(30005L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public final long value;

    MTLFeatureSet(final long value) {
        this.value = value;
    }

    public static MTLFeatureSet of(final long value) {
        if ((int) value == value) {
            switch ((int) value) {
                case 0: return _iOS_GPUFamily1_v1;
                case 1: return _iOS_GPUFamily2_v1;
                case 2: return _iOS_GPUFamily1_v2;
                case 3: return _iOS_GPUFamily2_v2;
                case 4: return _iOS_GPUFamily3_v1;
                case 5: return _iOS_GPUFamily1_v3;
                case 6: return _iOS_GPUFamily2_v3;
                case 7: return _iOS_GPUFamily3_v2;
                case 8: return _iOS_GPUFamily1_v4;
                case 9: return _iOS_GPUFamily2_v4;
                case 10: return _iOS_GPUFamily3_v3;
                case 11: return _iOS_GPUFamily4_v1;
                case 12: return _iOS_GPUFamily1_v5;
                case 13: return _iOS_GPUFamily2_v5;
                case 14: return _iOS_GPUFamily3_v4;
                case 15: return _iOS_GPUFamily4_v2;
                case 16: return _iOS_GPUFamily5_v1;
                case 10000: return _macOS_GPUFamily1_v1;
                case 10001: return _macOS_GPUFamily1_v2;
                case 10002: return _macOS_ReadWriteTextureTier2;
                case 10003: return _macOS_GPUFamily1_v3;
                case 10004: return _macOS_GPUFamily1_v4;
                case 10005: return _macOS_GPUFamily2_v1;
                case 30000: return _tvOS_GPUFamily1_v1;
                case 30001: return _tvOS_GPUFamily1_v2;
                case 30002: return _tvOS_GPUFamily1_v3;
                case 30003: return _tvOS_GPUFamily2_v1;
                case 30004: return _tvOS_GPUFamily1_v4;
                case 30005: return _tvOS_GPUFamily2_v2;
            }
        }
        throw new IllegalArgumentException("Unknown MTLFeatureSet: " + value);
    }
}
