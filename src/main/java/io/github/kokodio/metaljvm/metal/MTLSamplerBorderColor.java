package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLSamplerBorderColor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlsamplerbordercolor">Apple documentation</a>
 */
public enum MTLSamplerBorderColor {
    TransparentBlack(0L),
    OpaqueBlack(1L),
    OpaqueWhite(2L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLSamplerBorderColor[] VALUES = values();

    public final long value;

    MTLSamplerBorderColor(final long value) {
        this.value = value;
    }

    public static MTLSamplerBorderColor of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLSamplerBorderColor: " + value);
        }
        return VALUES[(int) value];
    }
}
