package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

/**
 * {@code MTLSizeAndAlign}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlsizeandalign">Apple documentation</a>
 */
public record MTLSizeAndAlign(long size, long align) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            ValueLayout.JAVA_LONG.withName("size"),
            ValueLayout.JAVA_LONG.withName("align")
    ).withName("MTLSizeAndAlign");

    public static MTLSizeAndAlign read(final MemorySegment segment) {
        return new MTLSizeAndAlign(
                segment.get(ValueLayout.JAVA_LONG, 0),
                segment.get(ValueLayout.JAVA_LONG, 8)
        );
    }

    public void write(final MemorySegment segment) {
        segment.set(ValueLayout.JAVA_LONG, 0, this.size);
        segment.set(ValueLayout.JAVA_LONG, 8, this.align);
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }
}
