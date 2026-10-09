package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLSamplerMinMagFilter}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlsamplerminmagfilter">Apple documentation</a>
 */
public enum MTLSamplerMinMagFilter {
    Nearest(0L),
    Linear(1L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLSamplerMinMagFilter[] VALUES = values();

    public final long value;

    MTLSamplerMinMagFilter(final long value) {
        this.value = value;
    }

    public static MTLSamplerMinMagFilter of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLSamplerMinMagFilter: " + value);
        }
        return VALUES[(int) value];
    }
}
