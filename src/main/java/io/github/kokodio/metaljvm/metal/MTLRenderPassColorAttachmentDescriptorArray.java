package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLRenderPassColorAttachmentDescriptorArray}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlrenderpasscolorattachmentdescriptorarray">Apple documentation</a>
 */
public class MTLRenderPassColorAttachmentDescriptorArray extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLRenderPassColorAttachmentDescriptorArray");
    private static final long SEL_objectAtIndexedSubscript_ = ObjC.selector("objectAtIndexedSubscript:");
    private static final MethodHandle MH_objectAtIndexedSubscript_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setObject_atIndexedSubscript_ = ObjC.selector("setObject:atIndexedSubscript:");
    private static final MethodHandle MH_setObject_atIndexedSubscript_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLRenderPassColorAttachmentDescriptorArray(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLRenderPassColorAttachmentDescriptorArray alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLRenderPassColorAttachmentDescriptorArray alloc() {
        try {
            return new MTLRenderPassColorAttachmentDescriptorArray((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassColorAttachmentDescriptorArray init]} */
    public MTLRenderPassColorAttachmentDescriptorArray init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLRenderPassColorAttachmentDescriptorArray objectAtIndexedSubscript:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTLRenderPassColorAttachmentDescriptor objectAtIndexedSubscript(final long attachmentIndex) {
        try {
            long result = (long) MH_objectAtIndexedSubscript_.invokeExact(this.handle, SEL_objectAtIndexedSubscript_, attachmentIndex);
            return new MTLRenderPassColorAttachmentDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLRenderPassColorAttachmentDescriptorArray setObject:atIndexedSubscript:]} */
    public void setObject(@Nullable final MTLRenderPassColorAttachmentDescriptor attachment, final long attachmentIndex) {
        try {
            MH_setObject_atIndexedSubscript_.invokeExact(this.handle, SEL_setObject_atIndexedSubscript_, attachment == null ? 0L : attachment.handle(), attachmentIndex);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
