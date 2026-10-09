package io.github.kokodio.metaljvm.foundation;

import io.github.kokodio.metaljvm.objc.NativeStack;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_DOUBLE;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code NSBundle}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/bundle">Apple documentation</a>
 */
public class NSBundle extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Foundation");
    private static final long CLS = ObjC.clazz("NSBundle");
    private static final long SEL_CLASS_bundleWithPath_ = ObjC.selector("bundleWithPath:");
    private static final MethodHandle MH_CLASS_bundleWithPath_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithPath_ = ObjC.selector("initWithPath:");
    private static final MethodHandle MH_initWithPath_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_bundleWithURL_ = ObjC.selector("bundleWithURL:");
    private static final MethodHandle MH_CLASS_bundleWithURL_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithURL_ = ObjC.selector("initWithURL:");
    private static final MethodHandle MH_initWithURL_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_bundleForClass_ = ObjC.selector("bundleForClass:");
    private static final MethodHandle MH_CLASS_bundleForClass_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_bundleWithIdentifier_ = ObjC.selector("bundleWithIdentifier:");
    private static final MethodHandle MH_CLASS_bundleWithIdentifier_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_load = ObjC.selector("load");
    private static final MethodHandle MH_load = ObjC.msgSend(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_unload = ObjC.selector("unload");
    private static final MethodHandle MH_unload = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_preflightAndReturnError_ = ObjC.selector("preflightAndReturnError:");
    private static final MethodHandle MH_preflightAndReturnError_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_loadAndReturnError_ = ObjC.selector("loadAndReturnError:");
    private static final MethodHandle MH_loadAndReturnError_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_URLForAuxiliaryExecutable_ = ObjC.selector("URLForAuxiliaryExecutable:");
    private static final MethodHandle MH_URLForAuxiliaryExecutable_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_pathForAuxiliaryExecutable_ = ObjC.selector("pathForAuxiliaryExecutable:");
    private static final MethodHandle MH_pathForAuxiliaryExecutable_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_URLForResource_withExtension_subdirectory_inBundleWithURL_ = ObjC.selector("URLForResource:withExtension:subdirectory:inBundleWithURL:");
    private static final MethodHandle MH_CLASS_URLForResource_withExtension_subdirectory_inBundleWithURL_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_URLsForResourcesWithExtension_subdirectory_inBundleWithURL_ = ObjC.selector("URLsForResourcesWithExtension:subdirectory:inBundleWithURL:");
    private static final MethodHandle MH_CLASS_URLsForResourcesWithExtension_subdirectory_inBundleWithURL_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_URLForResource_withExtension_ = ObjC.selector("URLForResource:withExtension:");
    private static final MethodHandle MH_URLForResource_withExtension_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_URLForResource_withExtension_subdirectory_ = ObjC.selector("URLForResource:withExtension:subdirectory:");
    private static final MethodHandle MH_URLForResource_withExtension_subdirectory_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_URLForResource_withExtension_subdirectory_localization_ = ObjC.selector("URLForResource:withExtension:subdirectory:localization:");
    private static final MethodHandle MH_URLForResource_withExtension_subdirectory_localization_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_URLsForResourcesWithExtension_subdirectory_ = ObjC.selector("URLsForResourcesWithExtension:subdirectory:");
    private static final MethodHandle MH_URLsForResourcesWithExtension_subdirectory_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_URLsForResourcesWithExtension_subdirectory_localization_ = ObjC.selector("URLsForResourcesWithExtension:subdirectory:localization:");
    private static final MethodHandle MH_URLsForResourcesWithExtension_subdirectory_localization_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_pathForResource_ofType_inDirectory_ = ObjC.selector("pathForResource:ofType:inDirectory:");
    private static final MethodHandle MH_CLASS_pathForResource_ofType_inDirectory_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_pathsForResourcesOfType_inDirectory_ = ObjC.selector("pathsForResourcesOfType:inDirectory:");
    private static final MethodHandle MH_CLASS_pathsForResourcesOfType_inDirectory_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_pathForResource_ofType_ = ObjC.selector("pathForResource:ofType:");
    private static final MethodHandle MH_pathForResource_ofType_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_pathForResource_ofType_inDirectory_ = ObjC.selector("pathForResource:ofType:inDirectory:");
    private static final MethodHandle MH_pathForResource_ofType_inDirectory_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_pathForResource_ofType_inDirectory_forLocalization_ = ObjC.selector("pathForResource:ofType:inDirectory:forLocalization:");
    private static final MethodHandle MH_pathForResource_ofType_inDirectory_forLocalization_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_pathsForResourcesOfType_inDirectory_ = ObjC.selector("pathsForResourcesOfType:inDirectory:");
    private static final MethodHandle MH_pathsForResourcesOfType_inDirectory_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_pathsForResourcesOfType_inDirectory_forLocalization_ = ObjC.selector("pathsForResourcesOfType:inDirectory:forLocalization:");
    private static final MethodHandle MH_pathsForResourcesOfType_inDirectory_forLocalization_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_localizedStringForKey_value_table_ = ObjC.selector("localizedStringForKey:value:table:");
    private static final MethodHandle MH_localizedStringForKey_value_table_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_localizedAttributedStringForKey_value_table_ = ObjC.selector("localizedAttributedStringForKey:value:table:");
    private static final MethodHandle MH_localizedAttributedStringForKey_value_table_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_localizedStringForKey_value_table_localizations_ = ObjC.selector("localizedStringForKey:value:table:localizations:");
    private static final MethodHandle MH_localizedStringForKey_value_table_localizations_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_objectForInfoDictionaryKey_ = ObjC.selector("objectForInfoDictionaryKey:");
    private static final MethodHandle MH_objectForInfoDictionaryKey_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_classNamed_ = ObjC.selector("classNamed:");
    private static final MethodHandle MH_classNamed_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_preferredLocalizationsFromArray_ = ObjC.selector("preferredLocalizationsFromArray:");
    private static final MethodHandle MH_CLASS_preferredLocalizationsFromArray_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_preferredLocalizationsFromArray_forPreferences_ = ObjC.selector("preferredLocalizationsFromArray:forPreferences:");
    private static final MethodHandle MH_CLASS_preferredLocalizationsFromArray_forPreferences_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_mainBundle = ObjC.selector("mainBundle");
    private static final MethodHandle MH_CLASS_mainBundle = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_allBundles = ObjC.selector("allBundles");
    private static final MethodHandle MH_CLASS_allBundles = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_allFrameworks = ObjC.selector("allFrameworks");
    private static final MethodHandle MH_CLASS_allFrameworks = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isLoaded = ObjC.selector("isLoaded");
    private static final MethodHandle MH_isLoaded = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_bundleURL = ObjC.selector("bundleURL");
    private static final MethodHandle MH_bundleURL = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_resourceURL = ObjC.selector("resourceURL");
    private static final MethodHandle MH_resourceURL = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_executableURL = ObjC.selector("executableURL");
    private static final MethodHandle MH_executableURL = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_privateFrameworksURL = ObjC.selector("privateFrameworksURL");
    private static final MethodHandle MH_privateFrameworksURL = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sharedFrameworksURL = ObjC.selector("sharedFrameworksURL");
    private static final MethodHandle MH_sharedFrameworksURL = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sharedSupportURL = ObjC.selector("sharedSupportURL");
    private static final MethodHandle MH_sharedSupportURL = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_builtInPlugInsURL = ObjC.selector("builtInPlugInsURL");
    private static final MethodHandle MH_builtInPlugInsURL = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_appStoreReceiptURL = ObjC.selector("appStoreReceiptURL");
    private static final MethodHandle MH_appStoreReceiptURL = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_bundlePath = ObjC.selector("bundlePath");
    private static final MethodHandle MH_bundlePath = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_resourcePath = ObjC.selector("resourcePath");
    private static final MethodHandle MH_resourcePath = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_executablePath = ObjC.selector("executablePath");
    private static final MethodHandle MH_executablePath = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_privateFrameworksPath = ObjC.selector("privateFrameworksPath");
    private static final MethodHandle MH_privateFrameworksPath = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sharedFrameworksPath = ObjC.selector("sharedFrameworksPath");
    private static final MethodHandle MH_sharedFrameworksPath = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sharedSupportPath = ObjC.selector("sharedSupportPath");
    private static final MethodHandle MH_sharedSupportPath = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_builtInPlugInsPath = ObjC.selector("builtInPlugInsPath");
    private static final MethodHandle MH_builtInPlugInsPath = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_bundleIdentifier = ObjC.selector("bundleIdentifier");
    private static final MethodHandle MH_bundleIdentifier = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_infoDictionary = ObjC.selector("infoDictionary");
    private static final MethodHandle MH_infoDictionary = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_localizedInfoDictionary = ObjC.selector("localizedInfoDictionary");
    private static final MethodHandle MH_localizedInfoDictionary = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_principalClass = ObjC.selector("principalClass");
    private static final MethodHandle MH_principalClass = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_preferredLocalizations = ObjC.selector("preferredLocalizations");
    private static final MethodHandle MH_preferredLocalizations = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_localizations = ObjC.selector("localizations");
    private static final MethodHandle MH_localizations = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_developmentLocalization = ObjC.selector("developmentLocalization");
    private static final MethodHandle MH_developmentLocalization = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_executableArchitectures = ObjC.selector("executableArchitectures");
    private static final MethodHandle MH_executableArchitectures = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setPreservationPriority_forTags_ = ObjC.selector("setPreservationPriority:forTags:");
    private static final MethodHandle MH_setPreservationPriority_forTags_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_LONG));
    private static final long SEL_preservationPriorityForTag_ = ObjC.selector("preservationPriorityForTag:");
    private static final MethodHandle MH_preservationPriorityForTag_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_DOUBLE, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public NSBundle(final long handle) {
        super(handle);
    }

    /**
     * {@code +[NSBundle alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static NSBundle alloc() {
        try {
            return new NSBundle((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSBundle init]} */
    public NSBundle init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSBundle bundleWithPath:]} */
    @Nullable
    public static NSBundle bundleWithPath(final String path) {
        final long nsPath = ObjC.nsString(path);
        try {
            long result = (long) MH_CLASS_bundleWithPath_.invokeExact(CLS, SEL_CLASS_bundleWithPath_, nsPath);
            return result == 0L ? null : new NSBundle(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsPath);
        }
    }

    /** {@code -[NSBundle initWithPath:]} */
    @Nullable
    public NSBundle initWithPath(final String path) {
        final long nsPath = ObjC.nsString(path);
        try {
            long result = (long) MH_initWithPath_.invokeExact(this.handle, SEL_initWithPath_, nsPath);
            if (result == 0L) {
                return null;
            }
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsPath);
        }
    }

    /** {@code +[NSBundle bundleWithURL:]} */
    @Nullable
    public static NSBundle bundleWithURL(final NSURL url) {
        try {
            long result = (long) MH_CLASS_bundleWithURL_.invokeExact(CLS, SEL_CLASS_bundleWithURL_, url.handle());
            return result == 0L ? null : new NSBundle(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSBundle initWithURL:]} */
    @Nullable
    public NSBundle initWithURL(final NSURL url) {
        try {
            long result = (long) MH_initWithURL_.invokeExact(this.handle, SEL_initWithURL_, url.handle());
            if (result == 0L) {
                return null;
            }
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSBundle bundleForClass:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSBundle bundleForClass(final long aClass) {
        try {
            long result = (long) MH_CLASS_bundleForClass_.invokeExact(CLS, SEL_CLASS_bundleForClass_, aClass);
            return new NSBundle(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSBundle bundleWithIdentifier:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public static NSBundle bundleWithIdentifier(final String identifier) {
        final long nsIdentifier = ObjC.nsString(identifier);
        try {
            long result = (long) MH_CLASS_bundleWithIdentifier_.invokeExact(CLS, SEL_CLASS_bundleWithIdentifier_, nsIdentifier);
            return result == 0L ? null : new NSBundle(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsIdentifier);
        }
    }

    /** {@code -[NSBundle load]} */
    public boolean load_() {
        try {
            return (boolean) MH_load.invokeExact(this.handle, SEL_load);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSBundle unload]} */
    public boolean unload() {
        try {
            return (boolean) MH_unload.invokeExact(this.handle, SEL_unload);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSBundle preflightAndReturnError:]} */
    public void preflightAndReturnError() {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            boolean result = (boolean) MH_preflightAndReturnError_.invokeExact(this.handle, SEL_preflightAndReturnError_, errorOut.address());
            if (!result) {
                throw NSErrorException.of("preflightAndReturnError:", errorOut.get(JAVA_LONG, 0L));
            }
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSBundle loadAndReturnError:]} */
    public void loadAndReturnError() {
        try (NativeStack stack = NativeStack.push()) {
            MemorySegment errorOut = stack.calloc(JAVA_LONG);
            boolean result = (boolean) MH_loadAndReturnError_.invokeExact(this.handle, SEL_loadAndReturnError_, errorOut.address());
            if (!result) {
                throw NSErrorException.of("loadAndReturnError:", errorOut.get(JAVA_LONG, 0L));
            }
        } catch (RuntimeException | Error exception) {
            throw exception;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSBundle URLForAuxiliaryExecutable:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSURL URLForAuxiliaryExecutable(final String executableName) {
        final long nsExecutableName = ObjC.nsString(executableName);
        try {
            long result = (long) MH_URLForAuxiliaryExecutable_.invokeExact(this.handle, SEL_URLForAuxiliaryExecutable_, nsExecutableName);
            return result == 0L ? null : new NSURL(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsExecutableName);
        }
    }

    /** {@code -[NSBundle pathForAuxiliaryExecutable:]} */
    @Nullable
    public String pathForAuxiliaryExecutable(final String executableName) {
        final long nsExecutableName = ObjC.nsString(executableName);
        try {
            long result = (long) MH_pathForAuxiliaryExecutable_.invokeExact(this.handle, SEL_pathForAuxiliaryExecutable_, nsExecutableName);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsExecutableName);
        }
    }

    /**
     * {@code +[NSBundle URLForResource:withExtension:subdirectory:inBundleWithURL:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public static NSURL URLForResource(@Nullable final String name, @Nullable final String ext, @Nullable final String subpath, final NSURL bundleURL) {
        final long nsName = name == null ? 0L : ObjC.nsString(name);
        final long nsExt = ext == null ? 0L : ObjC.nsString(ext);
        final long nsSubpath = subpath == null ? 0L : ObjC.nsString(subpath);
        try {
            long result = (long) MH_CLASS_URLForResource_withExtension_subdirectory_inBundleWithURL_.invokeExact(CLS, SEL_CLASS_URLForResource_withExtension_subdirectory_inBundleWithURL_, nsName, nsExt, nsSubpath, bundleURL.handle());
            return result == 0L ? null : new NSURL(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsName);
            ObjC.release(nsExt);
            ObjC.release(nsSubpath);
        }
    }

    /**
     * {@code +[NSBundle URLsForResourcesWithExtension:subdirectory:inBundleWithURL:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public static NSArray<NSURL> URLsForResources(@Nullable final String ext, @Nullable final String subpath, final NSURL bundleURL) {
        final long nsExt = ext == null ? 0L : ObjC.nsString(ext);
        final long nsSubpath = subpath == null ? 0L : ObjC.nsString(subpath);
        try {
            long result = (long) MH_CLASS_URLsForResourcesWithExtension_subdirectory_inBundleWithURL_.invokeExact(CLS, SEL_CLASS_URLsForResourcesWithExtension_subdirectory_inBundleWithURL_, nsExt, nsSubpath, bundleURL.handle());
            return result == 0L ? null : new NSArray<>(result, NSURL::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsExt);
            ObjC.release(nsSubpath);
        }
    }

    /**
     * {@code -[NSBundle URLForResource:withExtension:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSURL URLForResource(@Nullable final String name, @Nullable final String ext) {
        final long nsName = name == null ? 0L : ObjC.nsString(name);
        final long nsExt = ext == null ? 0L : ObjC.nsString(ext);
        try {
            long result = (long) MH_URLForResource_withExtension_.invokeExact(this.handle, SEL_URLForResource_withExtension_, nsName, nsExt);
            return result == 0L ? null : new NSURL(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsName);
            ObjC.release(nsExt);
        }
    }

    /**
     * {@code -[NSBundle URLForResource:withExtension:subdirectory:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSURL URLForResource(@Nullable final String name, @Nullable final String ext, @Nullable final String subpath) {
        final long nsName = name == null ? 0L : ObjC.nsString(name);
        final long nsExt = ext == null ? 0L : ObjC.nsString(ext);
        final long nsSubpath = subpath == null ? 0L : ObjC.nsString(subpath);
        try {
            long result = (long) MH_URLForResource_withExtension_subdirectory_.invokeExact(this.handle, SEL_URLForResource_withExtension_subdirectory_, nsName, nsExt, nsSubpath);
            return result == 0L ? null : new NSURL(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsName);
            ObjC.release(nsExt);
            ObjC.release(nsSubpath);
        }
    }

    /**
     * {@code -[NSBundle URLForResource:withExtension:subdirectory:localization:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSURL URLForResource(@Nullable final String name, @Nullable final String ext, @Nullable final String subpath, @Nullable final String localizationName) {
        final long nsName = name == null ? 0L : ObjC.nsString(name);
        final long nsExt = ext == null ? 0L : ObjC.nsString(ext);
        final long nsSubpath = subpath == null ? 0L : ObjC.nsString(subpath);
        final long nsLocalizationName = localizationName == null ? 0L : ObjC.nsString(localizationName);
        try {
            long result = (long) MH_URLForResource_withExtension_subdirectory_localization_.invokeExact(this.handle, SEL_URLForResource_withExtension_subdirectory_localization_, nsName, nsExt, nsSubpath, nsLocalizationName);
            return result == 0L ? null : new NSURL(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsName);
            ObjC.release(nsExt);
            ObjC.release(nsSubpath);
            ObjC.release(nsLocalizationName);
        }
    }

    /**
     * {@code -[NSBundle URLsForResourcesWithExtension:subdirectory:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<NSURL> URLsForResources(@Nullable final String ext, @Nullable final String subpath) {
        final long nsExt = ext == null ? 0L : ObjC.nsString(ext);
        final long nsSubpath = subpath == null ? 0L : ObjC.nsString(subpath);
        try {
            long result = (long) MH_URLsForResourcesWithExtension_subdirectory_.invokeExact(this.handle, SEL_URLsForResourcesWithExtension_subdirectory_, nsExt, nsSubpath);
            return result == 0L ? null : new NSArray<>(result, NSURL::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsExt);
            ObjC.release(nsSubpath);
        }
    }

    /**
     * {@code -[NSBundle URLsForResourcesWithExtension:subdirectory:localization:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<NSURL> URLsForResources(@Nullable final String ext, @Nullable final String subpath, @Nullable final String localizationName) {
        final long nsExt = ext == null ? 0L : ObjC.nsString(ext);
        final long nsSubpath = subpath == null ? 0L : ObjC.nsString(subpath);
        final long nsLocalizationName = localizationName == null ? 0L : ObjC.nsString(localizationName);
        try {
            long result = (long) MH_URLsForResourcesWithExtension_subdirectory_localization_.invokeExact(this.handle, SEL_URLsForResourcesWithExtension_subdirectory_localization_, nsExt, nsSubpath, nsLocalizationName);
            return result == 0L ? null : new NSArray<>(result, NSURL::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsExt);
            ObjC.release(nsSubpath);
            ObjC.release(nsLocalizationName);
        }
    }

    /** {@code +[NSBundle pathForResource:ofType:inDirectory:]} */
    @Nullable
    public static String pathForResourceOfTypeInDirectory_(@Nullable final String name, @Nullable final String ext, final String bundlePath) {
        final long nsName = name == null ? 0L : ObjC.nsString(name);
        final long nsExt = ext == null ? 0L : ObjC.nsString(ext);
        final long nsBundlePath = ObjC.nsString(bundlePath);
        try {
            long result = (long) MH_CLASS_pathForResource_ofType_inDirectory_.invokeExact(CLS, SEL_CLASS_pathForResource_ofType_inDirectory_, nsName, nsExt, nsBundlePath);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsName);
            ObjC.release(nsExt);
            ObjC.release(nsBundlePath);
        }
    }

    /**
     * {@code +[NSBundle pathsForResourcesOfType:inDirectory:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSArray<NSString> pathsForResourcesOfTypeInDirectory_(@Nullable final String ext, final String bundlePath) {
        final long nsExt = ext == null ? 0L : ObjC.nsString(ext);
        final long nsBundlePath = ObjC.nsString(bundlePath);
        try {
            long result = (long) MH_CLASS_pathsForResourcesOfType_inDirectory_.invokeExact(CLS, SEL_CLASS_pathsForResourcesOfType_inDirectory_, nsExt, nsBundlePath);
            return new NSArray<>(result, NSString::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsExt);
            ObjC.release(nsBundlePath);
        }
    }

    /** {@code -[NSBundle pathForResource:ofType:]} */
    @Nullable
    public String pathForResource(@Nullable final String name, @Nullable final String ext) {
        final long nsName = name == null ? 0L : ObjC.nsString(name);
        final long nsExt = ext == null ? 0L : ObjC.nsString(ext);
        try {
            long result = (long) MH_pathForResource_ofType_.invokeExact(this.handle, SEL_pathForResource_ofType_, nsName, nsExt);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsName);
            ObjC.release(nsExt);
        }
    }

    /** {@code -[NSBundle pathForResource:ofType:inDirectory:]} */
    @Nullable
    public String pathForResourceOfTypeInDirectory(@Nullable final String name, @Nullable final String ext, @Nullable final String subpath) {
        final long nsName = name == null ? 0L : ObjC.nsString(name);
        final long nsExt = ext == null ? 0L : ObjC.nsString(ext);
        final long nsSubpath = subpath == null ? 0L : ObjC.nsString(subpath);
        try {
            long result = (long) MH_pathForResource_ofType_inDirectory_.invokeExact(this.handle, SEL_pathForResource_ofType_inDirectory_, nsName, nsExt, nsSubpath);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsName);
            ObjC.release(nsExt);
            ObjC.release(nsSubpath);
        }
    }

    /** {@code -[NSBundle pathForResource:ofType:inDirectory:forLocalization:]} */
    @Nullable
    public String pathForResource(@Nullable final String name, @Nullable final String ext, @Nullable final String subpath, @Nullable final String localizationName) {
        final long nsName = name == null ? 0L : ObjC.nsString(name);
        final long nsExt = ext == null ? 0L : ObjC.nsString(ext);
        final long nsSubpath = subpath == null ? 0L : ObjC.nsString(subpath);
        final long nsLocalizationName = localizationName == null ? 0L : ObjC.nsString(localizationName);
        try {
            long result = (long) MH_pathForResource_ofType_inDirectory_forLocalization_.invokeExact(this.handle, SEL_pathForResource_ofType_inDirectory_forLocalization_, nsName, nsExt, nsSubpath, nsLocalizationName);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsName);
            ObjC.release(nsExt);
            ObjC.release(nsSubpath);
            ObjC.release(nsLocalizationName);
        }
    }

    /**
     * {@code -[NSBundle pathsForResourcesOfType:inDirectory:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<NSString> pathsForResourcesOfTypeInDirectory(@Nullable final String ext, @Nullable final String subpath) {
        final long nsExt = ext == null ? 0L : ObjC.nsString(ext);
        final long nsSubpath = subpath == null ? 0L : ObjC.nsString(subpath);
        try {
            long result = (long) MH_pathsForResourcesOfType_inDirectory_.invokeExact(this.handle, SEL_pathsForResourcesOfType_inDirectory_, nsExt, nsSubpath);
            return new NSArray<>(result, NSString::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsExt);
            ObjC.release(nsSubpath);
        }
    }

    /**
     * {@code -[NSBundle pathsForResourcesOfType:inDirectory:forLocalization:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<NSString> pathsForResourcesOfType(@Nullable final String ext, @Nullable final String subpath, @Nullable final String localizationName) {
        final long nsExt = ext == null ? 0L : ObjC.nsString(ext);
        final long nsSubpath = subpath == null ? 0L : ObjC.nsString(subpath);
        final long nsLocalizationName = localizationName == null ? 0L : ObjC.nsString(localizationName);
        try {
            long result = (long) MH_pathsForResourcesOfType_inDirectory_forLocalization_.invokeExact(this.handle, SEL_pathsForResourcesOfType_inDirectory_forLocalization_, nsExt, nsSubpath, nsLocalizationName);
            return new NSArray<>(result, NSString::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsExt);
            ObjC.release(nsSubpath);
            ObjC.release(nsLocalizationName);
        }
    }

    /** {@code -[NSBundle localizedStringForKey:value:table:]} */
    public String localizedStringForKey(final String key, @Nullable final String value, @Nullable final String tableName) {
        final long nsKey = ObjC.nsString(key);
        final long nsValue = value == null ? 0L : ObjC.nsString(value);
        final long nsTableName = tableName == null ? 0L : ObjC.nsString(tableName);
        try {
            long result = (long) MH_localizedStringForKey_value_table_.invokeExact(this.handle, SEL_localizedStringForKey_value_table_, nsKey, nsValue, nsTableName);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsKey);
            ObjC.release(nsValue);
            ObjC.release(nsTableName);
        }
    }

    /**
     * {@code -[NSBundle localizedAttributedStringForKey:value:table:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSObject localizedAttributedStringForKey(final String key, @Nullable final String value, @Nullable final String tableName) {
        final long nsKey = ObjC.nsString(key);
        final long nsValue = value == null ? 0L : ObjC.nsString(value);
        final long nsTableName = tableName == null ? 0L : ObjC.nsString(tableName);
        try {
            long result = (long) MH_localizedAttributedStringForKey_value_table_.invokeExact(this.handle, SEL_localizedAttributedStringForKey_value_table_, nsKey, nsValue, nsTableName);
            return new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsKey);
            ObjC.release(nsValue);
            ObjC.release(nsTableName);
        }
    }

    /** {@code -[NSBundle localizedStringForKey:value:table:localizations:]} */
    public String localizedStringForKey(final String key, @Nullable final String value, @Nullable final String tableName, final NSArray<NSString> localizations) {
        final long nsKey = ObjC.nsString(key);
        final long nsValue = value == null ? 0L : ObjC.nsString(value);
        final long nsTableName = tableName == null ? 0L : ObjC.nsString(tableName);
        try {
            long result = (long) MH_localizedStringForKey_value_table_localizations_.invokeExact(this.handle, SEL_localizedStringForKey_value_table_localizations_, nsKey, nsValue, nsTableName, localizations.handle());
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsKey);
            ObjC.release(nsValue);
            ObjC.release(nsTableName);
        }
    }

    /**
     * {@code -[NSBundle objectForInfoDictionaryKey:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject objectForInfoDictionaryKey(final String key) {
        final long nsKey = ObjC.nsString(key);
        try {
            long result = (long) MH_objectForInfoDictionaryKey_.invokeExact(this.handle, SEL_objectForInfoDictionaryKey_, nsKey);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsKey);
        }
    }

    /** {@code -[NSBundle classNamed:]} */
    public long classNamed(final String className) {
        final long nsClassName = ObjC.nsString(className);
        try {
            return (long) MH_classNamed_.invokeExact(this.handle, SEL_classNamed_, nsClassName);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsClassName);
        }
    }

    /**
     * {@code +[NSBundle preferredLocalizationsFromArray:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSArray<NSString> preferredLocalizationsFromArray(final NSArray<NSString> localizationsArray) {
        try {
            long result = (long) MH_CLASS_preferredLocalizationsFromArray_.invokeExact(CLS, SEL_CLASS_preferredLocalizationsFromArray_, localizationsArray.handle());
            return new NSArray<>(result, NSString::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSBundle preferredLocalizationsFromArray:forPreferences:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSArray<NSString> preferredLocalizationsFromArray(final NSArray<NSString> localizationsArray, @Nullable final NSArray<NSString> preferencesArray) {
        try {
            long result = (long) MH_CLASS_preferredLocalizationsFromArray_forPreferences_.invokeExact(CLS, SEL_CLASS_preferredLocalizationsFromArray_forPreferences_, localizationsArray.handle(), preferencesArray == null ? 0L : preferencesArray.handle());
            return new NSArray<>(result, NSString::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSBundle mainBundle]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSBundle mainBundle() {
        try {
            long result = (long) MH_CLASS_mainBundle.invokeExact(CLS, SEL_CLASS_mainBundle);
            return new NSBundle(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSBundle allBundles]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSArray<NSBundle> allBundles() {
        try {
            long result = (long) MH_CLASS_allBundles.invokeExact(CLS, SEL_CLASS_allBundles);
            return new NSArray<>(result, NSBundle::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSBundle allFrameworks]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSArray<NSBundle> allFrameworks() {
        try {
            long result = (long) MH_CLASS_allFrameworks.invokeExact(CLS, SEL_CLASS_allFrameworks);
            return new NSArray<>(result, NSBundle::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSBundle isLoaded]} */
    public boolean isLoaded() {
        try {
            return (boolean) MH_isLoaded.invokeExact(this.handle, SEL_isLoaded);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSBundle bundleURL]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSURL bundleURL() {
        try {
            long result = (long) MH_bundleURL.invokeExact(this.handle, SEL_bundleURL);
            return new NSURL(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSBundle resourceURL]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSURL resourceURL() {
        try {
            long result = (long) MH_resourceURL.invokeExact(this.handle, SEL_resourceURL);
            return result == 0L ? null : new NSURL(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSBundle executableURL]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSURL executableURL() {
        try {
            long result = (long) MH_executableURL.invokeExact(this.handle, SEL_executableURL);
            return result == 0L ? null : new NSURL(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSBundle privateFrameworksURL]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSURL privateFrameworksURL() {
        try {
            long result = (long) MH_privateFrameworksURL.invokeExact(this.handle, SEL_privateFrameworksURL);
            return result == 0L ? null : new NSURL(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSBundle sharedFrameworksURL]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSURL sharedFrameworksURL() {
        try {
            long result = (long) MH_sharedFrameworksURL.invokeExact(this.handle, SEL_sharedFrameworksURL);
            return result == 0L ? null : new NSURL(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSBundle sharedSupportURL]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSURL sharedSupportURL() {
        try {
            long result = (long) MH_sharedSupportURL.invokeExact(this.handle, SEL_sharedSupportURL);
            return result == 0L ? null : new NSURL(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSBundle builtInPlugInsURL]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSURL builtInPlugInsURL() {
        try {
            long result = (long) MH_builtInPlugInsURL.invokeExact(this.handle, SEL_builtInPlugInsURL);
            return result == 0L ? null : new NSURL(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSBundle appStoreReceiptURL]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSURL appStoreReceiptURL() {
        try {
            long result = (long) MH_appStoreReceiptURL.invokeExact(this.handle, SEL_appStoreReceiptURL);
            return result == 0L ? null : new NSURL(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSBundle bundlePath]} */
    public String bundlePath() {
        try {
            long result = (long) MH_bundlePath.invokeExact(this.handle, SEL_bundlePath);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSBundle resourcePath]} */
    @Nullable
    public String resourcePath() {
        try {
            long result = (long) MH_resourcePath.invokeExact(this.handle, SEL_resourcePath);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSBundle executablePath]} */
    @Nullable
    public String executablePath() {
        try {
            long result = (long) MH_executablePath.invokeExact(this.handle, SEL_executablePath);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSBundle privateFrameworksPath]} */
    @Nullable
    public String privateFrameworksPath() {
        try {
            long result = (long) MH_privateFrameworksPath.invokeExact(this.handle, SEL_privateFrameworksPath);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSBundle sharedFrameworksPath]} */
    @Nullable
    public String sharedFrameworksPath() {
        try {
            long result = (long) MH_sharedFrameworksPath.invokeExact(this.handle, SEL_sharedFrameworksPath);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSBundle sharedSupportPath]} */
    @Nullable
    public String sharedSupportPath() {
        try {
            long result = (long) MH_sharedSupportPath.invokeExact(this.handle, SEL_sharedSupportPath);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSBundle builtInPlugInsPath]} */
    @Nullable
    public String builtInPlugInsPath() {
        try {
            long result = (long) MH_builtInPlugInsPath.invokeExact(this.handle, SEL_builtInPlugInsPath);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSBundle bundleIdentifier]} */
    @Nullable
    public String bundleIdentifier() {
        try {
            long result = (long) MH_bundleIdentifier.invokeExact(this.handle, SEL_bundleIdentifier);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSBundle infoDictionary]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSDictionary<NSString, NSObject> infoDictionary() {
        try {
            long result = (long) MH_infoDictionary.invokeExact(this.handle, SEL_infoDictionary);
            return result == 0L ? null : new NSDictionary<>(result, NSString::new, NSObject::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSBundle localizedInfoDictionary]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSDictionary<NSString, NSObject> localizedInfoDictionary() {
        try {
            long result = (long) MH_localizedInfoDictionary.invokeExact(this.handle, SEL_localizedInfoDictionary);
            return result == 0L ? null : new NSDictionary<>(result, NSString::new, NSObject::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSBundle principalClass]} */
    public long principalClass() {
        try {
            return (long) MH_principalClass.invokeExact(this.handle, SEL_principalClass);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSBundle preferredLocalizations]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<NSString> preferredLocalizations() {
        try {
            long result = (long) MH_preferredLocalizations.invokeExact(this.handle, SEL_preferredLocalizations);
            return new NSArray<>(result, NSString::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSBundle localizations]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<NSString> localizations() {
        try {
            long result = (long) MH_localizations.invokeExact(this.handle, SEL_localizations);
            return new NSArray<>(result, NSString::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSBundle developmentLocalization]} */
    @Nullable
    public String developmentLocalization() {
        try {
            long result = (long) MH_developmentLocalization.invokeExact(this.handle, SEL_developmentLocalization);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSBundle executableArchitectures]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<NSNumber> executableArchitectures() {
        try {
            long result = (long) MH_executableArchitectures.invokeExact(this.handle, SEL_executableArchitectures);
            return result == 0L ? null : new NSArray<>(result, NSNumber::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSBundle setPreservationPriority:forTags:]} */
    public void setPreservationPriority(final double priority, final NSSet<NSString> tags) {
        try {
            MH_setPreservationPriority_forTags_.invokeExact(this.handle, SEL_setPreservationPriority_forTags_, priority, tags.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSBundle preservationPriorityForTag:]} */
    public double preservationPriorityForTag(final String tag) {
        final long nsTag = ObjC.nsString(tag);
        try {
            return (double) MH_preservationPriorityForTag_.invokeExact(this.handle, SEL_preservationPriorityForTag_, nsTag);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsTag);
        }
    }
}
