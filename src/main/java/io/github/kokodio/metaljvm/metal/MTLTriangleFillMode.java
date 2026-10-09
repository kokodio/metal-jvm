package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLTriangleFillMode}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtltrianglefillmode">Apple documentation</a>
 */
public enum MTLTriangleFillMode {
    Fill(0L),
    Lines(1L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLTriangleFillMode[] VALUES = values();

    public final long value;

    MTLTriangleFillMode(final long value) {
        this.value = value;
    }

    public static MTLTriangleFillMode of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLTriangleFillMode: " + value);
        }
        return VALUES[(int) value];
    }
}
