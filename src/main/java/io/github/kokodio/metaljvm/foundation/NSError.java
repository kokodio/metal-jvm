package io.github.kokodio.metaljvm.foundation;

import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code NSError}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/nserror">Apple documentation</a>
 */
public class NSError extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Foundation");
    private static final long CLS = ObjC.clazz("NSError");
    private static final long SEL_CLASS_new = ObjC.selector("new");
    private static final MethodHandle MH_CLASS_new = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");
    private static final MethodHandle MH_init = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithDomain_code_userInfo_ = ObjC.selector("initWithDomain:code:userInfo:");
    private static final MethodHandle MH_initWithDomain_code_userInfo_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_errorWithDomain_code_userInfo_ = ObjC.selector("errorWithDomain:code:userInfo:");
    private static final MethodHandle MH_CLASS_errorWithDomain_code_userInfo_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_setUserInfoValueProviderForDomain_provider_ = ObjC.selector("setUserInfoValueProviderForDomain:provider:");
    private static final MethodHandle MH_CLASS_setUserInfoValueProviderForDomain_provider_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_userInfoValueProviderForDomain_ = ObjC.selector("userInfoValueProviderForDomain:");
    private static final MethodHandle MH_CLASS_userInfoValueProviderForDomain_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_domain = ObjC.selector("domain");
    private static final MethodHandle MH_domain = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_code = ObjC.selector("code");
    private static final MethodHandle MH_code = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_userInfo = ObjC.selector("userInfo");
    private static final MethodHandle MH_userInfo = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_localizedDescription = ObjC.selector("localizedDescription");
    private static final MethodHandle MH_localizedDescription = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_localizedFailureReason = ObjC.selector("localizedFailureReason");
    private static final MethodHandle MH_localizedFailureReason = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_localizedRecoverySuggestion = ObjC.selector("localizedRecoverySuggestion");
    private static final MethodHandle MH_localizedRecoverySuggestion = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_localizedRecoveryOptions = ObjC.selector("localizedRecoveryOptions");
    private static final MethodHandle MH_localizedRecoveryOptions = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_recoveryAttempter = ObjC.selector("recoveryAttempter");
    private static final MethodHandle MH_recoveryAttempter = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_helpAnchor = ObjC.selector("helpAnchor");
    private static final MethodHandle MH_helpAnchor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_underlyingErrors = ObjC.selector("underlyingErrors");
    private static final MethodHandle MH_underlyingErrors = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public NSError(final long handle) {
        super(handle);
    }

    /**
     * {@code +[NSError alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static NSError alloc() {
        try {
            return new NSError((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSError new]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    public static NSError new_() {
        try {
            long result = (long) MH_CLASS_new.invokeExact(CLS, SEL_CLASS_new);
            return new NSError(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSError init]} */
    public NSError init() {
        try {
            long result = (long) MH_init.invokeExact(this.handle, SEL_init);
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSError initWithDomain:code:userInfo:]} */
    public NSError initWithDomain(final String domain, final long code, @Nullable final NSDictionary<NSObject, NSObject> dict) {
        final long nsDomain = ObjC.nsString(domain);
        try {
            long result = (long) MH_initWithDomain_code_userInfo_.invokeExact(this.handle, SEL_initWithDomain_code_userInfo_, nsDomain, code, dict == null ? 0L : dict.handle());
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsDomain);
        }
    }

    /** {@code +[NSError errorWithDomain:code:userInfo:]} */
    public static NSError error(final String domain, final long code, @Nullable final NSDictionary<NSObject, NSObject> dict) {
        final long nsDomain = ObjC.nsString(domain);
        try {
            long result = (long) MH_CLASS_errorWithDomain_code_userInfo_.invokeExact(CLS, SEL_CLASS_errorWithDomain_code_userInfo_, nsDomain, code, dict == null ? 0L : dict.handle());
            return new NSError(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsDomain);
        }
    }

    /** {@code +[NSError setUserInfoValueProviderForDomain:provider:]} */
    public static void setUserInfoValueProviderForDomain(final String errorDomain, final long provider) {
        final long nsErrorDomain = ObjC.nsString(errorDomain);
        try {
            MH_CLASS_setUserInfoValueProviderForDomain_provider_.invokeExact(CLS, SEL_CLASS_setUserInfoValueProviderForDomain_provider_, nsErrorDomain, provider);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsErrorDomain);
        }
    }

    /** {@code +[NSError userInfoValueProviderForDomain:]} */
    public static long userInfoValueProviderForDomain(final String errorDomain) {
        final long nsErrorDomain = ObjC.nsString(errorDomain);
        try {
            return (long) MH_CLASS_userInfoValueProviderForDomain_.invokeExact(CLS, SEL_CLASS_userInfoValueProviderForDomain_, nsErrorDomain);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsErrorDomain);
        }
    }

    /** {@code -[NSError domain]} */
    public String domain() {
        try {
            long result = (long) MH_domain.invokeExact(this.handle, SEL_domain);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSError code]} */
    public long code() {
        try {
            return (long) MH_code.invokeExact(this.handle, SEL_code);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSError userInfo]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSDictionary<NSObject, NSObject> userInfo() {
        try {
            long result = (long) MH_userInfo.invokeExact(this.handle, SEL_userInfo);
            return new NSDictionary<>(result, NSObject::new, NSObject::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSError localizedDescription]} */
    public String localizedDescription() {
        try {
            long result = (long) MH_localizedDescription.invokeExact(this.handle, SEL_localizedDescription);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSError localizedFailureReason]} */
    @Nullable
    public String localizedFailureReason() {
        try {
            long result = (long) MH_localizedFailureReason.invokeExact(this.handle, SEL_localizedFailureReason);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSError localizedRecoverySuggestion]} */
    @Nullable
    public String localizedRecoverySuggestion() {
        try {
            long result = (long) MH_localizedRecoverySuggestion.invokeExact(this.handle, SEL_localizedRecoverySuggestion);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSError localizedRecoveryOptions]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<NSString> localizedRecoveryOptions() {
        try {
            long result = (long) MH_localizedRecoveryOptions.invokeExact(this.handle, SEL_localizedRecoveryOptions);
            return result == 0L ? null : new NSArray<>(result, NSString::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSError recoveryAttempter]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject recoveryAttempter() {
        try {
            long result = (long) MH_recoveryAttempter.invokeExact(this.handle, SEL_recoveryAttempter);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSError helpAnchor]} */
    @Nullable
    public String helpAnchor() {
        try {
            long result = (long) MH_helpAnchor.invokeExact(this.handle, SEL_helpAnchor);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSError underlyingErrors]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<NSError> underlyingErrors() {
        try {
            long result = (long) MH_underlyingErrors.invokeExact(this.handle, SEL_underlyingErrors);
            return new NSArray<>(result, NSError::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
