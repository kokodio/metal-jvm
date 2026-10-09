package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTL4AlphaToCoverageState}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4alphatocoveragestate">Apple documentation</a>
 */
public enum MTL4AlphaToCoverageState {
    Disabled(0L),
    Enabled(1L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTL4AlphaToCoverageState[] VALUES = values();

    public final long value;

    MTL4AlphaToCoverageState(final long value) {
        this.value = value;
    }

    public static MTL4AlphaToCoverageState of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTL4AlphaToCoverageState: " + value);
        }
        return VALUES[(int) value];
    }
}
