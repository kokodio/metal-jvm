package io.github.kokodio.metaljvm.appkit;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSTouchTypeMask}
 *
 * @see <a href="https://developer.apple.com/documentation/appkit/nstouch/touchtypemask">Apple documentation</a>
 */
public final class NSTouchTypeMask {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long Direct = 1L;
    public static final long Indirect = 2L;

    private NSTouchTypeMask() {
    }
}
