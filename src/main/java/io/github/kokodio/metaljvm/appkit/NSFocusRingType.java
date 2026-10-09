package io.github.kokodio.metaljvm.appkit;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSFocusRingType}
 *
 * @see <a href="https://developer.apple.com/documentation/appkit/nsfocusringtype">Apple documentation</a>
 */
public enum NSFocusRingType {
    Default(0L),
    None(1L),
    Exterior(2L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final NSFocusRingType[] VALUES = values();

    public final long value;

    NSFocusRingType(final long value) {
        this.value = value;
    }

    public static NSFocusRingType of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown NSFocusRingType: " + value);
        }
        return VALUES[(int) value];
    }
}
