package io.github.kokodio.metaljvm.foundation;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

/**
 * {@code NSOperatingSystemVersion}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/operatingsystemversion">Apple documentation</a>
 */
public record NSOperatingSystemVersion(long majorVersion, long minorVersion, long patchVersion) {
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
            ValueLayout.JAVA_LONG.withName("majorVersion"),
            ValueLayout.JAVA_LONG.withName("minorVersion"),
            ValueLayout.JAVA_LONG.withName("patchVersion")
    ).withName("NSOperatingSystemVersion");

    public static NSOperatingSystemVersion read(final MemorySegment segment) {
        return new NSOperatingSystemVersion(
                segment.get(ValueLayout.JAVA_LONG, 0),
                segment.get(ValueLayout.JAVA_LONG, 8),
                segment.get(ValueLayout.JAVA_LONG, 16)
        );
    }

    public void write(final MemorySegment segment) {
        segment.set(ValueLayout.JAVA_LONG, 0, this.majorVersion);
        segment.set(ValueLayout.JAVA_LONG, 8, this.minorVersion);
        segment.set(ValueLayout.JAVA_LONG, 16, this.patchVersion);
    }

    public MemorySegment on(final SegmentAllocator allocator) {
        MemorySegment segment = allocator.allocate(LAYOUT);
        write(segment);
        return segment;
    }
}
