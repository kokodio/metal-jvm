package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLAttributeDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlattributedescriptor">Apple documentation</a>
 */
public class MTLAttributeDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLAttributeDescriptor");
    private static final long SEL_format = ObjC.selector("format");
    private static final MethodHandle MH_format = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFormat_ = ObjC.selector("setFormat:");
    private static final MethodHandle MH_setFormat_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_offset = ObjC.selector("offset");
    private static final MethodHandle MH_offset = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setOffset_ = ObjC.selector("setOffset:");
    private static final MethodHandle MH_setOffset_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_bufferIndex = ObjC.selector("bufferIndex");
    private static final MethodHandle MH_bufferIndex = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBufferIndex_ = ObjC.selector("setBufferIndex:");
    private static final MethodHandle MH_setBufferIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLAttributeDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLAttributeDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLAttributeDescriptor alloc() {
        try {
            return new MTLAttributeDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAttributeDescriptor init]} */
    public MTLAttributeDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAttributeDescriptor format]} */
    public MTLAttributeFormat format() {
        try {
            return MTLAttributeFormat.of((long) MH_format.invokeExact(this.handle, SEL_format));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAttributeDescriptor setFormat:]} */
    public void setFormat(final MTLAttributeFormat format) {
        try {
            MH_setFormat_.invokeExact(this.handle, SEL_setFormat_, format.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAttributeDescriptor offset]} */
    public long offset() {
        try {
            return (long) MH_offset.invokeExact(this.handle, SEL_offset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAttributeDescriptor setOffset:]} */
    public void setOffset(final long offset) {
        try {
            MH_setOffset_.invokeExact(this.handle, SEL_setOffset_, offset);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAttributeDescriptor bufferIndex]} */
    public long bufferIndex() {
        try {
            return (long) MH_bufferIndex.invokeExact(this.handle, SEL_bufferIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLAttributeDescriptor setBufferIndex:]} */
    public void setBufferIndex(final long bufferIndex) {
        try {
            MH_setBufferIndex_.invokeExact(this.handle, SEL_setBufferIndex_, bufferIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
