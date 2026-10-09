package io.github.kokodio.metaljvm.foundation;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSStringEncodingConversionOptions}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/nsstring/encodingconversionoptions">Apple documentation</a>
 */
public final class NSStringEncodingConversionOptions {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long AllowLossy = 1L;
    public static final long ExternalRepresentation = 2L;

    private NSStringEncodingConversionOptions() {
    }
}
