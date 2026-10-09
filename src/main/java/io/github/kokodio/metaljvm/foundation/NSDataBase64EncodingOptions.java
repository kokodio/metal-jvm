package io.github.kokodio.metaljvm.foundation;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSDataBase64EncodingOptions}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/nsdata/base64encodingoptions">Apple documentation</a>
 */
public final class NSDataBase64EncodingOptions {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long Encoding64CharacterLineLength = 1L;
    public static final long Encoding76CharacterLineLength = 2L;
    public static final long EncodingEndLineWithCarriageReturn = 16L;
    public static final long EncodingEndLineWithLineFeed = 32L;

    private NSDataBase64EncodingOptions() {
    }
}
