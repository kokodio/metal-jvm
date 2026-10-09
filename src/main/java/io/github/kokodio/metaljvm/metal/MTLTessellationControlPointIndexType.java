package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLTessellationControlPointIndexType}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtltessellationcontrolpointindextype">Apple documentation</a>
 */
public enum MTLTessellationControlPointIndexType {
    None(0L),
    UInt16(1L),
    UInt32(2L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLTessellationControlPointIndexType[] VALUES = values();

    public final long value;

    MTLTessellationControlPointIndexType(final long value) {
        this.value = value;
    }

    public static MTLTessellationControlPointIndexType of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLTessellationControlPointIndexType: " + value);
        }
        return VALUES[(int) value];
    }
}
