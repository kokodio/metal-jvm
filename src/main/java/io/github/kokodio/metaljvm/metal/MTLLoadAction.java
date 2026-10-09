package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLLoadAction}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlloadaction">Apple documentation</a>
 */
public enum MTLLoadAction {
    DontCare(0L),
    Load(1L),
    Clear(2L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLLoadAction[] VALUES = values();

    public final long value;

    MTLLoadAction(final long value) {
        this.value = value;
    }

    public static MTLLoadAction of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLLoadAction: " + value);
        }
        return VALUES[(int) value];
    }
}
