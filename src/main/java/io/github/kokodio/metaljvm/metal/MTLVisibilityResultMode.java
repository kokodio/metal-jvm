package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLVisibilityResultMode}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlvisibilityresultmode">Apple documentation</a>
 */
public enum MTLVisibilityResultMode {
    Disabled(0L),
    Boolean(1L),
    Counting(2L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLVisibilityResultMode[] VALUES = values();

    public final long value;

    MTLVisibilityResultMode(final long value) {
        this.value = value;
    }

    public static MTLVisibilityResultMode of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLVisibilityResultMode: " + value);
        }
        return VALUES[(int) value];
    }
}
