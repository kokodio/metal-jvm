package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLTensorError}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtltensorerror-swift.struct/code">Apple documentation</a>
 */
public enum MTLTensorError {
    None(0L),
    InternalError(1L),
    InvalidDescriptor(2L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLTensorError[] VALUES = values();

    public final long value;

    MTLTensorError(final long value) {
        this.value = value;
    }

    public static MTLTensorError of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLTensorError: " + value);
        }
        return VALUES[(int) value];
    }
}
