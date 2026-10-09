package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLShaderValidation}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlshadervalidation">Apple documentation</a>
 */
public enum MTLShaderValidation {
    Default(0L),
    Enabled(1L),
    Disabled(2L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLShaderValidation[] VALUES = values();

    public final long value;

    MTLShaderValidation(final long value) {
        this.value = value;
    }

    public static MTLShaderValidation of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLShaderValidation: " + value);
        }
        return VALUES[(int) value];
    }
}
