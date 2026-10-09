package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

/**
 * {@code MTLPackedFloatQuaternion}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlpackedfloatquaternion">Apple documentation</a>
 */
public record MTLPackedFloatQuaternion(float x, float y, float z, float w) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            ValueLayout.JAVA_FLOAT.withName("x"),
            ValueLayout.JAVA_FLOAT.withName("y"),
            ValueLayout.JAVA_FLOAT.withName("z"),
            ValueLayout.JAVA_FLOAT.withName("w")
    ).withName("MTLPackedFloatQuaternion");

    public static MTLPackedFloatQuaternion read(final MemorySegment segment) {
        return new MTLPackedFloatQuaternion(
                segment.get(ValueLayout.JAVA_FLOAT, 0),
                segment.get(ValueLayout.JAVA_FLOAT, 4),
                segment.get(ValueLayout.JAVA_FLOAT, 8),
                segment.get(ValueLayout.JAVA_FLOAT, 12)
        );
    }

    public void write(final MemorySegment segment) {
        segment.set(ValueLayout.JAVA_FLOAT, 0, this.x);
        segment.set(ValueLayout.JAVA_FLOAT, 4, this.y);
        segment.set(ValueLayout.JAVA_FLOAT, 8, this.z);
        segment.set(ValueLayout.JAVA_FLOAT, 12, this.w);
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }
}
