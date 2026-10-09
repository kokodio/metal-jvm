package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

/**
 * {@code MTLAccelerationStructureMotionInstanceDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlaccelerationstructuremotioninstancedescriptor">Apple documentation</a>
 */
public record MTLAccelerationStructureMotionInstanceDescriptor(int options, int mask, int intersectionFunctionTableOffset, int accelerationStructureIndex, int userID, int motionTransformsStartIndex, int motionTransformsCount, int motionStartBorderMode, int motionEndBorderMode, float motionStartTime, float motionEndTime) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            ValueLayout.JAVA_INT.withName("options"),
            ValueLayout.JAVA_INT.withName("mask"),
            ValueLayout.JAVA_INT.withName("intersectionFunctionTableOffset"),
            ValueLayout.JAVA_INT.withName("accelerationStructureIndex"),
            ValueLayout.JAVA_INT.withName("userID"),
            ValueLayout.JAVA_INT.withName("motionTransformsStartIndex"),
            ValueLayout.JAVA_INT.withName("motionTransformsCount"),
            ValueLayout.JAVA_INT.withName("motionStartBorderMode"),
            ValueLayout.JAVA_INT.withName("motionEndBorderMode"),
            ValueLayout.JAVA_FLOAT.withName("motionStartTime"),
            ValueLayout.JAVA_FLOAT.withName("motionEndTime")
    ).withName("MTLAccelerationStructureMotionInstanceDescriptor");

    public static MTLAccelerationStructureMotionInstanceDescriptor read(final MemorySegment segment) {
        return new MTLAccelerationStructureMotionInstanceDescriptor(
                segment.get(ValueLayout.JAVA_INT, 0),
                segment.get(ValueLayout.JAVA_INT, 4),
                segment.get(ValueLayout.JAVA_INT, 8),
                segment.get(ValueLayout.JAVA_INT, 12),
                segment.get(ValueLayout.JAVA_INT, 16),
                segment.get(ValueLayout.JAVA_INT, 20),
                segment.get(ValueLayout.JAVA_INT, 24),
                segment.get(ValueLayout.JAVA_INT, 28),
                segment.get(ValueLayout.JAVA_INT, 32),
                segment.get(ValueLayout.JAVA_FLOAT, 36),
                segment.get(ValueLayout.JAVA_FLOAT, 40)
        );
    }

    public void write(final MemorySegment segment) {
        segment.set(ValueLayout.JAVA_INT, 0, this.options);
        segment.set(ValueLayout.JAVA_INT, 4, this.mask);
        segment.set(ValueLayout.JAVA_INT, 8, this.intersectionFunctionTableOffset);
        segment.set(ValueLayout.JAVA_INT, 12, this.accelerationStructureIndex);
        segment.set(ValueLayout.JAVA_INT, 16, this.userID);
        segment.set(ValueLayout.JAVA_INT, 20, this.motionTransformsStartIndex);
        segment.set(ValueLayout.JAVA_INT, 24, this.motionTransformsCount);
        segment.set(ValueLayout.JAVA_INT, 28, this.motionStartBorderMode);
        segment.set(ValueLayout.JAVA_INT, 32, this.motionEndBorderMode);
        segment.set(ValueLayout.JAVA_FLOAT, 36, this.motionStartTime);
        segment.set(ValueLayout.JAVA_FLOAT, 40, this.motionEndTime);
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }
}
