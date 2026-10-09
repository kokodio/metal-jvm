package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLCommandEncoderErrorState}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlcommandencodererrorstate">Apple documentation</a>
 */
public enum MTLCommandEncoderErrorState {
    Unknown(0L),
    Completed(1L),
    Affected(2L),
    Pending(3L),
    Faulted(4L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLCommandEncoderErrorState[] VALUES = values();

    public final long value;

    MTLCommandEncoderErrorState(final long value) {
        this.value = value;
    }

    public static MTLCommandEncoderErrorState of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLCommandEncoderErrorState: " + value);
        }
        return VALUES[(int) value];
    }
}
