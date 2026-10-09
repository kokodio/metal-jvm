package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTL4PipelineDataSetSerializerDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4pipelinedatasetserializerdescriptor">Apple documentation</a>
 */
public class MTL4PipelineDataSetSerializerDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTL4PipelineDataSetSerializerDescriptor");
    private static final long SEL_configuration = ObjC.selector("configuration");
    private static final MethodHandle MH_configuration = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setConfiguration_ = ObjC.selector("setConfiguration:");
    private static final MethodHandle MH_setConfiguration_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTL4PipelineDataSetSerializerDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTL4PipelineDataSetSerializerDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTL4PipelineDataSetSerializerDescriptor alloc() {
        try {
            return new MTL4PipelineDataSetSerializerDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4PipelineDataSetSerializerDescriptor init]} */
    public MTL4PipelineDataSetSerializerDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4PipelineDataSetSerializerDescriptor configuration]}
     *
     * @return a combination of {@link MTL4PipelineDataSetSerializerConfiguration} flags
     */
    public long configuration() {
        try {
            return (long) MH_configuration.invokeExact(this.handle, SEL_configuration);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4PipelineDataSetSerializerDescriptor setConfiguration:]}
     *
     * @param configuration a combination of {@link MTL4PipelineDataSetSerializerConfiguration} flags
     */
    public void setConfiguration(final long configuration) {
        try {
            MH_setConfiguration_.invokeExact(this.handle, SEL_setConfiguration_, configuration);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
