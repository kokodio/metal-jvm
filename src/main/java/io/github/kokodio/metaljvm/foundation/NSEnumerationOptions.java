package io.github.kokodio.metaljvm.foundation;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSEnumerationOptions}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/nsenumerationoptions">Apple documentation</a>
 */
public final class NSEnumerationOptions {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long Concurrent = 1L;
    public static final long Reverse = 2L;

    private NSEnumerationOptions() {
    }
}
