package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

/**
 * {@code MTL4TimestampHeapEntry}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4timestampheapentry">Apple documentation</a>
 */
public record MTL4TimestampHeapEntry(long timestamp) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            ValueLayout.JAVA_LONG.withName("timestamp")
    ).withName("MTL4TimestampHeapEntry");

    public static MTL4TimestampHeapEntry read(final MemorySegment segment) {
        return new MTL4TimestampHeapEntry(
                segment.get(ValueLayout.JAVA_LONG, 0)
        );
    }

    public void write(final MemorySegment segment) {
        segment.set(ValueLayout.JAVA_LONG, 0, this.timestamp);
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }
}
