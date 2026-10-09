package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

/**
 * {@code MTLPackedFloat3}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlpackedfloat3-c.struct">Apple documentation</a>
 */
public record MTLPackedFloat3(float x, float y, float z) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            ValueLayout.JAVA_FLOAT.withName("x"),
            ValueLayout.JAVA_FLOAT.withName("y"),
            ValueLayout.JAVA_FLOAT.withName("z")
    ).withName("MTLPackedFloat3");

    public static MTLPackedFloat3 read(final MemorySegment segment) {
        return new MTLPackedFloat3(
                segment.get(ValueLayout.JAVA_FLOAT, 0),
                segment.get(ValueLayout.JAVA_FLOAT, 4),
                segment.get(ValueLayout.JAVA_FLOAT, 8)
        );
    }

    public void write(final MemorySegment segment) {
        segment.set(ValueLayout.JAVA_FLOAT, 0, this.x);
        segment.set(ValueLayout.JAVA_FLOAT, 4, this.y);
        segment.set(ValueLayout.JAVA_FLOAT, 8, this.z);
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }
}
