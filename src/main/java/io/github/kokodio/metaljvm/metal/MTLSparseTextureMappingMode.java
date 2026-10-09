package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLSparseTextureMappingMode}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlsparsetexturemappingmode">Apple documentation</a>
 */
public enum MTLSparseTextureMappingMode {
    Map(0L),
    Unmap(1L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLSparseTextureMappingMode[] VALUES = values();

    public final long value;

    MTLSparseTextureMappingMode(final long value) {
        this.value = value;
    }

    public static MTLSparseTextureMappingMode of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLSparseTextureMappingMode: " + value);
        }
        return VALUES[(int) value];
    }
}
