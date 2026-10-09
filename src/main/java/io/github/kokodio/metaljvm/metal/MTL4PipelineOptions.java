package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTL4PipelineOptions}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4pipelineoptions">Apple documentation</a>
 */
public class MTL4PipelineOptions extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTL4PipelineOptions");
    private static final long SEL_shaderValidation = ObjC.selector("shaderValidation");
    private static final MethodHandle MH_shaderValidation = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setShaderValidation_ = ObjC.selector("setShaderValidation:");
    private static final MethodHandle MH_setShaderValidation_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_shaderReflection = ObjC.selector("shaderReflection");
    private static final MethodHandle MH_shaderReflection = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setShaderReflection_ = ObjC.selector("setShaderReflection:");
    private static final MethodHandle MH_setShaderReflection_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTL4PipelineOptions(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTL4PipelineOptions alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTL4PipelineOptions alloc() {
        try {
            return new MTL4PipelineOptions((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4PipelineOptions init]} */
    public MTL4PipelineOptions init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4PipelineOptions shaderValidation]} */
    public MTLShaderValidation shaderValidation() {
        try {
            return MTLShaderValidation.of((long) MH_shaderValidation.invokeExact(this.handle, SEL_shaderValidation));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4PipelineOptions setShaderValidation:]} */
    public void setShaderValidation(final MTLShaderValidation shaderValidation) {
        try {
            MH_setShaderValidation_.invokeExact(this.handle, SEL_setShaderValidation_, shaderValidation.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4PipelineOptions shaderReflection]}
     *
     * @return a combination of {@link MTL4ShaderReflection} flags
     */
    public long shaderReflection() {
        try {
            return (long) MH_shaderReflection.invokeExact(this.handle, SEL_shaderReflection);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4PipelineOptions setShaderReflection:]}
     *
     * @param shaderReflection a combination of {@link MTL4ShaderReflection} flags
     */
    public void setShaderReflection(final long shaderReflection) {
        try {
            MH_setShaderReflection_.invokeExact(this.handle, SEL_setShaderReflection_, shaderReflection);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
