package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLBufferSparseTier}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlbuffersparsetier">Apple documentation</a>
 */
public enum MTLBufferSparseTier {
    TierNone(0L),
    Tier1(1L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLBufferSparseTier[] VALUES = values();

    public final long value;

    MTLBufferSparseTier(final long value) {
        this.value = value;
    }

    public static MTLBufferSparseTier of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLBufferSparseTier: " + value);
        }
        return VALUES[(int) value];
    }
}
