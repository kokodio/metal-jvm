package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLCounterSampleBufferError}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlcountersamplebuffererror-swift.struct/code">Apple documentation</a>
 */
public enum MTLCounterSampleBufferError {
    OutOfMemory(0L),
    Invalid(1L),
    Internal(2L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLCounterSampleBufferError[] VALUES = values();

    public final long value;

    MTLCounterSampleBufferError(final long value) {
        this.value = value;
    }

    public static MTLCounterSampleBufferError of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLCounterSampleBufferError: " + value);
        }
        return VALUES[(int) value];
    }
}
