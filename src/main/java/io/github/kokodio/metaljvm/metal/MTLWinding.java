package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLWinding}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlwinding">Apple documentation</a>
 */
public enum MTLWinding {
    Clockwise(0L),
    CounterClockwise(1L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLWinding[] VALUES = values();

    public final long value;

    MTLWinding(final long value) {
        this.value = value;
    }

    public static MTLWinding of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLWinding: " + value);
        }
        return VALUES[(int) value];
    }
}
