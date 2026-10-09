package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLIOPriority}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtliopriority">Apple documentation</a>
 */
public enum MTLIOPriority {
    High(0L),
    Normal(1L),
    Low(2L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLIOPriority[] VALUES = values();

    public final long value;

    MTLIOPriority(final long value) {
        this.value = value;
    }

    public static MTLIOPriority of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLIOPriority: " + value);
        }
        return VALUES[(int) value];
    }
}
