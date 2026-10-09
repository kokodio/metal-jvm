package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLTextureSwizzle}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtltextureswizzle">Apple documentation</a>
 */
public enum MTLTextureSwizzle {
    Zero(0L),
    One(1L),
    Red(2L),
    Green(3L),
    Blue(4L),
    Alpha(5L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_BYTE;
    private static final MTLTextureSwizzle[] VALUES = values();

    public final long value;

    MTLTextureSwizzle(final long value) {
        this.value = value;
    }

    public static MTLTextureSwizzle of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLTextureSwizzle: " + value);
        }
        return VALUES[(int) value];
    }
}
