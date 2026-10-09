package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLCurveBasis}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlcurvebasis">Apple documentation</a>
 */
public enum MTLCurveBasis {
    BSpline(0L),
    CatmullRom(1L),
    Linear(2L),
    Bezier(3L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLCurveBasis[] VALUES = values();

    public final long value;

    MTLCurveBasis(final long value) {
        this.value = value;
    }

    public static MTLCurveBasis of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLCurveBasis: " + value);
        }
        return VALUES[(int) value];
    }
}
