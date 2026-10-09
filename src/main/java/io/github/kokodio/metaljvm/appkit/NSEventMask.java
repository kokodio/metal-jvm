package io.github.kokodio.metaljvm.appkit;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSEventMask}
 *
 * @see <a href="https://developer.apple.com/documentation/appkit/nsevent/eventtypemask">Apple documentation</a>
 */
public final class NSEventMask {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long LeftMouseDown = 2L;
    public static final long LeftMouseUp = 4L;
    public static final long RightMouseDown = 8L;
    public static final long RightMouseUp = 16L;
    public static final long MouseMoved = 32L;
    public static final long LeftMouseDragged = 64L;
    public static final long RightMouseDragged = 128L;
    public static final long MouseEntered = 256L;
    public static final long MouseExited = 512L;
    public static final long KeyDown = 1024L;
    public static final long KeyUp = 2048L;
    public static final long FlagsChanged = 4096L;
    public static final long AppKitDefined = 8192L;
    public static final long SystemDefined = 16384L;
    public static final long ApplicationDefined = 32768L;
    public static final long Periodic = 0x10000L;
    public static final long CursorUpdate = 0x20000L;
    public static final long ScrollWheel = 0x400000L;
    public static final long TabletPoint = 0x800000L;
    public static final long TabletProximity = 0x1000000L;
    public static final long OtherMouseDown = 0x2000000L;
    public static final long OtherMouseUp = 0x4000000L;
    public static final long OtherMouseDragged = 0x8000000L;
    public static final long Gesture = 0x20000000L;
    public static final long Magnify = 0x40000000L;
    public static final long Swipe = 0x80000000L;
    public static final long Rotate = 0x40000L;
    public static final long BeginGesture = 0x80000L;
    public static final long EndGesture = 0x100000L;
    public static final long SmartMagnify = 0x100000000L;
    public static final long Pressure = 0x400000000L;
    public static final long DirectTouch = 0x2000000000L;
    public static final long ChangeMode = 0x4000000000L;
    public static final long MouseCancelled = 0x10000000000L;
    public static final long Any = 0xFFFFFFFFFFFFFFFFL;

    private NSEventMask() {
    }
}
