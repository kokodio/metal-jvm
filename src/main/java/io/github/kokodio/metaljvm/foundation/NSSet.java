package io.github.kokodio.metaljvm.foundation;

import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;
import java.util.function.LongFunction;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code NSSet}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/nsset">Apple documentation</a>
 */
public class NSSet<ObjectType extends NSObject> extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Foundation");
    private static final long CLS = ObjC.clazz("NSSet");
    private static final long SEL_member_ = ObjC.selector("member:");
    private static final MethodHandle MH_member_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_objectEnumerator = ObjC.selector("objectEnumerator");
    private static final MethodHandle MH_objectEnumerator = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");
    private static final MethodHandle MH_init = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithObjects_count_ = ObjC.selector("initWithObjects:count:");
    private static final MethodHandle MH_initWithObjects_count_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithCoder_ = ObjC.selector("initWithCoder:");
    private static final MethodHandle MH_initWithCoder_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_count = ObjC.selector("count");
    private static final MethodHandle MH_count = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_anyObject = ObjC.selector("anyObject");
    private static final MethodHandle MH_anyObject = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_containsObject_ = ObjC.selector("containsObject:");
    private static final MethodHandle MH_containsObject_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_descriptionWithLocale_ = ObjC.selector("descriptionWithLocale:");
    private static final MethodHandle MH_descriptionWithLocale_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_intersectsSet_ = ObjC.selector("intersectsSet:");
    private static final MethodHandle MH_intersectsSet_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isEqualToSet_ = ObjC.selector("isEqualToSet:");
    private static final MethodHandle MH_isEqualToSet_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isSubsetOfSet_ = ObjC.selector("isSubsetOfSet:");
    private static final MethodHandle MH_isSubsetOfSet_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_makeObjectsPerformSelector_ = ObjC.selector("makeObjectsPerformSelector:");
    private static final MethodHandle MH_makeObjectsPerformSelector_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_makeObjectsPerformSelector_withObject_ = ObjC.selector("makeObjectsPerformSelector:withObject:");
    private static final MethodHandle MH_makeObjectsPerformSelector_withObject_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setByAddingObject_ = ObjC.selector("setByAddingObject:");
    private static final MethodHandle MH_setByAddingObject_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setByAddingObjectsFromSet_ = ObjC.selector("setByAddingObjectsFromSet:");
    private static final MethodHandle MH_setByAddingObjectsFromSet_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setByAddingObjectsFromArray_ = ObjC.selector("setByAddingObjectsFromArray:");
    private static final MethodHandle MH_setByAddingObjectsFromArray_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_enumerateObjectsUsingBlock_ = ObjC.selector("enumerateObjectsUsingBlock:");
    private static final MethodHandle MH_enumerateObjectsUsingBlock_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_enumerateObjectsWithOptions_usingBlock_ = ObjC.selector("enumerateObjectsWithOptions:usingBlock:");
    private static final MethodHandle MH_enumerateObjectsWithOptions_usingBlock_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_objectsPassingTest_ = ObjC.selector("objectsPassingTest:");
    private static final MethodHandle MH_objectsPassingTest_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_objectsWithOptions_passingTest_ = ObjC.selector("objectsWithOptions:passingTest:");
    private static final MethodHandle MH_objectsWithOptions_passingTest_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_allObjects = ObjC.selector("allObjects");
    private static final MethodHandle MH_allObjects = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_description = ObjC.selector("description");
    private static final MethodHandle MH_description = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_set = ObjC.selector("set");
    private static final MethodHandle MH_CLASS_set = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_setWithObject_ = ObjC.selector("setWithObject:");
    private static final MethodHandle MH_CLASS_setWithObject_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_setWithObjects_count_ = ObjC.selector("setWithObjects:count:");
    private static final MethodHandle MH_CLASS_setWithObjects_count_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_setWithSet_ = ObjC.selector("setWithSet:");
    private static final MethodHandle MH_CLASS_setWithSet_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_setWithArray_ = ObjC.selector("setWithArray:");
    private static final MethodHandle MH_CLASS_setWithArray_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithSet_ = ObjC.selector("initWithSet:");
    private static final MethodHandle MH_initWithSet_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithSet_copyItems_ = ObjC.selector("initWithSet:copyItems:");
    private static final MethodHandle MH_initWithSet_copyItems_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_initWithArray_ = ObjC.selector("initWithArray:");
    private static final MethodHandle MH_initWithArray_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_valueForKey_ = ObjC.selector("valueForKey:");
    private static final MethodHandle MH_valueForKey_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setValue_forKey_ = ObjC.selector("setValue:forKey:");
    private static final MethodHandle MH_setValue_forKey_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_addObserver_forKeyPath_options_context_ = ObjC.selector("addObserver:forKeyPath:options:context:");
    private static final MethodHandle MH_addObserver_forKeyPath_options_context_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_removeObserver_forKeyPath_context_ = ObjC.selector("removeObserver:forKeyPath:context:");
    private static final MethodHandle MH_removeObserver_forKeyPath_context_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_removeObserver_forKeyPath_ = ObjC.selector("removeObserver:forKeyPath:");
    private static final MethodHandle MH_removeObserver_forKeyPath_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sortedArrayUsingDescriptors_ = ObjC.selector("sortedArrayUsingDescriptors:");
    private static final MethodHandle MH_sortedArrayUsingDescriptors_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_filteredSetUsingPredicate_ = ObjC.selector("filteredSetUsingPredicate:");
    private static final MethodHandle MH_filteredSetUsingPredicate_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    protected final LongFunction<ObjectType> objectType;

    public NSSet(final long handle, final LongFunction<ObjectType> objectType) {
        super(handle);
        this.objectType = objectType;
    }

    /**
     * {@code +[NSSet alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static <ObjectType extends NSObject> NSSet<ObjectType> alloc(final LongFunction<ObjectType> objectType) {
        try {
            return new NSSet<>((long) MH_alloc.invokeExact(CLS, SEL_alloc), objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSSet member:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public ObjectType member(final ObjectType object) {
        try {
            long result = (long) MH_member_.invokeExact(this.handle, SEL_member_, object.handle());
            return result == 0L ? null : this.objectType.apply(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSSet objectEnumerator]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSEnumerator<ObjectType> objectEnumerator() {
        try {
            long result = (long) MH_objectEnumerator.invokeExact(this.handle, SEL_objectEnumerator);
            return new NSEnumerator<>(result, this.objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSSet init]} */
    public NSSet<ObjectType> init() {
        try {
            long result = (long) MH_init.invokeExact(this.handle, SEL_init);
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSSet initWithObjects:count:]} */
    public NSSet<ObjectType> initWithObjects(final MemorySegment objects, final long cnt) {
        try {
            long result = (long) MH_initWithObjects_count_.invokeExact(this.handle, SEL_initWithObjects_count_, objects.address(), cnt);
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSSet initWithCoder:]} */
    @Nullable
    public NSSet<ObjectType> initWithCoder(final NSObject coder) {
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

    /** {@code -[NSSet count]} */
    public long count() {
        try {
            return (long) MH_count.invokeExact(this.handle, SEL_count);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSSet anyObject]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public ObjectType anyObject() {
        try {
            long result = (long) MH_anyObject.invokeExact(this.handle, SEL_anyObject);
            return result == 0L ? null : this.objectType.apply(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSSet containsObject:]} */
    public boolean containsObject(final ObjectType anObject) {
        try {
            return (boolean) MH_containsObject_.invokeExact(this.handle, SEL_containsObject_, anObject.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSSet descriptionWithLocale:]} */
    public String descriptionWithLocale(@Nullable final NSObject locale) {
        try {
            long result = (long) MH_descriptionWithLocale_.invokeExact(this.handle, SEL_descriptionWithLocale_, locale == null ? 0L : locale.handle());
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSSet intersectsSet:]} */
    public boolean intersectsSet(final NSSet<ObjectType> otherSet) {
        try {
            return (boolean) MH_intersectsSet_.invokeExact(this.handle, SEL_intersectsSet_, otherSet.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSSet isEqualToSet:]} */
    public boolean isEqualToSet(final NSSet<ObjectType> otherSet) {
        try {
            return (boolean) MH_isEqualToSet_.invokeExact(this.handle, SEL_isEqualToSet_, otherSet.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSSet isSubsetOfSet:]} */
    public boolean isSubsetOfSet(final NSSet<ObjectType> otherSet) {
        try {
            return (boolean) MH_isSubsetOfSet_.invokeExact(this.handle, SEL_isSubsetOfSet_, otherSet.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSSet makeObjectsPerformSelector:]} */
    public void makeObjectsPerformSelector(final long aSelector) {
        try {
            MH_makeObjectsPerformSelector_.invokeExact(this.handle, SEL_makeObjectsPerformSelector_, aSelector);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSSet makeObjectsPerformSelector:withObject:]} */
    public void makeObjectsPerformSelector(final long aSelector, @Nullable final NSObject argument) {
        try {
            MH_makeObjectsPerformSelector_withObject_.invokeExact(this.handle, SEL_makeObjectsPerformSelector_withObject_, aSelector, argument == null ? 0L : argument.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSSet setByAddingObject:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSSet<ObjectType> setByAddingObject(final ObjectType anObject) {
        try {
            long result = (long) MH_setByAddingObject_.invokeExact(this.handle, SEL_setByAddingObject_, anObject.handle());
            return new NSSet<>(result, this.objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSSet setByAddingObjectsFromSet:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSSet<ObjectType> setByAddingObjectsFromSet(final NSSet<ObjectType> other) {
        try {
            long result = (long) MH_setByAddingObjectsFromSet_.invokeExact(this.handle, SEL_setByAddingObjectsFromSet_, other.handle());
            return new NSSet<>(result, this.objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSSet setByAddingObjectsFromArray:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSSet<ObjectType> setByAddingObjectsFromArray(final NSArray<ObjectType> other) {
        try {
            long result = (long) MH_setByAddingObjectsFromArray_.invokeExact(this.handle, SEL_setByAddingObjectsFromArray_, other.handle());
            return new NSSet<>(result, this.objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSSet enumerateObjectsUsingBlock:]} */
    public void enumerateObjectsUsingBlock(final long block) {
        try {
            MH_enumerateObjectsUsingBlock_.invokeExact(this.handle, SEL_enumerateObjectsUsingBlock_, block);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSSet enumerateObjectsWithOptions:usingBlock:]}
     *
     * @param opts a combination of {@link NSEnumerationOptions} flags
     */
    public void enumerateObjectsWithOptions(final long opts, final long block) {
        try {
            MH_enumerateObjectsWithOptions_usingBlock_.invokeExact(this.handle, SEL_enumerateObjectsWithOptions_usingBlock_, opts, block);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSSet objectsPassingTest:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSSet<ObjectType> objectsPassingTest(final long predicate) {
        try {
            long result = (long) MH_objectsPassingTest_.invokeExact(this.handle, SEL_objectsPassingTest_, predicate);
            return new NSSet<>(result, this.objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSSet objectsWithOptions:passingTest:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     *
     * @param opts a combination of {@link NSEnumerationOptions} flags
     */
    public NSSet<ObjectType> objectsWithOptions(final long opts, final long predicate) {
        try {
            long result = (long) MH_objectsWithOptions_passingTest_.invokeExact(this.handle, SEL_objectsWithOptions_passingTest_, opts, predicate);
            return new NSSet<>(result, this.objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSSet allObjects]}
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

    /** {@code -[NSSet description]} */
    public String description() {
        try {
            long result = (long) MH_description.invokeExact(this.handle, SEL_description);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSSet set]} */
    public static <ObjectType extends NSObject> NSSet<ObjectType> set(final LongFunction<ObjectType> objectType) {
        try {
            long result = (long) MH_CLASS_set.invokeExact(CLS, SEL_CLASS_set);
            return new NSSet<>(result, objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSSet setWithObject:]} */
    public static <ObjectType extends NSObject> NSSet<ObjectType> setWithObject(final LongFunction<ObjectType> objectType, final ObjectType object) {
        try {
            long result = (long) MH_CLASS_setWithObject_.invokeExact(CLS, SEL_CLASS_setWithObject_, object.handle());
            return new NSSet<>(result, objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSSet setWithObjects:count:]} */
    public static <ObjectType extends NSObject> NSSet<ObjectType> setWithObjects(final LongFunction<ObjectType> objectType, final MemorySegment objects, final long cnt) {
        try {
            long result = (long) MH_CLASS_setWithObjects_count_.invokeExact(CLS, SEL_CLASS_setWithObjects_count_, objects.address(), cnt);
            return new NSSet<>(result, objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSSet setWithSet:]} */
    public static <ObjectType extends NSObject> NSSet<ObjectType> setWithSet(final LongFunction<ObjectType> objectType, final NSSet<ObjectType> set) {
        try {
            long result = (long) MH_CLASS_setWithSet_.invokeExact(CLS, SEL_CLASS_setWithSet_, set.handle());
            return new NSSet<>(result, objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSSet setWithArray:]} */
    public static <ObjectType extends NSObject> NSSet<ObjectType> setWithArray(final LongFunction<ObjectType> objectType, final NSArray<ObjectType> array) {
        try {
            long result = (long) MH_CLASS_setWithArray_.invokeExact(CLS, SEL_CLASS_setWithArray_, array.handle());
            return new NSSet<>(result, objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSSet initWithSet:]} */
    public NSSet<ObjectType> initWithSet(final NSSet<ObjectType> set) {
        try {
            long result = (long) MH_initWithSet_.invokeExact(this.handle, SEL_initWithSet_, set.handle());
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSSet initWithSet:copyItems:]} */
    public NSSet<ObjectType> initWithSet(final NSSet<ObjectType> set, final boolean flag) {
        try {
            long result = (long) MH_initWithSet_copyItems_.invokeExact(this.handle, SEL_initWithSet_copyItems_, set.handle(), flag);
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSSet initWithArray:]} */
    public NSSet<ObjectType> initWithArray(final NSArray<ObjectType> array) {
        try {
            long result = (long) MH_initWithArray_.invokeExact(this.handle, SEL_initWithArray_, array.handle());
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSSet valueForKey:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSObject valueForKey(final String key) {
        final long nsKey = ObjC.nsString(key);
        try {
            long result = (long) MH_valueForKey_.invokeExact(this.handle, SEL_valueForKey_, nsKey);
            return new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsKey);
        }
    }

    /** {@code -[NSSet setValue:forKey:]} */
    public void setValue(@Nullable final NSObject value, final String key) {
        final long nsKey = ObjC.nsString(key);
        try {
            MH_setValue_forKey_.invokeExact(this.handle, SEL_setValue_forKey_, value == null ? 0L : value.handle(), nsKey);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsKey);
        }
    }

    /**
     * {@code -[NSSet addObserver:forKeyPath:options:context:]}
     *
     * @param options a combination of {@link NSKeyValueObservingOptions} flags
     */
    public void addObserver(final NSObject observer, final String keyPath, final long options, final MemorySegment context) {
        final long nsKeyPath = ObjC.nsString(keyPath);
        try {
            MH_addObserver_forKeyPath_options_context_.invokeExact(this.handle, SEL_addObserver_forKeyPath_options_context_, observer.handle(), nsKeyPath, options, context.address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsKeyPath);
        }
    }

    /** {@code -[NSSet removeObserver:forKeyPath:context:]} */
    public void removeObserver(final NSObject observer, final String keyPath, final MemorySegment context) {
        final long nsKeyPath = ObjC.nsString(keyPath);
        try {
            MH_removeObserver_forKeyPath_context_.invokeExact(this.handle, SEL_removeObserver_forKeyPath_context_, observer.handle(), nsKeyPath, context.address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsKeyPath);
        }
    }

    /** {@code -[NSSet removeObserver:forKeyPath:]} */
    public void removeObserver(final NSObject observer, final String keyPath) {
        final long nsKeyPath = ObjC.nsString(keyPath);
        try {
            MH_removeObserver_forKeyPath_.invokeExact(this.handle, SEL_removeObserver_forKeyPath_, observer.handle(), nsKeyPath);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsKeyPath);
        }
    }

    /**
     * {@code -[NSSet sortedArrayUsingDescriptors:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<ObjectType> sortedArrayUsingDescriptors(final NSArray<NSObject> sortDescriptors) {
        try {
            long result = (long) MH_sortedArrayUsingDescriptors_.invokeExact(this.handle, SEL_sortedArrayUsingDescriptors_, sortDescriptors.handle());
            return new NSArray<>(result, this.objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSSet filteredSetUsingPredicate:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSSet<ObjectType> filteredSetUsingPredicate(final NSObject predicate) {
        try {
            long result = (long) MH_filteredSetUsingPredicate_.invokeExact(this.handle, SEL_filteredSetUsingPredicate_, predicate.handle());
            return new NSSet<>(result, this.objectType);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
