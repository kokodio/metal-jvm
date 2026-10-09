package io.github.kokodio.metaljvm.metalfx;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLFXSpatialScalerColorProcessingMode}
 *
 * @see <a href="https://developer.apple.com/documentation/metalfx/mtlfxspatialscalercolorprocessingmode">Apple documentation</a>
 */
public enum MTLFXSpatialScalerColorProcessingMode {
    Perceptual(0L),
    Linear(1L),
    HDR(2L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLFXSpatialScalerColorProcessingMode[] VALUES = values();

    public final long value;

    MTLFXSpatialScalerColorProcessingMode(final long value) {
        this.value = value;
    }

    public static MTLFXSpatialScalerColorProcessingMode of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLFXSpatialScalerColorProcessingMode: " + value);
        }
        return VALUES[(int) value];
    }
}
