package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLDeviceError}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtldeviceerror-swift.struct/code">Apple documentation</a>
 */
public enum MTLDeviceError {
    None(0L),
    NotSupported(1L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLDeviceError[] VALUES = values();

    public final long value;

    MTLDeviceError(final long value) {
        this.value = value;
    }

    public static MTLDeviceError of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLDeviceError: " + value);
        }
        return VALUES[(int) value];
    }
}
