package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLIndexType}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlindextype">Apple documentation</a>
 */
public enum MTLIndexType {
    UInt16(0L),
    UInt32(1L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLIndexType[] VALUES = values();

    public final long value;

    MTLIndexType(final long value) {
        this.value = value;
    }

    public static MTLIndexType of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLIndexType: " + value);
        }
        return VALUES[(int) value];
    }
}
