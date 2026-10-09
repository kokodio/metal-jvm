package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLIOStatus}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtliostatus">Apple documentation</a>
 */
public enum MTLIOStatus {
    Pending(0L),
    Cancelled(1L),
    Error(2L),
    Complete(3L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLIOStatus[] VALUES = values();

    public final long value;

    MTLIOStatus(final long value) {
        this.value = value;
    }

    public static MTLIOStatus of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLIOStatus: " + value);
        }
        return VALUES[(int) value];
    }
}
