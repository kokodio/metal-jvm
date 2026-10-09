package io.github.kokodio.metaljvm.appkit;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSWindowToolbarStyle}
 *
 * @see <a href="https://developer.apple.com/documentation/appkit/nswindow/toolbarstyle-swift.enum">Apple documentation</a>
 */
public enum NSWindowToolbarStyle {
    Automatic(0L),
    Expanded(1L),
    Preference(2L),
    Unified(3L),
    UnifiedCompact(4L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final NSWindowToolbarStyle[] VALUES = values();

    public final long value;

    NSWindowToolbarStyle(final long value) {
        this.value = value;
    }

    public static NSWindowToolbarStyle of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown NSWindowToolbarStyle: " + value);
        }
        return VALUES[(int) value];
    }
}
