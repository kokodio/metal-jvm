package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTL4CounterHeapType}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4counterheaptype">Apple documentation</a>
 */
public enum MTL4CounterHeapType {
    Invalid(0L),
    Timestamp(1L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTL4CounterHeapType[] VALUES = values();

    public final long value;

    MTL4CounterHeapType(final long value) {
        this.value = value;
    }

    public static MTL4CounterHeapType of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTL4CounterHeapType: " + value);
        }
        return VALUES[(int) value];
    }
}
