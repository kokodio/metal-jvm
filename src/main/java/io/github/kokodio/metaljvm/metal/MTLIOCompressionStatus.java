package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLIOCompressionStatus}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtliocompressionstatus">Apple documentation</a>
 */
public enum MTLIOCompressionStatus {
    Complete(0L),
    Error(1L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLIOCompressionStatus[] VALUES = values();

    public final long value;

    MTLIOCompressionStatus(final long value) {
        this.value = value;
    }

    public static MTLIOCompressionStatus of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLIOCompressionStatus: " + value);
        }
        return VALUES[(int) value];
    }
}
