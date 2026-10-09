package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLCaptureError}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlcaptureerror">Apple documentation</a>
 */
public enum MTLCaptureError {
    NotSupported(1L),
    AlreadyCapturing(2L),
    InvalidDescriptor(3L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public final long value;

    MTLCaptureError(final long value) {
        this.value = value;
    }

    public static MTLCaptureError of(final long value) {
        if ((int) value == value) {
            switch ((int) value) {
                case 1: return NotSupported;
                case 2: return AlreadyCapturing;
                case 3: return InvalidDescriptor;
            }
        }
        throw new IllegalArgumentException("Unknown MTLCaptureError: " + value);
    }
}
