package io.github.kokodio.metaljvm.foundation;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSStringCompareOptions}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/nsstring/compareoptions">Apple documentation</a>
 */
public final class NSStringCompareOptions {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long CaseInsensitiveSearch = 1L;
    public static final long LiteralSearch = 2L;
    public static final long BackwardsSearch = 4L;
    public static final long AnchoredSearch = 8L;
    public static final long NumericSearch = 64L;
    public static final long DiacriticInsensitiveSearch = 128L;
    public static final long WidthInsensitiveSearch = 256L;
    public static final long ForcedOrderingSearch = 512L;
    public static final long RegularExpressionSearch = 1024L;

    private NSStringCompareOptions() {
    }
}
