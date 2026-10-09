package io.github.kokodio.metaljvm.foundation;

import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_DOUBLE;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code NSDate}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/nsdate">Apple documentation</a>
 */
public class NSDate extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Foundation");
    private static final long CLS = ObjC.clazz("NSDate");
    private static final long SEL_init = ObjC.selector("init");
    private static final MethodHandle MH_init = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithTimeIntervalSinceReferenceDate_ = ObjC.selector("initWithTimeIntervalSinceReferenceDate:");
    private static final MethodHandle MH_initWithTimeIntervalSinceReferenceDate_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE));
    private static final long SEL_initWithCoder_ = ObjC.selector("initWithCoder:");
    private static final MethodHandle MH_initWithCoder_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_timeIntervalSinceReferenceDate = ObjC.selector("timeIntervalSinceReferenceDate");
    private static final MethodHandle MH_timeIntervalSinceReferenceDate = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_DOUBLE, JAVA_LONG, JAVA_LONG));
    private static final long SEL_timeIntervalSinceDate_ = ObjC.selector("timeIntervalSinceDate:");
    private static final MethodHandle MH_timeIntervalSinceDate_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_DOUBLE, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_addTimeInterval_ = ObjC.selector("addTimeInterval:");
    private static final MethodHandle MH_addTimeInterval_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE));
    private static final long SEL_dateByAddingTimeInterval_ = ObjC.selector("dateByAddingTimeInterval:");
    private static final MethodHandle MH_dateByAddingTimeInterval_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE));
    private static final long SEL_earlierDate_ = ObjC.selector("earlierDate:");
    private static final MethodHandle MH_earlierDate_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_laterDate_ = ObjC.selector("laterDate:");
    private static final MethodHandle MH_laterDate_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_compare_ = ObjC.selector("compare:");
    private static final MethodHandle MH_compare_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isEqualToDate_ = ObjC.selector("isEqualToDate:");
    private static final MethodHandle MH_isEqualToDate_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_descriptionWithLocale_ = ObjC.selector("descriptionWithLocale:");
    private static final MethodHandle MH_descriptionWithLocale_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_timeIntervalSinceNow = ObjC.selector("timeIntervalSinceNow");
    private static final MethodHandle MH_timeIntervalSinceNow = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_DOUBLE, JAVA_LONG, JAVA_LONG));
    private static final long SEL_timeIntervalSince1970 = ObjC.selector("timeIntervalSince1970");
    private static final MethodHandle MH_timeIntervalSince1970 = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_DOUBLE, JAVA_LONG, JAVA_LONG));
    private static final long SEL_description = ObjC.selector("description");
    private static final MethodHandle MH_description = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_timeIntervalSinceReferenceDate = ObjC.selector("timeIntervalSinceReferenceDate");
    private static final MethodHandle MH_CLASS_timeIntervalSinceReferenceDate = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_DOUBLE, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_date = ObjC.selector("date");
    private static final MethodHandle MH_CLASS_date = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_dateWithTimeIntervalSinceNow_ = ObjC.selector("dateWithTimeIntervalSinceNow:");
    private static final MethodHandle MH_CLASS_dateWithTimeIntervalSinceNow_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE));
    private static final long SEL_CLASS_dateWithTimeIntervalSinceReferenceDate_ = ObjC.selector("dateWithTimeIntervalSinceReferenceDate:");
    private static final MethodHandle MH_CLASS_dateWithTimeIntervalSinceReferenceDate_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE));
    private static final long SEL_CLASS_dateWithTimeIntervalSince1970_ = ObjC.selector("dateWithTimeIntervalSince1970:");
    private static final MethodHandle MH_CLASS_dateWithTimeIntervalSince1970_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE));
    private static final long SEL_CLASS_dateWithTimeInterval_sinceDate_ = ObjC.selector("dateWithTimeInterval:sinceDate:");
    private static final MethodHandle MH_CLASS_dateWithTimeInterval_sinceDate_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_LONG));
    private static final long SEL_initWithTimeIntervalSinceNow_ = ObjC.selector("initWithTimeIntervalSinceNow:");
    private static final MethodHandle MH_initWithTimeIntervalSinceNow_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE));
    private static final long SEL_initWithTimeIntervalSince1970_ = ObjC.selector("initWithTimeIntervalSince1970:");
    private static final MethodHandle MH_initWithTimeIntervalSince1970_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE));
    private static final long SEL_initWithTimeInterval_sinceDate_ = ObjC.selector("initWithTimeInterval:sinceDate:");
    private static final MethodHandle MH_initWithTimeInterval_sinceDate_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_LONG));
    private static final long SEL_CLASS_distantFuture = ObjC.selector("distantFuture");
    private static final MethodHandle MH_CLASS_distantFuture = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_distantPast = ObjC.selector("distantPast");
    private static final MethodHandle MH_CLASS_distantPast = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_now = ObjC.selector("now");
    private static final MethodHandle MH_CLASS_now = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_dateWithNaturalLanguageString_locale_ = ObjC.selector("dateWithNaturalLanguageString:locale:");
    private static final MethodHandle MH_CLASS_dateWithNaturalLanguageString_locale_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_dateWithNaturalLanguageString_ = ObjC.selector("dateWithNaturalLanguageString:");
    private static final MethodHandle MH_CLASS_dateWithNaturalLanguageString_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_dateWithString_ = ObjC.selector("dateWithString:");
    private static final MethodHandle MH_CLASS_dateWithString_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_dateWithCalendarFormat_timeZone_ = ObjC.selector("dateWithCalendarFormat:timeZone:");
    private static final MethodHandle MH_dateWithCalendarFormat_timeZone_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_descriptionWithCalendarFormat_timeZone_locale_ = ObjC.selector("descriptionWithCalendarFormat:timeZone:locale:");
    private static final MethodHandle MH_descriptionWithCalendarFormat_timeZone_locale_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithString_ = ObjC.selector("initWithString:");
    private static final MethodHandle MH_initWithString_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public NSDate(final long handle) {
        super(handle);
    }

    /**
     * {@code +[NSDate alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static NSDate alloc() {
        try {
            return new NSDate((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDate init]} */
    public NSDate init() {
        try {
            long result = (long) MH_init.invokeExact(this.handle, SEL_init);
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDate initWithTimeIntervalSinceReferenceDate:]} */
    public NSDate initWithTimeIntervalSinceReferenceDate(final double ti) {
        try {
            long result = (long) MH_initWithTimeIntervalSinceReferenceDate_.invokeExact(this.handle, SEL_initWithTimeIntervalSinceReferenceDate_, ti);
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDate initWithCoder:]} */
    @Nullable
    public NSDate initWithCoder(final NSObject coder) {
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

    /** {@code -[NSDate timeIntervalSinceReferenceDate]} */
    public double timeIntervalSinceReferenceDate() {
        try {
            return (double) MH_timeIntervalSinceReferenceDate.invokeExact(this.handle, SEL_timeIntervalSinceReferenceDate);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDate timeIntervalSinceDate:]} */
    public double timeIntervalSinceDate(final NSDate anotherDate) {
        try {
            return (double) MH_timeIntervalSinceDate_.invokeExact(this.handle, SEL_timeIntervalSinceDate_, anotherDate.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSDate addTimeInterval:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSObject addTimeInterval(final double seconds) {
        try {
            long result = (long) MH_addTimeInterval_.invokeExact(this.handle, SEL_addTimeInterval_, seconds);
            return new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDate dateByAddingTimeInterval:]} */
    public NSDate dateByAddingTimeInterval(final double ti) {
        try {
            long result = (long) MH_dateByAddingTimeInterval_.invokeExact(this.handle, SEL_dateByAddingTimeInterval_, ti);
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSDate earlierDate:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSDate earlierDate(final NSDate anotherDate) {
        try {
            long result = (long) MH_earlierDate_.invokeExact(this.handle, SEL_earlierDate_, anotherDate.handle());
            return new NSDate(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSDate laterDate:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSDate laterDate(final NSDate anotherDate) {
        try {
            long result = (long) MH_laterDate_.invokeExact(this.handle, SEL_laterDate_, anotherDate.handle());
            return new NSDate(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDate compare:]} */
    public NSComparisonResult compare(final NSDate other) {
        try {
            return NSComparisonResult.of((long) MH_compare_.invokeExact(this.handle, SEL_compare_, other.handle()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDate isEqualToDate:]} */
    public boolean isEqualToDate(final NSDate otherDate) {
        try {
            return (boolean) MH_isEqualToDate_.invokeExact(this.handle, SEL_isEqualToDate_, otherDate.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDate descriptionWithLocale:]} */
    public String descriptionWithLocale(@Nullable final NSObject locale) {
        try {
            long result = (long) MH_descriptionWithLocale_.invokeExact(this.handle, SEL_descriptionWithLocale_, locale == null ? 0L : locale.handle());
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDate timeIntervalSinceNow]} */
    public double timeIntervalSinceNow() {
        try {
            return (double) MH_timeIntervalSinceNow.invokeExact(this.handle, SEL_timeIntervalSinceNow);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDate timeIntervalSince1970]} */
    public double timeIntervalSince1970() {
        try {
            return (double) MH_timeIntervalSince1970.invokeExact(this.handle, SEL_timeIntervalSince1970);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDate description]} */
    public String description() {
        try {
            long result = (long) MH_description.invokeExact(this.handle, SEL_description);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSDate timeIntervalSinceReferenceDate]} */
    public static double timeIntervalSinceReferenceDate_() {
        try {
            return (double) MH_CLASS_timeIntervalSinceReferenceDate.invokeExact(CLS, SEL_CLASS_timeIntervalSinceReferenceDate);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSDate date]} */
    public static NSDate date() {
        try {
            long result = (long) MH_CLASS_date.invokeExact(CLS, SEL_CLASS_date);
            return new NSDate(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSDate dateWithTimeIntervalSinceNow:]} */
    public static NSDate dateWithTimeIntervalSinceNow(final double secs) {
        try {
            long result = (long) MH_CLASS_dateWithTimeIntervalSinceNow_.invokeExact(CLS, SEL_CLASS_dateWithTimeIntervalSinceNow_, secs);
            return new NSDate(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSDate dateWithTimeIntervalSinceReferenceDate:]} */
    public static NSDate dateWithTimeIntervalSinceReferenceDate(final double ti) {
        try {
            long result = (long) MH_CLASS_dateWithTimeIntervalSinceReferenceDate_.invokeExact(CLS, SEL_CLASS_dateWithTimeIntervalSinceReferenceDate_, ti);
            return new NSDate(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSDate dateWithTimeIntervalSince1970:]} */
    public static NSDate dateWithTimeIntervalSince1970(final double secs) {
        try {
            long result = (long) MH_CLASS_dateWithTimeIntervalSince1970_.invokeExact(CLS, SEL_CLASS_dateWithTimeIntervalSince1970_, secs);
            return new NSDate(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSDate dateWithTimeInterval:sinceDate:]} */
    public static NSDate dateWithTimeInterval(final double secsToBeAdded, final NSDate date) {
        try {
            long result = (long) MH_CLASS_dateWithTimeInterval_sinceDate_.invokeExact(CLS, SEL_CLASS_dateWithTimeInterval_sinceDate_, secsToBeAdded, date.handle());
            return new NSDate(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDate initWithTimeIntervalSinceNow:]} */
    public NSDate initWithTimeIntervalSinceNow(final double secs) {
        try {
            long result = (long) MH_initWithTimeIntervalSinceNow_.invokeExact(this.handle, SEL_initWithTimeIntervalSinceNow_, secs);
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDate initWithTimeIntervalSince1970:]} */
    public NSDate initWithTimeIntervalSince1970(final double secs) {
        try {
            long result = (long) MH_initWithTimeIntervalSince1970_.invokeExact(this.handle, SEL_initWithTimeIntervalSince1970_, secs);
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSDate initWithTimeInterval:sinceDate:]} */
    public NSDate initWithTimeInterval(final double secsToBeAdded, final NSDate date) {
        try {
            long result = (long) MH_initWithTimeInterval_sinceDate_.invokeExact(this.handle, SEL_initWithTimeInterval_sinceDate_, secsToBeAdded, date.handle());
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSDate distantFuture]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSDate distantFuture() {
        try {
            long result = (long) MH_CLASS_distantFuture.invokeExact(CLS, SEL_CLASS_distantFuture);
            return new NSDate(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSDate distantPast]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSDate distantPast() {
        try {
            long result = (long) MH_CLASS_distantPast.invokeExact(CLS, SEL_CLASS_distantPast);
            return new NSDate(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSDate now]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSDate now() {
        try {
            long result = (long) MH_CLASS_now.invokeExact(CLS, SEL_CLASS_now);
            return new NSDate(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSDate dateWithNaturalLanguageString:locale:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public static NSObject dateWithNaturalLanguageString(final String string, @Nullable final NSObject locale) {
        final long nsString = ObjC.nsString(string);
        try {
            long result = (long) MH_CLASS_dateWithNaturalLanguageString_locale_.invokeExact(CLS, SEL_CLASS_dateWithNaturalLanguageString_locale_, nsString, locale == null ? 0L : locale.handle());
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsString);
        }
    }

    /**
     * {@code +[NSDate dateWithNaturalLanguageString:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public static NSObject dateWithNaturalLanguageString(final String string) {
        final long nsString = ObjC.nsString(string);
        try {
            long result = (long) MH_CLASS_dateWithNaturalLanguageString_.invokeExact(CLS, SEL_CLASS_dateWithNaturalLanguageString_, nsString);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsString);
        }
    }

    /**
     * {@code +[NSDate dateWithString:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSObject dateWithString(final String aString) {
        final long nsAString = ObjC.nsString(aString);
        try {
            long result = (long) MH_CLASS_dateWithString_.invokeExact(CLS, SEL_CLASS_dateWithString_, nsAString);
            return new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsAString);
        }
    }

    /**
     * {@code -[NSDate dateWithCalendarFormat:timeZone:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSObject dateWithCalendarFormat(@Nullable final String format, @Nullable final NSObject aTimeZone) {
        final long nsFormat = format == null ? 0L : ObjC.nsString(format);
        try {
            long result = (long) MH_dateWithCalendarFormat_timeZone_.invokeExact(this.handle, SEL_dateWithCalendarFormat_timeZone_, nsFormat, aTimeZone == null ? 0L : aTimeZone.handle());
            return new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsFormat);
        }
    }

    /** {@code -[NSDate descriptionWithCalendarFormat:timeZone:locale:]} */
    @Nullable
    public String descriptionWithCalendarFormat(@Nullable final String format, @Nullable final NSObject aTimeZone, @Nullable final NSObject locale) {
        final long nsFormat = format == null ? 0L : ObjC.nsString(format);
        try {
            long result = (long) MH_descriptionWithCalendarFormat_timeZone_locale_.invokeExact(this.handle, SEL_descriptionWithCalendarFormat_timeZone_locale_, nsFormat, aTimeZone == null ? 0L : aTimeZone.handle(), locale == null ? 0L : locale.handle());
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsFormat);
        }
    }

    /**
     * {@code -[NSDate initWithString:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public NSObject initWithString(final String description) {
        final long nsDescription = ObjC.nsString(description);
        try {
            long result = (long) MH_initWithString_.invokeExact(this.handle, SEL_initWithString_, nsDescription);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsDescription);
        }
    }
}
