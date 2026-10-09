package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLCompileSymbolVisibility}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlcompilesymbolvisibility">Apple documentation</a>
 */
public enum MTLCompileSymbolVisibility {
    Default(0L),
    Hidden(1L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLCompileSymbolVisibility[] VALUES = values();

    public final long value;

    MTLCompileSymbolVisibility(final long value) {
        this.value = value;
    }

    public static MTLCompileSymbolVisibility of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLCompileSymbolVisibility: " + value);
        }
        return VALUES[(int) value];
    }
}
