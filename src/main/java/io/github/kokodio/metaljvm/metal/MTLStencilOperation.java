package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLStencilOperation}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlstenciloperation">Apple documentation</a>
 */
public enum MTLStencilOperation {
    Keep(0L),
    Zero(1L),
    Replace(2L),
    IncrementClamp(3L),
    DecrementClamp(4L),
    Invert(5L),
    IncrementWrap(6L),
    DecrementWrap(7L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLStencilOperation[] VALUES = values();

    public final long value;

    MTLStencilOperation(final long value) {
        this.value = value;
    }

    public static MTLStencilOperation of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLStencilOperation: " + value);
        }
        return VALUES[(int) value];
    }
}
