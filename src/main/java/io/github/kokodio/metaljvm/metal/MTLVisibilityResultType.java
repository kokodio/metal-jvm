package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLVisibilityResultType}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlvisibilityresulttype">Apple documentation</a>
 */
public enum MTLVisibilityResultType {
    Reset(0L),
    Accumulate(1L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLVisibilityResultType[] VALUES = values();

    public final long value;

    MTLVisibilityResultType(final long value) {
        this.value = value;
    }

    public static MTLVisibilityResultType of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLVisibilityResultType: " + value);
        }
        return VALUES[(int) value];
    }
}
