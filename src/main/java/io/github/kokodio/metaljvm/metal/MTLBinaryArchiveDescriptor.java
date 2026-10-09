package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.foundation.NSURL;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLBinaryArchiveDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlbinaryarchivedescriptor">Apple documentation</a>
 */
public class MTLBinaryArchiveDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLBinaryArchiveDescriptor");
    private static final long SEL_url = ObjC.selector("url");
    private static final MethodHandle MH_url = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setUrl_ = ObjC.selector("setUrl:");
    private static final MethodHandle MH_setUrl_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLBinaryArchiveDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLBinaryArchiveDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLBinaryArchiveDescriptor alloc() {
        try {
            return new MTLBinaryArchiveDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBinaryArchiveDescriptor init]} */
    public MTLBinaryArchiveDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLBinaryArchiveDescriptor url]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSURL url() {
        try {
            long result = (long) MH_url.invokeExact(this.handle, SEL_url);
            return result == 0L ? null : new NSURL(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBinaryArchiveDescriptor setUrl:]} */
    public void setUrl(@Nullable final NSURL url) {
        try {
            MH_setUrl_.invokeExact(this.handle, SEL_setUrl_, url == null ? 0L : url.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
