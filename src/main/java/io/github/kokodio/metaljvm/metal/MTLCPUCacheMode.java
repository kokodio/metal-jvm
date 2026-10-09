package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLCPUCacheMode}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlcpucachemode">Apple documentation</a>
 */
public enum MTLCPUCacheMode {
    DefaultCache(0L),
    WriteCombined(1L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLCPUCacheMode[] VALUES = values();

    public final long value;

    MTLCPUCacheMode(final long value) {
        this.value = value;
    }

    public static MTLCPUCacheMode of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLCPUCacheMode: " + value);
        }
        return VALUES[(int) value];
    }
}
