package io.github.kokodio.metaljvm.appkit;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSWindowUserTabbingPreference}
 *
 * @see <a href="https://developer.apple.com/documentation/appkit/nswindow/usertabbingpreference-swift.enum">Apple documentation</a>
 */
public enum NSWindowUserTabbingPreference {
    Manual(0L),
    Always(1L),
    InFullScreen(2L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final NSWindowUserTabbingPreference[] VALUES = values();

    public final long value;

    NSWindowUserTabbingPreference(final long value) {
        this.value = value;
    }

    public static NSWindowUserTabbingPreference of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown NSWindowUserTabbingPreference: " + value);
        }
        return VALUES[(int) value];
    }
}
