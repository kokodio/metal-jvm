package io.github.kokodio.metaljvm.appkit;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSEventGestureAxis}
 *
 * @see <a href="https://developer.apple.com/documentation/appkit/nsevent/gestureaxis">Apple documentation</a>
 */
public enum NSEventGestureAxis {
    None(0L),
    Horizontal(1L),
    Vertical(2L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final NSEventGestureAxis[] VALUES = values();

    public final long value;

    NSEventGestureAxis(final long value) {
        this.value = value;
    }

    public static NSEventGestureAxis of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown NSEventGestureAxis: " + value);
        }
        return VALUES[(int) value];
    }
}
