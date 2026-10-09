package io.github.kokodio.metaljvm.appkit;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSWindowButton}
 *
 * @see <a href="https://developer.apple.com/documentation/appkit/nswindow/buttontype">Apple documentation</a>
 */
public enum NSWindowButton {
    CloseButton(0L),
    MiniaturizeButton(1L),
    ZoomButton(2L),
    ToolbarButton(3L),
    DocumentIconButton(4L),
    DocumentVersionsButton(6L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public final long value;

    NSWindowButton(final long value) {
        this.value = value;
    }

    public static NSWindowButton of(final long value) {
        if ((int) value == value) {
            switch ((int) value) {
                case 0: return CloseButton;
                case 1: return MiniaturizeButton;
                case 2: return ZoomButton;
                case 3: return ToolbarButton;
                case 4: return DocumentIconButton;
                case 6: return DocumentVersionsButton;
            }
        }
        throw new IllegalArgumentException("Unknown NSWindowButton: " + value);
    }
}
