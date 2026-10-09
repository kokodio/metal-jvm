package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLAccelerationStructureInstanceDescriptorType}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlaccelerationstructureinstancedescriptortype">Apple documentation</a>
 */
public enum MTLAccelerationStructureInstanceDescriptorType {
    Default(0L),
    UserID(1L),
    Motion(2L),
    Indirect(3L),
    IndirectMotion(4L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTLAccelerationStructureInstanceDescriptorType[] VALUES = values();

    public final long value;

    MTLAccelerationStructureInstanceDescriptorType(final long value) {
        this.value = value;
    }

    public static MTLAccelerationStructureInstanceDescriptorType of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTLAccelerationStructureInstanceDescriptorType: " + value);
        }
        return VALUES[(int) value];
    }
}
