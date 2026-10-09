package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSArray;
import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLFunctionDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlfunctiondescriptor">Apple documentation</a>
 */
public class MTLFunctionDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLFunctionDescriptor");
    private static final long SEL_CLASS_functionDescriptor = ObjC.selector("functionDescriptor");
    private static final MethodHandle MH_CLASS_functionDescriptor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_name = ObjC.selector("name");
    private static final MethodHandle MH_name = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setName_ = ObjC.selector("setName:");
    private static final MethodHandle MH_setName_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_specializedName = ObjC.selector("specializedName");
    private static final MethodHandle MH_specializedName = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSpecializedName_ = ObjC.selector("setSpecializedName:");
    private static final MethodHandle MH_setSpecializedName_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_constantValues = ObjC.selector("constantValues");
    private static final MethodHandle MH_constantValues = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setConstantValues_ = ObjC.selector("setConstantValues:");
    private static final MethodHandle MH_setConstantValues_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_options = ObjC.selector("options");
    private static final MethodHandle MH_options = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setOptions_ = ObjC.selector("setOptions:");
    private static final MethodHandle MH_setOptions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_binaryArchives = ObjC.selector("binaryArchives");
    private static final MethodHandle MH_binaryArchives = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBinaryArchives_ = ObjC.selector("setBinaryArchives:");
    private static final MethodHandle MH_setBinaryArchives_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLFunctionDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLFunctionDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLFunctionDescriptor alloc() {
        try {
            return new MTLFunctionDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFunctionDescriptor init]} */
    public MTLFunctionDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[MTLFunctionDescriptor functionDescriptor]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static MTLFunctionDescriptor functionDescriptor() {
        try {
            long result = (long) MH_CLASS_functionDescriptor.invokeExact(CLS, SEL_CLASS_functionDescriptor);
            return new MTLFunctionDescriptor(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFunctionDescriptor name]} */
    @Nullable
    public String name() {
        try {
            long result = (long) MH_name.invokeExact(this.handle, SEL_name);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFunctionDescriptor setName:]} */
    public void setName(@Nullable final String name) {
        final long nsName = name == null ? 0L : ObjC.nsString(name);
        try {
            MH_setName_.invokeExact(this.handle, SEL_setName_, nsName);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsName);
        }
    }

    /** {@code -[MTLFunctionDescriptor specializedName]} */
    @Nullable
    public String specializedName() {
        try {
            long result = (long) MH_specializedName.invokeExact(this.handle, SEL_specializedName);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFunctionDescriptor setSpecializedName:]} */
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
     * {@code -[MTLFunctionDescriptor constantValues]}
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

    /** {@code -[MTLFunctionDescriptor setConstantValues:]} */
    public void setConstantValues(@Nullable final MTLFunctionConstantValues constantValues) {
        try {
            MH_setConstantValues_.invokeExact(this.handle, SEL_setConstantValues_, constantValues == null ? 0L : constantValues.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFunctionDescriptor options]}
     *
     * @return a combination of {@link MTLFunctionOptions} flags
     */
    public long options() {
        try {
            return (long) MH_options.invokeExact(this.handle, SEL_options);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFunctionDescriptor setOptions:]}
     *
     * @param options a combination of {@link MTLFunctionOptions} flags
     */
    public void setOptions(final long options) {
        try {
            MH_setOptions_.invokeExact(this.handle, SEL_setOptions_, options);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLFunctionDescriptor binaryArchives]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<MTLBinaryArchive> binaryArchives() {
        try {
            long result = (long) MH_binaryArchives.invokeExact(this.handle, SEL_binaryArchives);
            return result == 0L ? null : new NSArray<>(result, MTLBinaryArchive::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLFunctionDescriptor setBinaryArchives:]} */
    public void setBinaryArchives(@Nullable final NSArray<MTLBinaryArchive> binaryArchives) {
        try {
            MH_setBinaryArchives_.invokeExact(this.handle, SEL_setBinaryArchives_, binaryArchives == null ? 0L : binaryArchives.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
