package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLTensorPlaneType}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtltensorplanetype">Apple documentation</a>
 */
public enum MTLTensorPlaneType {
    Data(0L),
    Scales(1L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLTensorPlaneType[] VALUES = values();

    public final long value;

    MTLTensorPlaneType(final long value) {
        this.value = value;
    }

    public static MTLTensorPlaneType of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLTensorPlaneType: " + value);
        }
        return VALUES[(int) value];
    }
}
