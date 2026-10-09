package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLMatrixLayout}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlmatrixlayout">Apple documentation</a>
 */
public enum MTLMatrixLayout {
    ColumnMajor(0L),
    RowMajor(1L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLMatrixLayout[] VALUES = values();

    public final long value;

    MTLMatrixLayout(final long value) {
        this.value = value;
    }

    public static MTLMatrixLayout of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLMatrixLayout: " + value);
        }
        return VALUES[(int) value];
    }
}
