package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTL4LogicalToPhysicalColorAttachmentMappingState}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4logicaltophysicalcolorattachmentmappingstate">Apple documentation</a>
 */
public enum MTL4LogicalToPhysicalColorAttachmentMappingState {
    Identity(0L),
    Inherited(1L);

    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;
    private static final MTL4LogicalToPhysicalColorAttachmentMappingState[] VALUES = values();

    public final long value;

    MTL4LogicalToPhysicalColorAttachmentMappingState(final long value) {
        this.value = value;
    }

    public static MTL4LogicalToPhysicalColorAttachmentMappingState of(final long value) {
        if (value < 0 || value >= VALUES.length) {
            throw new IllegalArgumentException("Unknown MTL4LogicalToPhysicalColorAttachmentMappingState: " + value);
        }
        return VALUES[(int) value];
    }
}
