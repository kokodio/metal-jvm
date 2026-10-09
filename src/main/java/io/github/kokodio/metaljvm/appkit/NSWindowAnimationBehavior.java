package io.github.kokodio.metaljvm.appkit;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSWindowAnimationBehavior}
 *
 * @see <a href="https://developer.apple.com/documentation/appkit/nswindow/animationbehavior-swift.enum">Apple documentation</a>
 */
public enum NSWindowAnimationBehavior {
    Default(0L),
    None(2L),
    DocumentWindow(3L),
    UtilityWindow(4L),
    AlertPanel(5L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public final long value;

    NSWindowAnimationBehavior(final long value) {
        this.value = value;
    }

    public static NSWindowAnimationBehavior of(final long value) {
        if ((int) value == value) {
            switch ((int) value) {
                case 0: return Default;
                case 2: return None;
                case 3: return DocumentWindow;
                case 4: return UtilityWindow;
                case 5: return AlertPanel;
            }
        }
        throw new IllegalArgumentException("Unknown NSWindowAnimationBehavior: " + value);
    }
}
