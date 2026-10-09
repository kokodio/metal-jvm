package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLBindingAccess}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlbindingaccess">Apple documentation</a>
 */
public enum MTLBindingAccess {
    BindingAccessReadOnly(0L),
    BindingAccessReadWrite(1L),
    BindingAccessWriteOnly(2L),
    ArgumentAccessReadOnly(0L),
    ArgumentAccessReadWrite(1L),
    ArgumentAccessWriteOnly(2L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public final long value;

    MTLBindingAccess(final long value) {
        this.value = value;
    }

    public static MTLBindingAccess of(final long value) {
        if ((int) value == value) {
            switch ((int) value) {
                case 0: return BindingAccessReadOnly;
                case 1: return BindingAccessReadWrite;
                case 2: return BindingAccessWriteOnly;
            }
        }
        throw new IllegalArgumentException("Unknown MTLBindingAccess: " + value);
    }
}
