package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLSamplerMipFilter}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlsamplermipfilter">Apple documentation</a>
 */
public enum MTLSamplerMipFilter {
    NotMipmapped(0L),
    Nearest(1L),
    Linear(2L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLSamplerMipFilter[] VALUES = values();

    public final long value;

    MTLSamplerMipFilter(final long value) {
        this.value = value;
    }

    public static MTLSamplerMipFilter of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLSamplerMipFilter: " + value);
        }
        return VALUES[(int) value];
    }
}
