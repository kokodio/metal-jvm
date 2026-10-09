package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLBarrierScope}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlbarrierscope">Apple documentation</a>
 */
public final class MTLBarrierScope {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long Buffers = 1L;
    public static final long Textures = 2L;
    public static final long RenderTargets = 4L;

    private MTLBarrierScope() {
    }
}
