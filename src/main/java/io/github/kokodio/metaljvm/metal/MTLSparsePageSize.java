package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLSparsePageSize}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlsparsepagesize">Apple documentation</a>
 */
public enum MTLSparsePageSize {
    Size16(101L),
    Size64(102L),
    Size256(103L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public final long value;

    MTLSparsePageSize(final long value) {
        this.value = value;
    }

    public static MTLSparsePageSize of(final long value) {
        if ((int) value == value) {
            switch ((int) value) {
                case 101: return Size16;
                case 102: return Size64;
                case 103: return Size256;
            }
        }
        throw new IllegalArgumentException("Unknown MTLSparsePageSize: " + value);
    }
}
