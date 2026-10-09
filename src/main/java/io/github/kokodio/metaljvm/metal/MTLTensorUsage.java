package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLTensorUsage}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtltensorusage">Apple documentation</a>
 */
public final class MTLTensorUsage {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long Compute = 1L;
    public static final long Render = 2L;
    public static final long MachineLearning = 4L;

    private MTLTensorUsage() {
    }
}
