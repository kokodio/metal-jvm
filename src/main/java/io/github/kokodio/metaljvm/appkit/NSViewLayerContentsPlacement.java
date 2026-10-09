package io.github.kokodio.metaljvm.appkit;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSViewLayerContentsPlacement}
 *
 * @see <a href="https://developer.apple.com/documentation/appkit/nsview/layercontentsplacement-swift.enum">Apple documentation</a>
 */
public enum NSViewLayerContentsPlacement {
    ScaleAxesIndependently(0L),
    ScaleProportionallyToFit(1L),
    ScaleProportionallyToFill(2L),
    Center(3L),
    Top(4L),
    TopRight(5L),
    Right(6L),
    BottomRight(7L),
    Bottom(8L),
    BottomLeft(9L),
    Left(10L),
    TopLeft(11L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final NSViewLayerContentsPlacement[] VALUES = values();

    public final long value;

    NSViewLayerContentsPlacement(final long value) {
        this.value = value;
    }

    public static NSViewLayerContentsPlacement of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown NSViewLayerContentsPlacement: " + value);
        }
        return VALUES[(int) value];
    }
}
