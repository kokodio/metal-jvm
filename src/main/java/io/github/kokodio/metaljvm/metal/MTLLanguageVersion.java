package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLLanguageVersion}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtllanguageversion">Apple documentation</a>
 */
public enum MTLLanguageVersion {
    Version1_0(0x10000L),
    Version1_1(0x10001L),
    Version1_2(0x10002L),
    Version2_0(0x20000L),
    Version2_1(0x20001L),
    Version2_2(0x20002L),
    Version2_3(0x20003L),
    Version2_4(0x20004L),
    Version3_0(0x30000L),
    Version3_1(0x30001L),
    Version3_2(0x30002L),
    Version4_0(0x40000L),
    Version4_1(0x40001L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public final long value;

    MTLLanguageVersion(final long value) {
        this.value = value;
    }

    public static MTLLanguageVersion of(final long value) {
        if ((int) value == value) {
            switch ((int) value) {
                case 65536: return Version1_0;
                case 65537: return Version1_1;
                case 65538: return Version1_2;
                case 131072: return Version2_0;
                case 131073: return Version2_1;
                case 131074: return Version2_2;
                case 131075: return Version2_3;
                case 131076: return Version2_4;
                case 196608: return Version3_0;
                case 196609: return Version3_1;
                case 196610: return Version3_2;
                case 262144: return Version4_0;
                case 262145: return Version4_1;
            }
        }
        throw new IllegalArgumentException("Unknown MTLLanguageVersion: " + value);
    }
}
