package io.github.kokodio.metaljvm.appkit;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSWindowOcclusionState}
 *
 * @see <a href="https://developer.apple.com/documentation/appkit/nswindow/occlusionstate-swift.struct">Apple documentation</a>
 */
public final class NSWindowOcclusionState {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long Visible = 2L;

    private NSWindowOcclusionState() {
    }
}
