package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLFunctionLogType}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlfunctionlogtype">Apple documentation</a>
 */
public enum MTLFunctionLogType {
    Validation(0L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLFunctionLogType[] VALUES = values();

    public final long value;

    MTLFunctionLogType(final long value) {
        this.value = value;
    }

    public static MTLFunctionLogType of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLFunctionLogType: " + value);
        }
        return VALUES[(int) value];
    }
}
