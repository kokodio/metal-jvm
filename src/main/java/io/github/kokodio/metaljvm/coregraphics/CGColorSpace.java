package io.github.kokodio.metaljvm.coregraphics;

import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_DOUBLE;
import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code CGColorSpace}
 *
 * @see <a href="https://developer.apple.com/documentation/coregraphics/cgcolorspace">Apple documentation</a>
 */
public final class CGColorSpace {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("CoreGraphics");
    private static final MethodHandle MH_CGColorSpaceCreateDeviceGray = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("CGColorSpaceCreateDeviceGray"), FunctionDescriptor.of(JAVA_LONG));
    private static final MethodHandle MH_CGColorSpaceCreateDeviceRGB = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("CGColorSpaceCreateDeviceRGB"), FunctionDescriptor.of(JAVA_LONG));
    private static final MethodHandle MH_CGColorSpaceCreateDeviceCMYK = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("CGColorSpaceCreateDeviceCMYK"), FunctionDescriptor.of(JAVA_LONG));
    private static final MethodHandle MH_CGColorSpaceCreateCalibratedGray = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("CGColorSpaceCreateCalibratedGray"), FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE));
    private static final MethodHandle MH_CGColorSpaceCreateCalibratedRGB = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("CGColorSpaceCreateCalibratedRGB"), FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final MethodHandle MH_CGColorSpaceCreateLab = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("CGColorSpaceCreateLab"), FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final MethodHandle MH_CGColorSpaceCreateWithICCData = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("CGColorSpaceCreateWithICCData"), FunctionDescriptor.of(JAVA_LONG, JAVA_LONG));
    private static final MethodHandle MH_CGColorSpaceCreateICCBased = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("CGColorSpaceCreateICCBased"), FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final MethodHandle MH_CGColorSpaceCreateIndexed = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("CGColorSpaceCreateIndexed"), FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final MethodHandle MH_CGColorSpaceCreatePattern = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("CGColorSpaceCreatePattern"), FunctionDescriptor.of(JAVA_LONG, JAVA_LONG));
    private static final MethodHandle MH_CGColorSpaceCreateWithColorSyncProfile = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("CGColorSpaceCreateWithColorSyncProfile"), FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final MethodHandle MH_CGColorSpaceCreateWithName = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("CGColorSpaceCreateWithName"), FunctionDescriptor.of(JAVA_LONG, JAVA_LONG));
    private static final MethodHandle MH_CGColorSpaceRetain = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("CGColorSpaceRetain"), FunctionDescriptor.of(JAVA_LONG, JAVA_LONG));
    private static final MethodHandle MH_CGColorSpaceRelease = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("CGColorSpaceRelease"), FunctionDescriptor.ofVoid(JAVA_LONG));
    private static final MethodHandle MH_CGColorSpaceGetName = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("CGColorSpaceGetName"), FunctionDescriptor.of(JAVA_LONG, JAVA_LONG));
    private static final MethodHandle MH_CGColorSpaceCopyName = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("CGColorSpaceCopyName"), FunctionDescriptor.of(JAVA_LONG, JAVA_LONG));
    private static final MethodHandle MH_CGColorSpaceGetTypeID = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("CGColorSpaceGetTypeID"), FunctionDescriptor.of(JAVA_LONG));
    private static final MethodHandle MH_CGColorSpaceGetNumberOfComponents = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("CGColorSpaceGetNumberOfComponents"), FunctionDescriptor.of(JAVA_LONG, JAVA_LONG));
    private static final MethodHandle MH_CGColorSpaceGetModel = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("CGColorSpaceGetModel"), FunctionDescriptor.of(JAVA_INT, JAVA_LONG));
    private static final MethodHandle MH_CGColorSpaceGetBaseColorSpace = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("CGColorSpaceGetBaseColorSpace"), FunctionDescriptor.of(JAVA_LONG, JAVA_LONG));
    private static final MethodHandle MH_CGColorSpaceCopyBaseColorSpace = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("CGColorSpaceCopyBaseColorSpace"), FunctionDescriptor.of(JAVA_LONG, JAVA_LONG));
    private static final MethodHandle MH_CGColorSpaceGetColorTableCount = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("CGColorSpaceGetColorTableCount"), FunctionDescriptor.of(JAVA_LONG, JAVA_LONG));
    private static final MethodHandle MH_CGColorSpaceGetColorTable = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("CGColorSpaceGetColorTable"), FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final MethodHandle MH_CGColorSpaceCopyICCData = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("CGColorSpaceCopyICCData"), FunctionDescriptor.of(JAVA_LONG, JAVA_LONG));
    private static final MethodHandle MH_CGColorSpaceIsWideGamutRGB = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("CGColorSpaceIsWideGamutRGB"), FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG));
    private static final MethodHandle MH_CGColorSpaceIsHDR = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("CGColorSpaceIsHDR"), FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG));
    private static final MethodHandle MH_CGColorSpaceUsesITUR_2100TF = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("CGColorSpaceUsesITUR_2100TF"), FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG));
    private static final MethodHandle MH_CGColorSpaceIsPQBased = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("CGColorSpaceIsPQBased"), FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG));
    private static final MethodHandle MH_CGColorSpaceIsHLGBased = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("CGColorSpaceIsHLGBased"), FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG));
    private static final MethodHandle MH_CGColorSpaceSupportsOutput = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("CGColorSpaceSupportsOutput"), FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG));
    private static final MethodHandle MH_CGColorSpaceCopyPropertyList = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("CGColorSpaceCopyPropertyList"), FunctionDescriptor.of(JAVA_LONG, JAVA_LONG));
    private static final MethodHandle MH_CGColorSpaceCreateWithPropertyList = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("CGColorSpaceCreateWithPropertyList"), FunctionDescriptor.of(JAVA_LONG, JAVA_LONG));
    private static final MethodHandle MH_CGColorSpaceUsesExtendedRange = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("CGColorSpaceUsesExtendedRange"), FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG));
    private static final MethodHandle MH_CGColorSpaceCreateLinearized = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("CGColorSpaceCreateLinearized"), FunctionDescriptor.of(JAVA_LONG, JAVA_LONG));
    private static final MethodHandle MH_CGColorSpaceCreateExtended = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("CGColorSpaceCreateExtended"), FunctionDescriptor.of(JAVA_LONG, JAVA_LONG));
    private static final MethodHandle MH_CGColorSpaceCreateExtendedLinearized = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("CGColorSpaceCreateExtendedLinearized"), FunctionDescriptor.of(JAVA_LONG, JAVA_LONG));
    private static final MethodHandle MH_CGColorSpaceCreateCopyWithStandardRange = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("CGColorSpaceCreateCopyWithStandardRange"), FunctionDescriptor.of(JAVA_LONG, JAVA_LONG));
    private static final MethodHandle MH_CGColorSpaceCreateWithICCProfile = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("CGColorSpaceCreateWithICCProfile"), FunctionDescriptor.of(JAVA_LONG, JAVA_LONG));
    private static final MethodHandle MH_CGColorSpaceCopyICCProfile = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("CGColorSpaceCopyICCProfile"), FunctionDescriptor.of(JAVA_LONG, JAVA_LONG));
    private static final MethodHandle MH_CGColorSpaceCreateWithPlatformColorSpace = ObjC.LINKER.downcallHandle(
            FRAMEWORK.findOrThrow("CGColorSpaceCreateWithPlatformColorSpace"), FunctionDescriptor.of(JAVA_LONG, JAVA_LONG));

    public static final long kCGColorSpaceACESCGLinear = ObjC.loadSymbol(FRAMEWORK, "kCGColorSpaceACESCGLinear");
    public static final long kCGColorSpaceAdobeRGB1998 = ObjC.loadSymbol(FRAMEWORK, "kCGColorSpaceAdobeRGB1998");
    public static final long kCGColorSpaceCoreMedia709 = ObjC.loadSymbol(FRAMEWORK, "kCGColorSpaceCoreMedia709");
    public static final long kCGColorSpaceDCIP3 = ObjC.loadSymbol(FRAMEWORK, "kCGColorSpaceDCIP3");
    public static final long kCGColorSpaceDisplayP3 = ObjC.loadSymbol(FRAMEWORK, "kCGColorSpaceDisplayP3");
    public static final long kCGColorSpaceDisplayP3_HLG = ObjC.loadSymbol(FRAMEWORK, "kCGColorSpaceDisplayP3_HLG");
    public static final long kCGColorSpaceDisplayP3_PQ = ObjC.loadSymbol(FRAMEWORK, "kCGColorSpaceDisplayP3_PQ");
    public static final long kCGColorSpaceDisplayP3_PQ_EOTF = ObjC.loadSymbol(FRAMEWORK, "kCGColorSpaceDisplayP3_PQ_EOTF");
    public static final long kCGColorSpaceExtendedDisplayP3 = ObjC.loadSymbol(FRAMEWORK, "kCGColorSpaceExtendedDisplayP3");
    public static final long kCGColorSpaceExtendedGray = ObjC.loadSymbol(FRAMEWORK, "kCGColorSpaceExtendedGray");
    public static final long kCGColorSpaceExtendedITUR_2020 = ObjC.loadSymbol(FRAMEWORK, "kCGColorSpaceExtendedITUR_2020");
    public static final long kCGColorSpaceExtendedLinearDisplayP3 = ObjC.loadSymbol(FRAMEWORK, "kCGColorSpaceExtendedLinearDisplayP3");
    public static final long kCGColorSpaceExtendedLinearGray = ObjC.loadSymbol(FRAMEWORK, "kCGColorSpaceExtendedLinearGray");
    public static final long kCGColorSpaceExtendedLinearITUR_2020 = ObjC.loadSymbol(FRAMEWORK, "kCGColorSpaceExtendedLinearITUR_2020");
    public static final long kCGColorSpaceExtendedLinearSRGB = ObjC.loadSymbol(FRAMEWORK, "kCGColorSpaceExtendedLinearSRGB");
    public static final long kCGColorSpaceExtendedRange = ObjC.loadSymbol(FRAMEWORK, "kCGColorSpaceExtendedRange");
    public static final long kCGColorSpaceExtendedSRGB = ObjC.loadSymbol(FRAMEWORK, "kCGColorSpaceExtendedSRGB");
    public static final long kCGColorSpaceGenericCMYK = ObjC.loadSymbol(FRAMEWORK, "kCGColorSpaceGenericCMYK");
    public static final long kCGColorSpaceGenericGray = ObjC.loadSymbol(FRAMEWORK, "kCGColorSpaceGenericGray");
    public static final long kCGColorSpaceGenericGrayGamma2_2 = ObjC.loadSymbol(FRAMEWORK, "kCGColorSpaceGenericGrayGamma2_2");
    public static final long kCGColorSpaceGenericLab = ObjC.loadSymbol(FRAMEWORK, "kCGColorSpaceGenericLab");
    public static final long kCGColorSpaceGenericRGB = ObjC.loadSymbol(FRAMEWORK, "kCGColorSpaceGenericRGB");
    public static final long kCGColorSpaceGenericRGBLinear = ObjC.loadSymbol(FRAMEWORK, "kCGColorSpaceGenericRGBLinear");
    public static final long kCGColorSpaceGenericXYZ = ObjC.loadSymbol(FRAMEWORK, "kCGColorSpaceGenericXYZ");
    public static final long kCGColorSpaceITUR_2020 = ObjC.loadSymbol(FRAMEWORK, "kCGColorSpaceITUR_2020");
    public static final long kCGColorSpaceITUR_2020_HLG = ObjC.loadSymbol(FRAMEWORK, "kCGColorSpaceITUR_2020_HLG");
    public static final long kCGColorSpaceITUR_2020_PQ = ObjC.loadSymbol(FRAMEWORK, "kCGColorSpaceITUR_2020_PQ");
    public static final long kCGColorSpaceITUR_2020_PQ_EOTF = ObjC.loadSymbol(FRAMEWORK, "kCGColorSpaceITUR_2020_PQ_EOTF");
    public static final long kCGColorSpaceITUR_2020_sRGBGamma = ObjC.loadSymbol(FRAMEWORK, "kCGColorSpaceITUR_2020_sRGBGamma");
    public static final long kCGColorSpaceITUR_2100_HLG = ObjC.loadSymbol(FRAMEWORK, "kCGColorSpaceITUR_2100_HLG");
    public static final long kCGColorSpaceITUR_2100_PQ = ObjC.loadSymbol(FRAMEWORK, "kCGColorSpaceITUR_2100_PQ");
    public static final long kCGColorSpaceITUR_709 = ObjC.loadSymbol(FRAMEWORK, "kCGColorSpaceITUR_709");
    public static final long kCGColorSpaceITUR_709_HLG = ObjC.loadSymbol(FRAMEWORK, "kCGColorSpaceITUR_709_HLG");
    public static final long kCGColorSpaceITUR_709_PQ = ObjC.loadSymbol(FRAMEWORK, "kCGColorSpaceITUR_709_PQ");
    public static final long kCGColorSpaceLinearDisplayP3 = ObjC.loadSymbol(FRAMEWORK, "kCGColorSpaceLinearDisplayP3");
    public static final long kCGColorSpaceLinearGray = ObjC.loadSymbol(FRAMEWORK, "kCGColorSpaceLinearGray");
    public static final long kCGColorSpaceLinearITUR_2020 = ObjC.loadSymbol(FRAMEWORK, "kCGColorSpaceLinearITUR_2020");
    public static final long kCGColorSpaceLinearSRGB = ObjC.loadSymbol(FRAMEWORK, "kCGColorSpaceLinearSRGB");
    public static final long kCGColorSpaceROMMRGB = ObjC.loadSymbol(FRAMEWORK, "kCGColorSpaceROMMRGB");
    public static final long kCGColorSpaceSRGB = ObjC.loadSymbol(FRAMEWORK, "kCGColorSpaceSRGB");

    private CGColorSpace() {
    }

    /** {@code CGColorSpaceCreateDeviceGray()} */
    public static long CGColorSpaceCreateDeviceGray() {
        try {
            return (long) MH_CGColorSpaceCreateDeviceGray.invokeExact();
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code CGColorSpaceCreateDeviceRGB()} */
    public static long CGColorSpaceCreateDeviceRGB() {
        try {
            return (long) MH_CGColorSpaceCreateDeviceRGB.invokeExact();
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code CGColorSpaceCreateDeviceCMYK()} */
    public static long CGColorSpaceCreateDeviceCMYK() {
        try {
            return (long) MH_CGColorSpaceCreateDeviceCMYK.invokeExact();
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code CGColorSpaceCreateCalibratedGray()} */
    public static long CGColorSpaceCreateCalibratedGray(final MemorySegment whitePoint, final MemorySegment blackPoint, final double gamma) {
        try {
            return (long) MH_CGColorSpaceCreateCalibratedGray.invokeExact(whitePoint.address(), blackPoint.address(), gamma);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code CGColorSpaceCreateCalibratedRGB()} */
    public static long CGColorSpaceCreateCalibratedRGB(final MemorySegment whitePoint, final MemorySegment blackPoint, final MemorySegment gamma, final MemorySegment matrix) {
        try {
            return (long) MH_CGColorSpaceCreateCalibratedRGB.invokeExact(whitePoint.address(), blackPoint.address(), gamma.address(), matrix.address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code CGColorSpaceCreateLab()} */
    public static long CGColorSpaceCreateLab(final MemorySegment whitePoint, final MemorySegment blackPoint, final MemorySegment range) {
        try {
            return (long) MH_CGColorSpaceCreateLab.invokeExact(whitePoint.address(), blackPoint.address(), range.address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code CGColorSpaceCreateWithICCData()} */
    public static long CGColorSpaceCreateWithICCData(final MemorySegment data) {
        try {
            return (long) MH_CGColorSpaceCreateWithICCData.invokeExact(data.address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code CGColorSpaceCreateICCBased()} */
    public static long CGColorSpaceCreateICCBased(final long nComponents, final MemorySegment range, final long profile, final long alternate) {
        try {
            return (long) MH_CGColorSpaceCreateICCBased.invokeExact(nComponents, range.address(), profile, alternate);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code CGColorSpaceCreateIndexed()} */
    public static long CGColorSpaceCreateIndexed(final long baseSpace, final long lastIndex, final MemorySegment colorTable) {
        try {
            return (long) MH_CGColorSpaceCreateIndexed.invokeExact(baseSpace, lastIndex, colorTable.address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code CGColorSpaceCreatePattern()} */
    public static long CGColorSpaceCreatePattern(final long baseSpace) {
        try {
            return (long) MH_CGColorSpaceCreatePattern.invokeExact(baseSpace);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code CGColorSpaceCreateWithColorSyncProfile()} */
    public static long CGColorSpaceCreateWithColorSyncProfile(final long arg0, final long options) {
        try {
            return (long) MH_CGColorSpaceCreateWithColorSyncProfile.invokeExact(arg0, options);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code CGColorSpaceCreateWithName()} */
    public static long CGColorSpaceCreateWithName(final long name) {
        try {
            return (long) MH_CGColorSpaceCreateWithName.invokeExact(name);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code CGColorSpaceRetain()} */
    public static long CGColorSpaceRetain(final long space) {
        try {
            return (long) MH_CGColorSpaceRetain.invokeExact(space);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code CGColorSpaceRelease()} */
    public static void CGColorSpaceRelease(final long space) {
        try {
            MH_CGColorSpaceRelease.invokeExact(space);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code CGColorSpaceGetName()} */
    public static long CGColorSpaceGetName(final long space) {
        try {
            return (long) MH_CGColorSpaceGetName.invokeExact(space);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code CGColorSpaceCopyName()} */
    public static long CGColorSpaceCopyName(final long space) {
        try {
            return (long) MH_CGColorSpaceCopyName.invokeExact(space);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code CGColorSpaceGetTypeID()} */
    public static long CGColorSpaceGetTypeID() {
        try {
            return (long) MH_CGColorSpaceGetTypeID.invokeExact();
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code CGColorSpaceGetNumberOfComponents()} */
    public static long CGColorSpaceGetNumberOfComponents(final long space) {
        try {
            return (long) MH_CGColorSpaceGetNumberOfComponents.invokeExact(space);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code CGColorSpaceGetModel()} */
    public static CGColorSpaceModel CGColorSpaceGetModel(final long space) {
        try {
            return CGColorSpaceModel.of((int) MH_CGColorSpaceGetModel.invokeExact(space));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code CGColorSpaceGetBaseColorSpace()} */
    public static long CGColorSpaceGetBaseColorSpace(final long space) {
        try {
            return (long) MH_CGColorSpaceGetBaseColorSpace.invokeExact(space);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code CGColorSpaceCopyBaseColorSpace()} */
    public static long CGColorSpaceCopyBaseColorSpace(final long space) {
        try {
            return (long) MH_CGColorSpaceCopyBaseColorSpace.invokeExact(space);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code CGColorSpaceGetColorTableCount()} */
    public static long CGColorSpaceGetColorTableCount(final long space) {
        try {
            return (long) MH_CGColorSpaceGetColorTableCount.invokeExact(space);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code CGColorSpaceGetColorTable()} */
    public static void CGColorSpaceGetColorTable(final long space, final MemorySegment table) {
        try {
            MH_CGColorSpaceGetColorTable.invokeExact(space, table.address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code CGColorSpaceCopyICCData()} */
    public static long CGColorSpaceCopyICCData(final long space) {
        try {
            return (long) MH_CGColorSpaceCopyICCData.invokeExact(space);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code CGColorSpaceIsWideGamutRGB()} */
    public static boolean CGColorSpaceIsWideGamutRGB(final long arg0) {
        try {
            return (boolean) MH_CGColorSpaceIsWideGamutRGB.invokeExact(arg0);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code CGColorSpaceIsHDR()} */
    public static boolean CGColorSpaceIsHDR(final long arg0) {
        try {
            return (boolean) MH_CGColorSpaceIsHDR.invokeExact(arg0);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code CGColorSpaceUsesITUR_2100TF()} */
    public static boolean CGColorSpaceUsesITUR_2100TF(final long arg0) {
        try {
            return (boolean) MH_CGColorSpaceUsesITUR_2100TF.invokeExact(arg0);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code CGColorSpaceIsPQBased()} */
    public static boolean CGColorSpaceIsPQBased(final long s) {
        try {
            return (boolean) MH_CGColorSpaceIsPQBased.invokeExact(s);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code CGColorSpaceIsHLGBased()} */
    public static boolean CGColorSpaceIsHLGBased(final long s) {
        try {
            return (boolean) MH_CGColorSpaceIsHLGBased.invokeExact(s);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code CGColorSpaceSupportsOutput()} */
    public static boolean CGColorSpaceSupportsOutput(final long space) {
        try {
            return (boolean) MH_CGColorSpaceSupportsOutput.invokeExact(space);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code CGColorSpaceCopyPropertyList()} */
    public static MemorySegment CGColorSpaceCopyPropertyList(final long space) {
        try {
            return MemorySegment.ofAddress((long) MH_CGColorSpaceCopyPropertyList.invokeExact(space));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code CGColorSpaceCreateWithPropertyList()} */
    public static long CGColorSpaceCreateWithPropertyList(final MemorySegment plist) {
        try {
            return (long) MH_CGColorSpaceCreateWithPropertyList.invokeExact(plist.address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code CGColorSpaceUsesExtendedRange()} */
    public static boolean CGColorSpaceUsesExtendedRange(final long space) {
        try {
            return (boolean) MH_CGColorSpaceUsesExtendedRange.invokeExact(space);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code CGColorSpaceCreateLinearized()} */
    public static long CGColorSpaceCreateLinearized(final long space) {
        try {
            return (long) MH_CGColorSpaceCreateLinearized.invokeExact(space);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code CGColorSpaceCreateExtended()} */
    public static long CGColorSpaceCreateExtended(final long space) {
        try {
            return (long) MH_CGColorSpaceCreateExtended.invokeExact(space);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code CGColorSpaceCreateExtendedLinearized()} */
    public static long CGColorSpaceCreateExtendedLinearized(final long space) {
        try {
            return (long) MH_CGColorSpaceCreateExtendedLinearized.invokeExact(space);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code CGColorSpaceCreateCopyWithStandardRange()} */
    public static long CGColorSpaceCreateCopyWithStandardRange(final long space) {
        try {
            return (long) MH_CGColorSpaceCreateCopyWithStandardRange.invokeExact(space);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code CGColorSpaceCreateWithICCProfile()} */
    public static long CGColorSpaceCreateWithICCProfile(final long data) {
        try {
            return (long) MH_CGColorSpaceCreateWithICCProfile.invokeExact(data);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code CGColorSpaceCopyICCProfile()} */
    public static long CGColorSpaceCopyICCProfile(final long space) {
        try {
            return (long) MH_CGColorSpaceCopyICCProfile.invokeExact(space);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code CGColorSpaceCreateWithPlatformColorSpace()} */
    public static long CGColorSpaceCreateWithPlatformColorSpace(final MemorySegment ref) {
        try {
            return (long) MH_CGColorSpaceCreateWithPlatformColorSpace.invokeExact(ref.address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
