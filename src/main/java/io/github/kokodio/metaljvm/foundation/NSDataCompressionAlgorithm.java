package io.github.kokodio.metaljvm.foundation;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSDataCompressionAlgorithm}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/nsdata/compressionalgorithm">Apple documentation</a>
 */
public enum NSDataCompressionAlgorithm {
    LZFSE(0L),
    LZ4(1L),
    LZMA(2L),
    Zlib(3L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final NSDataCompressionAlgorithm[] VALUES = values();

    public final long value;

    NSDataCompressionAlgorithm(final long value) {
        this.value = value;
    }

    public static NSDataCompressionAlgorithm of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown NSDataCompressionAlgorithm: " + value);
        }
        return VALUES[(int) value];
    }
}
