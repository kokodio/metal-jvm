package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLHazardTrackingMode}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlhazardtrackingmode">Apple documentation</a>
 */
public enum MTLHazardTrackingMode {
    Default(0L),
    Untracked(1L),
    Tracked(2L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLHazardTrackingMode[] VALUES = values();

    public final long value;

    MTLHazardTrackingMode(final long value) {
        this.value = value;
    }

    public static MTLHazardTrackingMode of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLHazardTrackingMode: " + value);
        }
        return VALUES[(int) value];
    }
}
