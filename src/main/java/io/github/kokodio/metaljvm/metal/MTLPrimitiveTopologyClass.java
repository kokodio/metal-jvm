package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLPrimitiveTopologyClass}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlprimitivetopologyclass">Apple documentation</a>
 */
public enum MTLPrimitiveTopologyClass {
    Unspecified(0L),
    Point(1L),
    Line(2L),
    Triangle(3L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLPrimitiveTopologyClass[] VALUES = values();

    public final long value;

    MTLPrimitiveTopologyClass(final long value) {
        this.value = value;
    }

    public static MTLPrimitiveTopologyClass of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLPrimitiveTopologyClass: " + value);
        }
        return VALUES[(int) value];
    }
}
