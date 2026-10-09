package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLMotionBorderMode}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlmotionbordermode">Apple documentation</a>
 */
public enum MTLMotionBorderMode {
    Clamp(0L),
    Vanish(1L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_INT;
    private static final MTLMotionBorderMode[] VALUES = values();

    public final long value;

    MTLMotionBorderMode(final long value) {
        this.value = value;
    }

    public static MTLMotionBorderMode of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLMotionBorderMode: " + value);
        }
        return VALUES[(int) value];
    }
}
