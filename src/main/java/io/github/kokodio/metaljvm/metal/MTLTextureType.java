package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLTextureType}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtltexturetype">Apple documentation</a>
 */
public enum MTLTextureType {
    Type1D(0L),
    Type1DArray(1L),
    Type2D(2L),
    Type2DArray(3L),
    Type2DMultisample(4L),
    TypeCube(5L),
    TypeCubeArray(6L),
    Type3D(7L),
    Type2DMultisampleArray(8L),
    TypeTextureBuffer(9L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLTextureType[] VALUES = values();

    public final long value;

    MTLTextureType(final long value) {
        this.value = value;
    }

    public static MTLTextureType of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLTextureType: " + value);
        }
        return VALUES[(int) value];
    }
}
