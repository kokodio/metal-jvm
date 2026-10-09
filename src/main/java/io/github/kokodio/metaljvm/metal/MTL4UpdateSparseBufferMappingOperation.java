package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSRange;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

/**
 * {@code MTL4UpdateSparseBufferMappingOperation}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4updatesparsebuffermappingoperation">Apple documentation</a>
 */
public record MTL4UpdateSparseBufferMappingOperation(long mode, NSRange bufferRange, long heapOffset) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            ValueLayout.JAVA_LONG.withName("mode"),
            NSRange.LAYOUT.withName("bufferRange"),
            ValueLayout.JAVA_LONG.withName("heapOffset")
    ).withName("MTL4UpdateSparseBufferMappingOperation");

    public static MTL4UpdateSparseBufferMappingOperation read(final MemorySegment segment) {
        return new MTL4UpdateSparseBufferMappingOperation(
                segment.get(ValueLayout.JAVA_LONG, 0),
                NSRange.read(segment.asSlice(8, NSRange.LAYOUT)),
                segment.get(ValueLayout.JAVA_LONG, 24)
        );
    }

    public void write(final MemorySegment segment) {
        segment.set(ValueLayout.JAVA_LONG, 0, this.mode);
        this.bufferRange.write(segment.asSlice(8, NSRange.LAYOUT));
        segment.set(ValueLayout.JAVA_LONG, 24, this.heapOffset);
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }
}
