package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLTransformType}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtltransformtype">Apple documentation</a>
 */
public enum MTLTransformType {
    PackedFloat4x3(0L),
    Component(1L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLTransformType[] VALUES = values();

    public final long value;

    MTLTransformType(final long value) {
        this.value = value;
    }

    public static MTLTransformType of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLTransformType: " + value);
        }
        return VALUES[(int) value];
    }
}
