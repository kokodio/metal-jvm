package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

/**
 * {@code MTLIntersectionFunctionBufferArguments}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlintersectionfunctionbufferarguments">Apple documentation</a>
 */
public record MTLIntersectionFunctionBufferArguments(long intersectionFunctionBuffer, long intersectionFunctionBufferSize, long intersectionFunctionStride) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            ValueLayout.JAVA_LONG.withName("intersectionFunctionBuffer"),
            ValueLayout.JAVA_LONG.withName("intersectionFunctionBufferSize"),
            ValueLayout.JAVA_LONG.withName("intersectionFunctionStride")
    ).withName("MTLIntersectionFunctionBufferArguments");

    public static MTLIntersectionFunctionBufferArguments read(final MemorySegment segment) {
        return new MTLIntersectionFunctionBufferArguments(
                segment.get(ValueLayout.JAVA_LONG, 0),
                segment.get(ValueLayout.JAVA_LONG, 8),
                segment.get(ValueLayout.JAVA_LONG, 16)
        );
    }

    public void write(final MemorySegment segment) {
        segment.set(ValueLayout.JAVA_LONG, 0, this.intersectionFunctionBuffer);
        segment.set(ValueLayout.JAVA_LONG, 8, this.intersectionFunctionBufferSize);
        segment.set(ValueLayout.JAVA_LONG, 16, this.intersectionFunctionStride);
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }
}
