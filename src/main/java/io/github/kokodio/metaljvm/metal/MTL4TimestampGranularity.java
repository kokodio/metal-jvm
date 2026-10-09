package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTL4TimestampGranularity}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4timestampgranularity">Apple documentation</a>
 */
public enum MTL4TimestampGranularity {
    Relaxed(0L),
    Precise(1L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTL4TimestampGranularity[] VALUES = values();

    public final long value;

    MTL4TimestampGranularity(final long value) {
        this.value = value;
    }

    public static MTL4TimestampGranularity of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTL4TimestampGranularity: " + value);
        }
        return VALUES[(int) value];
    }
}
