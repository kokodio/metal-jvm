package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLCommandBufferErrorOption}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlcommandbuffererroroption">Apple documentation</a>
 */
public final class MTLCommandBufferErrorOption {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long None = 0L;
    public static final long EncoderExecutionStatus = 1L;

    private MTLCommandBufferErrorOption() {
    }
}
