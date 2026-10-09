package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

/**
 * {@code MTLSize}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlsize">Apple documentation</a>
 */
public record MTLSize(long width, long height, long depth) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            ValueLayout.JAVA_LONG.withName("width"),
            ValueLayout.JAVA_LONG.withName("height"),
            ValueLayout.JAVA_LONG.withName("depth")
    ).withName("MTLSize");

    public static MTLSize read(final MemorySegment segment) {
        return new MTLSize(
                segment.get(ValueLayout.JAVA_LONG, 0),
                segment.get(ValueLayout.JAVA_LONG, 8),
                segment.get(ValueLayout.JAVA_LONG, 16)
        );
    }

    public void write(final MemorySegment segment) {
        segment.set(ValueLayout.JAVA_LONG, 0, this.width);
        segment.set(ValueLayout.JAVA_LONG, 8, this.height);
        segment.set(ValueLayout.JAVA_LONG, 16, this.depth);
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }
}
