package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

/**
 * {@code MTLVertexAmplificationViewMapping}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlvertexamplificationviewmapping">Apple documentation</a>
 */
public record MTLVertexAmplificationViewMapping(int viewportArrayIndexOffset, int renderTargetArrayIndexOffset) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            ValueLayout.JAVA_INT.withName("viewportArrayIndexOffset"),
            ValueLayout.JAVA_INT.withName("renderTargetArrayIndexOffset")
    ).withName("MTLVertexAmplificationViewMapping");

    public static MTLVertexAmplificationViewMapping read(final MemorySegment segment) {
        return new MTLVertexAmplificationViewMapping(
                segment.get(ValueLayout.JAVA_INT, 0),
                segment.get(ValueLayout.JAVA_INT, 4)
        );
    }

    public void write(final MemorySegment segment) {
        segment.set(ValueLayout.JAVA_INT, 0, this.viewportArrayIndexOffset);
        segment.set(ValueLayout.JAVA_INT, 4, this.renderTargetArrayIndexOffset);
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }
}
