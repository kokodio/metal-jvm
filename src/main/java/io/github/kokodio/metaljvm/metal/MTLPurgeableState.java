package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLPurgeableState}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlpurgeablestate">Apple documentation</a>
 */
public enum MTLPurgeableState {
    KeepCurrent(1L),
    NonVolatile(2L),
    Volatile(3L),
    Empty(4L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public final long value;

    MTLPurgeableState(final long value) {
        this.value = value;
    }

    public static MTLPurgeableState of(final long value) {
        if ((int) value == value) {
            switch ((int) value) {
                case 1: return KeepCurrent;
                case 2: return NonVolatile;
                case 3: return Volatile;
                case 4: return Empty;
            }
        }
        throw new IllegalArgumentException("Unknown MTLPurgeableState: " + value);
    }
}
