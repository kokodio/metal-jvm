package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTL4CompilerDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4compilerdescriptor">Apple documentation</a>
 */
public class MTL4CompilerDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTL4CompilerDescriptor");
    private static final long SEL_label = ObjC.selector("label");
    private static final MethodHandle MH_label = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLabel_ = ObjC.selector("setLabel:");
    private static final MethodHandle MH_setLabel_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_pipelineDataSetSerializer = ObjC.selector("pipelineDataSetSerializer");
    private static final MethodHandle MH_pipelineDataSetSerializer = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setPipelineDataSetSerializer_ = ObjC.selector("setPipelineDataSetSerializer:");
    private static final MethodHandle MH_setPipelineDataSetSerializer_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTL4CompilerDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTL4CompilerDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTL4CompilerDescriptor alloc() {
        try {
            return new MTL4CompilerDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CompilerDescriptor init]} */
    public MTL4CompilerDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CompilerDescriptor label]} */
    @Nullable
    public String label() {
        try {
            long result = (long) MH_label.invokeExact(this.handle, SEL_label);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CompilerDescriptor setLabel:]} */
    public void setLabel(@Nullable final String label) {
        final long nsLabel = label == null ? 0L : ObjC.nsString(label);
        try {
            MH_setLabel_.invokeExact(this.handle, SEL_setLabel_, nsLabel);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsLabel);
        }
    }

    /**
     * {@code -[MTL4CompilerDescriptor pipelineDataSetSerializer]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTL4PipelineDataSetSerializer pipelineDataSetSerializer() {
        try {
            long result = (long) MH_pipelineDataSetSerializer.invokeExact(this.handle, SEL_pipelineDataSetSerializer);
            return result == 0L ? null : new MTL4PipelineDataSetSerializer(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CompilerDescriptor setPipelineDataSetSerializer:]} */
    public void setPipelineDataSetSerializer(@Nullable final MTL4PipelineDataSetSerializer pipelineDataSetSerializer) {
        try {
            MH_setPipelineDataSetSerializer_.invokeExact(this.handle, SEL_setPipelineDataSetSerializer_, pipelineDataSetSerializer == null ? 0L : pipelineDataSetSerializer.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
