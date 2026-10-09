package io.github.kokodio.metaljvm.metal;

import java.lang.foreign.ValueLayout;

/**
 * {@code MTLPipelineOption}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlpipelineoption">Apple documentation</a>
 */
public final class MTLPipelineOption {
    public static final ValueLayout LAYOUT = ValueLayout.JAVA_LONG;

    public static final long None = 0L;
    public static final long ArgumentInfo = 1L;
    public static final long BindingInfo = 1L;
    public static final long BufferTypeInfo = 2L;
    public static final long FailOnBinaryArchiveMiss = 4L;

    private MTLPipelineOption() {
    }
}
