package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

/**
 * {@code MTLIndirectCommandBufferExecutionRange}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlindirectcommandbufferexecutionrange">Apple documentation</a>
 */
public record MTLIndirectCommandBufferExecutionRange(int location, int length) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            ValueLayout.JAVA_INT.withName("location"),
            ValueLayout.JAVA_INT.withName("length")
    ).withName("MTLIndirectCommandBufferExecutionRange");

    public static MTLIndirectCommandBufferExecutionRange read(final MemorySegment segment) {
        return new MTLIndirectCommandBufferExecutionRange(
                segment.get(ValueLayout.JAVA_INT, 0),
                segment.get(ValueLayout.JAVA_INT, 4)
        );
    }

    public void write(final MemorySegment segment) {
        segment.set(ValueLayout.JAVA_INT, 0, this.location);
        segment.set(ValueLayout.JAVA_INT, 4, this.length);
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }
}
