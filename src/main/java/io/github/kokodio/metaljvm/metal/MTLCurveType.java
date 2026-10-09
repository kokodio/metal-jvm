package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLCurveType}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlcurvetype">Apple documentation</a>
 */
public enum MTLCurveType {
    Round(0L),
    Flat(1L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLCurveType[] VALUES = values();

    public final long value;

    MTLCurveType(final long value) {
        this.value = value;
    }

    public static MTLCurveType of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLCurveType: " + value);
        }
        return VALUES[(int) value];
    }
}
