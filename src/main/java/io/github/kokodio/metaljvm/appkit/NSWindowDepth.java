package io.github.kokodio.metaljvm.appkit;

import java.lang.foreign.ValueLayout;

/**
 * {@code NSWindowDepth}
 *
 * @see <a href="https://developer.apple.com/documentation/appkit/nswindow/depth">Apple documentation</a>
 */
public enum NSWindowDepth {
    TwentyfourBitRGB(520L),
    SixtyfourBitRGB(528L),
    OnehundredtwentyeightBitRGB(544L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_INT;

    public final long value;

    NSWindowDepth(final long value) {
        this.value = value;
    }

    public static NSWindowDepth of(final long value) {
        if ((int) value == value) {
            switch ((int) value) {
                case 520: return TwentyfourBitRGB;
                case 528: return SixtyfourBitRGB;
                case 544: return OnehundredtwentyeightBitRGB;
            }
        }
        throw new IllegalArgumentException("Unknown NSWindowDepth: " + value);
    }
}
