package io.github.kokodio.metaljvm.appkit;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSWindowTabbingMode}
 *
 * @see <a href="https://developer.apple.com/documentation/appkit/nswindow/tabbingmode-swift.enum">Apple documentation</a>
 */
public enum NSWindowTabbingMode {
    Automatic(0L),
    Preferred(1L),
    Disallowed(2L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final NSWindowTabbingMode[] VALUES = values();

    public final long value;

    NSWindowTabbingMode(final long value) {
        this.value = value;
    }

    public static NSWindowTabbingMode of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown NSWindowTabbingMode: " + value);
        }
        return VALUES[(int) value];
    }
}
