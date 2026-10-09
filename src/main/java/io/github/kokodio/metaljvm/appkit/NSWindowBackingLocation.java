package io.github.kokodio.metaljvm.appkit;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSWindowBackingLocation}
 *
 * @see <a href="https://developer.apple.com/documentation/appkit/nswindow/backinglocation-swift.enum">Apple documentation</a>
 */
public enum NSWindowBackingLocation {
    Default(0L),
    VideoMemory(1L),
    MainMemory(2L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final NSWindowBackingLocation[] VALUES = values();

    public final long value;

    NSWindowBackingLocation(final long value) {
        this.value = value;
    }

    public static NSWindowBackingLocation of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown NSWindowBackingLocation: " + value);
        }
        return VALUES[(int) value];
    }
}
