package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

/**
 * {@code MTL4UpdateSparseTextureMappingOperation}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4updatesparsetexturemappingoperation">Apple documentation</a>
 */
public record MTL4UpdateSparseTextureMappingOperation(long mode, MTLRegion textureRegion, long textureLevel, long textureSlice, long heapOffset) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            ValueLayout.JAVA_LONG.withName("mode"),
            MTLRegion.LAYOUT.withName("textureRegion"),
            ValueLayout.JAVA_LONG.withName("textureLevel"),
            ValueLayout.JAVA_LONG.withName("textureSlice"),
            ValueLayout.JAVA_LONG.withName("heapOffset")
    ).withName("MTL4UpdateSparseTextureMappingOperation");

    public static MTL4UpdateSparseTextureMappingOperation read(final MemorySegment segment) {
        return new MTL4UpdateSparseTextureMappingOperation(
                segment.get(ValueLayout.JAVA_LONG, 0),
                MTLRegion.read(segment.asSlice(8, MTLRegion.LAYOUT)),
                segment.get(ValueLayout.JAVA_LONG, 56),
                segment.get(ValueLayout.JAVA_LONG, 64),
                segment.get(ValueLayout.JAVA_LONG, 72)
        );
    }

    public void write(final MemorySegment segment) {
        segment.set(ValueLayout.JAVA_LONG, 0, this.mode);
        this.textureRegion.write(segment.asSlice(8, MTLRegion.LAYOUT));
        segment.set(ValueLayout.JAVA_LONG, 56, this.textureLevel);
        segment.set(ValueLayout.JAVA_LONG, 64, this.textureSlice);
        segment.set(ValueLayout.JAVA_LONG, 72, this.heapOffset);
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }
}
