package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSArray;
import io.github.kokodio.metaljvm.foundation.NSDictionary;
import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.foundation.NSString;
import io.github.kokodio.metaljvm.objc.NativeStack;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLCompileOptions}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtlcompileoptions">Apple documentation</a>
 */
public class MTLCompileOptions extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLCompileOptions");
    private static final long SEL_preprocessorMacros = ObjC.selector("preprocessorMacros");
    private static final MethodHandle MH_preprocessorMacros = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setPreprocessorMacros_ = ObjC.selector("setPreprocessorMacros:");
    private static final MethodHandle MH_setPreprocessorMacros_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_fastMathEnabled = ObjC.selector("fastMathEnabled");
    private static final MethodHandle MH_fastMathEnabled = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFastMathEnabled_ = ObjC.selector("setFastMathEnabled:");
    private static final MethodHandle MH_setFastMathEnabled_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_mathMode = ObjC.selector("mathMode");
    private static final MethodHandle MH_mathMode = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMathMode_ = ObjC.selector("setMathMode:");
    private static final MethodHandle MH_setMathMode_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_mathFloatingPointFunctions = ObjC.selector("mathFloatingPointFunctions");
    private static final MethodHandle MH_mathFloatingPointFunctions = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMathFloatingPointFunctions_ = ObjC.selector("setMathFloatingPointFunctions:");
    private static final MethodHandle MH_setMathFloatingPointFunctions_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_languageVersion = ObjC.selector("languageVersion");
    private static final MethodHandle MH_languageVersion = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLanguageVersion_ = ObjC.selector("setLanguageVersion:");
    private static final MethodHandle MH_setLanguageVersion_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_libraryType = ObjC.selector("libraryType");
    private static final MethodHandle MH_libraryType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLibraryType_ = ObjC.selector("setLibraryType:");
    private static final MethodHandle MH_setLibraryType_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_installName = ObjC.selector("installName");
    private static final MethodHandle MH_installName = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setInstallName_ = ObjC.selector("setInstallName:");
    private static final MethodHandle MH_setInstallName_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_libraries = ObjC.selector("libraries");
    private static final MethodHandle MH_libraries = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLibraries_ = ObjC.selector("setLibraries:");
    private static final MethodHandle MH_setLibraries_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_preserveInvariance = ObjC.selector("preserveInvariance");
    private static final MethodHandle MH_preserveInvariance = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setPreserveInvariance_ = ObjC.selector("setPreserveInvariance:");
    private static final MethodHandle MH_setPreserveInvariance_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_optimizationLevel = ObjC.selector("optimizationLevel");
    private static final MethodHandle MH_optimizationLevel = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setOptimizationLevel_ = ObjC.selector("setOptimizationLevel:");
    private static final MethodHandle MH_setOptimizationLevel_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_compileSymbolVisibility = ObjC.selector("compileSymbolVisibility");
    private static final MethodHandle MH_compileSymbolVisibility = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setCompileSymbolVisibility_ = ObjC.selector("setCompileSymbolVisibility:");
    private static final MethodHandle MH_setCompileSymbolVisibility_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_allowReferencingUndefinedSymbols = ObjC.selector("allowReferencingUndefinedSymbols");
    private static final MethodHandle MH_allowReferencingUndefinedSymbols = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setAllowReferencingUndefinedSymbols_ = ObjC.selector("setAllowReferencingUndefinedSymbols:");
    private static final MethodHandle MH_setAllowReferencingUndefinedSymbols_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_maxTotalThreadsPerThreadgroup = ObjC.selector("maxTotalThreadsPerThreadgroup");
    private static final MethodHandle MH_maxTotalThreadsPerThreadgroup = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMaxTotalThreadsPerThreadgroup_ = ObjC.selector("setMaxTotalThreadsPerThreadgroup:");
    private static final MethodHandle MH_setMaxTotalThreadsPerThreadgroup_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_requiredThreadsPerThreadgroup = ObjC.selector("requiredThreadsPerThreadgroup");
    private static final MethodHandle MH_requiredThreadsPerThreadgroup = ObjC.msgSendCritical(FunctionDescriptor.of(MTLSize.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setRequiredThreadsPerThreadgroup_ = ObjC.selector("setRequiredThreadsPerThreadgroup:");
    private static final MethodHandle MH_setRequiredThreadsPerThreadgroup_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_enableLogging = ObjC.selector("enableLogging");
    private static final MethodHandle MH_enableLogging = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setEnableLogging_ = ObjC.selector("setEnableLogging:");
    private static final MethodHandle MH_setEnableLogging_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_floatingPointConversionRoundingMode = ObjC.selector("floatingPointConversionRoundingMode");
    private static final MethodHandle MH_floatingPointConversionRoundingMode = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFloatingPointConversionRoundingMode_ = ObjC.selector("setFloatingPointConversionRoundingMode:");
    private static final MethodHandle MH_setFloatingPointConversionRoundingMode_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLCompileOptions(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLCompileOptions alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLCompileOptions alloc() {
        try {
            return new MTLCompileOptions((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCompileOptions init]} */
    public MTLCompileOptions init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[MTLCompileOptions preprocessorMacros]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSDictionary<NSString, NSObject> preprocessorMacros() {
        try {
            long result = (long) MH_preprocessorMacros.invokeExact(this.handle, SEL_preprocessorMacros);
            return result == 0L ? null : new NSDictionary<>(result, NSString::new, NSObject::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCompileOptions setPreprocessorMacros:]} */
    public void setPreprocessorMacros(@Nullable final NSDictionary<NSString, NSObject> preprocessorMacros) {
        try {
            MH_setPreprocessorMacros_.invokeExact(this.handle, SEL_setPreprocessorMacros_, preprocessorMacros == null ? 0L : preprocessorMacros.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCompileOptions fastMathEnabled]} */
    public boolean fastMathEnabled() {
        try {
            return (boolean) MH_fastMathEnabled.invokeExact(this.handle, SEL_fastMathEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCompileOptions setFastMathEnabled:]} */
    public void setFastMathEnabled(final boolean fastMathEnabled) {
        try {
            MH_setFastMathEnabled_.invokeExact(this.handle, SEL_setFastMathEnabled_, fastMathEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCompileOptions mathMode]} */
    public MTLMathMode mathMode() {
        try {
            return MTLMathMode.of((long) MH_mathMode.invokeExact(this.handle, SEL_mathMode));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCompileOptions setMathMode:]} */
    public void setMathMode(final MTLMathMode mathMode) {
        try {
            MH_setMathMode_.invokeExact(this.handle, SEL_setMathMode_, mathMode.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCompileOptions mathFloatingPointFunctions]} */
    public MTLMathFloatingPointFunctions mathFloatingPointFunctions() {
        try {
            return MTLMathFloatingPointFunctions.of((long) MH_mathFloatingPointFunctions.invokeExact(this.handle, SEL_mathFloatingPointFunctions));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCompileOptions setMathFloatingPointFunctions:]} */
    public void setMathFloatingPointFunctions(final MTLMathFloatingPointFunctions mathFloatingPointFunctions) {
        try {
            MH_setMathFloatingPointFunctions_.invokeExact(this.handle, SEL_setMathFloatingPointFunctions_, mathFloatingPointFunctions.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCompileOptions languageVersion]} */
    public MTLLanguageVersion languageVersion() {
        try {
            return MTLLanguageVersion.of((long) MH_languageVersion.invokeExact(this.handle, SEL_languageVersion));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCompileOptions setLanguageVersion:]} */
    public void setLanguageVersion(final MTLLanguageVersion languageVersion) {
        try {
            MH_setLanguageVersion_.invokeExact(this.handle, SEL_setLanguageVersion_, languageVersion.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCompileOptions libraryType]} */
    public MTLLibraryType libraryType() {
        try {
            return MTLLibraryType.of((long) MH_libraryType.invokeExact(this.handle, SEL_libraryType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCompileOptions setLibraryType:]} */
    public void setLibraryType(final MTLLibraryType libraryType) {
        try {
            MH_setLibraryType_.invokeExact(this.handle, SEL_setLibraryType_, libraryType.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCompileOptions installName]} */
    @Nullable
    public String installName() {
        try {
            long result = (long) MH_installName.invokeExact(this.handle, SEL_installName);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCompileOptions setInstallName:]} */
    public void setInstallName(@Nullable final String installName) {
        final long nsInstallName = installName == null ? 0L : ObjC.nsString(installName);
        try {
            MH_setInstallName_.invokeExact(this.handle, SEL_setInstallName_, nsInstallName);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsInstallName);
        }
    }

    /**
     * {@code -[MTLCompileOptions libraries]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<MTLDynamicLibrary> libraries() {
        try {
            long result = (long) MH_libraries.invokeExact(this.handle, SEL_libraries);
            return result == 0L ? null : new NSArray<>(result, MTLDynamicLibrary::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCompileOptions setLibraries:]} */
    public void setLibraries(@Nullable final NSArray<MTLDynamicLibrary> libraries) {
        try {
            MH_setLibraries_.invokeExact(this.handle, SEL_setLibraries_, libraries == null ? 0L : libraries.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCompileOptions preserveInvariance]} */
    public boolean preserveInvariance() {
        try {
            return (boolean) MH_preserveInvariance.invokeExact(this.handle, SEL_preserveInvariance);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCompileOptions setPreserveInvariance:]} */
    public void setPreserveInvariance(final boolean preserveInvariance) {
        try {
            MH_setPreserveInvariance_.invokeExact(this.handle, SEL_setPreserveInvariance_, preserveInvariance);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCompileOptions optimizationLevel]} */
    public MTLLibraryOptimizationLevel optimizationLevel() {
        try {
            return MTLLibraryOptimizationLevel.of((long) MH_optimizationLevel.invokeExact(this.handle, SEL_optimizationLevel));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCompileOptions setOptimizationLevel:]} */
    public void setOptimizationLevel(final MTLLibraryOptimizationLevel optimizationLevel) {
        try {
            MH_setOptimizationLevel_.invokeExact(this.handle, SEL_setOptimizationLevel_, optimizationLevel.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCompileOptions compileSymbolVisibility]} */
    public MTLCompileSymbolVisibility compileSymbolVisibility() {
        try {
            return MTLCompileSymbolVisibility.of((long) MH_compileSymbolVisibility.invokeExact(this.handle, SEL_compileSymbolVisibility));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCompileOptions setCompileSymbolVisibility:]} */
    public void setCompileSymbolVisibility(final MTLCompileSymbolVisibility compileSymbolVisibility) {
        try {
            MH_setCompileSymbolVisibility_.invokeExact(this.handle, SEL_setCompileSymbolVisibility_, compileSymbolVisibility.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCompileOptions allowReferencingUndefinedSymbols]} */
    public boolean allowReferencingUndefinedSymbols() {
        try {
            return (boolean) MH_allowReferencingUndefinedSymbols.invokeExact(this.handle, SEL_allowReferencingUndefinedSymbols);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCompileOptions setAllowReferencingUndefinedSymbols:]} */
    public void setAllowReferencingUndefinedSymbols(final boolean allowReferencingUndefinedSymbols) {
        try {
            MH_setAllowReferencingUndefinedSymbols_.invokeExact(this.handle, SEL_setAllowReferencingUndefinedSymbols_, allowReferencingUndefinedSymbols);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCompileOptions maxTotalThreadsPerThreadgroup]} */
    public long maxTotalThreadsPerThreadgroup() {
        try {
            return (long) MH_maxTotalThreadsPerThreadgroup.invokeExact(this.handle, SEL_maxTotalThreadsPerThreadgroup);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCompileOptions setMaxTotalThreadsPerThreadgroup:]} */
    public void setMaxTotalThreadsPerThreadgroup(final long maxTotalThreadsPerThreadgroup) {
        try {
            MH_setMaxTotalThreadsPerThreadgroup_.invokeExact(this.handle, SEL_setMaxTotalThreadsPerThreadgroup_, maxTotalThreadsPerThreadgroup);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCompileOptions requiredThreadsPerThreadgroup]} */
    public MTLSize requiredThreadsPerThreadgroup() {
        try (NativeStack stack = NativeStack.push()) {
            return MTLSize.read((MemorySegment) MH_requiredThreadsPerThreadgroup.invokeExact((SegmentAllocator) stack, this.handle, SEL_requiredThreadsPerThreadgroup));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCompileOptions setRequiredThreadsPerThreadgroup:]} */
    public void setRequiredThreadsPerThreadgroup(final MTLSize requiredThreadsPerThreadgroup) {
        try (NativeStack stack = NativeStack.push()) {
            MH_setRequiredThreadsPerThreadgroup_.invokeExact(this.handle, SEL_setRequiredThreadsPerThreadgroup_, requiredThreadsPerThreadgroup.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCompileOptions enableLogging]} */
    public boolean enableLogging() {
        try {
            return (boolean) MH_enableLogging.invokeExact(this.handle, SEL_enableLogging);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCompileOptions setEnableLogging:]} */
    public void setEnableLogging(final boolean enableLogging) {
        try {
            MH_setEnableLogging_.invokeExact(this.handle, SEL_setEnableLogging_, enableLogging);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCompileOptions floatingPointConversionRoundingMode]} */
    public MTLFloatingPointConversionRoundingMode floatingPointConversionRoundingMode() {
        try {
            return MTLFloatingPointConversionRoundingMode.of((long) MH_floatingPointConversionRoundingMode.invokeExact(this.handle, SEL_floatingPointConversionRoundingMode));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLCompileOptions setFloatingPointConversionRoundingMode:]} */
    public void setFloatingPointConversionRoundingMode(final MTLFloatingPointConversionRoundingMode floatingPointConversionRoundingMode) {
        try {
            MH_setFloatingPointConversionRoundingMode_.invokeExact(this.handle, SEL_setFloatingPointConversionRoundingMode_, floatingPointConversionRoundingMode.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
