package io.github.kokodio.metaljvm.appkit;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSViewLayerContentsRedrawPolicy}
 *
 * @see <a href="https://developer.apple.com/documentation/appkit/nsview/layercontentsredrawpolicy-swift.enum">Apple documentation</a>
 */
public enum NSViewLayerContentsRedrawPolicy {
    Never(0L),
    OnSetNeedsDisplay(1L),
    DuringViewResize(2L),
    BeforeViewResize(3L),
    Crossfade(4L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final NSViewLayerContentsRedrawPolicy[] VALUES = values();

    public final long value;

    NSViewLayerContentsRedrawPolicy(final long value) {
        this.value = value;
    }

    public static NSViewLayerContentsRedrawPolicy of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown NSViewLayerContentsRedrawPolicy: " + value);
        }
        return VALUES[(int) value];
    }
}
