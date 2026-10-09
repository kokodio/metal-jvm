package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLDepthClipMode}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtldepthclipmode">Apple documentation</a>
 */
public enum MTLDepthClipMode {
    Clip(0L),
    Clamp(1L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLDepthClipMode[] VALUES = values();

    public final long value;

    MTLDepthClipMode(final long value) {
        this.value = value;
    }

    public static MTLDepthClipMode of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLDepthClipMode: " + value);
        }
        return VALUES[(int) value];
    }
}
