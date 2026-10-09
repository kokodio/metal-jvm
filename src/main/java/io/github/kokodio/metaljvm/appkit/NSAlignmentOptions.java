package io.github.kokodio.metaljvm.appkit;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSAlignmentOptions}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/alignmentoptions">Apple documentation</a>
 */
public final class NSAlignmentOptions {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long MinXInward = 1L;
    public static final long MinYInward = 2L;
    public static final long MaxXInward = 4L;
    public static final long MaxYInward = 8L;
    public static final long WidthInward = 16L;
    public static final long HeightInward = 32L;
    public static final long MinXOutward = 256L;
    public static final long MinYOutward = 512L;
    public static final long MaxXOutward = 1024L;
    public static final long MaxYOutward = 2048L;
    public static final long WidthOutward = 4096L;
    public static final long HeightOutward = 8192L;
    public static final long MinXNearest = 0x10000L;
    public static final long MinYNearest = 0x20000L;
    public static final long MaxXNearest = 0x40000L;
    public static final long MaxYNearest = 0x80000L;
    public static final long WidthNearest = 0x100000L;
    public static final long HeightNearest = 0x200000L;
    public static final long RectFlipped = 0x8000000000000000L;
    public static final long AllEdgesInward = 15L;
    public static final long AllEdgesOutward = 3840L;
    public static final long AllEdgesNearest = 0xF0000L;

    private NSAlignmentOptions() {
    }
}
