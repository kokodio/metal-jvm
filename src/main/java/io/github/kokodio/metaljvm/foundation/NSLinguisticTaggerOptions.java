package io.github.kokodio.metaljvm.foundation;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSLinguisticTaggerOptions}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/nslinguistictagger/options">Apple documentation</a>
 */
public final class NSLinguisticTaggerOptions {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long OmitWords = 1L;
    public static final long OmitPunctuation = 2L;
    public static final long OmitWhitespace = 4L;
    public static final long OmitOther = 8L;
    public static final long JoinNames = 16L;

    private NSLinguisticTaggerOptions() {
    }
}
