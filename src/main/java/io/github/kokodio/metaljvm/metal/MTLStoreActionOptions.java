package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLStoreActionOptions}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlstoreactionoptions">Apple documentation</a>
 */
public final class MTLStoreActionOptions {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long None = 0L;
    public static final long CustomSamplePositions = 1L;

    private MTLStoreActionOptions() {
    }
}
