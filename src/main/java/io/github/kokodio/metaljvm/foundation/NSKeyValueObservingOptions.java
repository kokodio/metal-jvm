package io.github.kokodio.metaljvm.foundation;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSKeyValueObservingOptions}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/nskeyvalueobservingoptions">Apple documentation</a>
 */
public final class NSKeyValueObservingOptions {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long New = 1L;
    public static final long Old = 2L;
    public static final long Initial = 4L;
    public static final long Prior = 8L;

    private NSKeyValueObservingOptions() {
    }
}
