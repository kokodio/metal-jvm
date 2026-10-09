package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLStages}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlstages">Apple documentation</a>
 */
public final class MTLStages {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long Vertex = 1L;
    public static final long Fragment = 2L;
    public static final long Tile = 4L;
    public static final long Object = 8L;
    public static final long Mesh = 16L;
    public static final long ResourceState = 0x4000000L;
    public static final long Dispatch = 0x8000000L;
    public static final long Blit = 0x10000000L;
    public static final long AccelerationStructure = 0x20000000L;
    public static final long MachineLearning = 0x40000000L;
    public static final long All = 0x7FFFFFFFFFFFFFFFL;

    private MTLStages() {
    }
}
