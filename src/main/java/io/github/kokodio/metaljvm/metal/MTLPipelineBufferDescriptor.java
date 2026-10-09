package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLPipelineBufferDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlpipelinebufferdescriptor">Apple documentation</a>
 */
public class MTLPipelineBufferDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLPipelineBufferDescriptor");
    private static final long SEL_mutability = ObjC.selector("mutability");
    private static final MethodHandle MH_mutability = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMutability_ = ObjC.selector("setMutability:");
    private static final MethodHandle MH_setMutability_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLPipelineBufferDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLPipelineBufferDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLPipelineBufferDescriptor alloc() {
        try {
            return new MTLPipelineBufferDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLPipelineBufferDescriptor init]} */
    public MTLPipelineBufferDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLPipelineBufferDescriptor mutability]} */
    public MTLMutability mutability() {
        try {
            return MTLMutability.of((long) MH_mutability.invokeExact(this.handle, SEL_mutability));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLPipelineBufferDescriptor setMutability:]} */
    public void setMutability(final MTLMutability mutability) {
        try {
            MH_setMutability_.invokeExact(this.handle, SEL_setMutability_, mutability.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
