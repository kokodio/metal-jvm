package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLHeapType}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlheaptype">Apple documentation</a>
 */
public enum MTLHeapType {
    Automatic(0L),
    Placement(1L),
    Sparse(2L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLHeapType[] VALUES = values();

    public final long value;

    MTLHeapType(final long value) {
        this.value = value;
    }

    public static MTLHeapType of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLHeapType: " + value);
        }
        return VALUES[(int) value];
    }
}
