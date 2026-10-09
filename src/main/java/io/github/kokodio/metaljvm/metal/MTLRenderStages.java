package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLRenderStages}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlrenderstages">Apple documentation</a>
 */
public final class MTLRenderStages {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long Vertex = 1L;
    public static final long Fragment = 2L;
    public static final long Tile = 4L;
    public static final long Object = 8L;
    public static final long Mesh = 16L;

    private MTLRenderStages() {
    }
}
