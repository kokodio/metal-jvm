package io.github.kokodio.metaljvm.quartzcore;

import java.lang.foreign.ValueLayout;

/**
 * {@code CAEdgeAntialiasingMask}
 *
 * @see <a href="https://developer.apple.com/documentation/quartzcore/caedgeantialiasingmask">Apple documentation</a>
 */
public final class CAEdgeAntialiasingMask {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_INT;

    public static final long kCALayerLeftEdge = 1L;
    public static final long kCALayerRightEdge = 2L;
    public static final long kCALayerBottomEdge = 4L;
    public static final long kCALayerTopEdge = 8L;

    private CAEdgeAntialiasingMask() {
    }
}
