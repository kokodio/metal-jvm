package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLStageInputOutputDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlstageinputoutputdescriptor">Apple documentation</a>
 */
public class MTLStageInputOutputDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLStageInputOutputDescriptor");
    private static final long SEL_CLASS_stageInputOutputDescriptor = ObjC.selector("stageInputOutputDescriptor");
    private static final MethodHandle MH_CLASS_stageInputOutputDescriptor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_reset = ObjC.selector("reset");
    private static final MethodHandle MH_reset = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_layouts = ObjC.selector("layouts");
    private static final MethodHandle MH_layouts = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_attributes = ObjC.selector("attributes");
    private static final MethodHandle MH_attributes = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_indexType = ObjC.selector("indexType");
    private static final MethodHandle MH_indexType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setIndexType_ = ObjC.selector("setIndexType:");
    private static final MethodHandle MH_setIndexType_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_indexBufferIndex = ObjC.selector("indexBufferIndex");
    private static final MethodHandle MH_indexBufferIndex = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setIndexBufferIndex_ = ObjC.selector("setIndexBufferIndex:");
    private static final MethodHandle MH_setIndexBufferIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLStageInputOutputDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLStageInputOutputDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLStageInputOutputDescriptor alloc() {
        try {
            return new MTLStageInputOutputDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLStageInputOutputDescriptor init]} */
    public MTLStageInputOutputDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[MTLStageInputOutputDescriptor stageInputOutputDescriptor]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static MTLStageInputOutputDescriptor stageInputOutputDescriptor() {
        try {
            long result = (long) MH_CLASS_stageInputOutputDescriptor.invokeExact(CLS, SEL_CLASS_stageInputOutputDescriptor);
            return new MTLStageInputOutputDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLStageInputOutputDescriptor reset]} */
    public void reset() {
        try {
            MH_reset.invokeExact(this.handle, SEL_reset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLStageInputOutputDescriptor layouts]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLBufferLayoutDescriptorArray layouts() {
        try {
            long result = (long) MH_layouts.invokeExact(this.handle, SEL_layouts);
            return new MTLBufferLayoutDescriptorArray(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLStageInputOutputDescriptor attributes]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLAttributeDescriptorArray attributes() {
        try {
            long result = (long) MH_attributes.invokeExact(this.handle, SEL_attributes);
            return new MTLAttributeDescriptorArray(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLStageInputOutputDescriptor indexType]} */
    public MTLIndexType indexType() {
        try {
            return MTLIndexType.of((long) MH_indexType.invokeExact(this.handle, SEL_indexType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLStageInputOutputDescriptor setIndexType:]} */
    public void setIndexType(final MTLIndexType indexType) {
        try {
            MH_setIndexType_.invokeExact(this.handle, SEL_setIndexType_, indexType.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLStageInputOutputDescriptor indexBufferIndex]} */
    public long indexBufferIndex() {
        try {
            return (long) MH_indexBufferIndex.invokeExact(this.handle, SEL_indexBufferIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLStageInputOutputDescriptor setIndexBufferIndex:]} */
    public void setIndexBufferIndex(final long indexBufferIndex) {
        try {
            MH_setIndexBufferIndex_.invokeExact(this.handle, SEL_setIndexBufferIndex_, indexBufferIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
