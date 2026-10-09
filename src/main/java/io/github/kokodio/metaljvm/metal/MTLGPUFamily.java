package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLGPUFamily}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlgpufamily">Apple documentation</a>
 */
public enum MTLGPUFamily {
    Apple1(1001L),
    Apple2(1002L),
    Apple3(1003L),
    Apple4(1004L),
    Apple5(1005L),
    Apple6(1006L),
    Apple7(1007L),
    Apple8(1008L),
    Apple9(1009L),
    Apple10(1010L),
    Apple11(1011L),
    Mac1(2001L),
    Mac2(2002L),
    Common1(3001L),
    Common2(3002L),
    Common3(3003L),
    MacCatalyst1(4001L),
    MacCatalyst2(4002L),
    Metal3(5001L),
    Metal4(5002L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public final long value;

    MTLGPUFamily(final long value) {
        this.value = value;
    }

    public static MTLGPUFamily of(final long value) {
        if ((int) value == value) {
            switch ((int) value) {
                case 1001: return Apple1;
                case 1002: return Apple2;
                case 1003: return Apple3;
                case 1004: return Apple4;
                case 1005: return Apple5;
                case 1006: return Apple6;
                case 1007: return Apple7;
                case 1008: return Apple8;
                case 1009: return Apple9;
                case 1010: return Apple10;
                case 1011: return Apple11;
                case 2001: return Mac1;
                case 2002: return Mac2;
                case 3001: return Common1;
                case 3002: return Common2;
                case 3003: return Common3;
                case 4001: return MacCatalyst1;
                case 4002: return MacCatalyst2;
                case 5001: return Metal3;
                case 5002: return Metal4;
            }
        }
        throw new IllegalArgumentException("Unknown MTLGPUFamily: " + value);
    }
}
