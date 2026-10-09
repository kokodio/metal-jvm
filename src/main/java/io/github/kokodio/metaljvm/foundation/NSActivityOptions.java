package io.github.kokodio.metaljvm.foundation;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSActivityOptions}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/processinfo/activityoptions">Apple documentation</a>
 */
public final class NSActivityOptions {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long IdleDisplaySleepDisabled = 0x10000000000L;
    public static final long IdleSystemSleepDisabled = 0x100000L;
    public static final long SuddenTerminationDisabled = 16384L;
    public static final long AutomaticTerminationDisabled = 32768L;
    public static final long AnimationTrackingEnabled = 0x200000000000L;
    public static final long TrackingEnabled = 0x400000000000L;
    public static final long UserInitiated = 0xFFFFFFL;
    public static final long UserInitiatedAllowingIdleSystemSleep = 0xEFFFFFL;
    public static final long Background = 255L;
    public static final long LatencyCritical = 0xFF00000000L;
    public static final long UserInteractive = 0xFF00FFFFFFL;

    private NSActivityOptions() {
    }
}
