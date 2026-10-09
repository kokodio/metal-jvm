package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLIOCompressionMethod}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtliocompressionmethod">Apple documentation</a>
 */
public enum MTLIOCompressionMethod {
    Zlib(0L),
    LZFSE(1L),
    LZ4(2L),
    LZMA(3L),
    LZBitmap(4L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLIOCompressionMethod[] VALUES = values();

    public final long value;

    MTLIOCompressionMethod(final long value) {
        this.value = value;
    }

    public static MTLIOCompressionMethod of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLIOCompressionMethod: " + value);
        }
        return VALUES[(int) value];
    }
}
