package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

/**
 * {@code MTLTextureSwizzleChannels}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtltextureswizzlechannels">Apple documentation</a>
 */
public record MTLTextureSwizzleChannels(byte red, byte green, byte blue, byte alpha) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            ValueLayout.JAVA_BYTE.withName("red"),
            ValueLayout.JAVA_BYTE.withName("green"),
            ValueLayout.JAVA_BYTE.withName("blue"),
            ValueLayout.JAVA_BYTE.withName("alpha")
    ).withName("MTLTextureSwizzleChannels");

    public static MTLTextureSwizzleChannels read(final MemorySegment segment) {
        return new MTLTextureSwizzleChannels(
                segment.get(ValueLayout.JAVA_BYTE, 0),
                segment.get(ValueLayout.JAVA_BYTE, 1),
                segment.get(ValueLayout.JAVA_BYTE, 2),
                segment.get(ValueLayout.JAVA_BYTE, 3)
        );
    }

    public void write(final MemorySegment segment) {
        segment.set(ValueLayout.JAVA_BYTE, 0, this.red);
        segment.set(ValueLayout.JAVA_BYTE, 1, this.green);
        segment.set(ValueLayout.JAVA_BYTE, 2, this.blue);
        segment.set(ValueLayout.JAVA_BYTE, 3, this.alpha);
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }
}
