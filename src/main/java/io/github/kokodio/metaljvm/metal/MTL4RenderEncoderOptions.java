package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTL4RenderEncoderOptions}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4renderencoderoptions">Apple documentation</a>
 */
public final class MTL4RenderEncoderOptions {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long None = 0L;
    public static final long Suspending = 1L;
    public static final long Resuming = 2L;

    private MTL4RenderEncoderOptions() {
    }
}
