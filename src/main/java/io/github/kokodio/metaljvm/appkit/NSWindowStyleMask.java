package io.github.kokodio.metaljvm.appkit;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSWindowStyleMask}
 *
 * @see <a href="https://developer.apple.com/documentation/appkit/nswindow/stylemask-swift.struct">Apple documentation</a>
 */
public final class NSWindowStyleMask {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long Borderless = 0L;
    public static final long Titled = 1L;
    public static final long Closable = 2L;
    public static final long Miniaturizable = 4L;
    public static final long Resizable = 8L;
    public static final long TexturedBackground = 256L;
    public static final long UnifiedTitleAndToolbar = 4096L;
    public static final long FullScreen = 16384L;
    public static final long FullSizeContentView = 32768L;
    public static final long UtilityWindow = 16L;
    public static final long DocModalWindow = 64L;
    public static final long NonactivatingPanel = 128L;
    public static final long HUDWindow = 8192L;

    private NSWindowStyleMask() {
    }
}
