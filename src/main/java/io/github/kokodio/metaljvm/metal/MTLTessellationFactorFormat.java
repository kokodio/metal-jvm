package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLTessellationFactorFormat}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtltessellationfactorformat">Apple documentation</a>
 */
public enum MTLTessellationFactorFormat {
    Half(0L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLTessellationFactorFormat[] VALUES = values();

    public final long value;

    MTLTessellationFactorFormat(final long value) {
        this.value = value;
    }

    public static MTLTessellationFactorFormat of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLTessellationFactorFormat: " + value);
        }
        return VALUES[(int) value];
    }
}
