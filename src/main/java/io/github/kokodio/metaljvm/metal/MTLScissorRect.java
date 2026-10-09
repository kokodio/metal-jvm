package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

/**
 * {@code MTLScissorRect}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlscissorrect">Apple documentation</a>
 */
public record MTLScissorRect(long x, long y, long width, long height) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            ValueLayout.JAVA_LONG.withName("x"),
            ValueLayout.JAVA_LONG.withName("y"),
            ValueLayout.JAVA_LONG.withName("width"),
            ValueLayout.JAVA_LONG.withName("height")
    ).withName("MTLScissorRect");

    public static MTLScissorRect read(final MemorySegment segment) {
        return new MTLScissorRect(
                segment.get(ValueLayout.JAVA_LONG, 0),
                segment.get(ValueLayout.JAVA_LONG, 8),
                segment.get(ValueLayout.JAVA_LONG, 16),
                segment.get(ValueLayout.JAVA_LONG, 24)
        );
    }

    public void write(final MemorySegment segment) {
        segment.set(ValueLayout.JAVA_LONG, 0, this.x);
        segment.set(ValueLayout.JAVA_LONG, 8, this.y);
        segment.set(ValueLayout.JAVA_LONG, 16, this.width);
        segment.set(ValueLayout.JAVA_LONG, 24, this.height);
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }
}
