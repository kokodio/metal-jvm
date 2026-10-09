package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLLibraryOptimizationLevel}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtllibraryoptimizationlevel">Apple documentation</a>
 */
public enum MTLLibraryOptimizationLevel {
    Default(0L),
    Size(1L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLLibraryOptimizationLevel[] VALUES = values();

    public final long value;

    MTLLibraryOptimizationLevel(final long value) {
        this.value = value;
    }

    public static MTLLibraryOptimizationLevel of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLLibraryOptimizationLevel: " + value);
        }
        return VALUES[(int) value];
    }
}
