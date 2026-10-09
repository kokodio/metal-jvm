package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTL4BlendState}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4blendstate">Apple documentation</a>
 */
public enum MTL4BlendState {
    Disabled(0L),
    Enabled(1L),
    Unspecialized(2L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTL4BlendState[] VALUES = values();

    public final long value;

    MTL4BlendState(final long value) {
        this.value = value;
    }

    public static MTL4BlendState of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTL4BlendState: " + value);
        }
        return VALUES[(int) value];
    }
}
