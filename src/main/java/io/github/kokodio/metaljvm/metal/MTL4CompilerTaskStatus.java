package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTL4CompilerTaskStatus}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4compilertaskstatus">Apple documentation</a>
 */
public enum MTL4CompilerTaskStatus {
    None(0L),
    Scheduled(1L),
    Compiling(2L),
    Finished(3L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTL4CompilerTaskStatus[] VALUES = values();

    public final long value;

    MTL4CompilerTaskStatus(final long value) {
        this.value = value;
    }

    public static MTL4CompilerTaskStatus of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTL4CompilerTaskStatus: " + value);
        }
        return VALUES[(int) value];
    }
}
