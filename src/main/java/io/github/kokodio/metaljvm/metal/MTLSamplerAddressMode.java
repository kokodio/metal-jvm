package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLSamplerAddressMode}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlsampleraddressmode">Apple documentation</a>
 */
public enum MTLSamplerAddressMode {
    ClampToEdge(0L),
    MirrorClampToEdge(1L),
    Repeat(2L),
    MirrorRepeat(3L),
    ClampToZero(4L),
    ClampToBorderColor(5L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLSamplerAddressMode[] VALUES = values();

    public final long value;

    MTLSamplerAddressMode(final long value) {
        this.value = value;
    }

    public static MTLSamplerAddressMode of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLSamplerAddressMode: " + value);
        }
        return VALUES[(int) value];
    }
}
