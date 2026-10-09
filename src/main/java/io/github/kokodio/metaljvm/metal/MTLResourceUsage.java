package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLResourceUsage}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlresourceusage">Apple documentation</a>
 */
public final class MTLResourceUsage {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long Read = 1L;
    public static final long Write = 2L;
    public static final long Sample = 4L;

    private MTLResourceUsage() {
    }
}
