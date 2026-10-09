package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTL4CommandQueueError}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4commandqueueerror-swift.struct/code">Apple documentation</a>
 */
public enum MTL4CommandQueueError {
    None(0L),
    Timeout(1L),
    NotPermitted(2L),
    OutOfMemory(3L),
    DeviceRemoved(4L),
    AccessRevoked(5L),
    Internal(6L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTL4CommandQueueError[] VALUES = values();

    public final long value;

    MTL4CommandQueueError(final long value) {
        this.value = value;
    }

    public static MTL4CommandQueueError of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTL4CommandQueueError: " + value);
        }
        return VALUES[(int) value];
    }
}
