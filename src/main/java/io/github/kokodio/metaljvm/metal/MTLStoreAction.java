package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLStoreAction}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlstoreaction">Apple documentation</a>
 */
public enum MTLStoreAction {
    DontCare(0L),
    Store(1L),
    MultisampleResolve(2L),
    StoreAndMultisampleResolve(3L),
    Unknown(4L),
    CustomSampleDepthStore(5L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLStoreAction[] VALUES = values();

    public final long value;

    MTLStoreAction(final long value) {
        this.value = value;
    }

    public static MTLStoreAction of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLStoreAction: " + value);
        }
        return VALUES[(int) value];
    }
}
