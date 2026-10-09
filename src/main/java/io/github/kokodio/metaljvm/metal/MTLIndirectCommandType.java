package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLIndirectCommandType}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlindirectcommandtype">Apple documentation</a>
 */
public final class MTLIndirectCommandType {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long Draw = 1L;
    public static final long DrawIndexed = 2L;
    public static final long DrawPatches = 4L;
    public static final long DrawIndexedPatches = 8L;
    public static final long ConcurrentDispatch = 32L;
    public static final long ConcurrentDispatchThreads = 64L;
    public static final long DrawMeshThreadgroups = 128L;
    public static final long DrawMeshThreads = 256L;

    private MTLIndirectCommandType() {
    }
}
