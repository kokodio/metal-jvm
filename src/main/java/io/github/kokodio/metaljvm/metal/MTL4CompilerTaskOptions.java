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
 * {@code MTL4CompilerTaskOptions}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtl4compilertaskoptions">Apple documentation</a>
 */
public class MTL4CompilerTaskOptions extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTL4CompilerTaskOptions");
    private static final long SEL_lookupArchives = ObjC.selector("lookupArchives");
    private static final MethodHandle MH_lookupArchives = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLookupArchives_ = ObjC.selector("setLookupArchives:");
    private static final MethodHandle MH_setLookupArchives_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTL4CompilerTaskOptions(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTL4CompilerTaskOptions alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTL4CompilerTaskOptions alloc() {
        try {
            return new MTL4CompilerTaskOptions((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CompilerTaskOptions init]} */
    public MTL4CompilerTaskOptions init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTL4CompilerTaskOptions lookupArchives]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<MTL4Archive> lookupArchives() {
        try {
            long result = (long) MH_lookupArchives.invokeExact(this.handle, SEL_lookupArchives);
            return result == 0L ? null : new NSArray<>(result, MTL4Archive::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTL4CompilerTaskOptions setLookupArchives:]} */
    public void setLookupArchives(@Nullable final NSArray<MTL4Archive> lookupArchives) {
        try {
            MH_setLookupArchives_.invokeExact(this.handle, SEL_setLookupArchives_, lookupArchives == null ? 0L : lookupArchives.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
