package io.github.kokodio.metaljvm.foundation;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSStringEnumerationOptions}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/nsstring/enumerationoptions">Apple documentation</a>
 */
public final class NSStringEnumerationOptions {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long ByLines = 0L;
    public static final long ByParagraphs = 1L;
    public static final long ByComposedCharacterSequences = 2L;
    public static final long ByWords = 3L;
    public static final long BySentences = 4L;
    public static final long ByCaretPositions = 5L;
    public static final long ByDeletionClusters = 6L;
    public static final long Reverse = 256L;
    public static final long SubstringNotRequired = 512L;
    public static final long Localized = 1024L;

    private NSStringEnumerationOptions() {
    }
}
