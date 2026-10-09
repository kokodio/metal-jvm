package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLResourceOptions}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlresourceoptions">Apple documentation</a>
 */
public final class MTLResourceOptions {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long CPUCacheModeDefaultCache = 0L;
    public static final long CPUCacheModeWriteCombined = 1L;
    public static final long StorageModeShared = 0L;
    public static final long StorageModeManaged = 16L;
    public static final long StorageModePrivate = 32L;
    public static final long StorageModeMemoryless = 48L;
    public static final long HazardTrackingModeDefault = 0L;
    public static final long HazardTrackingModeUntracked = 256L;
    public static final long HazardTrackingModeTracked = 512L;
    public static final long OptionCPUCacheModeDefault = 0L;
    public static final long OptionCPUCacheModeWriteCombined = 1L;

    private MTLResourceOptions() {
    }
}
