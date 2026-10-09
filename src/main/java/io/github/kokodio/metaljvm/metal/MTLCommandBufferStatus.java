package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLCommandBufferStatus}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlcommandbufferstatus">Apple documentation</a>
 */
public enum MTLCommandBufferStatus {
    NotEnqueued(0L),
    Enqueued(1L),
    Committed(2L),
    Scheduled(3L),
    Completed(4L),
    Error(5L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLCommandBufferStatus[] VALUES = values();

    public final long value;

    MTLCommandBufferStatus(final long value) {
        this.value = value;
    }

    public static MTLCommandBufferStatus of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLCommandBufferStatus: " + value);
        }
        return VALUES[(int) value];
    }
}
