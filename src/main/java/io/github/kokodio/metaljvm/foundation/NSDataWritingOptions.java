package io.github.kokodio.metaljvm.foundation;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSDataWritingOptions}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/nsdata/writingoptions">Apple documentation</a>
 */
public final class NSDataWritingOptions {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long DataWritingAtomic = 1L;
    public static final long DataWritingWithoutOverwriting = 2L;
    public static final long DataWritingFileProtectionNone = 0x10000000L;
    public static final long DataWritingFileProtectionComplete = 0x20000000L;
    public static final long DataWritingFileProtectionCompleteUnlessOpen = 0x30000000L;
    public static final long DataWritingFileProtectionCompleteUntilFirstUserAuthentication = 0x40000000L;
    public static final long DataWritingFileProtectionCompleteWhenUserInactive = 0x50000000L;
    public static final long DataWritingFileProtectionMask = 0xF0000000L;
    public static final long AtomicWrite = 1L;

    private NSDataWritingOptions() {
    }
}
