package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLCurveEndCaps}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlcurveendcaps">Apple documentation</a>
 */
public enum MTLCurveEndCaps {
    None(0L),
    Disk(1L),
    Sphere(2L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLCurveEndCaps[] VALUES = values();

    public final long value;

    MTLCurveEndCaps(final long value) {
        this.value = value;
    }

    public static MTLCurveEndCaps of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLCurveEndCaps: " + value);
        }
        return VALUES[(int) value];
    }
}
