package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLMutability}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlmutability">Apple documentation</a>
 */
public enum MTLMutability {
    Default(0L),
    Mutable(1L),
    Immutable(2L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLMutability[] VALUES = values();

    public final long value;

    MTLMutability(final long value) {
        this.value = value;
    }

    public static MTLMutability of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLMutability: " + value);
        }
        return VALUES[(int) value];
    }
}
