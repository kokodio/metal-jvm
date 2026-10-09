package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

/**
 * {@code MTLAccelerationStructureInstanceDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlaccelerationstructureinstancedescriptor">Apple documentation</a>
 */
public record MTLAccelerationStructureInstanceDescriptor(MTLPackedFloat4x3 transformationMatrix, int options, int mask, int intersectionFunctionTableOffset, int accelerationStructureIndex) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            MTLPackedFloat4x3.LAYOUT.withName("transformationMatrix"),
            ValueLayout.JAVA_INT.withName("options"),
            ValueLayout.JAVA_INT.withName("mask"),
            ValueLayout.JAVA_INT.withName("intersectionFunctionTableOffset"),
            ValueLayout.JAVA_INT.withName("accelerationStructureIndex")
    ).withName("MTLAccelerationStructureInstanceDescriptor");

    public static MTLAccelerationStructureInstanceDescriptor read(final MemorySegment segment) {
        return new MTLAccelerationStructureInstanceDescriptor(
                MTLPackedFloat4x3.read(segment.asSlice(0, MTLPackedFloat4x3.LAYOUT)),
                segment.get(ValueLayout.JAVA_INT, 48),
                segment.get(ValueLayout.JAVA_INT, 52),
                segment.get(ValueLayout.JAVA_INT, 56),
                segment.get(ValueLayout.JAVA_INT, 60)
        );
    }

    public void write(final MemorySegment segment) {
        this.transformationMatrix.write(segment.asSlice(0, MTLPackedFloat4x3.LAYOUT));
        segment.set(ValueLayout.JAVA_INT, 48, this.options);
        segment.set(ValueLayout.JAVA_INT, 52, this.mask);
        segment.set(ValueLayout.JAVA_INT, 56, this.intersectionFunctionTableOffset);
        segment.set(ValueLayout.JAVA_INT, 60, this.accelerationStructureIndex);
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }
}
