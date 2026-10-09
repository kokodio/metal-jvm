package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLSamplerReductionMode}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlsamplerreductionmode">Apple documentation</a>
 */
public enum MTLSamplerReductionMode {
    WeightedAverage(0L),
    Minimum(1L),
    Maximum(2L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLSamplerReductionMode[] VALUES = values();

    public final long value;

    MTLSamplerReductionMode(final long value) {
        this.value = value;
    }

    public static MTLSamplerReductionMode of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLSamplerReductionMode: " + value);
        }
        return VALUES[(int) value];
    }
}
