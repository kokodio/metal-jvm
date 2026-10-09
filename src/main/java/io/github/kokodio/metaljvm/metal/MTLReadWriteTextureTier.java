package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLReadWriteTextureTier}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlreadwritetexturetier">Apple documentation</a>
 */
public enum MTLReadWriteTextureTier {
    TierNone(0L),
    Tier1(1L),
    Tier2(2L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLReadWriteTextureTier[] VALUES = values();

    public final long value;

    MTLReadWriteTextureTier(final long value) {
        this.value = value;
    }

    public static MTLReadWriteTextureTier of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLReadWriteTextureTier: " + value);
        }
        return VALUES[(int) value];
    }
}
