package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

/**
 * {@code MTLIndirectAccelerationStructureMotionInstanceDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlindirectaccelerationstructuremotioninstancedescriptor">Apple documentation</a>
 */
public record MTLIndirectAccelerationStructureMotionInstanceDescriptor(int options, int mask, int intersectionFunctionTableOffset, int userID, MTLResourceID accelerationStructureID, int motionTransformsStartIndex, int motionTransformsCount, int motionStartBorderMode, int motionEndBorderMode, float motionStartTime, float motionEndTime) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            ValueLayout.JAVA_INT.withName("options"),
            ValueLayout.JAVA_INT.withName("mask"),
            ValueLayout.JAVA_INT.withName("intersectionFunctionTableOffset"),
            ValueLayout.JAVA_INT.withName("userID"),
            MTLResourceID.LAYOUT.withName("accelerationStructureID"),
            ValueLayout.JAVA_INT.withName("motionTransformsStartIndex"),
            ValueLayout.JAVA_INT.withName("motionTransformsCount"),
            ValueLayout.JAVA_INT.withName("motionStartBorderMode"),
            ValueLayout.JAVA_INT.withName("motionEndBorderMode"),
            ValueLayout.JAVA_FLOAT.withName("motionStartTime"),
            ValueLayout.JAVA_FLOAT.withName("motionEndTime")
    ).withName("MTLIndirectAccelerationStructureMotionInstanceDescriptor");

    public static MTLIndirectAccelerationStructureMotionInstanceDescriptor read(final MemorySegment segment) {
        return new MTLIndirectAccelerationStructureMotionInstanceDescriptor(
                segment.get(ValueLayout.JAVA_INT, 0),
                segment.get(ValueLayout.JAVA_INT, 4),
                segment.get(ValueLayout.JAVA_INT, 8),
                segment.get(ValueLayout.JAVA_INT, 12),
                MTLResourceID.read(segment.asSlice(16, MTLResourceID.LAYOUT)),
                segment.get(ValueLayout.JAVA_INT, 24),
                segment.get(ValueLayout.JAVA_INT, 28),
                segment.get(ValueLayout.JAVA_INT, 32),
                segment.get(ValueLayout.JAVA_INT, 36),
                segment.get(ValueLayout.JAVA_FLOAT, 40),
                segment.get(ValueLayout.JAVA_FLOAT, 44)
        );
    }

    public void write(final MemorySegment segment) {
        segment.set(ValueLayout.JAVA_INT, 0, this.options);
        segment.set(ValueLayout.JAVA_INT, 4, this.mask);
        segment.set(ValueLayout.JAVA_INT, 8, this.intersectionFunctionTableOffset);
        segment.set(ValueLayout.JAVA_INT, 12, this.userID);
        this.accelerationStructureID.write(segment.asSlice(16, MTLResourceID.LAYOUT));
        segment.set(ValueLayout.JAVA_INT, 24, this.motionTransformsStartIndex);
        segment.set(ValueLayout.JAVA_INT, 28, this.motionTransformsCount);
        segment.set(ValueLayout.JAVA_INT, 32, this.motionStartBorderMode);
        segment.set(ValueLayout.JAVA_INT, 36, this.motionEndBorderMode);
        segment.set(ValueLayout.JAVA_FLOAT, 40, this.motionStartTime);
        segment.set(ValueLayout.JAVA_FLOAT, 44, this.motionEndTime);
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }
}
