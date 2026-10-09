package io.github.kokodio.metaljvm.appkit;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSEventModifierFlags}
 *
 * @see <a href="https://developer.apple.com/documentation/appkit/nsevent/modifierflags-swift.struct">Apple documentation</a>
 */
public final class NSEventModifierFlags {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long CapsLock = 0x10000L;
    public static final long Shift = 0x20000L;
    public static final long Control = 0x40000L;
    public static final long Option = 0x80000L;
    public static final long Command = 0x100000L;
    public static final long NumericPad = 0x200000L;
    public static final long Help = 0x400000L;
    public static final long Function = 0x800000L;
    public static final long DeviceIndependentFlagsMask = 0xFFFF0000L;

    private NSEventModifierFlags() {
    }
}
