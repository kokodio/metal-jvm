package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

/**
 * {@code MTL4BufferRange}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4bufferrange">Apple documentation</a>
 */
public record MTL4BufferRange(long bufferAddress, long length) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            ValueLayout.JAVA_LONG.withName("bufferAddress"),
            ValueLayout.JAVA_LONG.withName("length")
    ).withName("MTL4BufferRange");

    public static MTL4BufferRange read(final MemorySegment segment) {
        return new MTL4BufferRange(
                segment.get(ValueLayout.JAVA_LONG, 0),
                segment.get(ValueLayout.JAVA_LONG, 8)
        );
    }

    public void write(final MemorySegment segment) {
        segment.set(ValueLayout.JAVA_LONG, 0, this.bufferAddress);
        segment.set(ValueLayout.JAVA_LONG, 8, this.length);
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }
}
