package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLAccelerationStructureInstanceOptions}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlaccelerationstructureinstanceoptions">Apple documentation</a>
 */
public final class MTLAccelerationStructureInstanceOptions {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_INT;

    public static final long None = 0L;
    public static final long DisableTriangleCulling = 1L;
    public static final long TriangleFrontFacingWindingCounterClockwise = 2L;
    public static final long Opaque = 4L;
    public static final long NonOpaque = 8L;

    private MTLAccelerationStructureInstanceOptions() {
    }
}
