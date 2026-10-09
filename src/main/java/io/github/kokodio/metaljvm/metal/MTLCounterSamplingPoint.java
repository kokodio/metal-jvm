package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLCounterSamplingPoint}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlcountersamplingpoint">Apple documentation</a>
 */
public enum MTLCounterSamplingPoint {
    AtStageBoundary(0L),
    AtDrawBoundary(1L),
    AtDispatchBoundary(2L),
    AtTileDispatchBoundary(3L),
    AtBlitBoundary(4L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLCounterSamplingPoint[] VALUES = values();

    public final long value;

    MTLCounterSamplingPoint(final long value) {
        this.value = value;
    }

    public static MTLCounterSamplingPoint of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLCounterSamplingPoint: " + value);
        }
        return VALUES[(int) value];
    }
}
