package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLDeviceLocation}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtldevicelocation">Apple documentation</a>
 */
public enum MTLDeviceLocation {
    BuiltIn(0L),
    Slot(1L),
    External(2L),
    Unspecified(0xFFFFFFFFFFFFFFFFL);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public final long value;

    MTLDeviceLocation(final long value) {
        this.value = value;
    }

    public static MTLDeviceLocation of(final long value) {
        if ((int) value == value) {
            switch ((int) value) {
                case 0: return BuiltIn;
                case 1: return Slot;
                case 2: return External;
                case -1: return Unspecified;
            }
        }
        throw new IllegalArgumentException("Unknown MTLDeviceLocation: " + value);
    }
}
