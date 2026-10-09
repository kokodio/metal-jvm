package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

/**
 * {@code MTL4CopySparseTextureMappingOperation}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4copysparsetexturemappingoperation">Apple documentation</a>
 */
public record MTL4CopySparseTextureMappingOperation(MTLRegion sourceRegion, long sourceLevel, long sourceSlice, MTLOrigin destinationOrigin, long destinationLevel, long destinationSlice) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            MTLRegion.LAYOUT.withName("sourceRegion"),
            ValueLayout.JAVA_LONG.withName("sourceLevel"),
            ValueLayout.JAVA_LONG.withName("sourceSlice"),
            MTLOrigin.LAYOUT.withName("destinationOrigin"),
            ValueLayout.JAVA_LONG.withName("destinationLevel"),
            ValueLayout.JAVA_LONG.withName("destinationSlice")
    ).withName("MTL4CopySparseTextureMappingOperation");

    public static MTL4CopySparseTextureMappingOperation read(final MemorySegment segment) {
        return new MTL4CopySparseTextureMappingOperation(
                MTLRegion.read(segment.asSlice(0, MTLRegion.LAYOUT)),
                segment.get(ValueLayout.JAVA_LONG, 48),
                segment.get(ValueLayout.JAVA_LONG, 56),
                MTLOrigin.read(segment.asSlice(64, MTLOrigin.LAYOUT)),
                segment.get(ValueLayout.JAVA_LONG, 88),
                segment.get(ValueLayout.JAVA_LONG, 96)
        );
    }

    public void write(final MemorySegment segment) {
        this.sourceRegion.write(segment.asSlice(0, MTLRegion.LAYOUT));
        segment.set(ValueLayout.JAVA_LONG, 48, this.sourceLevel);
        segment.set(ValueLayout.JAVA_LONG, 56, this.sourceSlice);
        this.destinationOrigin.write(segment.asSlice(64, MTLOrigin.LAYOUT));
        segment.set(ValueLayout.JAVA_LONG, 88, this.destinationLevel);
        segment.set(ValueLayout.JAVA_LONG, 96, this.destinationSlice);
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }
}
