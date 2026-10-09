package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTL4LibraryDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4librarydescriptor">Apple documentation</a>
 */
public class MTL4LibraryDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTL4LibraryDescriptor");
    private static final long SEL_source = ObjC.selector("source");
    private static final MethodHandle MH_source = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSource_ = ObjC.selector("setSource:");
    private static final MethodHandle MH_setSource_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_options = ObjC.selector("options");
    private static final MethodHandle MH_options = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setOptions_ = ObjC.selector("setOptions:");
    private static final MethodHandle MH_setOptions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_name = ObjC.selector("name");
    private static final MethodHandle MH_name = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setName_ = ObjC.selector("setName:");
    private static final MethodHandle MH_setName_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTL4LibraryDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTL4LibraryDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTL4LibraryDescriptor alloc() {
        try {
            return new MTL4LibraryDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4LibraryDescriptor init]} */
    public MTL4LibraryDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4LibraryDescriptor source]} */
    @Nullable
    public String source() {
        try {
            long result = (long) MH_source.invokeExact(this.handle, SEL_source);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4LibraryDescriptor setSource:]} */
    public void setSource(@Nullable final String source) {
        final long nsSource = source == null ? 0L : ObjC.nsString(source);
        try {
            MH_setSource_.invokeExact(this.handle, SEL_setSource_, nsSource);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsSource);
        }
    }

    /**
     * {@code -[MTL4LibraryDescriptor options]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public MTLCompileOptions options() {
        try {
            long result = (long) MH_options.invokeExact(this.handle, SEL_options);
            return result == 0L ? null : new MTLCompileOptions(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4LibraryDescriptor setOptions:]} */
    public void setOptions(@Nullable final MTLCompileOptions options) {
        try {
            MH_setOptions_.invokeExact(this.handle, SEL_setOptions_, options == null ? 0L : options.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4LibraryDescriptor name]} */
    @Nullable
    public String name() {
        try {
            long result = (long) MH_name.invokeExact(this.handle, SEL_name);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4LibraryDescriptor setName:]} */
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
}
