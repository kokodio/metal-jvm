package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLCaptureDestination}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlcapturedestination">Apple documentation</a>
 */
public enum MTLCaptureDestination {
    DeveloperTools(1L),
    GPUTraceDocument(2L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public final long value;

    MTLCaptureDestination(final long value) {
        this.value = value;
    }

    public static MTLCaptureDestination of(final long value) {
        if ((int) value == value) {
            switch ((int) value) {
                case 1: return DeveloperTools;
                case 2: return GPUTraceDocument;
            }
        }
        throw new IllegalArgumentException("Unknown MTLCaptureDestination: " + value);
    }
}
