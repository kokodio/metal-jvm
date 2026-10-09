package io.github.kokodio.metaljvm.appkit;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSWindowNumberListOptions}
 *
 * @see <a href="https://developer.apple.com/documentation/appkit/nswindow/numberlistoptions">Apple documentation</a>
 */
public final class NSWindowNumberListOptions {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long AllApplications = 1L;
    public static final long AllSpaces = 16L;

    private NSWindowNumberListOptions() {
    }
}
