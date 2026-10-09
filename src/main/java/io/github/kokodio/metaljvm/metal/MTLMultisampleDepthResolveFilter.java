package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLMultisampleDepthResolveFilter}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlmultisampledepthresolvefilter">Apple documentation</a>
 */
public enum MTLMultisampleDepthResolveFilter {
    Sample0(0L),
    Min(1L),
    Max(2L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLMultisampleDepthResolveFilter[] VALUES = values();

    public final long value;

    MTLMultisampleDepthResolveFilter(final long value) {
        this.value = value;
    }

    public static MTLMultisampleDepthResolveFilter of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLMultisampleDepthResolveFilter: " + value);
        }
        return VALUES[(int) value];
    }
}
