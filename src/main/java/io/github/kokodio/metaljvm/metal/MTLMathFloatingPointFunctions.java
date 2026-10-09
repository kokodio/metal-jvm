package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLMathFloatingPointFunctions}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlmathfloatingpointfunctions">Apple documentation</a>
 */
public enum MTLMathFloatingPointFunctions {
    Fast(0L),
    Precise(1L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLMathFloatingPointFunctions[] VALUES = values();

    public final long value;

    MTLMathFloatingPointFunctions(final long value) {
        this.value = value;
    }

    public static MTLMathFloatingPointFunctions of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLMathFloatingPointFunctions: " + value);
        }
        return VALUES[(int) value];
    }
}
