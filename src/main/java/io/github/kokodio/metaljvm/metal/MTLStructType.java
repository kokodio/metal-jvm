package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSArray;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLStructType}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlstructtype">Apple documentation</a>
 */
public class MTLStructType extends MTLType {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLStructType");
    private static final long SEL_memberByName_ = ObjC.selector("memberByName:");
    private static final MethodHandle MH_memberByName_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_members = ObjC.selector("members");
    private static final MethodHandle MH_members = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLStructType(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLStructType alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLStructType alloc() {
        try {
            return new MTLStructType((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLStructType init]} */
    public MTLStructType init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLStructType memberByName:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLStructMember memberByName(final String name) {
        final long nsName = ObjC.nsString(name);
        try {
            long result = (long) MH_memberByName_.invokeExact(this.handle, SEL_memberByName_, nsName);
            return result == 0L ? null : new MTLStructMember(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsName);
        }
    }

    /**
     * {@code -[MTLStructType members]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<MTLStructMember> members() {
        try {
            long result = (long) MH_members.invokeExact(this.handle, SEL_members);
            return new NSArray<>(result, MTLStructMember::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
