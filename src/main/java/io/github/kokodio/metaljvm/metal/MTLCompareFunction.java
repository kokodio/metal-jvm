package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLCompareFunction}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlcomparefunction">Apple documentation</a>
 */
public enum MTLCompareFunction {
    Never(0L),
    Less(1L),
    Equal(2L),
    LessEqual(3L),
    Greater(4L),
    NotEqual(5L),
    GreaterEqual(6L),
    Always(7L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLCompareFunction[] VALUES = values();

    public final long value;

    MTLCompareFunction(final long value) {
        this.value = value;
    }

    public static MTLCompareFunction of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLCompareFunction: " + value);
        }
        return VALUES[(int) value];
    }
}
