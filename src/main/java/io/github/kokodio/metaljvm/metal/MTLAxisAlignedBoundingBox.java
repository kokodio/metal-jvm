package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

/**
 * {@code MTLAxisAlignedBoundingBox}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlaxisalignedboundingbox-c.struct">Apple documentation</a>
 */
public record MTLAxisAlignedBoundingBox(MTLPackedFloat3 min, MTLPackedFloat3 max) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            MTLPackedFloat3.LAYOUT.withName("min"),
            MTLPackedFloat3.LAYOUT.withName("max")
    ).withName("MTLAxisAlignedBoundingBox");

    public static MTLAxisAlignedBoundingBox read(final MemorySegment segment) {
        return new MTLAxisAlignedBoundingBox(
                MTLPackedFloat3.read(segment.asSlice(0, MTLPackedFloat3.LAYOUT)),
                MTLPackedFloat3.read(segment.asSlice(12, MTLPackedFloat3.LAYOUT))
        );
    }

    public void write(final MemorySegment segment) {
        this.min.write(segment.asSlice(0, MTLPackedFloat3.LAYOUT));
        this.max.write(segment.asSlice(12, MTLPackedFloat3.LAYOUT));
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }
}
