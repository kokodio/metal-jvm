package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLIOError}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlioerror-swift.struct/code">Apple documentation</a>
 */
public enum MTLIOError {
    URLInvalid(1L),
    Internal(2L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public final long value;

    MTLIOError(final long value) {
        this.value = value;
    }

    public static MTLIOError of(final long value) {
        if ((int) value == value) {
            switch ((int) value) {
                case 1: return URLInvalid;
                case 2: return Internal;
            }
        }
        throw new IllegalArgumentException("Unknown MTLIOError: " + value);
    }
}
