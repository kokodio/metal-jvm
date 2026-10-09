package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

/**
 * {@code MTLAccelerationStructureSizes}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlaccelerationstructuresizes">Apple documentation</a>
 */
public record MTLAccelerationStructureSizes(long accelerationStructureSize, long buildScratchBufferSize, long refitScratchBufferSize) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            ValueLayout.JAVA_LONG.withName("accelerationStructureSize"),
            ValueLayout.JAVA_LONG.withName("buildScratchBufferSize"),
            ValueLayout.JAVA_LONG.withName("refitScratchBufferSize")
    ).withName("MTLAccelerationStructureSizes");

    public static MTLAccelerationStructureSizes read(final MemorySegment segment) {
        return new MTLAccelerationStructureSizes(
                segment.get(ValueLayout.JAVA_LONG, 0),
                segment.get(ValueLayout.JAVA_LONG, 8),
                segment.get(ValueLayout.JAVA_LONG, 16)
        );
    }

    public void write(final MemorySegment segment) {
        segment.set(ValueLayout.JAVA_LONG, 0, this.accelerationStructureSize);
        segment.set(ValueLayout.JAVA_LONG, 8, this.buildScratchBufferSize);
        segment.set(ValueLayout.JAVA_LONG, 16, this.refitScratchBufferSize);
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }
}
