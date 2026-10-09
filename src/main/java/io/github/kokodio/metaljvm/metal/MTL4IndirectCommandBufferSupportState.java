package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTL4IndirectCommandBufferSupportState}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4indirectcommandbuffersupportstate">Apple documentation</a>
 */
public enum MTL4IndirectCommandBufferSupportState {
    Disabled(0L),
    Enabled(1L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTL4IndirectCommandBufferSupportState[] VALUES = values();

    public final long value;

    MTL4IndirectCommandBufferSupportState(final long value) {
        this.value = value;
    }

    public static MTL4IndirectCommandBufferSupportState of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTL4IndirectCommandBufferSupportState: " + value);
        }
        return VALUES[(int) value];
    }
}
