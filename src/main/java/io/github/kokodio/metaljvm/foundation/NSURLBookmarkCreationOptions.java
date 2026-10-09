package io.github.kokodio.metaljvm.foundation;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSURLBookmarkCreationOptions}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/nsurl/bookmarkcreationoptions">Apple documentation</a>
 */
public final class NSURLBookmarkCreationOptions {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long PreferFileIDResolution = 256L;
    public static final long MinimalBookmark = 512L;
    public static final long SuitableForBookmarkFile = 1024L;
    public static final long WithSecurityScope = 2048L;
    public static final long SecurityScopeAllowOnlyReadAccess = 4096L;
    public static final long WithoutImplicitSecurityScope = 0x20000000L;

    private NSURLBookmarkCreationOptions() {
    }
}
