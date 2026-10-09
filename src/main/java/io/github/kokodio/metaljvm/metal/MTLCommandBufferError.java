package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLCommandBufferError}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlcommandbuffererror-swift.struct/code">Apple documentation</a>
 */
public enum MTLCommandBufferError {
    None(0L),
    Internal(1L),
    Timeout(2L),
    PageFault(3L),
    Blacklisted(4L),
    AccessRevoked(4L),
    NotPermitted(7L),
    OutOfMemory(8L),
    InvalidResource(9L),
    Memoryless(10L),
    DeviceRemoved(11L),
    StackOverflow(12L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public final long value;

    MTLCommandBufferError(final long value) {
        this.value = value;
    }

    public static MTLCommandBufferError of(final long value) {
        if ((int) value == value) {
            switch ((int) value) {
                case 0: return None;
                case 1: return Internal;
                case 2: return Timeout;
                case 3: return PageFault;
                case 4: return Blacklisted;
                case 7: return NotPermitted;
                case 8: return OutOfMemory;
                case 9: return InvalidResource;
                case 10: return Memoryless;
                case 11: return DeviceRemoved;
                case 12: return StackOverflow;
            }
        }
        throw new IllegalArgumentException("Unknown MTLCommandBufferError: " + value);
    }
}
