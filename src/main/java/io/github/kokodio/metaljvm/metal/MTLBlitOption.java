package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLBlitOption}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlblitoption">Apple documentation</a>
 */
public final class MTLBlitOption {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long None = 0L;
    public static final long DepthFromDepthStencil = 1L;
    public static final long StencilFromDepthStencil = 2L;
    public static final long RowLinearPVRTC = 4L;

    private MTLBlitOption() {
    }
}
