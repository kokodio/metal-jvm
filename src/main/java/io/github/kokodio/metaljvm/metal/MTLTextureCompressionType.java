package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLTextureCompressionType}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtltexturecompressiontype">Apple documentation</a>
 */
public enum MTLTextureCompressionType {
    Lossless(0L),
    Lossy(1L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLTextureCompressionType[] VALUES = values();

    public final long value;

    MTLTextureCompressionType(final long value) {
        this.value = value;
    }

    public static MTLTextureCompressionType of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLTextureCompressionType: " + value);
        }
        return VALUES[(int) value];
    }
}
