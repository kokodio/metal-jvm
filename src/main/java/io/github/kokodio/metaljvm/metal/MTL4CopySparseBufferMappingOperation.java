package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSRange;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

/**
 * {@code MTL4CopySparseBufferMappingOperation}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4copysparsebuffermappingoperation">Apple documentation</a>
 */
public record MTL4CopySparseBufferMappingOperation(NSRange sourceRange, long destinationOffset) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            NSRange.LAYOUT.withName("sourceRange"),
            ValueLayout.JAVA_LONG.withName("destinationOffset")
    ).withName("MTL4CopySparseBufferMappingOperation");

    public static MTL4CopySparseBufferMappingOperation read(final MemorySegment segment) {
        return new MTL4CopySparseBufferMappingOperation(
                NSRange.read(segment.asSlice(0, NSRange.LAYOUT)),
                segment.get(ValueLayout.JAVA_LONG, 16)
        );
    }

    public void write(final MemorySegment segment) {
        this.sourceRange.write(segment.asSlice(0, NSRange.LAYOUT));
        segment.set(ValueLayout.JAVA_LONG, 16, this.destinationOffset);
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }
}
