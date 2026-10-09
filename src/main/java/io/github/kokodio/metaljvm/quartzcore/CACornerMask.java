package io.github.kokodio.metaljvm.quartzcore;

import java.lang.foreign.ValueLayout;

/**
 * {@code CACornerMask}
 *
 * @see <a href="https://developer.apple.com/documentation/quartzcore/cacornermask">Apple documentation</a>
 */
public final class CACornerMask {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long kCALayerMinXMinYCorner = 1L;
    public static final long kCALayerMaxXMinYCorner = 2L;
    public static final long kCALayerMinXMaxYCorner = 4L;
    public static final long kCALayerMaxXMaxYCorner = 8L;

    private CACornerMask() {
    }
}
