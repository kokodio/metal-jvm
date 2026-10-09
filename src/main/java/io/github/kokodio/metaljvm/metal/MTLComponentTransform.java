package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

/**
 * {@code MTLComponentTransform}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlcomponenttransform">Apple documentation</a>
 */
public record MTLComponentTransform(MTLPackedFloat3 scale, MTLPackedFloat3 shear, MTLPackedFloat3 pivot, MTLPackedFloatQuaternion rotation, MTLPackedFloat3 translation) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            MTLPackedFloat3.LAYOUT.withName("scale"),
            MTLPackedFloat3.LAYOUT.withName("shear"),
            MTLPackedFloat3.LAYOUT.withName("pivot"),
            MTLPackedFloatQuaternion.LAYOUT.withName("rotation"),
            MTLPackedFloat3.LAYOUT.withName("translation")
    ).withName("MTLComponentTransform");

    public static MTLComponentTransform read(final MemorySegment segment) {
        return new MTLComponentTransform(
                MTLPackedFloat3.read(segment.asSlice(0, MTLPackedFloat3.LAYOUT)),
                MTLPackedFloat3.read(segment.asSlice(12, MTLPackedFloat3.LAYOUT)),
                MTLPackedFloat3.read(segment.asSlice(24, MTLPackedFloat3.LAYOUT)),
                MTLPackedFloatQuaternion.read(segment.asSlice(36, MTLPackedFloatQuaternion.LAYOUT)),
                MTLPackedFloat3.read(segment.asSlice(52, MTLPackedFloat3.LAYOUT))
        );
    }

    public void write(final MemorySegment segment) {
        this.scale.write(segment.asSlice(0, MTLPackedFloat3.LAYOUT));
        this.shear.write(segment.asSlice(12, MTLPackedFloat3.LAYOUT));
        this.pivot.write(segment.asSlice(24, MTLPackedFloat3.LAYOUT));
        this.rotation.write(segment.asSlice(36, MTLPackedFloatQuaternion.LAYOUT));
        this.translation.write(segment.asSlice(52, MTLPackedFloat3.LAYOUT));
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }
}
