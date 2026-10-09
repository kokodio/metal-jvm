package io.github.kokodio.metaljvm.appkit;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSUserInterfaceLayoutDirection}
 *
 * @see <a href="https://developer.apple.com/documentation/appkit/nsuserinterfacelayoutdirection">Apple documentation</a>
 */
public enum NSUserInterfaceLayoutDirection {
    LeftToRight(0L),
    RightToLeft(1L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final NSUserInterfaceLayoutDirection[] VALUES = values();

    public final long value;

    NSUserInterfaceLayoutDirection(final long value) {
        this.value = value;
    }

    public static NSUserInterfaceLayoutDirection of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown NSUserInterfaceLayoutDirection: " + value);
        }
        return VALUES[(int) value];
    }
}
