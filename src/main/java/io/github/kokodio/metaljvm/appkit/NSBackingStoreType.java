package io.github.kokodio.metaljvm.appkit;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSBackingStoreType}
 *
 * @see <a href="https://developer.apple.com/documentation/appkit/nswindow/backingstoretype">Apple documentation</a>
 */
public enum NSBackingStoreType {
    Retained(0L),
    Nonretained(1L),
    Buffered(2L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final NSBackingStoreType[] VALUES = values();

    public final long value;

    NSBackingStoreType(final long value) {
        this.value = value;
    }

    public static NSBackingStoreType of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown NSBackingStoreType: " + value);
        }
        return VALUES[(int) value];
    }
}
