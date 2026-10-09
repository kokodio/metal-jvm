package io.github.kokodio.metaljvm.foundation;

import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code NSNotification}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/nsnotification">Apple documentation</a>
 */
public class NSNotification extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Foundation");
    private static final long CLS = ObjC.clazz("NSNotification");
    private static final long SEL_initWithName_object_userInfo_ = ObjC.selector("initWithName:object:userInfo:");
    private static final MethodHandle MH_initWithName_object_userInfo_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithCoder_ = ObjC.selector("initWithCoder:");
    private static final MethodHandle MH_initWithCoder_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_name = ObjC.selector("name");
    private static final MethodHandle MH_name = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_object = ObjC.selector("object");
    private static final MethodHandle MH_object = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_userInfo = ObjC.selector("userInfo");
    private static final MethodHandle MH_userInfo = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_notificationWithName_object_ = ObjC.selector("notificationWithName:object:");
    private static final MethodHandle MH_CLASS_notificationWithName_object_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_notificationWithName_object_userInfo_ = ObjC.selector("notificationWithName:object:userInfo:");
    private static final MethodHandle MH_CLASS_notificationWithName_object_userInfo_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");
    private static final MethodHandle MH_init = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public NSNotification(final long handle) {
        super(handle);
    }

    /**
     * {@code +[NSNotification alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static NSNotification alloc() {
        try {
            return new NSNotification((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSNotification initWithName:object:userInfo:]} */
    public NSNotification initWithName(final String name, @Nullable final NSObject object, @Nullable final NSDictionary<NSObject, NSObject> userInfo) {
        final long nsName = ObjC.nsString(name);
        try {
            long result = (long) MH_initWithName_object_userInfo_.invokeExact(this.handle, SEL_initWithName_object_userInfo_, nsName, object == null ? 0L : object.handle(), userInfo == null ? 0L : userInfo.handle());
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsName);
        }
    }

    /** {@code -[NSNotification initWithCoder:]} */
    @Nullable
    public NSNotification initWithCoder(final NSObject coder) {
        try {
            long result = (long) MH_initWithCoder_.invokeExact(this.handle, SEL_initWithCoder_, coder.handle());
            if (result == 0L) {
                return null;
            }
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSNotification name]} */
    public String name() {
        try {
            long result = (long) MH_name.invokeExact(this.handle, SEL_name);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSNotification object]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject object() {
        try {
            long result = (long) MH_object.invokeExact(this.handle, SEL_object);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSNotification userInfo]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSDictionary<NSObject, NSObject> userInfo() {
        try {
            long result = (long) MH_userInfo.invokeExact(this.handle, SEL_userInfo);
            return result == 0L ? null : new NSDictionary<>(result, NSObject::new, NSObject::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSNotification notificationWithName:object:]} */
    public static NSNotification notification(final String aName, @Nullable final NSObject anObject) {
        final long nsAName = ObjC.nsString(aName);
        try {
            long result = (long) MH_CLASS_notificationWithName_object_.invokeExact(CLS, SEL_CLASS_notificationWithName_object_, nsAName, anObject == null ? 0L : anObject.handle());
            return new NSNotification(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsAName);
        }
    }

    /** {@code +[NSNotification notificationWithName:object:userInfo:]} */
    public static NSNotification notification(final String aName, @Nullable final NSObject anObject, @Nullable final NSDictionary<NSObject, NSObject> aUserInfo) {
        final long nsAName = ObjC.nsString(aName);
        try {
            long result = (long) MH_CLASS_notificationWithName_object_userInfo_.invokeExact(CLS, SEL_CLASS_notificationWithName_object_userInfo_, nsAName, anObject == null ? 0L : anObject.handle(), aUserInfo == null ? 0L : aUserInfo.handle());
            return new NSNotification(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsAName);
        }
    }

    /** {@code -[NSNotification init]} */
    public NSNotification init() {
        try {
            long result = (long) MH_init.invokeExact(this.handle, SEL_init);
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
