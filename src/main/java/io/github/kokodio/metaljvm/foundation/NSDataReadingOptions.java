package io.github.kokodio.metaljvm.foundation;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSDataReadingOptions}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/nsdata/readingoptions">Apple documentation</a>
 */
public final class NSDataReadingOptions {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long DataReadingMappedIfSafe = 1L;
    public static final long DataReadingUncached = 2L;
    public static final long DataReadingMappedAlways = 8L;
    public static final long DataReadingMapped = 1L;
    public static final long MappedRead = 1L;
    public static final long UncachedRead = 2L;

    private NSDataReadingOptions() {
    }
}
