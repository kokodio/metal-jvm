package io.github.kokodio.metaljvm.coregraphics;

import java.lang.foreign.ValueLayout;

/**
 * {@code CGColorSpaceModel}
 *
 * @see <a href="https://developer.apple.com/documentation/coregraphics/cgcolorspacemodel">Apple documentation</a>
 */
public enum CGColorSpaceModel {
    kCGColorSpaceModelUnknown(0xFFFFFFFFFFFFFFFFL),
    kCGColorSpaceModelMonochrome(0L),
    kCGColorSpaceModelRGB(1L),
    kCGColorSpaceModelCMYK(2L),
    kCGColorSpaceModelLab(3L),
    kCGColorSpaceModelDeviceN(4L),
    kCGColorSpaceModelIndexed(5L),
    kCGColorSpaceModelPattern(6L),
    kCGColorSpaceModelXYZ(7L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_INT;

    public final long value;

    CGColorSpaceModel(final long value) {
        this.value = value;
    }

    public static CGColorSpaceModel of(final long value) {
        if ((int) value == value) {
            switch ((int) value) {
                case -1: return kCGColorSpaceModelUnknown;
                case 0: return kCGColorSpaceModelMonochrome;
                case 1: return kCGColorSpaceModelRGB;
                case 2: return kCGColorSpaceModelCMYK;
                case 3: return kCGColorSpaceModelLab;
                case 4: return kCGColorSpaceModelDeviceN;
                case 5: return kCGColorSpaceModelIndexed;
                case 6: return kCGColorSpaceModelPattern;
                case 7: return kCGColorSpaceModelXYZ;
            }
        }
        throw new IllegalArgumentException("Unknown CGColorSpaceModel: " + value);
    }
}
