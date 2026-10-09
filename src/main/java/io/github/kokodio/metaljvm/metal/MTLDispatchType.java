package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLDispatchType}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtldispatchtype">Apple documentation</a>
 */
public enum MTLDispatchType {
    Serial(0L),
    Concurrent(1L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLDispatchType[] VALUES = values();

    public final long value;

    MTLDispatchType(final long value) {
        this.value = value;
    }

    public static MTLDispatchType of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLDispatchType: " + value);
        }
        return VALUES[(int) value];
    }
}
