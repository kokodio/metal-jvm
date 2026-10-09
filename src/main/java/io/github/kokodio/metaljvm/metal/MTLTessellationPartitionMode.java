package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLTessellationPartitionMode}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtltessellationpartitionmode">Apple documentation</a>
 */
public enum MTLTessellationPartitionMode {
    Pow2(0L),
    Integer(1L),
    FractionalOdd(2L),
    FractionalEven(3L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLTessellationPartitionMode[] VALUES = values();

    public final long value;

    MTLTessellationPartitionMode(final long value) {
        this.value = value;
    }

    public static MTLTessellationPartitionMode of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLTessellationPartitionMode: " + value);
        }
        return VALUES[(int) value];
    }
}
