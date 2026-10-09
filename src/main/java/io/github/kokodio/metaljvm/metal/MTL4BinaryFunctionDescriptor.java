package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTL4BinaryFunctionDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4binaryfunctiondescriptor">Apple documentation</a>
 */
public class MTL4BinaryFunctionDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTL4BinaryFunctionDescriptor");
    private static final long SEL_name = ObjC.selector("name");
    private static final MethodHandle MH_name = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setName_ = ObjC.selector("setName:");
    private static final MethodHandle MH_setName_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_functionDescriptor = ObjC.selector("functionDescriptor");
    private static final MethodHandle MH_functionDescriptor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFunctionDescriptor_ = ObjC.selector("setFunctionDescriptor:");
    private static final MethodHandle MH_setFunctionDescriptor_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_options = ObjC.selector("options");
    private static final MethodHandle MH_options = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setOptions_ = ObjC.selector("setOptions:");
    private static final MethodHandle MH_setOptions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTL4BinaryFunctionDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTL4BinaryFunctionDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTL4BinaryFunctionDescriptor alloc() {
        try {
            return new MTL4BinaryFunctionDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4BinaryFunctionDescriptor init]} */
    public MTL4BinaryFunctionDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4BinaryFunctionDescriptor name]} */
    public String name() {
        try {
            long result = (long) MH_name.invokeExact(this.handle, SEL_name);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4BinaryFunctionDescriptor setName:]} */
    public void setName(final String name) {
        final long nsName = ObjC.nsString(name);
        try {
            MH_setName_.invokeExact(this.handle, SEL_setName_, nsName);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsName);
        }
    }

    /**
     * {@code -[MTL4BinaryFunctionDescriptor functionDescriptor]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public MTL4FunctionDescriptor functionDescriptor() {
        try {
            long result = (long) MH_functionDescriptor.invokeExact(this.handle, SEL_functionDescriptor);
            return new MTL4FunctionDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4BinaryFunctionDescriptor setFunctionDescriptor:]} */
    public void setFunctionDescriptor(final MTL4FunctionDescriptor functionDescriptor) {
        try {
            MH_setFunctionDescriptor_.invokeExact(this.handle, SEL_setFunctionDescriptor_, functionDescriptor.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4BinaryFunctionDescriptor options]}
     *
     * @return a combination of {@link MTL4BinaryFunctionOptions} flags
     */
    public long options() {
        try {
            return (long) MH_options.invokeExact(this.handle, SEL_options);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4BinaryFunctionDescriptor setOptions:]}
     *
     * @param options a combination of {@link MTL4BinaryFunctionOptions} flags
     */
    public void setOptions(final long options) {
        try {
            MH_setOptions_.invokeExact(this.handle, SEL_setOptions_, options);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
