package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLCullMode}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlcullmode">Apple documentation</a>
 */
public enum MTLCullMode {
    None(0L),
    Front(1L),
    Back(2L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLCullMode[] VALUES = values();

    public final long value;

    MTLCullMode(final long value) {
        this.value = value;
    }

    public static MTLCullMode of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLCullMode: " + value);
        }
        return VALUES[(int) value];
    }
}
