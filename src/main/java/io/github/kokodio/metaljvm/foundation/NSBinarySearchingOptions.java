package io.github.kokodio.metaljvm.foundation;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSBinarySearchingOptions}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/nsbinarysearchingoptions">Apple documentation</a>
 */
public final class NSBinarySearchingOptions {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long FirstEqual = 256L;
    public static final long LastEqual = 512L;
    public static final long InsertionIndex = 1024L;

    private NSBinarySearchingOptions() {
    }
}
