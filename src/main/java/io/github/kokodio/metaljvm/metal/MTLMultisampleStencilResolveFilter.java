package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLMultisampleStencilResolveFilter}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlmultisamplestencilresolvefilter">Apple documentation</a>
 */
public enum MTLMultisampleStencilResolveFilter {
    Sample0(0L),
    DepthResolvedSample(1L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLMultisampleStencilResolveFilter[] VALUES = values();

    public final long value;

    MTLMultisampleStencilResolveFilter(final long value) {
        this.value = value;
    }

    public static MTLMultisampleStencilResolveFilter of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLMultisampleStencilResolveFilter: " + value);
        }
        return VALUES[(int) value];
    }
}
