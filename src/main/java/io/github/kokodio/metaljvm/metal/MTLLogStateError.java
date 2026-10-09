package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLLogStateError}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtllogstateerror">Apple documentation</a>
 */
public enum MTLLogStateError {
    InvalidSize(1L),
    Invalid(2L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public final long value;

    MTLLogStateError(final long value) {
        this.value = value;
    }

    public static MTLLogStateError of(final long value) {
        if ((int) value == value) {
            switch ((int) value) {
                case 1: return InvalidSize;
                case 2: return Invalid;
            }
        }
        throw new IllegalArgumentException("Unknown MTLLogStateError: " + value);
    }
}
