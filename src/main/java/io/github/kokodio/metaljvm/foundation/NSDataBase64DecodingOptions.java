package io.github.kokodio.metaljvm.foundation;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSDataBase64DecodingOptions}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/nsdata/base64decodingoptions">Apple documentation</a>
 */
public final class NSDataBase64DecodingOptions {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long IgnoreUnknownCharacters = 1L;

    private NSDataBase64DecodingOptions() {
    }
}
