package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTL4PipelineDataSetSerializerConfiguration}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4pipelinedatasetserializerconfiguration">Apple documentation</a>
 */
public final class MTL4PipelineDataSetSerializerConfiguration {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long CaptureDescriptors = 1L;
    public static final long CaptureBinaries = 2L;

    private MTL4PipelineDataSetSerializerConfiguration() {
    }
}
