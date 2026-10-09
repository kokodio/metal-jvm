package io.github.kokodio.metaljvm.foundation;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSURLBookmarkResolutionOptions}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/nsurl/bookmarkresolutionoptions">Apple documentation</a>
 */
public final class NSURLBookmarkResolutionOptions {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long WithoutUI = 256L;
    public static final long WithoutMounting = 512L;
    public static final long WithSecurityScope = 1024L;
    public static final long WithoutImplicitStartAccessing = 32768L;

    private NSURLBookmarkResolutionOptions() {
    }
}
