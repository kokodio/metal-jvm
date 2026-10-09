package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLAccelerationStructureUsage}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlaccelerationstructureusage">Apple documentation</a>
 */
public final class MTLAccelerationStructureUsage {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long None = 0L;
    public static final long Refit = 1L;
    public static final long PreferFastBuild = 2L;
    public static final long ExtendedLimits = 4L;
    public static final long PreferFastIntersection = 16L;
    public static final long MinimizeMemory = 32L;

    private MTLAccelerationStructureUsage() {
    }
}
