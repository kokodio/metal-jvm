package io.github.kokodio.metaljvm.appkit;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSWindowTitleVisibility}
 *
 * @see <a href="https://developer.apple.com/documentation/appkit/nswindow/titlevisibility-swift.enum">Apple documentation</a>
 */
public enum NSWindowTitleVisibility {
    Visible(0L),
    Hidden(1L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final NSWindowTitleVisibility[] VALUES = values();

    public final long value;

    NSWindowTitleVisibility(final long value) {
        this.value = value;
    }

    public static NSWindowTitleVisibility of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown NSWindowTitleVisibility: " + value);
        }
        return VALUES[(int) value];
    }
}
