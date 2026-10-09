package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLStorageMode}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlstoragemode">Apple documentation</a>
 */
public enum MTLStorageMode {
    Shared(0L),
    Managed(1L),
    Private(2L),
    Memoryless(3L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLStorageMode[] VALUES = values();

    public final long value;

    MTLStorageMode(final long value) {
        this.value = value;
    }

    public static MTLStorageMode of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLStorageMode: " + value);
        }
        return VALUES[(int) value];
    }
}
