package io.github.kokodio.metaljvm.foundation;

import io.github.kokodio.metaljvm.objc.NativeStack;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_DOUBLE;
import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code NSProcessInfo}
 *
 * @see <a href="https://developer.apple.com/documentation/foundation/processinfo">Apple documentation</a>
 */
public class NSProcessInfo extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Foundation");
    private static final long CLS = ObjC.clazz("NSProcessInfo");
    private static final long SEL_operatingSystem = ObjC.selector("operatingSystem");
    private static final MethodHandle MH_operatingSystem = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_operatingSystemName = ObjC.selector("operatingSystemName");
    private static final MethodHandle MH_operatingSystemName = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isOperatingSystemAtLeastVersion_ = ObjC.selector("isOperatingSystemAtLeastVersion:");
    private static final MethodHandle MH_isOperatingSystemAtLeastVersion_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_disableSuddenTermination = ObjC.selector("disableSuddenTermination");
    private static final MethodHandle MH_disableSuddenTermination = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_enableSuddenTermination = ObjC.selector("enableSuddenTermination");
    private static final MethodHandle MH_enableSuddenTermination = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_disableAutomaticTermination_ = ObjC.selector("disableAutomaticTermination:");
    private static final MethodHandle MH_disableAutomaticTermination_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_enableAutomaticTermination_ = ObjC.selector("enableAutomaticTermination:");
    private static final MethodHandle MH_enableAutomaticTermination_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_processInfo = ObjC.selector("processInfo");
    private static final MethodHandle MH_CLASS_processInfo = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_environment = ObjC.selector("environment");
    private static final MethodHandle MH_environment = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_arguments = ObjC.selector("arguments");
    private static final MethodHandle MH_arguments = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_hostName = ObjC.selector("hostName");
    private static final MethodHandle MH_hostName = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_processName = ObjC.selector("processName");
    private static final MethodHandle MH_processName = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setProcessName_ = ObjC.selector("setProcessName:");
    private static final MethodHandle MH_setProcessName_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_processIdentifier = ObjC.selector("processIdentifier");
    private static final MethodHandle MH_processIdentifier = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_INT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_globallyUniqueString = ObjC.selector("globallyUniqueString");
    private static final MethodHandle MH_globallyUniqueString = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_operatingSystemVersionString = ObjC.selector("operatingSystemVersionString");
    private static final MethodHandle MH_operatingSystemVersionString = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_operatingSystemVersion = ObjC.selector("operatingSystemVersion");
    private static final MethodHandle MH_operatingSystemVersion = ObjC.msgSendCritical(FunctionDescriptor.of(NSOperatingSystemVersion.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_processorCount = ObjC.selector("processorCount");
    private static final MethodHandle MH_processorCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_activeProcessorCount = ObjC.selector("activeProcessorCount");
    private static final MethodHandle MH_activeProcessorCount = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_physicalMemory = ObjC.selector("physicalMemory");
    private static final MethodHandle MH_physicalMemory = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_systemUptime = ObjC.selector("systemUptime");
    private static final MethodHandle MH_systemUptime = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_DOUBLE, JAVA_LONG, JAVA_LONG));
    private static final long SEL_automaticTerminationSupportEnabled = ObjC.selector("automaticTerminationSupportEnabled");
    private static final MethodHandle MH_automaticTerminationSupportEnabled = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setAutomaticTerminationSupportEnabled_ = ObjC.selector("setAutomaticTerminationSupportEnabled:");
    private static final MethodHandle MH_setAutomaticTerminationSupportEnabled_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_beginActivityWithOptions_reason_ = ObjC.selector("beginActivityWithOptions:reason:");
    private static final MethodHandle MH_beginActivityWithOptions_reason_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_endActivity_ = ObjC.selector("endActivity:");
    private static final MethodHandle MH_endActivity_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_performActivityWithOptions_reason_usingBlock_ = ObjC.selector("performActivityWithOptions:reason:usingBlock:");
    private static final MethodHandle MH_performActivityWithOptions_reason_usingBlock_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_performExpiringActivityWithReason_usingBlock_ = ObjC.selector("performExpiringActivityWithReason:usingBlock:");
    private static final MethodHandle MH_performExpiringActivityWithReason_usingBlock_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_userName = ObjC.selector("userName");
    private static final MethodHandle MH_userName = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_fullUserName = ObjC.selector("fullUserName");
    private static final MethodHandle MH_fullUserName = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_thermalState = ObjC.selector("thermalState");
    private static final MethodHandle MH_thermalState = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isLowPowerModeEnabled = ObjC.selector("isLowPowerModeEnabled");
    private static final MethodHandle MH_isLowPowerModeEnabled = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isMacCatalystApp = ObjC.selector("isMacCatalystApp");
    private static final MethodHandle MH_isMacCatalystApp = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isiOSAppOnMac = ObjC.selector("isiOSAppOnMac");
    private static final MethodHandle MH_isiOSAppOnMac = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isiOSAppOnVision = ObjC.selector("isiOSAppOnVision");
    private static final MethodHandle MH_isiOSAppOnVision = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isDeviceCertifiedFor_ = ObjC.selector("isDeviceCertifiedFor:");
    private static final MethodHandle MH_isDeviceCertifiedFor_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_hasPerformanceProfile_ = ObjC.selector("hasPerformanceProfile:");
    private static final MethodHandle MH_hasPerformanceProfile_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public NSProcessInfo(final long handle) {
        super(handle);
    }

    /**
     * {@code +[NSProcessInfo alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static NSProcessInfo alloc() {
        try {
            return new NSProcessInfo((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSProcessInfo init]} */
    public NSProcessInfo init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSProcessInfo operatingSystem]} */
    public long operatingSystem() {
        try {
            return (long) MH_operatingSystem.invokeExact(this.handle, SEL_operatingSystem);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSProcessInfo operatingSystemName]} */
    public String operatingSystemName() {
        try {
            long result = (long) MH_operatingSystemName.invokeExact(this.handle, SEL_operatingSystemName);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSProcessInfo isOperatingSystemAtLeastVersion:]} */
    public boolean isOperatingSystemAtLeastVersion(final NSOperatingSystemVersion version) {
        try (NativeStack stack = NativeStack.push()) {
            return (boolean) MH_isOperatingSystemAtLeastVersion_.invokeExact(this.handle, SEL_isOperatingSystemAtLeastVersion_, version.on(stack).address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSProcessInfo disableSuddenTermination]} */
    public void disableSuddenTermination() {
        try {
            MH_disableSuddenTermination.invokeExact(this.handle, SEL_disableSuddenTermination);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSProcessInfo enableSuddenTermination]} */
    public void enableSuddenTermination() {
        try {
            MH_enableSuddenTermination.invokeExact(this.handle, SEL_enableSuddenTermination);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSProcessInfo disableAutomaticTermination:]} */
    public void disableAutomaticTermination(final String reason) {
        final long nsReason = ObjC.nsString(reason);
        try {
            MH_disableAutomaticTermination_.invokeExact(this.handle, SEL_disableAutomaticTermination_, nsReason);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsReason);
        }
    }

    /** {@code -[NSProcessInfo enableAutomaticTermination:]} */
    public void enableAutomaticTermination(final String reason) {
        final long nsReason = ObjC.nsString(reason);
        try {
            MH_enableAutomaticTermination_.invokeExact(this.handle, SEL_enableAutomaticTermination_, nsReason);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsReason);
        }
    }

    /**
     * {@code +[NSProcessInfo processInfo]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public static NSProcessInfo processInfo() {
        try {
            long result = (long) MH_CLASS_processInfo.invokeExact(CLS, SEL_CLASS_processInfo);
            return new NSProcessInfo(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSProcessInfo environment]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSDictionary<NSString, NSString> environment() {
        try {
            long result = (long) MH_environment.invokeExact(this.handle, SEL_environment);
            return new NSDictionary<>(result, NSString::new, NSString::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSProcessInfo arguments]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSArray<NSString> arguments() {
        try {
            long result = (long) MH_arguments.invokeExact(this.handle, SEL_arguments);
            return new NSArray<>(result, NSString::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSProcessInfo hostName]} */
    public String hostName() {
        try {
            long result = (long) MH_hostName.invokeExact(this.handle, SEL_hostName);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSProcessInfo processName]} */
    public String processName() {
        try {
            long result = (long) MH_processName.invokeExact(this.handle, SEL_processName);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSProcessInfo setProcessName:]} */
    public void setProcessName(final String processName) {
        final long nsProcessName = ObjC.nsString(processName);
        try {
            MH_setProcessName_.invokeExact(this.handle, SEL_setProcessName_, nsProcessName);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsProcessName);
        }
    }

    /** {@code -[NSProcessInfo processIdentifier]} */
    public int processIdentifier() {
        try {
            return (int) MH_processIdentifier.invokeExact(this.handle, SEL_processIdentifier);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSProcessInfo globallyUniqueString]} */
    public String globallyUniqueString() {
        try {
            long result = (long) MH_globallyUniqueString.invokeExact(this.handle, SEL_globallyUniqueString);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSProcessInfo operatingSystemVersionString]} */
    public String operatingSystemVersionString() {
        try {
            long result = (long) MH_operatingSystemVersionString.invokeExact(this.handle, SEL_operatingSystemVersionString);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSProcessInfo operatingSystemVersion]} */
    public NSOperatingSystemVersion operatingSystemVersion() {
        try (NativeStack stack = NativeStack.push()) {
            return NSOperatingSystemVersion.read((MemorySegment) MH_operatingSystemVersion.invokeExact((SegmentAllocator) stack, this.handle, SEL_operatingSystemVersion));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSProcessInfo processorCount]} */
    public long processorCount() {
        try {
            return (long) MH_processorCount.invokeExact(this.handle, SEL_processorCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSProcessInfo activeProcessorCount]} */
    public long activeProcessorCount() {
        try {
            return (long) MH_activeProcessorCount.invokeExact(this.handle, SEL_activeProcessorCount);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSProcessInfo physicalMemory]} */
    public long physicalMemory() {
        try {
            return (long) MH_physicalMemory.invokeExact(this.handle, SEL_physicalMemory);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSProcessInfo systemUptime]} */
    public double systemUptime() {
        try {
            return (double) MH_systemUptime.invokeExact(this.handle, SEL_systemUptime);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSProcessInfo automaticTerminationSupportEnabled]} */
    public boolean automaticTerminationSupportEnabled() {
        try {
            return (boolean) MH_automaticTerminationSupportEnabled.invokeExact(this.handle, SEL_automaticTerminationSupportEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSProcessInfo setAutomaticTerminationSupportEnabled:]} */
    public void setAutomaticTerminationSupportEnabled(final boolean automaticTerminationSupportEnabled) {
        try {
            MH_setAutomaticTerminationSupportEnabled_.invokeExact(this.handle, SEL_setAutomaticTerminationSupportEnabled_, automaticTerminationSupportEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSProcessInfo beginActivityWithOptions:reason:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     *
     * @param options a combination of {@link NSActivityOptions} flags
     */
    public NSObject beginActivity(final long options, final String reason) {
        final long nsReason = ObjC.nsString(reason);
        try {
            long result = (long) MH_beginActivityWithOptions_reason_.invokeExact(this.handle, SEL_beginActivityWithOptions_reason_, options, nsReason);
            return new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsReason);
        }
    }

    /** {@code -[NSProcessInfo endActivity:]} */
    public void endActivity(final NSObject activity) {
        try {
            MH_endActivity_.invokeExact(this.handle, SEL_endActivity_, activity.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSProcessInfo performActivityWithOptions:reason:usingBlock:]}
     *
     * @param options a combination of {@link NSActivityOptions} flags
     */
    public void performActivity(final long options, final String reason, final long block) {
        final long nsReason = ObjC.nsString(reason);
        try {
            MH_performActivityWithOptions_reason_usingBlock_.invokeExact(this.handle, SEL_performActivityWithOptions_reason_usingBlock_, options, nsReason, block);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsReason);
        }
    }

    /** {@code -[NSProcessInfo performExpiringActivityWithReason:usingBlock:]} */
    public void performExpiringActivity(final String reason, final long block) {
        final long nsReason = ObjC.nsString(reason);
        try {
            MH_performExpiringActivityWithReason_usingBlock_.invokeExact(this.handle, SEL_performExpiringActivityWithReason_usingBlock_, nsReason, block);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsReason);
        }
    }

    /** {@code -[NSProcessInfo userName]} */
    @Nullable
    public String userName() {
        try {
            long result = (long) MH_userName.invokeExact(this.handle, SEL_userName);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSProcessInfo fullUserName]} */
    @Nullable
    public String fullUserName() {
        try {
            long result = (long) MH_fullUserName.invokeExact(this.handle, SEL_fullUserName);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSProcessInfo thermalState]} */
    public NSProcessInfoThermalState thermalState() {
        try {
            return NSProcessInfoThermalState.of((long) MH_thermalState.invokeExact(this.handle, SEL_thermalState));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSProcessInfo isLowPowerModeEnabled]} */
    public boolean isLowPowerModeEnabled() {
        try {
            return (boolean) MH_isLowPowerModeEnabled.invokeExact(this.handle, SEL_isLowPowerModeEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSProcessInfo isMacCatalystApp]} */
    public boolean isMacCatalystApp() {
        try {
            return (boolean) MH_isMacCatalystApp.invokeExact(this.handle, SEL_isMacCatalystApp);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSProcessInfo isiOSAppOnMac]} */
    public boolean isiOSAppOnMac() {
        try {
            return (boolean) MH_isiOSAppOnMac.invokeExact(this.handle, SEL_isiOSAppOnMac);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSProcessInfo isiOSAppOnVision]} */
    public boolean isiOSAppOnVision() {
        try {
            return (boolean) MH_isiOSAppOnVision.invokeExact(this.handle, SEL_isiOSAppOnVision);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSProcessInfo isDeviceCertifiedFor:]} */
    public boolean isDeviceCertifiedFor(final long performanceTier) {
        try {
            return (boolean) MH_isDeviceCertifiedFor_.invokeExact(this.handle, SEL_isDeviceCertifiedFor_, performanceTier);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSProcessInfo hasPerformanceProfile:]} */
    public boolean hasPerformanceProfile(final long performanceProfile) {
        try {
            return (boolean) MH_hasPerformanceProfile_.invokeExact(this.handle, SEL_hasPerformanceProfile_, performanceProfile);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
