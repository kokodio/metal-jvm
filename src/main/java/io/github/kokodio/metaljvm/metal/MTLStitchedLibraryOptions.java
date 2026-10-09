package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLStitchedLibraryOptions}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlstitchedlibraryoptions">Apple documentation</a>
 */
public final class MTLStitchedLibraryOptions {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long None = 0L;
    public static final long FailOnBinaryArchiveMiss = 1L;
    public static final long StoreLibraryInMetalPipelinesScript = 2L;

    private MTLStitchedLibraryOptions() {
    }
}
