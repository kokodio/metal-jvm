package io.github.kokodio.metaljvm.appkit;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSSelectionDirection}
 *
 * @see <a href="https://developer.apple.com/documentation/appkit/nswindow/selectiondirection">Apple documentation</a>
 */
public enum NSSelectionDirection {
    DirectSelection(0L),
    SelectingNext(1L),
    SelectingPrevious(2L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final NSSelectionDirection[] VALUES = values();

    public final long value;

    NSSelectionDirection(final long value) {
        this.value = value;
    }

    public static NSSelectionDirection of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown NSSelectionDirection: " + value);
        }
        return VALUES[(int) value];
    }
}
