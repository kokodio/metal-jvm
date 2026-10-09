package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLLogLevel}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlloglevel">Apple documentation</a>
 */
public enum MTLLogLevel {
    Undefined(0L),
    Debug(1L),
    Info(2L),
    Notice(3L),
    Error(4L),
    Fault(5L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLLogLevel[] VALUES = values();

    public final long value;

    MTLLogLevel(final long value) {
        this.value = value;
    }

    public static MTLLogLevel of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLLogLevel: " + value);
        }
        return VALUES[(int) value];
    }
}
