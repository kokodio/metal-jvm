package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLForwardProgressUsage}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlforwardprogressusage">Apple documentation</a>
 */
public enum MTLForwardProgressUsage {
    Automatic(0L),
    Weak(1L),
    SIMDGroupParallel(2L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLForwardProgressUsage[] VALUES = values();

    public final long value;

    MTLForwardProgressUsage(final long value) {
        this.value = value;
    }

    public static MTLForwardProgressUsage of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLForwardProgressUsage: " + value);
        }
        return VALUES[(int) value];
    }
}
