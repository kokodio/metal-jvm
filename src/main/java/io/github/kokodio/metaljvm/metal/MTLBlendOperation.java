package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLBlendOperation}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlblendoperation">Apple documentation</a>
 */
public enum MTLBlendOperation {
    Add(0L),
    Subtract(1L),
    ReverseSubtract(2L),
    Min(3L),
    Max(4L),
    Unspecialized(5L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLBlendOperation[] VALUES = values();

    public final long value;

    MTLBlendOperation(final long value) {
        this.value = value;
    }

    public static MTLBlendOperation of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLBlendOperation: " + value);
        }
        return VALUES[(int) value];
    }
}
