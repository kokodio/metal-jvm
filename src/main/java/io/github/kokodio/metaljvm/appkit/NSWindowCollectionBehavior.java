package io.github.kokodio.metaljvm.appkit;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSWindowCollectionBehavior}
 *
 * @see <a href="https://developer.apple.com/documentation/appkit/nswindow/collectionbehavior-swift.struct">Apple documentation</a>
 */
public final class NSWindowCollectionBehavior {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long Default = 0L;
    public static final long CanJoinAllSpaces = 1L;
    public static final long MoveToActiveSpace = 2L;
    public static final long Managed = 4L;
    public static final long Transient = 8L;
    public static final long Stationary = 16L;
    public static final long ParticipatesInCycle = 32L;
    public static final long IgnoresCycle = 64L;
    public static final long FullScreenPrimary = 128L;
    public static final long FullScreenAuxiliary = 256L;
    public static final long FullScreenNone = 512L;
    public static final long FullScreenAllowsTiling = 2048L;
    public static final long FullScreenDisallowsTiling = 4096L;
    public static final long Primary = 0x10000L;
    public static final long Auxiliary = 0x20000L;
    public static final long CanJoinAllApplications = 0x40000L;

    private NSWindowCollectionBehavior() {
    }
}
