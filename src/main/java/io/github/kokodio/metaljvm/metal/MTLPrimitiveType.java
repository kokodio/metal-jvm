package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLPrimitiveType}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlprimitivetype">Apple documentation</a>
 */
public enum MTLPrimitiveType {
    Point(0L),
    Line(1L),
    LineStrip(2L),
    Triangle(3L),
    TriangleStrip(4L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLPrimitiveType[] VALUES = values();

    public final long value;

    MTLPrimitiveType(final long value) {
        this.value = value;
    }

    public static MTLPrimitiveType of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLPrimitiveType: " + value);
        }
        return VALUES[(int) value];
    }
}
