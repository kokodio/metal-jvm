package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

/**
 * {@code MTLDrawPatchIndirectArguments}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtldrawpatchindirectarguments">Apple documentation</a>
 */
public record MTLDrawPatchIndirectArguments(int patchCount, int instanceCount, int patchStart, int baseInstance) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            ValueLayout.JAVA_INT.withName("patchCount"),
            ValueLayout.JAVA_INT.withName("instanceCount"),
            ValueLayout.JAVA_INT.withName("patchStart"),
            ValueLayout.JAVA_INT.withName("baseInstance")
    ).withName("MTLDrawPatchIndirectArguments");

    public static MTLDrawPatchIndirectArguments read(final MemorySegment segment) {
        return new MTLDrawPatchIndirectArguments(
                segment.get(ValueLayout.JAVA_INT, 0),
                segment.get(ValueLayout.JAVA_INT, 4),
                segment.get(ValueLayout.JAVA_INT, 8),
                segment.get(ValueLayout.JAVA_INT, 12)
        );
    }

    public void write(final MemorySegment segment) {
        segment.set(ValueLayout.JAVA_INT, 0, this.patchCount);
        segment.set(ValueLayout.JAVA_INT, 4, this.instanceCount);
        segment.set(ValueLayout.JAVA_INT, 8, this.patchStart);
        segment.set(ValueLayout.JAVA_INT, 12, this.baseInstance);
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }
}
