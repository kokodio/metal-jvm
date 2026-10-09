package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLAccelerationStructureRefitOptions}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlaccelerationstructurerefitoptions">Apple documentation</a>
 */
public final class MTLAccelerationStructureRefitOptions {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long VertexData = 1L;
    public static final long PerPrimitiveData = 2L;

    private MTLAccelerationStructureRefitOptions() {
    }
}
