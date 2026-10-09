package io.github.kokodio.metaljvm.foundation;

import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code NSNotificationCenter}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/notificationcenter">Apple documentation</a>
 */
public class NSNotificationCenter extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Foundation");
    private static final long CLS = ObjC.clazz("NSNotificationCenter");
    private static final long SEL_addObserver_selector_name_object_ = ObjC.selector("addObserver:selector:name:object:");
    private static final MethodHandle MH_addObserver_selector_name_object_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_postNotification_ = ObjC.selector("postNotification:");
    private static final MethodHandle MH_postNotification_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_postNotificationName_object_ = ObjC.selector("postNotificationName:object:");
    private static final MethodHandle MH_postNotificationName_object_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_postNotificationName_object_userInfo_ = ObjC.selector("postNotificationName:object:userInfo:");
    private static final MethodHandle MH_postNotificationName_object_userInfo_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_removeObserver_ = ObjC.selector("removeObserver:");
    private static final MethodHandle MH_removeObserver_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_removeObserver_name_object_ = ObjC.selector("removeObserver:name:object:");
    private static final MethodHandle MH_removeObserver_name_object_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_addObserverForName_object_queue_usingBlock_ = ObjC.selector("addObserverForName:object:queue:usingBlock:");
    private static final MethodHandle MH_addObserverForName_object_queue_usingBlock_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_defaultCenter = ObjC.selector("defaultCenter");
    private static final MethodHandle MH_CLASS_defaultCenter = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public NSNotificationCenter(final long handle) {
        super(handle);
    }

    /**
     * {@code +[NSNotificationCenter alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static NSNotificationCenter alloc() {
        try {
            return new NSNotificationCenter((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSNotificationCenter init]} */
    public NSNotificationCenter init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSNotificationCenter addObserver:selector:name:object:]} */
    public void addObserver(final NSObject observer, final long aSelector, @Nullable final String aName, @Nullable final NSObject anObject) {
        final long nsAName = aName == null ? 0L : ObjC.nsString(aName);
        try {
            MH_addObserver_selector_name_object_.invokeExact(this.handle, SEL_addObserver_selector_name_object_, observer.handle(), aSelector, nsAName, anObject == null ? 0L : anObject.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsAName);
        }
    }

    /** {@code -[NSNotificationCenter postNotification:]} */
    public void postNotification(final NSNotification notification) {
        try {
            MH_postNotification_.invokeExact(this.handle, SEL_postNotification_, notification.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSNotificationCenter postNotificationName:object:]} */
    public void postNotificationName(final String aName, @Nullable final NSObject anObject) {
        final long nsAName = ObjC.nsString(aName);
        try {
            MH_postNotificationName_object_.invokeExact(this.handle, SEL_postNotificationName_object_, nsAName, anObject == null ? 0L : anObject.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsAName);
        }
    }

    /** {@code -[NSNotificationCenter postNotificationName:object:userInfo:]} */
    public void postNotificationName(final String aName, @Nullable final NSObject anObject, @Nullable final NSDictionary<NSObject, NSObject> aUserInfo) {
        final long nsAName = ObjC.nsString(aName);
        try {
            MH_postNotificationName_object_userInfo_.invokeExact(this.handle, SEL_postNotificationName_object_userInfo_, nsAName, anObject == null ? 0L : anObject.handle(), aUserInfo == null ? 0L : aUserInfo.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsAName);
        }
    }

    /** {@code -[NSNotificationCenter removeObserver:]} */
    public void removeObserver(final NSObject observer) {
        try {
            MH_removeObserver_.invokeExact(this.handle, SEL_removeObserver_, observer.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSNotificationCenter removeObserver:name:object:]} */
    public void removeObserver(final NSObject observer, @Nullable final String aName, @Nullable final NSObject anObject) {
        final long nsAName = aName == null ? 0L : ObjC.nsString(aName);
        try {
            MH_removeObserver_name_object_.invokeExact(this.handle, SEL_removeObserver_name_object_, observer.handle(), nsAName, anObject == null ? 0L : anObject.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsAName);
        }
    }

    /**
     * {@code -[NSNotificationCenter addObserverForName:object:queue:usingBlock:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSObject addObserverForName(@Nullable final String name, @Nullable final NSObject obj, @Nullable final NSObject queue, final long block) {
        final long nsName = name == null ? 0L : ObjC.nsString(name);
        try {
            long result = (long) MH_addObserverForName_object_queue_usingBlock_.invokeExact(this.handle, SEL_addObserverForName_object_queue_usingBlock_, nsName, obj == null ? 0L : obj.handle(), queue == null ? 0L : queue.handle(), block);
            return new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsName);
        }
    }

    /**
     * {@code +[NSNotificationCenter defaultCenter]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSNotificationCenter defaultCenter() {
        try {
            long result = (long) MH_CLASS_defaultCenter.invokeExact(CLS, SEL_CLASS_defaultCenter);
            return new NSNotificationCenter(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
