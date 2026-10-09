package io.github.kokodio.metaljvm.foundation;

import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;
import java.util.function.LongFunction;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code NSEnumerator}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/nsenumerator">Apple documentation</a>
 */
public class NSEnumerator<ObjectType extends NSObject> extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Foundation");
    private static final long CLS = ObjC.clazz("NSEnumerator");
    private static final long SEL_nextObject = ObjC.selector("nextObject");
    private static final MethodHandle MH_nextObject = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_allObjects = ObjC.selector("allObjects");
    private static final MethodHandle MH_allObjects = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    protected final LongFunction<ObjectType> objectType;

    public NSEnumerator(final long handle, final LongFunction<ObjectType> objectType) {
        super(handle);
        this.objectType = objectType;
    }

    /**
     * {@code +[NSEnumerator alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static <ObjectType extends NSObject> NSEnumerator<ObjectType> alloc(final LongFunction<ObjectType> objectType) {
        try {
            return new NSEnumerator<>((long) MH_alloc.invokeExact(CLS, SEL_alloc), objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSEnumerator init]} */
    public NSEnumerator<ObjectType> init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSEnumerator nextObject]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public ObjectType nextObject() {
        try {
            long result = (long) MH_nextObject.invokeExact(this.handle, SEL_nextObject);
            return result == 0L ? null : this.objectType.apply(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSEnumerator allObjects]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<ObjectType> allObjects() {
        try {
            long result = (long) MH_allObjects.invokeExact(this.handle, SEL_allObjects);
            return new NSArray<>(result, this.objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
