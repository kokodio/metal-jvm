package io.github.kokodio.metaljvm.foundation;

import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code NSObject}
 *
 * @see <a href="https://developer.apple.com/documentation/objectivec/nsobject-swift.class">Apple documentation</a>
 */
public class NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Foundation");
    private static final long CLS = ObjC.clazz("NSObject");
    private static final long SEL_isEqual_ = ObjC.selector("isEqual:");
    private static final MethodHandle MH_isEqual_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_class = ObjC.selector("class");
    private static final MethodHandle MH_class = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_self = ObjC.selector("self");
    private static final MethodHandle MH_self = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_performSelector_ = ObjC.selector("performSelector:");
    private static final MethodHandle MH_performSelector_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_performSelector_withObject_ = ObjC.selector("performSelector:withObject:");
    private static final MethodHandle MH_performSelector_withObject_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_performSelector_withObject_withObject_ = ObjC.selector("performSelector:withObject:withObject:");
    private static final MethodHandle MH_performSelector_withObject_withObject_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isProxy = ObjC.selector("isProxy");
    private static final MethodHandle MH_isProxy = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isKindOfClass_ = ObjC.selector("isKindOfClass:");
    private static final MethodHandle MH_isKindOfClass_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isMemberOfClass_ = ObjC.selector("isMemberOfClass:");
    private static final MethodHandle MH_isMemberOfClass_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_conformsToProtocol_ = ObjC.selector("conformsToProtocol:");
    private static final MethodHandle MH_conformsToProtocol_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_respondsToSelector_ = ObjC.selector("respondsToSelector:");
    private static final MethodHandle MH_respondsToSelector_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_retain = ObjC.selector("retain");
    private static final MethodHandle MH_retain = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_release = ObjC.selector("release");
    private static final MethodHandle MH_release = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_autorelease = ObjC.selector("autorelease");
    private static final MethodHandle MH_autorelease = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_retainCount = ObjC.selector("retainCount");
    private static final MethodHandle MH_retainCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_hash = ObjC.selector("hash");
    private static final MethodHandle MH_hash = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_superclass = ObjC.selector("superclass");
    private static final MethodHandle MH_superclass = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_description = ObjC.selector("description");
    private static final MethodHandle MH_description = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_debugDescription = ObjC.selector("debugDescription");
    private static final MethodHandle MH_debugDescription = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_load = ObjC.selector("load");
    private static final MethodHandle MH_CLASS_load = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_initialize = ObjC.selector("initialize");
    private static final MethodHandle MH_CLASS_initialize = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");
    private static final MethodHandle MH_init = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_new = ObjC.selector("new");
    private static final MethodHandle MH_CLASS_new = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_allocWithZone_ = ObjC.selector("allocWithZone:");
    private static final MethodHandle MH_CLASS_allocWithZone_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_CLASS_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_dealloc = ObjC.selector("dealloc");
    private static final MethodHandle MH_dealloc = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_finalize = ObjC.selector("finalize");
    private static final MethodHandle MH_finalize = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_copy = ObjC.selector("copy");
    private static final MethodHandle MH_copy = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_mutableCopy = ObjC.selector("mutableCopy");
    private static final MethodHandle MH_mutableCopy = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_instancesRespondToSelector_ = ObjC.selector("instancesRespondToSelector:");
    private static final MethodHandle MH_CLASS_instancesRespondToSelector_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_conformsToProtocol_ = ObjC.selector("conformsToProtocol:");
    private static final MethodHandle MH_CLASS_conformsToProtocol_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_methodForSelector_ = ObjC.selector("methodForSelector:");
    private static final MethodHandle MH_methodForSelector_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_instanceMethodForSelector_ = ObjC.selector("instanceMethodForSelector:");
    private static final MethodHandle MH_CLASS_instanceMethodForSelector_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_doesNotRecognizeSelector_ = ObjC.selector("doesNotRecognizeSelector:");
    private static final MethodHandle MH_doesNotRecognizeSelector_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_forwardingTargetForSelector_ = ObjC.selector("forwardingTargetForSelector:");
    private static final MethodHandle MH_forwardingTargetForSelector_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_forwardInvocation_ = ObjC.selector("forwardInvocation:");
    private static final MethodHandle MH_forwardInvocation_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_methodSignatureForSelector_ = ObjC.selector("methodSignatureForSelector:");
    private static final MethodHandle MH_methodSignatureForSelector_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_instanceMethodSignatureForSelector_ = ObjC.selector("instanceMethodSignatureForSelector:");
    private static final MethodHandle MH_CLASS_instanceMethodSignatureForSelector_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_isSubclassOfClass_ = ObjC.selector("isSubclassOfClass:");
    private static final MethodHandle MH_CLASS_isSubclassOfClass_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_resolveClassMethod_ = ObjC.selector("resolveClassMethod:");
    private static final MethodHandle MH_CLASS_resolveClassMethod_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_resolveInstanceMethod_ = ObjC.selector("resolveInstanceMethod:");
    private static final MethodHandle MH_CLASS_resolveInstanceMethod_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_hash = ObjC.selector("hash");
    private static final MethodHandle MH_CLASS_hash = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_superclass = ObjC.selector("superclass");
    private static final MethodHandle MH_CLASS_superclass = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_class = ObjC.selector("class");
    private static final MethodHandle MH_CLASS_class = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_description = ObjC.selector("description");
    private static final MethodHandle MH_CLASS_description = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_debugDescription = ObjC.selector("debugDescription");
    private static final MethodHandle MH_CLASS_debugDescription = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    protected long handle;

    public NSObject(final long handle) {
        this.handle = handle;
    }

    public long handle() {
        return this.handle;
    }

    /** {@code -[NSObject isEqual:]} */
    public boolean isEqual(@Nullable final NSObject object) {
        try {
            return (boolean) MH_isEqual_.invokeExact(this.handle, SEL_isEqual_, object == null ? 0L : object.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSObject class]} */
    public long class_() {
        try {
            return (long) MH_class.invokeExact(this.handle, SEL_class);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSObject self]} */
    @Nullable
    public NSObject self() {
        try {
            long result = (long) MH_self.invokeExact(this.handle, SEL_self);
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
     * {@code -[NSObject performSelector:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject performSelector(final long aSelector) {
        try {
            long result = (long) MH_performSelector_.invokeExact(this.handle, SEL_performSelector_, aSelector);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSObject performSelector:withObject:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject performSelector(final long aSelector, @Nullable final NSObject object) {
        try {
            long result = (long) MH_performSelector_withObject_.invokeExact(this.handle, SEL_performSelector_withObject_, aSelector, object == null ? 0L : object.handle());
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSObject performSelector:withObject:withObject:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject performSelector(final long aSelector, @Nullable final NSObject object1, @Nullable final NSObject object2) {
        try {
            long result = (long) MH_performSelector_withObject_withObject_.invokeExact(this.handle, SEL_performSelector_withObject_withObject_, aSelector, object1 == null ? 0L : object1.handle(), object2 == null ? 0L : object2.handle());
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSObject isProxy]} */
    public boolean isProxy() {
        try {
            return (boolean) MH_isProxy.invokeExact(this.handle, SEL_isProxy);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSObject isKindOfClass:]} */
    public boolean isKindOfClass(final long aClass) {
        try {
            return (boolean) MH_isKindOfClass_.invokeExact(this.handle, SEL_isKindOfClass_, aClass);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSObject isMemberOfClass:]} */
    public boolean isMemberOfClass(final long aClass) {
        try {
            return (boolean) MH_isMemberOfClass_.invokeExact(this.handle, SEL_isMemberOfClass_, aClass);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSObject conformsToProtocol:]} */
    public boolean conformsToProtocol(@Nullable final NSObject aProtocol) {
        try {
            return (boolean) MH_conformsToProtocol_.invokeExact(this.handle, SEL_conformsToProtocol_, aProtocol == null ? 0L : aProtocol.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSObject respondsToSelector:]} */
    public boolean respondsToSelector(final long aSelector) {
        try {
            return (boolean) MH_respondsToSelector_.invokeExact(this.handle, SEL_respondsToSelector_, aSelector);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSObject retain]} */
    @Nullable
    public NSObject retain() {
        try {
            long result = (long) MH_retain.invokeExact(this.handle, SEL_retain);
            if (result == 0L) {
                return null;
            }
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSObject release]} */
    public void release() {
        try {
            MH_release.invokeExact(this.handle, SEL_release);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSObject autorelease]} */
    @Nullable
    public NSObject autorelease() {
        try {
            long result = (long) MH_autorelease.invokeExact(this.handle, SEL_autorelease);
            if (result == 0L) {
                return null;
            }
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSObject retainCount]} */
    public long retainCount() {
        try {
            return (long) MH_retainCount.invokeExact(this.handle, SEL_retainCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSObject hash]} */
    public long hash() {
        try {
            return (long) MH_hash.invokeExact(this.handle, SEL_hash);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSObject superclass]} */
    public long superclass() {
        try {
            return (long) MH_superclass.invokeExact(this.handle, SEL_superclass);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSObject description]} */
    @Nullable
    public String description() {
        try {
            long result = (long) MH_description.invokeExact(this.handle, SEL_description);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSObject debugDescription]} */
    @Nullable
    public String debugDescription() {
        try {
            long result = (long) MH_debugDescription.invokeExact(this.handle, SEL_debugDescription);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSObject load]} */
    public static void load() {
        try {
            MH_CLASS_load.invokeExact(CLS, SEL_CLASS_load);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSObject initialize]} */
    public static void initialize() {
        try {
            MH_CLASS_initialize.invokeExact(CLS, SEL_CLASS_initialize);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSObject init]} */
    @Nullable
    public NSObject init() {
        try {
            long result = (long) MH_init.invokeExact(this.handle, SEL_init);
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
     * {@code +[NSObject new]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public static NSObject new_() {
        try {
            long result = (long) MH_CLASS_new.invokeExact(CLS, SEL_CLASS_new);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSObject allocWithZone:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public static NSObject allocWithZone(final long zone) {
        try {
            long result = (long) MH_CLASS_allocWithZone_.invokeExact(CLS, SEL_CLASS_allocWithZone_, zone);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSObject alloc]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public static NSObject alloc() {
        try {
            long result = (long) MH_CLASS_alloc.invokeExact(CLS, SEL_CLASS_alloc);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSObject dealloc]} */
    public void dealloc() {
        try {
            MH_dealloc.invokeExact(this.handle, SEL_dealloc);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSObject finalize]} */
    public void finalize_() {
        try {
            MH_finalize.invokeExact(this.handle, SEL_finalize);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSObject copy]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public NSObject copy() {
        try {
            long result = (long) MH_copy.invokeExact(this.handle, SEL_copy);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSObject mutableCopy]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public NSObject mutableCopy() {
        try {
            long result = (long) MH_mutableCopy.invokeExact(this.handle, SEL_mutableCopy);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSObject instancesRespondToSelector:]} */
    public static boolean instancesRespondToSelector(final long aSelector) {
        try {
            return (boolean) MH_CLASS_instancesRespondToSelector_.invokeExact(CLS, SEL_CLASS_instancesRespondToSelector_, aSelector);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSObject conformsToProtocol:]} */
    public static boolean conformsToProtocol_(@Nullable final NSObject protocol) {
        try {
            return (boolean) MH_CLASS_conformsToProtocol_.invokeExact(CLS, SEL_CLASS_conformsToProtocol_, protocol == null ? 0L : protocol.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSObject methodForSelector:]} */
    public MemorySegment methodForSelector(final long aSelector) {
        try {
            return MemorySegment.ofAddress((long) MH_methodForSelector_.invokeExact(this.handle, SEL_methodForSelector_, aSelector));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSObject instanceMethodForSelector:]} */
    public static MemorySegment instanceMethodForSelector(final long aSelector) {
        try {
            return MemorySegment.ofAddress((long) MH_CLASS_instanceMethodForSelector_.invokeExact(CLS, SEL_CLASS_instanceMethodForSelector_, aSelector));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSObject doesNotRecognizeSelector:]} */
    public void doesNotRecognizeSelector(final long aSelector) {
        try {
            MH_doesNotRecognizeSelector_.invokeExact(this.handle, SEL_doesNotRecognizeSelector_, aSelector);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSObject forwardingTargetForSelector:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject forwardingTargetForSelector(final long aSelector) {
        try {
            long result = (long) MH_forwardingTargetForSelector_.invokeExact(this.handle, SEL_forwardingTargetForSelector_, aSelector);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSObject forwardInvocation:]} */
    public void forwardInvocation(@Nullable final NSObject anInvocation) {
        try {
            MH_forwardInvocation_.invokeExact(this.handle, SEL_forwardInvocation_, anInvocation == null ? 0L : anInvocation.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSObject methodSignatureForSelector:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject methodSignatureForSelector(final long aSelector) {
        try {
            long result = (long) MH_methodSignatureForSelector_.invokeExact(this.handle, SEL_methodSignatureForSelector_, aSelector);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSObject instanceMethodSignatureForSelector:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public static NSObject instanceMethodSignatureForSelector(final long aSelector) {
        try {
            long result = (long) MH_CLASS_instanceMethodSignatureForSelector_.invokeExact(CLS, SEL_CLASS_instanceMethodSignatureForSelector_, aSelector);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSObject isSubclassOfClass:]} */
    public static boolean isSubclassOfClass(final long aClass) {
        try {
            return (boolean) MH_CLASS_isSubclassOfClass_.invokeExact(CLS, SEL_CLASS_isSubclassOfClass_, aClass);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSObject resolveClassMethod:]} */
    public static boolean resolveClassMethod(final long sel) {
        try {
            return (boolean) MH_CLASS_resolveClassMethod_.invokeExact(CLS, SEL_CLASS_resolveClassMethod_, sel);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSObject resolveInstanceMethod:]} */
    public static boolean resolveInstanceMethod(final long sel) {
        try {
            return (boolean) MH_CLASS_resolveInstanceMethod_.invokeExact(CLS, SEL_CLASS_resolveInstanceMethod_, sel);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSObject hash]} */
    public static long hash_() {
        try {
            return (long) MH_CLASS_hash.invokeExact(CLS, SEL_CLASS_hash);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSObject superclass]} */
    public static long superclass_() {
        try {
            return (long) MH_CLASS_superclass.invokeExact(CLS, SEL_CLASS_superclass);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSObject class]} */
    public static long class__() {
        try {
            return (long) MH_CLASS_class.invokeExact(CLS, SEL_CLASS_class);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSObject description]} */
    @Nullable
    public static String description_() {
        try {
            long result = (long) MH_CLASS_description.invokeExact(CLS, SEL_CLASS_description);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSObject debugDescription]} */
    @Nullable
    public static String debugDescription_() {
        try {
            long result = (long) MH_CLASS_debugDescription.invokeExact(CLS, SEL_CLASS_debugDescription);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
