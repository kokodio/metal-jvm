package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLPatchType}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlpatchtype">Apple documentation</a>
 */
public enum MTLPatchType {
    None(0L),
    Triangle(1L),
    Quad(2L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLPatchType[] VALUES = values();

    public final long value;

    MTLPatchType(final long value) {
        this.value = value;
    }

    public static MTLPatchType of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLPatchType: " + value);
        }
        return VALUES[(int) value];
    }
}
