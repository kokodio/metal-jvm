package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLLibraryType}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtllibrarytype">Apple documentation</a>
 */
public enum MTLLibraryType {
    Executable(0L),
    Dynamic(1L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLLibraryType[] VALUES = values();

    public final long value;

    MTLLibraryType(final long value) {
        this.value = value;
    }

    public static MTLLibraryType of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLLibraryType: " + value);
        }
        return VALUES[(int) value];
    }
}
