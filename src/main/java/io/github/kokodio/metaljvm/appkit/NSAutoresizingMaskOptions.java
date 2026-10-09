package io.github.kokodio.metaljvm.appkit;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSAutoresizingMaskOptions}
 *
 * @see <a href="https://developer.apple.com/documentation/appkit/nsview/autoresizingmask-swift.struct">Apple documentation</a>
 */
public final class NSAutoresizingMaskOptions {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long ViewNotSizable = 0L;
    public static final long ViewMinXMargin = 1L;
    public static final long ViewWidthSizable = 2L;
    public static final long ViewMaxXMargin = 4L;
    public static final long ViewMinYMargin = 8L;
    public static final long ViewHeightSizable = 16L;
    public static final long ViewMaxYMargin = 32L;

    private NSAutoresizingMaskOptions() {
    }
}
