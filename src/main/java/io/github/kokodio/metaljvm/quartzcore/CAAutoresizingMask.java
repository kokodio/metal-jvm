package io.github.kokodio.metaljvm.quartzcore;

import java.lang.foreign.ValueLayout;

/**
 * {@code CAAutoresizingMask}
 *
 * @see <a href="https://developer.apple.com/documentation/quartzcore/caautoresizingmask">Apple documentation</a>
 */
public final class CAAutoresizingMask {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_INT;

    public static final long kCALayerNotSizable = 0L;
    public static final long kCALayerMinXMargin = 1L;
    public static final long kCALayerWidthSizable = 2L;
    public static final long kCALayerMaxXMargin = 4L;
    public static final long kCALayerMinYMargin = 8L;
    public static final long kCALayerHeightSizable = 16L;
    public static final long kCALayerMaxYMargin = 32L;

    private CAAutoresizingMask() {
    }
}
