package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

/**
 * {@code MTLDrawIndexedPrimitivesIndirectArguments}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtldrawindexedprimitivesindirectarguments">Apple documentation</a>
 */
public record MTLDrawIndexedPrimitivesIndirectArguments(int indexCount, int instanceCount, int indexStart, int baseVertex, int baseInstance) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            ValueLayout.JAVA_INT.withName("indexCount"),
            ValueLayout.JAVA_INT.withName("instanceCount"),
            ValueLayout.JAVA_INT.withName("indexStart"),
            ValueLayout.JAVA_INT.withName("baseVertex"),
            ValueLayout.JAVA_INT.withName("baseInstance")
    ).withName("MTLDrawIndexedPrimitivesIndirectArguments");

    public static MTLDrawIndexedPrimitivesIndirectArguments read(final MemorySegment segment) {
        return new MTLDrawIndexedPrimitivesIndirectArguments(
                segment.get(ValueLayout.JAVA_INT, 0),
                segment.get(ValueLayout.JAVA_INT, 4),
                segment.get(ValueLayout.JAVA_INT, 8),
                segment.get(ValueLayout.JAVA_INT, 12),
                segment.get(ValueLayout.JAVA_INT, 16)
        );
    }

    public void write(final MemorySegment segment) {
        segment.set(ValueLayout.JAVA_INT, 0, this.indexCount);
        segment.set(ValueLayout.JAVA_INT, 4, this.instanceCount);
        segment.set(ValueLayout.JAVA_INT, 8, this.indexStart);
        segment.set(ValueLayout.JAVA_INT, 12, this.baseVertex);
        segment.set(ValueLayout.JAVA_INT, 16, this.baseInstance);
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }
}
