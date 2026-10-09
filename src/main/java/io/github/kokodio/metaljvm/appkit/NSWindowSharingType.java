package io.github.kokodio.metaljvm.appkit;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSWindowSharingType}
 *
 * @see <a href="https://developer.apple.com/documentation/appkit/nswindow/sharingtype-swift.enum">Apple documentation</a>
 */
public enum NSWindowSharingType {
    None(0L),
    ReadOnly(1L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final NSWindowSharingType[] VALUES = values();

    public final long value;

    NSWindowSharingType(final long value) {
        this.value = value;
    }

    public static NSWindowSharingType of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown NSWindowSharingType: " + value);
        }
        return VALUES[(int) value];
    }
}
