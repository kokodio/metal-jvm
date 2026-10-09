package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLBinding}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlbinding">Apple documentation</a>
 */
public class MTLBinding extends NSObject {
    private static final long SEL_name = ObjC.selector("name");
    private static final MethodHandle MH_name = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_type = ObjC.selector("type");
    private static final MethodHandle MH_type = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_access = ObjC.selector("access");
    private static final MethodHandle MH_access = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_index = ObjC.selector("index");
    private static final MethodHandle MH_index = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isUsed = ObjC.selector("isUsed");
    private static final MethodHandle MH_isUsed = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isArgument = ObjC.selector("isArgument");
    private static final MethodHandle MH_isArgument = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));

    public MTLBinding(final long handle) {
        super(handle);
    }

    /** {@code -[MTLBinding name]} */
    public String name() {
        try {
            long result = (long) MH_name.invokeExact(this.handle, SEL_name);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBinding type]} */
    public MTLBindingType type() {
        try {
            return MTLBindingType.of((long) MH_type.invokeExact(this.handle, SEL_type));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBinding access]} */
    public MTLBindingAccess access() {
        try {
            return MTLBindingAccess.of((long) MH_access.invokeExact(this.handle, SEL_access));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBinding index]} */
    public long index() {
        try {
            return (long) MH_index.invokeExact(this.handle, SEL_index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBinding isUsed]} */
    public boolean isUsed() {
        try {
            return (boolean) MH_isUsed.invokeExact(this.handle, SEL_isUsed);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLBinding isArgument]} */
    public boolean isArgument() {
        try {
            return (boolean) MH_isArgument.invokeExact(this.handle, SEL_isArgument);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
