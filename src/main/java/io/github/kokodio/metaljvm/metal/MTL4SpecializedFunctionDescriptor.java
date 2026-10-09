package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTL4SpecializedFunctionDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4specializedfunctiondescriptor">Apple documentation</a>
 */
public class MTL4SpecializedFunctionDescriptor extends MTL4FunctionDescriptor {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTL4SpecializedFunctionDescriptor");
    private static final long SEL_functionDescriptor = ObjC.selector("functionDescriptor");
    private static final MethodHandle MH_functionDescriptor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFunctionDescriptor_ = ObjC.selector("setFunctionDescriptor:");
    private static final MethodHandle MH_setFunctionDescriptor_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_specializedName = ObjC.selector("specializedName");
    private static final MethodHandle MH_specializedName = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSpecializedName_ = ObjC.selector("setSpecializedName:");
    private static final MethodHandle MH_setSpecializedName_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_constantValues = ObjC.selector("constantValues");
    private static final MethodHandle MH_constantValues = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setConstantValues_ = ObjC.selector("setConstantValues:");
    private static final MethodHandle MH_setConstantValues_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTL4SpecializedFunctionDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTL4SpecializedFunctionDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTL4SpecializedFunctionDescriptor alloc() {
        try {
            return new MTL4SpecializedFunctionDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4SpecializedFunctionDescriptor init]} */
    public MTL4SpecializedFunctionDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4SpecializedFunctionDescriptor functionDescriptor]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTL4FunctionDescriptor functionDescriptor() {
        try {
            long result = (long) MH_functionDescriptor.invokeExact(this.handle, SEL_functionDescriptor);
            return result == 0L ? null : new MTL4FunctionDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4SpecializedFunctionDescriptor setFunctionDescriptor:]} */
    public void setFunctionDescriptor(@Nullable final MTL4FunctionDescriptor functionDescriptor) {
        try {
            MH_setFunctionDescriptor_.invokeExact(this.handle, SEL_setFunctionDescriptor_, functionDescriptor == null ? 0L : functionDescriptor.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4SpecializedFunctionDescriptor specializedName]} */
    @Nullable
    public String specializedName() {
        try {
            long result = (long) MH_specializedName.invokeExact(this.handle, SEL_specializedName);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4SpecializedFunctionDescriptor setSpecializedName:]} */
    public void setSpecializedName(@Nullable final String specializedName) {
        final long nsSpecializedName = specializedName == null ? 0L : ObjC.nsString(specializedName);
        try {
            MH_setSpecializedName_.invokeExact(this.handle, SEL_setSpecializedName_, nsSpecializedName);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsSpecializedName);
        }
    }

    /**
     * {@code -[MTL4SpecializedFunctionDescriptor constantValues]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLFunctionConstantValues constantValues() {
        try {
            long result = (long) MH_constantValues.invokeExact(this.handle, SEL_constantValues);
            return result == 0L ? null : new MTLFunctionConstantValues(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4SpecializedFunctionDescriptor setConstantValues:]} */
    public void setConstantValues(@Nullable final MTLFunctionConstantValues constantValues) {
        try {
            MH_setConstantValues_.invokeExact(this.handle, SEL_setConstantValues_, constantValues == null ? 0L : constantValues.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
