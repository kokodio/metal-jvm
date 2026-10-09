package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLArgumentBuffersTier}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlargumentbufferstier">Apple documentation</a>
 */
public enum MTLArgumentBuffersTier {
    Tier1(0L),
    Tier2(1L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLArgumentBuffersTier[] VALUES = values();

    public final long value;

    MTLArgumentBuffersTier(final long value) {
        this.value = value;
    }

    public static MTLArgumentBuffersTier of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLArgumentBuffersTier: " + value);
        }
        return VALUES[(int) value];
    }
}
