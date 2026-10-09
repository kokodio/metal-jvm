package io.github.kokodio.metaljvm.foundation;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSDataSearchOptions}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/nsdata/searchoptions">Apple documentation</a>
 */
public final class NSDataSearchOptions {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long Backwards = 1L;
    public static final long Anchored = 2L;

    private NSDataSearchOptions() {
    }
}
