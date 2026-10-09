package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLTextureSparseTier}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtltexturesparsetier">Apple documentation</a>
 */
public enum MTLTextureSparseTier {
    TierNone(0L),
    Tier1(1L),
    Tier2(2L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLTextureSparseTier[] VALUES = values();

    public final long value;

    MTLTextureSparseTier(final long value) {
        this.value = value;
    }

    public static MTLTextureSparseTier of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLTextureSparseTier: " + value);
        }
        return VALUES[(int) value];
    }
}
