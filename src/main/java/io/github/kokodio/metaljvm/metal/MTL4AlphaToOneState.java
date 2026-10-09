package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTL4AlphaToOneState}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4alphatoonestate">Apple documentation</a>
 */
public enum MTL4AlphaToOneState {
    Disabled(0L),
    Enabled(1L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTL4AlphaToOneState[] VALUES = values();

    public final long value;

    MTL4AlphaToOneState(final long value) {
        this.value = value;
    }

    public static MTL4AlphaToOneState of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTL4AlphaToOneState: " + value);
        }
        return VALUES[(int) value];
    }
}
