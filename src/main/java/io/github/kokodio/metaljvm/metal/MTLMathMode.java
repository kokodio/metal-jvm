package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLMathMode}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlmathmode">Apple documentation</a>
 */
public enum MTLMathMode {
    Safe(0L),
    Relaxed(1L),
    Fast(2L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLMathMode[] VALUES = values();

    public final long value;

    MTLMathMode(final long value) {
        this.value = value;
    }

    public static MTLMathMode of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLMathMode: " + value);
        }
        return VALUES[(int) value];
    }
}
