package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;
import java.util.Arrays;

/**
 * {@code MTLPackedFloat4x3}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlpackedfloat4x3-c.struct">Apple documentation</a>
 */
public record MTLPackedFloat4x3(MTLPackedFloat3[] columns) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(4, MTLPackedFloat3.LAYOUT).withName("columns")
    ).withName("MTLPackedFloat4x3");

    public static MTLPackedFloat4x3 read(final MemorySegment segment) {
        return new MTLPackedFloat4x3(
                new MTLPackedFloat3[]{
                        MTLPackedFloat3.read(segment.asSlice(0, MTLPackedFloat3.LAYOUT)),
                        MTLPackedFloat3.read(segment.asSlice(12, MTLPackedFloat3.LAYOUT)),
                        MTLPackedFloat3.read(segment.asSlice(24, MTLPackedFloat3.LAYOUT)),
                        MTLPackedFloat3.read(segment.asSlice(36, MTLPackedFloat3.LAYOUT))
                }
        );
    }

    public void write(final MemorySegment segment) {
        this.columns[0].write(segment.asSlice(0, MTLPackedFloat3.LAYOUT));
        this.columns[1].write(segment.asSlice(12, MTLPackedFloat3.LAYOUT));
        this.columns[2].write(segment.asSlice(24, MTLPackedFloat3.LAYOUT));
        this.columns[3].write(segment.asSlice(36, MTLPackedFloat3.LAYOUT));
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }

    @Override
    public boolean equals(final Object other) {
        return other instanceof MTLPackedFloat4x3 that
                && Arrays.equals(this.columns, that.columns);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(this.columns);
        return result;
    }
}
