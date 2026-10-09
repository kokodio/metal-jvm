package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSArray;
import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLStitchedLibraryDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlstitchedlibrarydescriptor">Apple documentation</a>
 */
public class MTLStitchedLibraryDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLStitchedLibraryDescriptor");
    private static final long SEL_functionGraphs = ObjC.selector("functionGraphs");
    private static final MethodHandle MH_functionGraphs = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFunctionGraphs_ = ObjC.selector("setFunctionGraphs:");
    private static final MethodHandle MH_setFunctionGraphs_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_functions = ObjC.selector("functions");
    private static final MethodHandle MH_functions = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFunctions_ = ObjC.selector("setFunctions:");
    private static final MethodHandle MH_setFunctions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_binaryArchives = ObjC.selector("binaryArchives");
    private static final MethodHandle MH_binaryArchives = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBinaryArchives_ = ObjC.selector("setBinaryArchives:");
    private static final MethodHandle MH_setBinaryArchives_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_options = ObjC.selector("options");
    private static final MethodHandle MH_options = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setOptions_ = ObjC.selector("setOptions:");
    private static final MethodHandle MH_setOptions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLStitchedLibraryDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLStitchedLibraryDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLStitchedLibraryDescriptor alloc() {
        try {
            return new MTLStitchedLibraryDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLStitchedLibraryDescriptor init]} */
    public MTLStitchedLibraryDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLStitchedLibraryDescriptor functionGraphs]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<MTLFunctionStitchingGraph> functionGraphs() {
        try {
            long result = (long) MH_functionGraphs.invokeExact(this.handle, SEL_functionGraphs);
            return new NSArray<>(result, MTLFunctionStitchingGraph::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLStitchedLibraryDescriptor setFunctionGraphs:]} */
    public void setFunctionGraphs(final NSArray<MTLFunctionStitchingGraph> functionGraphs) {
        try {
            MH_setFunctionGraphs_.invokeExact(this.handle, SEL_setFunctionGraphs_, functionGraphs.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLStitchedLibraryDescriptor functions]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<MTLFunction> functions() {
        try {
            long result = (long) MH_functions.invokeExact(this.handle, SEL_functions);
            return new NSArray<>(result, MTLFunction::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLStitchedLibraryDescriptor setFunctions:]} */
    public void setFunctions(final NSArray<MTLFunction> functions) {
        try {
            MH_setFunctions_.invokeExact(this.handle, SEL_setFunctions_, functions.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLStitchedLibraryDescriptor binaryArchives]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<MTLBinaryArchive> binaryArchives() {
        try {
            long result = (long) MH_binaryArchives.invokeExact(this.handle, SEL_binaryArchives);
            return new NSArray<>(result, MTLBinaryArchive::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLStitchedLibraryDescriptor setBinaryArchives:]} */
    public void setBinaryArchives(final NSArray<MTLBinaryArchive> binaryArchives) {
        try {
            MH_setBinaryArchives_.invokeExact(this.handle, SEL_setBinaryArchives_, binaryArchives.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLStitchedLibraryDescriptor options]}
     *
     * @return a combination of {@link MTLStitchedLibraryOptions} flags
     */
    public long options() {
        try {
            return (long) MH_options.invokeExact(this.handle, SEL_options);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLStitchedLibraryDescriptor setOptions:]}
     *
     * @param options a combination of {@link MTLStitchedLibraryOptions} flags
     */
    public void setOptions(final long options) {
        try {
            MH_setOptions_.invokeExact(this.handle, SEL_setOptions_, options);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
