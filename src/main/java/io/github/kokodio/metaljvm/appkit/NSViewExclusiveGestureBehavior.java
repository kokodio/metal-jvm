package io.github.kokodio.metaljvm.appkit;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSViewExclusiveGestureBehavior}
 *
 * @see <a href="https://developer.apple.com/documentation/appkit/nsview/exclusivegesturebehavior-swift.enum">Apple documentation</a>
 */
public enum NSViewExclusiveGestureBehavior {
    Inherit(0L),
    Exclusive(1L),
    NotExclusive(2L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final NSViewExclusiveGestureBehavior[] VALUES = values();

    public final long value;

    NSViewExclusiveGestureBehavior(final long value) {
        this.value = value;
    }

    public static NSViewExclusiveGestureBehavior of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown NSViewExclusiveGestureBehavior: " + value);
        }
        return VALUES[(int) value];
    }
}
