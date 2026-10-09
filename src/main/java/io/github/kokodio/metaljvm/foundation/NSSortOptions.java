package io.github.kokodio.metaljvm.foundation;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSSortOptions}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/nssortoptions">Apple documentation</a>
 */
public final class NSSortOptions {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long Concurrent = 1L;
    public static final long Stable = 16L;

    private NSSortOptions() {
    }
}
