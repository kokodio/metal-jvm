package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLSparseTextureRegionAlignmentMode}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlsparsetextureregionalignmentmode">Apple documentation</a>
 */
public enum MTLSparseTextureRegionAlignmentMode {
    Outward(0L),
    Inward(1L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLSparseTextureRegionAlignmentMode[] VALUES = values();

    public final long value;

    MTLSparseTextureRegionAlignmentMode(final long value) {
        this.value = value;
    }

    public static MTLSparseTextureRegionAlignmentMode of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLSparseTextureRegionAlignmentMode: " + value);
        }
        return VALUES[(int) value];
    }
}
