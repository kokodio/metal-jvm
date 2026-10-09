package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

/**
 * {@code MTLDrawPrimitivesIndirectArguments}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtldrawprimitivesindirectarguments">Apple documentation</a>
 */
public record MTLDrawPrimitivesIndirectArguments(int vertexCount, int instanceCount, int vertexStart, int baseInstance) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            ValueLayout.JAVA_INT.withName("vertexCount"),
            ValueLayout.JAVA_INT.withName("instanceCount"),
            ValueLayout.JAVA_INT.withName("vertexStart"),
            ValueLayout.JAVA_INT.withName("baseInstance")
    ).withName("MTLDrawPrimitivesIndirectArguments");

    public static MTLDrawPrimitivesIndirectArguments read(final MemorySegment segment) {
        return new MTLDrawPrimitivesIndirectArguments(
                segment.get(ValueLayout.JAVA_INT, 0),
                segment.get(ValueLayout.JAVA_INT, 4),
                segment.get(ValueLayout.JAVA_INT, 8),
                segment.get(ValueLayout.JAVA_INT, 12)
        );
    }

    public void write(final MemorySegment segment) {
        segment.set(ValueLayout.JAVA_INT, 0, this.vertexCount);
        segment.set(ValueLayout.JAVA_INT, 4, this.instanceCount);
        segment.set(ValueLayout.JAVA_INT, 8, this.vertexStart);
        segment.set(ValueLayout.JAVA_INT, 12, this.baseInstance);
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }
}
