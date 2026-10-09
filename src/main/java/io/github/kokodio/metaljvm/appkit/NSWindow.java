package io.github.kokodio.metaljvm.appkit;

import io.github.kokodio.metaljvm.foundation.NSArray;
import io.github.kokodio.metaljvm.foundation.NSData;
import io.github.kokodio.metaljvm.foundation.NSDate;
import io.github.kokodio.metaljvm.foundation.NSDictionary;
import io.github.kokodio.metaljvm.foundation.NSNumber;
import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.foundation.NSPoint;
import io.github.kokodio.metaljvm.foundation.NSRect;
import io.github.kokodio.metaljvm.foundation.NSSize;
import io.github.kokodio.metaljvm.foundation.NSURL;
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
 * {@code NSWindow}
 *
 * @see <a href="https://developer.apple.com/documentation/appkit/nswindow">Apple documentation</a>
 */
public class NSWindow extends NSResponder {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("AppKit");
    private static final long CLS = ObjC.clazz("NSWindow");
    private static final long SEL_CLASS_frameRectForContentRect_styleMask_ = ObjC.selector("frameRectForContentRect:styleMask:");
    private static final MethodHandle MH_CLASS_frameRectForContentRect_styleMask_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSRect.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_LONG));
    private static final long SEL_CLASS_contentRectForFrameRect_styleMask_ = ObjC.selector("contentRectForFrameRect:styleMask:");
    private static final MethodHandle MH_CLASS_contentRectForFrameRect_styleMask_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSRect.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_LONG));
    private static final long SEL_CLASS_minFrameWidthWithTitle_styleMask_ = ObjC.selector("minFrameWidthWithTitle:styleMask:");
    private static final MethodHandle MH_CLASS_minFrameWidthWithTitle_styleMask_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_DOUBLE, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_frameRectForContentRect_ = ObjC.selector("frameRectForContentRect:");
    private static final MethodHandle MH_frameRectForContentRect_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSRect.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_contentRectForFrameRect_ = ObjC.selector("contentRectForFrameRect:");
    private static final MethodHandle MH_contentRectForFrameRect_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSRect.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_initWithContentRect_styleMask_backing_defer_ = ObjC.selector("initWithContentRect:styleMask:backing:defer:");
    private static final MethodHandle MH_initWithContentRect_styleMask_backing_defer_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_initWithContentRect_styleMask_backing_defer_screen_ = ObjC.selector("initWithContentRect:styleMask:backing:defer:screen:");
    private static final MethodHandle MH_initWithContentRect_styleMask_backing_defer_screen_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN, JAVA_LONG));
    private static final long SEL_addTitlebarAccessoryViewController_ = ObjC.selector("addTitlebarAccessoryViewController:");
    private static final MethodHandle MH_addTitlebarAccessoryViewController_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_insertTitlebarAccessoryViewController_atIndex_ = ObjC.selector("insertTitlebarAccessoryViewController:atIndex:");
    private static final MethodHandle MH_insertTitlebarAccessoryViewController_atIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_removeTitlebarAccessoryViewControllerAtIndex_ = ObjC.selector("removeTitlebarAccessoryViewControllerAtIndex:");
    private static final MethodHandle MH_removeTitlebarAccessoryViewControllerAtIndex_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTitleWithRepresentedFilename_ = ObjC.selector("setTitleWithRepresentedFilename:");
    private static final MethodHandle MH_setTitleWithRepresentedFilename_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_fieldEditor_forObject_ = ObjC.selector("fieldEditor:forObject:");
    private static final MethodHandle MH_fieldEditor_forObject_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN, JAVA_LONG));
    private static final long SEL_endEditingFor_ = ObjC.selector("endEditingFor:");
    private static final MethodHandle MH_endEditingFor_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_constrainFrameRect_toScreen_ = ObjC.selector("constrainFrameRect:toScreen:");
    private static final MethodHandle MH_constrainFrameRect_toScreen_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSRect.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_LONG));
    private static final long SEL_setFrame_display_ = ObjC.selector("setFrame:display:");
    private static final MethodHandle MH_setFrame_display_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_BOOLEAN));
    private static final long SEL_setContentSize_ = ObjC.selector("setContentSize:");
    private static final MethodHandle MH_setContentSize_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_setFrameOrigin_ = ObjC.selector("setFrameOrigin:");
    private static final MethodHandle MH_setFrameOrigin_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_setFrameTopLeftPoint_ = ObjC.selector("setFrameTopLeftPoint:");
    private static final MethodHandle MH_setFrameTopLeftPoint_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_cascadeTopLeftFromPoint_ = ObjC.selector("cascadeTopLeftFromPoint:");
    private static final MethodHandle MH_cascadeTopLeftFromPoint_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSPoint.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_animationResizeTime_ = ObjC.selector("animationResizeTime:");
    private static final MethodHandle MH_animationResizeTime_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_DOUBLE, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_setFrame_display_animate_ = ObjC.selector("setFrame:display:animate:");
    private static final MethodHandle MH_setFrame_display_animate_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_BOOLEAN, JAVA_BOOLEAN));
    private static final long SEL_displayIfNeeded = ObjC.selector("displayIfNeeded");
    private static final MethodHandle MH_displayIfNeeded = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_display = ObjC.selector("display");
    private static final MethodHandle MH_display = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_update = ObjC.selector("update");
    private static final MethodHandle MH_update = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_makeFirstResponder_ = ObjC.selector("makeFirstResponder:");
    private static final MethodHandle MH_makeFirstResponder_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_close = ObjC.selector("close");
    private static final MethodHandle MH_close = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_miniaturize_ = ObjC.selector("miniaturize:");
    private static final MethodHandle MH_miniaturize_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_deminiaturize_ = ObjC.selector("deminiaturize:");
    private static final MethodHandle MH_deminiaturize_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_zoom_ = ObjC.selector("zoom:");
    private static final MethodHandle MH_zoom_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_tryToPerform_with_ = ObjC.selector("tryToPerform:with:");
    private static final MethodHandle MH_tryToPerform_with_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_validRequestorForSendType_returnType_ = ObjC.selector("validRequestorForSendType:returnType:");
    private static final MethodHandle MH_validRequestorForSendType_returnType_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setContentBorderThickness_forEdge_ = ObjC.selector("setContentBorderThickness:forEdge:");
    private static final MethodHandle MH_setContentBorderThickness_forEdge_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_LONG));
    private static final long SEL_contentBorderThicknessForEdge_ = ObjC.selector("contentBorderThicknessForEdge:");
    private static final MethodHandle MH_contentBorderThicknessForEdge_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_DOUBLE, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setAutorecalculatesContentBorderThickness_forEdge_ = ObjC.selector("setAutorecalculatesContentBorderThickness:forEdge:");
    private static final MethodHandle MH_setAutorecalculatesContentBorderThickness_forEdge_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN, JAVA_LONG));
    private static final long SEL_autorecalculatesContentBorderThicknessForEdge_ = ObjC.selector("autorecalculatesContentBorderThicknessForEdge:");
    private static final MethodHandle MH_autorecalculatesContentBorderThicknessForEdge_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_center = ObjC.selector("center");
    private static final MethodHandle MH_center = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_makeKeyAndOrderFront_ = ObjC.selector("makeKeyAndOrderFront:");
    private static final MethodHandle MH_makeKeyAndOrderFront_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_orderFront_ = ObjC.selector("orderFront:");
    private static final MethodHandle MH_orderFront_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_orderBack_ = ObjC.selector("orderBack:");
    private static final MethodHandle MH_orderBack_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_orderOut_ = ObjC.selector("orderOut:");
    private static final MethodHandle MH_orderOut_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_orderWindow_relativeTo_ = ObjC.selector("orderWindow:relativeTo:");
    private static final MethodHandle MH_orderWindow_relativeTo_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_orderFrontRegardless = ObjC.selector("orderFrontRegardless");
    private static final MethodHandle MH_orderFrontRegardless = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_makeKeyWindow = ObjC.selector("makeKeyWindow");
    private static final MethodHandle MH_makeKeyWindow = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_makeMainWindow = ObjC.selector("makeMainWindow");
    private static final MethodHandle MH_makeMainWindow = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_becomeKeyWindow = ObjC.selector("becomeKeyWindow");
    private static final MethodHandle MH_becomeKeyWindow = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_resignKeyWindow = ObjC.selector("resignKeyWindow");
    private static final MethodHandle MH_resignKeyWindow = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_becomeMainWindow = ObjC.selector("becomeMainWindow");
    private static final MethodHandle MH_becomeMainWindow = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_resignMainWindow = ObjC.selector("resignMainWindow");
    private static final MethodHandle MH_resignMainWindow = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_convertRectToScreen_ = ObjC.selector("convertRectToScreen:");
    private static final MethodHandle MH_convertRectToScreen_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSRect.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_convertRectFromScreen_ = ObjC.selector("convertRectFromScreen:");
    private static final MethodHandle MH_convertRectFromScreen_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSRect.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_convertPointToScreen_ = ObjC.selector("convertPointToScreen:");
    private static final MethodHandle MH_convertPointToScreen_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSPoint.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_convertPointFromScreen_ = ObjC.selector("convertPointFromScreen:");
    private static final MethodHandle MH_convertPointFromScreen_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSPoint.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_convertRectToBacking_ = ObjC.selector("convertRectToBacking:");
    private static final MethodHandle MH_convertRectToBacking_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSRect.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_convertRectFromBacking_ = ObjC.selector("convertRectFromBacking:");
    private static final MethodHandle MH_convertRectFromBacking_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSRect.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_convertPointToBacking_ = ObjC.selector("convertPointToBacking:");
    private static final MethodHandle MH_convertPointToBacking_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSPoint.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_convertPointFromBacking_ = ObjC.selector("convertPointFromBacking:");
    private static final MethodHandle MH_convertPointFromBacking_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSPoint.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_backingAlignedRect_options_ = ObjC.selector("backingAlignedRect:options:");
    private static final MethodHandle MH_backingAlignedRect_options_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSRect.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_LONG));
    private static final long SEL_performClose_ = ObjC.selector("performClose:");
    private static final MethodHandle MH_performClose_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_performMiniaturize_ = ObjC.selector("performMiniaturize:");
    private static final MethodHandle MH_performMiniaturize_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_performZoom_ = ObjC.selector("performZoom:");
    private static final MethodHandle MH_performZoom_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_dataWithEPSInsideRect_ = ObjC.selector("dataWithEPSInsideRect:");
    private static final MethodHandle MH_dataWithEPSInsideRect_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_dataWithPDFInsideRect_ = ObjC.selector("dataWithPDFInsideRect:");
    private static final MethodHandle MH_dataWithPDFInsideRect_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_print_ = ObjC.selector("print:");
    private static final MethodHandle MH_print_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDynamicDepthLimit_ = ObjC.selector("setDynamicDepthLimit:");
    private static final MethodHandle MH_setDynamicDepthLimit_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_invalidateShadow = ObjC.selector("invalidateShadow");
    private static final MethodHandle MH_invalidateShadow = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_toggleFullScreen_ = ObjC.selector("toggleFullScreen:");
    private static final MethodHandle MH_toggleFullScreen_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFrameFromString_ = ObjC.selector("setFrameFromString:");
    private static final MethodHandle MH_setFrameFromString_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_saveFrameUsingName_ = ObjC.selector("saveFrameUsingName:");
    private static final MethodHandle MH_saveFrameUsingName_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFrameUsingName_force_ = ObjC.selector("setFrameUsingName:force:");
    private static final MethodHandle MH_setFrameUsingName_force_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_setFrameUsingName_ = ObjC.selector("setFrameUsingName:");
    private static final MethodHandle MH_setFrameUsingName_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setFrameAutosaveName_ = ObjC.selector("setFrameAutosaveName:");
    private static final MethodHandle MH_setFrameAutosaveName_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_removeFrameUsingName_ = ObjC.selector("removeFrameUsingName:");
    private static final MethodHandle MH_CLASS_removeFrameUsingName_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_beginSheet_completionHandler_ = ObjC.selector("beginSheet:completionHandler:");
    private static final MethodHandle MH_beginSheet_completionHandler_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_beginCriticalSheet_completionHandler_ = ObjC.selector("beginCriticalSheet:completionHandler:");
    private static final MethodHandle MH_beginCriticalSheet_completionHandler_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_endSheet_ = ObjC.selector("endSheet:");
    private static final MethodHandle MH_endSheet_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_endSheet_returnCode_ = ObjC.selector("endSheet:returnCode:");
    private static final MethodHandle MH_endSheet_returnCode_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_standardWindowButton_forStyleMask_ = ObjC.selector("standardWindowButton:forStyleMask:");
    private static final MethodHandle MH_CLASS_standardWindowButton_forStyleMask_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_standardWindowButton_ = ObjC.selector("standardWindowButton:");
    private static final MethodHandle MH_standardWindowButton_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_addChildWindow_ordered_ = ObjC.selector("addChildWindow:ordered:");
    private static final MethodHandle MH_addChildWindow_ordered_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_removeChildWindow_ = ObjC.selector("removeChildWindow:");
    private static final MethodHandle MH_removeChildWindow_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_canRepresentDisplayGamut_ = ObjC.selector("canRepresentDisplayGamut:");
    private static final MethodHandle MH_canRepresentDisplayGamut_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_windowNumbersWithOptions_ = ObjC.selector("windowNumbersWithOptions:");
    private static final MethodHandle MH_CLASS_windowNumbersWithOptions_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_windowNumberAtPoint_belowWindowWithWindowNumber_ = ObjC.selector("windowNumberAtPoint:belowWindowWithWindowNumber:");
    private static final MethodHandle MH_CLASS_windowNumberAtPoint_belowWindowWithWindowNumber_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_LONG));
    private static final long SEL_CLASS_windowWithContentViewController_ = ObjC.selector("windowWithContentViewController:");
    private static final MethodHandle MH_CLASS_windowWithContentViewController_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_performWindowDragWithEvent_ = ObjC.selector("performWindowDragWithEvent:");
    private static final MethodHandle MH_performWindowDragWithEvent_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_selectNextKeyView_ = ObjC.selector("selectNextKeyView:");
    private static final MethodHandle MH_selectNextKeyView_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_selectPreviousKeyView_ = ObjC.selector("selectPreviousKeyView:");
    private static final MethodHandle MH_selectPreviousKeyView_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_selectKeyViewFollowingView_ = ObjC.selector("selectKeyViewFollowingView:");
    private static final MethodHandle MH_selectKeyViewFollowingView_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_selectKeyViewPrecedingView_ = ObjC.selector("selectKeyViewPrecedingView:");
    private static final MethodHandle MH_selectKeyViewPrecedingView_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_disableKeyEquivalentForDefaultButtonCell = ObjC.selector("disableKeyEquivalentForDefaultButtonCell");
    private static final MethodHandle MH_disableKeyEquivalentForDefaultButtonCell = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_enableKeyEquivalentForDefaultButtonCell = ObjC.selector("enableKeyEquivalentForDefaultButtonCell");
    private static final MethodHandle MH_enableKeyEquivalentForDefaultButtonCell = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_recalculateKeyViewLoop = ObjC.selector("recalculateKeyViewLoop");
    private static final MethodHandle MH_recalculateKeyViewLoop = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_toggleToolbarShown_ = ObjC.selector("toggleToolbarShown:");
    private static final MethodHandle MH_toggleToolbarShown_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_runToolbarCustomizationPalette_ = ObjC.selector("runToolbarCustomizationPalette:");
    private static final MethodHandle MH_runToolbarCustomizationPalette_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_selectNextTab_ = ObjC.selector("selectNextTab:");
    private static final MethodHandle MH_selectNextTab_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_selectPreviousTab_ = ObjC.selector("selectPreviousTab:");
    private static final MethodHandle MH_selectPreviousTab_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_moveTabToNewWindow_ = ObjC.selector("moveTabToNewWindow:");
    private static final MethodHandle MH_moveTabToNewWindow_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_mergeAllWindows_ = ObjC.selector("mergeAllWindows:");
    private static final MethodHandle MH_mergeAllWindows_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_toggleTabBar_ = ObjC.selector("toggleTabBar:");
    private static final MethodHandle MH_toggleTabBar_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_toggleTabOverview_ = ObjC.selector("toggleTabOverview:");
    private static final MethodHandle MH_toggleTabOverview_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_addTabbedWindow_ordered_ = ObjC.selector("addTabbedWindow:ordered:");
    private static final MethodHandle MH_addTabbedWindow_ordered_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_transferWindowSharingToWindow_completionHandler_ = ObjC.selector("transferWindowSharingToWindow:completionHandler:");
    private static final MethodHandle MH_transferWindowSharingToWindow_completionHandler_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_requestSharingOfWindow_completionHandler_ = ObjC.selector("requestSharingOfWindow:completionHandler:");
    private static final MethodHandle MH_requestSharingOfWindow_completionHandler_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_requestSharingOfWindowUsingPreview_title_completionHandler_ = ObjC.selector("requestSharingOfWindowUsingPreview:title:completionHandler:");
    private static final MethodHandle MH_requestSharingOfWindowUsingPreview_title_completionHandler_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_defaultDepthLimit = ObjC.selector("defaultDepthLimit");
    private static final MethodHandle MH_CLASS_defaultDepthLimit = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_INT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_title = ObjC.selector("title");
    private static final MethodHandle MH_title = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTitle_ = ObjC.selector("setTitle:");
    private static final MethodHandle MH_setTitle_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_subtitle = ObjC.selector("subtitle");
    private static final MethodHandle MH_subtitle = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSubtitle_ = ObjC.selector("setSubtitle:");
    private static final MethodHandle MH_setSubtitle_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_titleVisibility = ObjC.selector("titleVisibility");
    private static final MethodHandle MH_titleVisibility = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTitleVisibility_ = ObjC.selector("setTitleVisibility:");
    private static final MethodHandle MH_setTitleVisibility_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_titlebarAppearsTransparent = ObjC.selector("titlebarAppearsTransparent");
    private static final MethodHandle MH_titlebarAppearsTransparent = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTitlebarAppearsTransparent_ = ObjC.selector("setTitlebarAppearsTransparent:");
    private static final MethodHandle MH_setTitlebarAppearsTransparent_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_toolbarStyle = ObjC.selector("toolbarStyle");
    private static final MethodHandle MH_toolbarStyle = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setToolbarStyle_ = ObjC.selector("setToolbarStyle:");
    private static final MethodHandle MH_setToolbarStyle_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_contentLayoutRect = ObjC.selector("contentLayoutRect");
    private static final MethodHandle MH_contentLayoutRect = ObjC.msgSendCritical(FunctionDescriptor.of(NSRect.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_contentLayoutGuide = ObjC.selector("contentLayoutGuide");
    private static final MethodHandle MH_contentLayoutGuide = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_titlebarAccessoryViewControllers = ObjC.selector("titlebarAccessoryViewControllers");
    private static final MethodHandle MH_titlebarAccessoryViewControllers = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTitlebarAccessoryViewControllers_ = ObjC.selector("setTitlebarAccessoryViewControllers:");
    private static final MethodHandle MH_setTitlebarAccessoryViewControllers_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_representedURL = ObjC.selector("representedURL");
    private static final MethodHandle MH_representedURL = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setRepresentedURL_ = ObjC.selector("setRepresentedURL:");
    private static final MethodHandle MH_setRepresentedURL_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_representedFilename = ObjC.selector("representedFilename");
    private static final MethodHandle MH_representedFilename = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setRepresentedFilename_ = ObjC.selector("setRepresentedFilename:");
    private static final MethodHandle MH_setRepresentedFilename_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isExcludedFromWindowsMenu = ObjC.selector("isExcludedFromWindowsMenu");
    private static final MethodHandle MH_isExcludedFromWindowsMenu = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setExcludedFromWindowsMenu_ = ObjC.selector("setExcludedFromWindowsMenu:");
    private static final MethodHandle MH_setExcludedFromWindowsMenu_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_contentView = ObjC.selector("contentView");
    private static final MethodHandle MH_contentView = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setContentView_ = ObjC.selector("setContentView:");
    private static final MethodHandle MH_setContentView_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_delegate = ObjC.selector("delegate");
    private static final MethodHandle MH_delegate = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDelegate_ = ObjC.selector("setDelegate:");
    private static final MethodHandle MH_setDelegate_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_windowNumber = ObjC.selector("windowNumber");
    private static final MethodHandle MH_windowNumber = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_styleMask = ObjC.selector("styleMask");
    private static final MethodHandle MH_styleMask = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setStyleMask_ = ObjC.selector("setStyleMask:");
    private static final MethodHandle MH_setStyleMask_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_cascadingReferenceFrame = ObjC.selector("cascadingReferenceFrame");
    private static final MethodHandle MH_cascadingReferenceFrame = ObjC.msgSendCritical(FunctionDescriptor.of(NSRect.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_frame = ObjC.selector("frame");
    private static final MethodHandle MH_frame = ObjC.msgSendCritical(FunctionDescriptor.of(NSRect.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_inLiveResize = ObjC.selector("inLiveResize");
    private static final MethodHandle MH_inLiveResize = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_resizeIncrements = ObjC.selector("resizeIncrements");
    private static final MethodHandle MH_resizeIncrements = ObjC.msgSendCritical(FunctionDescriptor.of(NSSize.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setResizeIncrements_ = ObjC.selector("setResizeIncrements:");
    private static final MethodHandle MH_setResizeIncrements_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_aspectRatio = ObjC.selector("aspectRatio");
    private static final MethodHandle MH_aspectRatio = ObjC.msgSendCritical(FunctionDescriptor.of(NSSize.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setAspectRatio_ = ObjC.selector("setAspectRatio:");
    private static final MethodHandle MH_setAspectRatio_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_contentResizeIncrements = ObjC.selector("contentResizeIncrements");
    private static final MethodHandle MH_contentResizeIncrements = ObjC.msgSendCritical(FunctionDescriptor.of(NSSize.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setContentResizeIncrements_ = ObjC.selector("setContentResizeIncrements:");
    private static final MethodHandle MH_setContentResizeIncrements_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_contentAspectRatio = ObjC.selector("contentAspectRatio");
    private static final MethodHandle MH_contentAspectRatio = ObjC.msgSendCritical(FunctionDescriptor.of(NSSize.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setContentAspectRatio_ = ObjC.selector("setContentAspectRatio:");
    private static final MethodHandle MH_setContentAspectRatio_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_viewsNeedDisplay = ObjC.selector("viewsNeedDisplay");
    private static final MethodHandle MH_viewsNeedDisplay = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setViewsNeedDisplay_ = ObjC.selector("setViewsNeedDisplay:");
    private static final MethodHandle MH_setViewsNeedDisplay_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_preservesContentDuringLiveResize = ObjC.selector("preservesContentDuringLiveResize");
    private static final MethodHandle MH_preservesContentDuringLiveResize = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setPreservesContentDuringLiveResize_ = ObjC.selector("setPreservesContentDuringLiveResize:");
    private static final MethodHandle MH_setPreservesContentDuringLiveResize_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_firstResponder = ObjC.selector("firstResponder");
    private static final MethodHandle MH_firstResponder = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_resizeFlags = ObjC.selector("resizeFlags");
    private static final MethodHandle MH_resizeFlags = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isReleasedWhenClosed = ObjC.selector("isReleasedWhenClosed");
    private static final MethodHandle MH_isReleasedWhenClosed = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setReleasedWhenClosed_ = ObjC.selector("setReleasedWhenClosed:");
    private static final MethodHandle MH_setReleasedWhenClosed_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_isZoomed = ObjC.selector("isZoomed");
    private static final MethodHandle MH_isZoomed = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isMiniaturized = ObjC.selector("isMiniaturized");
    private static final MethodHandle MH_isMiniaturized = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_backgroundColor = ObjC.selector("backgroundColor");
    private static final MethodHandle MH_backgroundColor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBackgroundColor_ = ObjC.selector("setBackgroundColor:");
    private static final MethodHandle MH_setBackgroundColor_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isMovable = ObjC.selector("isMovable");
    private static final MethodHandle MH_isMovable = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMovable_ = ObjC.selector("setMovable:");
    private static final MethodHandle MH_setMovable_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_isMovableByWindowBackground = ObjC.selector("isMovableByWindowBackground");
    private static final MethodHandle MH_isMovableByWindowBackground = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMovableByWindowBackground_ = ObjC.selector("setMovableByWindowBackground:");
    private static final MethodHandle MH_setMovableByWindowBackground_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_hidesOnDeactivate = ObjC.selector("hidesOnDeactivate");
    private static final MethodHandle MH_hidesOnDeactivate = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setHidesOnDeactivate_ = ObjC.selector("setHidesOnDeactivate:");
    private static final MethodHandle MH_setHidesOnDeactivate_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_canHide = ObjC.selector("canHide");
    private static final MethodHandle MH_canHide = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setCanHide_ = ObjC.selector("setCanHide:");
    private static final MethodHandle MH_setCanHide_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_miniwindowImage = ObjC.selector("miniwindowImage");
    private static final MethodHandle MH_miniwindowImage = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMiniwindowImage_ = ObjC.selector("setMiniwindowImage:");
    private static final MethodHandle MH_setMiniwindowImage_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_miniwindowTitle = ObjC.selector("miniwindowTitle");
    private static final MethodHandle MH_miniwindowTitle = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMiniwindowTitle_ = ObjC.selector("setMiniwindowTitle:");
    private static final MethodHandle MH_setMiniwindowTitle_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_dockTile = ObjC.selector("dockTile");
    private static final MethodHandle MH_dockTile = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isDocumentEdited = ObjC.selector("isDocumentEdited");
    private static final MethodHandle MH_isDocumentEdited = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDocumentEdited_ = ObjC.selector("setDocumentEdited:");
    private static final MethodHandle MH_setDocumentEdited_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_isVisible = ObjC.selector("isVisible");
    private static final MethodHandle MH_isVisible = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isKeyWindow = ObjC.selector("isKeyWindow");
    private static final MethodHandle MH_isKeyWindow = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isMainWindow = ObjC.selector("isMainWindow");
    private static final MethodHandle MH_isMainWindow = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_canBecomeKeyWindow = ObjC.selector("canBecomeKeyWindow");
    private static final MethodHandle MH_canBecomeKeyWindow = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_canBecomeMainWindow = ObjC.selector("canBecomeMainWindow");
    private static final MethodHandle MH_canBecomeMainWindow = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_worksWhenModal = ObjC.selector("worksWhenModal");
    private static final MethodHandle MH_worksWhenModal = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_preventsApplicationTerminationWhenModal = ObjC.selector("preventsApplicationTerminationWhenModal");
    private static final MethodHandle MH_preventsApplicationTerminationWhenModal = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setPreventsApplicationTerminationWhenModal_ = ObjC.selector("setPreventsApplicationTerminationWhenModal:");
    private static final MethodHandle MH_setPreventsApplicationTerminationWhenModal_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_backingScaleFactor = ObjC.selector("backingScaleFactor");
    private static final MethodHandle MH_backingScaleFactor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_DOUBLE, JAVA_LONG, JAVA_LONG));
    private static final long SEL_allowsToolTipsWhenApplicationIsInactive = ObjC.selector("allowsToolTipsWhenApplicationIsInactive");
    private static final MethodHandle MH_allowsToolTipsWhenApplicationIsInactive = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setAllowsToolTipsWhenApplicationIsInactive_ = ObjC.selector("setAllowsToolTipsWhenApplicationIsInactive:");
    private static final MethodHandle MH_setAllowsToolTipsWhenApplicationIsInactive_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_backingType = ObjC.selector("backingType");
    private static final MethodHandle MH_backingType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setBackingType_ = ObjC.selector("setBackingType:");
    private static final MethodHandle MH_setBackingType_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_level = ObjC.selector("level");
    private static final MethodHandle MH_level = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLevel_ = ObjC.selector("setLevel:");
    private static final MethodHandle MH_setLevel_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_depthLimit = ObjC.selector("depthLimit");
    private static final MethodHandle MH_depthLimit = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_INT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDepthLimit_ = ObjC.selector("setDepthLimit:");
    private static final MethodHandle MH_setDepthLimit_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_INT));
    private static final long SEL_hasDynamicDepthLimit = ObjC.selector("hasDynamicDepthLimit");
    private static final MethodHandle MH_hasDynamicDepthLimit = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_screen = ObjC.selector("screen");
    private static final MethodHandle MH_screen = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_deepestScreen = ObjC.selector("deepestScreen");
    private static final MethodHandle MH_deepestScreen = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_hasShadow = ObjC.selector("hasShadow");
    private static final MethodHandle MH_hasShadow = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setHasShadow_ = ObjC.selector("setHasShadow:");
    private static final MethodHandle MH_setHasShadow_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_alphaValue = ObjC.selector("alphaValue");
    private static final MethodHandle MH_alphaValue = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_DOUBLE, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setAlphaValue_ = ObjC.selector("setAlphaValue:");
    private static final MethodHandle MH_setAlphaValue_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE));
    private static final long SEL_isOpaque = ObjC.selector("isOpaque");
    private static final MethodHandle MH_isOpaque = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setOpaque_ = ObjC.selector("setOpaque:");
    private static final MethodHandle MH_setOpaque_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_sharingType = ObjC.selector("sharingType");
    private static final MethodHandle MH_sharingType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSharingType_ = ObjC.selector("setSharingType:");
    private static final MethodHandle MH_setSharingType_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_allowsConcurrentViewDrawing = ObjC.selector("allowsConcurrentViewDrawing");
    private static final MethodHandle MH_allowsConcurrentViewDrawing = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setAllowsConcurrentViewDrawing_ = ObjC.selector("setAllowsConcurrentViewDrawing:");
    private static final MethodHandle MH_setAllowsConcurrentViewDrawing_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_displaysWhenScreenProfileChanges = ObjC.selector("displaysWhenScreenProfileChanges");
    private static final MethodHandle MH_displaysWhenScreenProfileChanges = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDisplaysWhenScreenProfileChanges_ = ObjC.selector("setDisplaysWhenScreenProfileChanges:");
    private static final MethodHandle MH_setDisplaysWhenScreenProfileChanges_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_canBecomeVisibleWithoutLogin = ObjC.selector("canBecomeVisibleWithoutLogin");
    private static final MethodHandle MH_canBecomeVisibleWithoutLogin = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setCanBecomeVisibleWithoutLogin_ = ObjC.selector("setCanBecomeVisibleWithoutLogin:");
    private static final MethodHandle MH_setCanBecomeVisibleWithoutLogin_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_collectionBehavior = ObjC.selector("collectionBehavior");
    private static final MethodHandle MH_collectionBehavior = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setCollectionBehavior_ = ObjC.selector("setCollectionBehavior:");
    private static final MethodHandle MH_setCollectionBehavior_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_animationBehavior = ObjC.selector("animationBehavior");
    private static final MethodHandle MH_animationBehavior = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setAnimationBehavior_ = ObjC.selector("setAnimationBehavior:");
    private static final MethodHandle MH_setAnimationBehavior_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isOnActiveSpace = ObjC.selector("isOnActiveSpace");
    private static final MethodHandle MH_isOnActiveSpace = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_stringWithSavedFrame = ObjC.selector("stringWithSavedFrame");
    private static final MethodHandle MH_stringWithSavedFrame = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_frameAutosaveName = ObjC.selector("frameAutosaveName");
    private static final MethodHandle MH_frameAutosaveName = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_minSize = ObjC.selector("minSize");
    private static final MethodHandle MH_minSize = ObjC.msgSendCritical(FunctionDescriptor.of(NSSize.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMinSize_ = ObjC.selector("setMinSize:");
    private static final MethodHandle MH_setMinSize_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_maxSize = ObjC.selector("maxSize");
    private static final MethodHandle MH_maxSize = ObjC.msgSendCritical(FunctionDescriptor.of(NSSize.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMaxSize_ = ObjC.selector("setMaxSize:");
    private static final MethodHandle MH_setMaxSize_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_contentMinSize = ObjC.selector("contentMinSize");
    private static final MethodHandle MH_contentMinSize = ObjC.msgSendCritical(FunctionDescriptor.of(NSSize.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setContentMinSize_ = ObjC.selector("setContentMinSize:");
    private static final MethodHandle MH_setContentMinSize_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_contentMaxSize = ObjC.selector("contentMaxSize");
    private static final MethodHandle MH_contentMaxSize = ObjC.msgSendCritical(FunctionDescriptor.of(NSSize.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setContentMaxSize_ = ObjC.selector("setContentMaxSize:");
    private static final MethodHandle MH_setContentMaxSize_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_minFullScreenContentSize = ObjC.selector("minFullScreenContentSize");
    private static final MethodHandle MH_minFullScreenContentSize = ObjC.msgSendCritical(FunctionDescriptor.of(NSSize.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMinFullScreenContentSize_ = ObjC.selector("setMinFullScreenContentSize:");
    private static final MethodHandle MH_setMinFullScreenContentSize_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_maxFullScreenContentSize = ObjC.selector("maxFullScreenContentSize");
    private static final MethodHandle MH_maxFullScreenContentSize = ObjC.msgSendCritical(FunctionDescriptor.of(NSSize.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMaxFullScreenContentSize_ = ObjC.selector("setMaxFullScreenContentSize:");
    private static final MethodHandle MH_setMaxFullScreenContentSize_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_deviceDescription = ObjC.selector("deviceDescription");
    private static final MethodHandle MH_deviceDescription = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_windowController = ObjC.selector("windowController");
    private static final MethodHandle MH_windowController = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setWindowController_ = ObjC.selector("setWindowController:");
    private static final MethodHandle MH_setWindowController_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sheets = ObjC.selector("sheets");
    private static final MethodHandle MH_sheets = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_attachedSheet = ObjC.selector("attachedSheet");
    private static final MethodHandle MH_attachedSheet = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isSheet = ObjC.selector("isSheet");
    private static final MethodHandle MH_isSheet = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sheetParent = ObjC.selector("sheetParent");
    private static final MethodHandle MH_sheetParent = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_childWindows = ObjC.selector("childWindows");
    private static final MethodHandle MH_childWindows = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_parentWindow = ObjC.selector("parentWindow");
    private static final MethodHandle MH_parentWindow = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setParentWindow_ = ObjC.selector("setParentWindow:");
    private static final MethodHandle MH_setParentWindow_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_appearanceSource = ObjC.selector("appearanceSource");
    private static final MethodHandle MH_appearanceSource = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setAppearanceSource_ = ObjC.selector("setAppearanceSource:");
    private static final MethodHandle MH_setAppearanceSource_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_colorSpace = ObjC.selector("colorSpace");
    private static final MethodHandle MH_colorSpace = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setColorSpace_ = ObjC.selector("setColorSpace:");
    private static final MethodHandle MH_setColorSpace_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_occlusionState = ObjC.selector("occlusionState");
    private static final MethodHandle MH_occlusionState = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_titlebarSeparatorStyle = ObjC.selector("titlebarSeparatorStyle");
    private static final MethodHandle MH_titlebarSeparatorStyle = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTitlebarSeparatorStyle_ = ObjC.selector("setTitlebarSeparatorStyle:");
    private static final MethodHandle MH_setTitlebarSeparatorStyle_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_contentViewController = ObjC.selector("contentViewController");
    private static final MethodHandle MH_contentViewController = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setContentViewController_ = ObjC.selector("setContentViewController:");
    private static final MethodHandle MH_setContentViewController_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initialFirstResponder = ObjC.selector("initialFirstResponder");
    private static final MethodHandle MH_initialFirstResponder = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setInitialFirstResponder_ = ObjC.selector("setInitialFirstResponder:");
    private static final MethodHandle MH_setInitialFirstResponder_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_keyViewSelectionDirection = ObjC.selector("keyViewSelectionDirection");
    private static final MethodHandle MH_keyViewSelectionDirection = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_defaultButtonCell = ObjC.selector("defaultButtonCell");
    private static final MethodHandle MH_defaultButtonCell = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setDefaultButtonCell_ = ObjC.selector("setDefaultButtonCell:");
    private static final MethodHandle MH_setDefaultButtonCell_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_autorecalculatesKeyViewLoop = ObjC.selector("autorecalculatesKeyViewLoop");
    private static final MethodHandle MH_autorecalculatesKeyViewLoop = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setAutorecalculatesKeyViewLoop_ = ObjC.selector("setAutorecalculatesKeyViewLoop:");
    private static final MethodHandle MH_setAutorecalculatesKeyViewLoop_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_toolbar = ObjC.selector("toolbar");
    private static final MethodHandle MH_toolbar = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setToolbar_ = ObjC.selector("setToolbar:");
    private static final MethodHandle MH_setToolbar_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_showsToolbarButton = ObjC.selector("showsToolbarButton");
    private static final MethodHandle MH_showsToolbarButton = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setShowsToolbarButton_ = ObjC.selector("setShowsToolbarButton:");
    private static final MethodHandle MH_setShowsToolbarButton_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_CLASS_allowsAutomaticWindowTabbing = ObjC.selector("allowsAutomaticWindowTabbing");
    private static final MethodHandle MH_CLASS_allowsAutomaticWindowTabbing = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_setAllowsAutomaticWindowTabbing_ = ObjC.selector("setAllowsAutomaticWindowTabbing:");
    private static final MethodHandle MH_CLASS_setAllowsAutomaticWindowTabbing_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_CLASS_userTabbingPreference = ObjC.selector("userTabbingPreference");
    private static final MethodHandle MH_CLASS_userTabbingPreference = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_tabbingMode = ObjC.selector("tabbingMode");
    private static final MethodHandle MH_tabbingMode = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTabbingMode_ = ObjC.selector("setTabbingMode:");
    private static final MethodHandle MH_setTabbingMode_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_tabbingIdentifier = ObjC.selector("tabbingIdentifier");
    private static final MethodHandle MH_tabbingIdentifier = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTabbingIdentifier_ = ObjC.selector("setTabbingIdentifier:");
    private static final MethodHandle MH_setTabbingIdentifier_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_tabbedWindows = ObjC.selector("tabbedWindows");
    private static final MethodHandle MH_tabbedWindows = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_tab = ObjC.selector("tab");
    private static final MethodHandle MH_tab = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_tabGroup = ObjC.selector("tabGroup");
    private static final MethodHandle MH_tabGroup = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_hasActiveWindowSharingSession = ObjC.selector("hasActiveWindowSharingSession");
    private static final MethodHandle MH_hasActiveWindowSharingSession = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_windowTitlebarLayoutDirection = ObjC.selector("windowTitlebarLayoutDirection");
    private static final MethodHandle MH_windowTitlebarLayoutDirection = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_trackEventsMatchingMask_timeout_mode_handler_ = ObjC.selector("trackEventsMatchingMask:timeout:mode:handler:");
    private static final MethodHandle MH_trackEventsMatchingMask_timeout_mode_handler_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_LONG, JAVA_LONG));
    private static final long SEL_nextEventMatchingMask_ = ObjC.selector("nextEventMatchingMask:");
    private static final MethodHandle MH_nextEventMatchingMask_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_nextEventMatchingMask_untilDate_inMode_dequeue_ = ObjC.selector("nextEventMatchingMask:untilDate:inMode:dequeue:");
    private static final MethodHandle MH_nextEventMatchingMask_untilDate_inMode_dequeue_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_discardEventsMatchingMask_beforeEvent_ = ObjC.selector("discardEventsMatchingMask:beforeEvent:");
    private static final MethodHandle MH_discardEventsMatchingMask_beforeEvent_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_postEvent_atStart_ = ObjC.selector("postEvent:atStart:");
    private static final MethodHandle MH_postEvent_atStart_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_sendEvent_ = ObjC.selector("sendEvent:");
    private static final MethodHandle MH_sendEvent_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_currentEvent = ObjC.selector("currentEvent");
    private static final MethodHandle MH_currentEvent = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_acceptsMouseMovedEvents = ObjC.selector("acceptsMouseMovedEvents");
    private static final MethodHandle MH_acceptsMouseMovedEvents = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setAcceptsMouseMovedEvents_ = ObjC.selector("setAcceptsMouseMovedEvents:");
    private static final MethodHandle MH_setAcceptsMouseMovedEvents_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_ignoresMouseEvents = ObjC.selector("ignoresMouseEvents");
    private static final MethodHandle MH_ignoresMouseEvents = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setIgnoresMouseEvents_ = ObjC.selector("setIgnoresMouseEvents:");
    private static final MethodHandle MH_setIgnoresMouseEvents_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_mouseLocationOutsideOfEventStream = ObjC.selector("mouseLocationOutsideOfEventStream");
    private static final MethodHandle MH_mouseLocationOutsideOfEventStream = ObjC.msgSendCritical(FunctionDescriptor.of(NSPoint.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_disableCursorRects = ObjC.selector("disableCursorRects");
    private static final MethodHandle MH_disableCursorRects = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_enableCursorRects = ObjC.selector("enableCursorRects");
    private static final MethodHandle MH_enableCursorRects = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_discardCursorRects = ObjC.selector("discardCursorRects");
    private static final MethodHandle MH_discardCursorRects = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_invalidateCursorRectsForView_ = ObjC.selector("invalidateCursorRectsForView:");
    private static final MethodHandle MH_invalidateCursorRectsForView_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_resetCursorRects = ObjC.selector("resetCursorRects");
    private static final MethodHandle MH_resetCursorRects = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_areCursorRectsEnabled = ObjC.selector("areCursorRectsEnabled");
    private static final MethodHandle MH_areCursorRectsEnabled = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_beginDraggingSessionWithItems_event_source_ = ObjC.selector("beginDraggingSessionWithItems:event:source:");
    private static final MethodHandle MH_beginDraggingSessionWithItems_event_source_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_dragImage_at_offset_event_pasteboard_source_slideBack_ = ObjC.selector("dragImage:at:offset:event:pasteboard:source:slideBack:");
    private static final MethodHandle MH_dragImage_at_offset_event_pasteboard_source_slideBack_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_registerForDraggedTypes_ = ObjC.selector("registerForDraggedTypes:");
    private static final MethodHandle MH_registerForDraggedTypes_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_unregisterDraggedTypes = ObjC.selector("unregisterDraggedTypes");
    private static final MethodHandle MH_unregisterDraggedTypes = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_displayLinkWithTarget_selector_ = ObjC.selector("displayLinkWithTarget:selector:");
    private static final MethodHandle MH_displayLinkWithTarget_selector_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_cacheImageInRect_ = ObjC.selector("cacheImageInRect:");
    private static final MethodHandle MH_cacheImageInRect_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_restoreCachedImage = ObjC.selector("restoreCachedImage");
    private static final MethodHandle MH_restoreCachedImage = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_discardCachedImage = ObjC.selector("discardCachedImage");
    private static final MethodHandle MH_discardCachedImage = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_CLASS_menuChanged_ = ObjC.selector("menuChanged:");
    private static final MethodHandle MH_CLASS_menuChanged_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_gState = ObjC.selector("gState");
    private static final MethodHandle MH_gState = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_convertBaseToScreen_ = ObjC.selector("convertBaseToScreen:");
    private static final MethodHandle MH_convertBaseToScreen_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSPoint.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_convertScreenToBase_ = ObjC.selector("convertScreenToBase:");
    private static final MethodHandle MH_convertScreenToBase_ = ObjC.msgSendCritical(FunctionDescriptor.of(NSPoint.LAYOUT, JAVA_LONG, JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
    private static final long SEL_userSpaceScaleFactor = ObjC.selector("userSpaceScaleFactor");
    private static final MethodHandle MH_userSpaceScaleFactor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_DOUBLE, JAVA_LONG, JAVA_LONG));
    private static final long SEL_useOptimizedDrawing_ = ObjC.selector("useOptimizedDrawing:");
    private static final MethodHandle MH_useOptimizedDrawing_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_canStoreColor = ObjC.selector("canStoreColor");
    private static final MethodHandle MH_canStoreColor = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_disableFlushWindow = ObjC.selector("disableFlushWindow");
    private static final MethodHandle MH_disableFlushWindow = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_enableFlushWindow = ObjC.selector("enableFlushWindow");
    private static final MethodHandle MH_enableFlushWindow = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_flushWindow = ObjC.selector("flushWindow");
    private static final MethodHandle MH_flushWindow = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_flushWindowIfNeeded = ObjC.selector("flushWindowIfNeeded");
    private static final MethodHandle MH_flushWindowIfNeeded = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithWindowRef_ = ObjC.selector("initWithWindowRef:");
    private static final MethodHandle MH_initWithWindowRef_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_disableScreenUpdatesUntilFlush = ObjC.selector("disableScreenUpdatesUntilFlush");
    private static final MethodHandle MH_disableScreenUpdatesUntilFlush = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_isFlushWindowDisabled = ObjC.selector("isFlushWindowDisabled");
    private static final MethodHandle MH_isFlushWindowDisabled = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isAutodisplay = ObjC.selector("isAutodisplay");
    private static final MethodHandle MH_isAutodisplay = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setAutodisplay_ = ObjC.selector("setAutodisplay:");
    private static final MethodHandle MH_setAutodisplay_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_graphicsContext = ObjC.selector("graphicsContext");
    private static final MethodHandle MH_graphicsContext = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_isOneShot = ObjC.selector("isOneShot");
    private static final MethodHandle MH_isOneShot = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setOneShot_ = ObjC.selector("setOneShot:");
    private static final MethodHandle MH_setOneShot_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_preferredBackingLocation = ObjC.selector("preferredBackingLocation");
    private static final MethodHandle MH_preferredBackingLocation = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setPreferredBackingLocation_ = ObjC.selector("setPreferredBackingLocation:");
    private static final MethodHandle MH_setPreferredBackingLocation_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_backingLocation = ObjC.selector("backingLocation");
    private static final MethodHandle MH_backingLocation = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_showsResizeIndicator = ObjC.selector("showsResizeIndicator");
    private static final MethodHandle MH_showsResizeIndicator = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setShowsResizeIndicator_ = ObjC.selector("setShowsResizeIndicator:");
    private static final MethodHandle MH_setShowsResizeIndicator_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN));
    private static final long SEL_windowRef = ObjC.selector("windowRef");
    private static final MethodHandle MH_windowRef = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public NSWindow(final long handle) {
        super(handle);
    }

    /**
     * {@code +[NSWindow alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static NSWindow alloc() {
        try {
            return new NSWindow((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow init]} */
    public NSWindow init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSWindow frameRectForContentRect:styleMask:]}
     *
     * @param style a combination of {@link NSWindowStyleMask} flags
     */
    public static NSRect frameRectForContentRect(final NSRect cRect, final long style) {
        try (NativeStack stack = NativeStack.push()) {
            return NSRect.read((MemorySegment) MH_CLASS_frameRectForContentRect_styleMask_.invokeExact((SegmentAllocator) stack, CLS, SEL_CLASS_frameRectForContentRect_styleMask_, cRect.origin().x(), cRect.origin().y(), cRect.size().width(), cRect.size().height(), style));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSWindow contentRectForFrameRect:styleMask:]}
     *
     * @param style a combination of {@link NSWindowStyleMask} flags
     */
    public static NSRect contentRectForFrameRect(final NSRect fRect, final long style) {
        try (NativeStack stack = NativeStack.push()) {
            return NSRect.read((MemorySegment) MH_CLASS_contentRectForFrameRect_styleMask_.invokeExact((SegmentAllocator) stack, CLS, SEL_CLASS_contentRectForFrameRect_styleMask_, fRect.origin().x(), fRect.origin().y(), fRect.size().width(), fRect.size().height(), style));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSWindow minFrameWidthWithTitle:styleMask:]}
     *
     * @param style a combination of {@link NSWindowStyleMask} flags
     */
    public static double minFrameWidth(final String title, final long style) {
        final long nsTitle = ObjC.nsString(title);
        try {
            return (double) MH_CLASS_minFrameWidthWithTitle_styleMask_.invokeExact(CLS, SEL_CLASS_minFrameWidthWithTitle_styleMask_, nsTitle, style);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsTitle);
        }
    }

    /** {@code -[NSWindow frameRectForContentRect:]} */
    public NSRect frameRectForContentRect(final NSRect contentRect) {
        try (NativeStack stack = NativeStack.push()) {
            return NSRect.read((MemorySegment) MH_frameRectForContentRect_.invokeExact((SegmentAllocator) stack, this.handle, SEL_frameRectForContentRect_, contentRect.origin().x(), contentRect.origin().y(), contentRect.size().width(), contentRect.size().height()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow contentRectForFrameRect:]} */
    public NSRect contentRectForFrameRect(final NSRect frameRect) {
        try (NativeStack stack = NativeStack.push()) {
            return NSRect.read((MemorySegment) MH_contentRectForFrameRect_.invokeExact((SegmentAllocator) stack, this.handle, SEL_contentRectForFrameRect_, frameRect.origin().x(), frameRect.origin().y(), frameRect.size().width(), frameRect.size().height()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow initWithContentRect:styleMask:backing:defer:]}
     *
     * @param style a combination of {@link NSWindowStyleMask} flags
     */
    public NSWindow initWithContentRect(final NSRect contentRect, final long style, final NSBackingStoreType backingStoreType, final boolean flag) {
        try {
            long result = (long) MH_initWithContentRect_styleMask_backing_defer_.invokeExact(this.handle, SEL_initWithContentRect_styleMask_backing_defer_, contentRect.origin().x(), contentRect.origin().y(), contentRect.size().width(), contentRect.size().height(), style, backingStoreType.value, flag);
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow initWithContentRect:styleMask:backing:defer:screen:]}
     *
     * @param style a combination of {@link NSWindowStyleMask} flags
     */
    public NSWindow initWithContentRect(final NSRect contentRect, final long style, final NSBackingStoreType backingStoreType, final boolean flag, @Nullable final NSObject screen) {
        try {
            long result = (long) MH_initWithContentRect_styleMask_backing_defer_screen_.invokeExact(this.handle, SEL_initWithContentRect_styleMask_backing_defer_screen_, contentRect.origin().x(), contentRect.origin().y(), contentRect.size().width(), contentRect.size().height(), style, backingStoreType.value, flag, screen == null ? 0L : screen.handle());
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow addTitlebarAccessoryViewController:]} */
    public void addTitlebarAccessoryViewController(final NSObject childViewController) {
        try {
            MH_addTitlebarAccessoryViewController_.invokeExact(this.handle, SEL_addTitlebarAccessoryViewController_, childViewController.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow insertTitlebarAccessoryViewController:atIndex:]} */
    public void insertTitlebarAccessoryViewController(final NSObject childViewController, final long index) {
        try {
            MH_insertTitlebarAccessoryViewController_atIndex_.invokeExact(this.handle, SEL_insertTitlebarAccessoryViewController_atIndex_, childViewController.handle(), index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow removeTitlebarAccessoryViewControllerAtIndex:]} */
    public void removeTitlebarAccessoryViewControllerAtIndex(final long index) {
        try {
            MH_removeTitlebarAccessoryViewControllerAtIndex_.invokeExact(this.handle, SEL_removeTitlebarAccessoryViewControllerAtIndex_, index);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setTitleWithRepresentedFilename:]} */
    public void setTitleWithRepresentedFilename(final String filename) {
        final long nsFilename = ObjC.nsString(filename);
        try {
            MH_setTitleWithRepresentedFilename_.invokeExact(this.handle, SEL_setTitleWithRepresentedFilename_, nsFilename);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsFilename);
        }
    }

    /**
     * {@code -[NSWindow fieldEditor:forObject:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject fieldEditor(final boolean createFlag, @Nullable final NSObject object) {
        try {
            long result = (long) MH_fieldEditor_forObject_.invokeExact(this.handle, SEL_fieldEditor_forObject_, createFlag, object == null ? 0L : object.handle());
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow endEditingFor:]} */
    public void endEditingFor(@Nullable final NSObject object) {
        try {
            MH_endEditingFor_.invokeExact(this.handle, SEL_endEditingFor_, object == null ? 0L : object.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow constrainFrameRect:toScreen:]} */
    public NSRect constrainFrameRect(final NSRect frameRect, @Nullable final NSObject screen) {
        try (NativeStack stack = NativeStack.push()) {
            return NSRect.read((MemorySegment) MH_constrainFrameRect_toScreen_.invokeExact((SegmentAllocator) stack, this.handle, SEL_constrainFrameRect_toScreen_, frameRect.origin().x(), frameRect.origin().y(), frameRect.size().width(), frameRect.size().height(), screen == null ? 0L : screen.handle()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setFrame:display:]} */
    public void setFrame(final NSRect frameRect, final boolean flag) {
        try {
            MH_setFrame_display_.invokeExact(this.handle, SEL_setFrame_display_, frameRect.origin().x(), frameRect.origin().y(), frameRect.size().width(), frameRect.size().height(), flag);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setContentSize:]} */
    public void setContentSize(final NSSize size) {
        try {
            MH_setContentSize_.invokeExact(this.handle, SEL_setContentSize_, size.width(), size.height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setFrameOrigin:]} */
    public void setFrameOrigin(final NSPoint point) {
        try {
            MH_setFrameOrigin_.invokeExact(this.handle, SEL_setFrameOrigin_, point.x(), point.y());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setFrameTopLeftPoint:]} */
    public void setFrameTopLeftPoint(final NSPoint point) {
        try {
            MH_setFrameTopLeftPoint_.invokeExact(this.handle, SEL_setFrameTopLeftPoint_, point.x(), point.y());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow cascadeTopLeftFromPoint:]} */
    public NSPoint cascadeTopLeftFromPoint(final NSPoint topLeftPoint) {
        try (NativeStack stack = NativeStack.push()) {
            return NSPoint.read((MemorySegment) MH_cascadeTopLeftFromPoint_.invokeExact((SegmentAllocator) stack, this.handle, SEL_cascadeTopLeftFromPoint_, topLeftPoint.x(), topLeftPoint.y()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow animationResizeTime:]} */
    public double animationResizeTime(final NSRect newFrame) {
        try {
            return (double) MH_animationResizeTime_.invokeExact(this.handle, SEL_animationResizeTime_, newFrame.origin().x(), newFrame.origin().y(), newFrame.size().width(), newFrame.size().height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setFrame:display:animate:]} */
    public void setFrame(final NSRect frameRect, final boolean displayFlag, final boolean animateFlag) {
        try {
            MH_setFrame_display_animate_.invokeExact(this.handle, SEL_setFrame_display_animate_, frameRect.origin().x(), frameRect.origin().y(), frameRect.size().width(), frameRect.size().height(), displayFlag, animateFlag);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow displayIfNeeded]} */
    public void displayIfNeeded() {
        try {
            MH_displayIfNeeded.invokeExact(this.handle, SEL_displayIfNeeded);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow display]} */
    public void display() {
        try {
            MH_display.invokeExact(this.handle, SEL_display);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow update]} */
    public void update() {
        try {
            MH_update.invokeExact(this.handle, SEL_update);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow makeFirstResponder:]} */
    public boolean makeFirstResponder(@Nullable final NSResponder responder) {
        try {
            return (boolean) MH_makeFirstResponder_.invokeExact(this.handle, SEL_makeFirstResponder_, responder == null ? 0L : responder.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow close]} */
    public void close() {
        try {
            MH_close.invokeExact(this.handle, SEL_close);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow miniaturize:]} */
    public void miniaturize(@Nullable final NSObject sender) {
        try {
            MH_miniaturize_.invokeExact(this.handle, SEL_miniaturize_, sender == null ? 0L : sender.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow deminiaturize:]} */
    public void deminiaturize(@Nullable final NSObject sender) {
        try {
            MH_deminiaturize_.invokeExact(this.handle, SEL_deminiaturize_, sender == null ? 0L : sender.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow zoom:]} */
    public void zoom(@Nullable final NSObject sender) {
        try {
            MH_zoom_.invokeExact(this.handle, SEL_zoom_, sender == null ? 0L : sender.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow tryToPerform:with:]} */
    public boolean tryToPerform(final long action, @Nullable final NSObject object) {
        try {
            return (boolean) MH_tryToPerform_with_.invokeExact(this.handle, SEL_tryToPerform_with_, action, object == null ? 0L : object.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow validRequestorForSendType:returnType:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject validRequestorForSendType(@Nullable final String sendType, @Nullable final String returnType) {
        final long nsSendType = sendType == null ? 0L : ObjC.nsString(sendType);
        final long nsReturnType = returnType == null ? 0L : ObjC.nsString(returnType);
        try {
            long result = (long) MH_validRequestorForSendType_returnType_.invokeExact(this.handle, SEL_validRequestorForSendType_returnType_, nsSendType, nsReturnType);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsSendType);
            ObjC.release(nsReturnType);
        }
    }

    /** {@code -[NSWindow setContentBorderThickness:forEdge:]} */
    public void setContentBorderThickness(final double thickness, final NSRectEdge edge) {
        try {
            MH_setContentBorderThickness_forEdge_.invokeExact(this.handle, SEL_setContentBorderThickness_forEdge_, thickness, edge.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow contentBorderThicknessForEdge:]} */
    public double contentBorderThicknessForEdge(final NSRectEdge edge) {
        try {
            return (double) MH_contentBorderThicknessForEdge_.invokeExact(this.handle, SEL_contentBorderThicknessForEdge_, edge.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setAutorecalculatesContentBorderThickness:forEdge:]} */
    public void setAutorecalculatesContentBorderThickness(final boolean flag, final NSRectEdge edge) {
        try {
            MH_setAutorecalculatesContentBorderThickness_forEdge_.invokeExact(this.handle, SEL_setAutorecalculatesContentBorderThickness_forEdge_, flag, edge.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow autorecalculatesContentBorderThicknessForEdge:]} */
    public boolean autorecalculatesContentBorderThicknessForEdge(final NSRectEdge edge) {
        try {
            return (boolean) MH_autorecalculatesContentBorderThicknessForEdge_.invokeExact(this.handle, SEL_autorecalculatesContentBorderThicknessForEdge_, edge.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow center]} */
    public void center() {
        try {
            MH_center.invokeExact(this.handle, SEL_center);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow makeKeyAndOrderFront:]} */
    public void makeKeyAndOrderFront(@Nullable final NSObject sender) {
        try {
            MH_makeKeyAndOrderFront_.invokeExact(this.handle, SEL_makeKeyAndOrderFront_, sender == null ? 0L : sender.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow orderFront:]} */
    public void orderFront(@Nullable final NSObject sender) {
        try {
            MH_orderFront_.invokeExact(this.handle, SEL_orderFront_, sender == null ? 0L : sender.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow orderBack:]} */
    public void orderBack(@Nullable final NSObject sender) {
        try {
            MH_orderBack_.invokeExact(this.handle, SEL_orderBack_, sender == null ? 0L : sender.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow orderOut:]} */
    public void orderOut(@Nullable final NSObject sender) {
        try {
            MH_orderOut_.invokeExact(this.handle, SEL_orderOut_, sender == null ? 0L : sender.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow orderWindow:relativeTo:]} */
    public void orderWindow(final NSWindowOrderingMode place, final long otherWin) {
        try {
            MH_orderWindow_relativeTo_.invokeExact(this.handle, SEL_orderWindow_relativeTo_, place.value, otherWin);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow orderFrontRegardless]} */
    public void orderFrontRegardless() {
        try {
            MH_orderFrontRegardless.invokeExact(this.handle, SEL_orderFrontRegardless);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow makeKeyWindow]} */
    public void makeKeyWindow() {
        try {
            MH_makeKeyWindow.invokeExact(this.handle, SEL_makeKeyWindow);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow makeMainWindow]} */
    public void makeMainWindow() {
        try {
            MH_makeMainWindow.invokeExact(this.handle, SEL_makeMainWindow);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow becomeKeyWindow]} */
    public void becomeKeyWindow() {
        try {
            MH_becomeKeyWindow.invokeExact(this.handle, SEL_becomeKeyWindow);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow resignKeyWindow]} */
    public void resignKeyWindow() {
        try {
            MH_resignKeyWindow.invokeExact(this.handle, SEL_resignKeyWindow);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow becomeMainWindow]} */
    public void becomeMainWindow() {
        try {
            MH_becomeMainWindow.invokeExact(this.handle, SEL_becomeMainWindow);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow resignMainWindow]} */
    public void resignMainWindow() {
        try {
            MH_resignMainWindow.invokeExact(this.handle, SEL_resignMainWindow);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow convertRectToScreen:]} */
    public NSRect convertRectToScreen(final NSRect rect) {
        try (NativeStack stack = NativeStack.push()) {
            return NSRect.read((MemorySegment) MH_convertRectToScreen_.invokeExact((SegmentAllocator) stack, this.handle, SEL_convertRectToScreen_, rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow convertRectFromScreen:]} */
    public NSRect convertRectFromScreen(final NSRect rect) {
        try (NativeStack stack = NativeStack.push()) {
            return NSRect.read((MemorySegment) MH_convertRectFromScreen_.invokeExact((SegmentAllocator) stack, this.handle, SEL_convertRectFromScreen_, rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow convertPointToScreen:]} */
    public NSPoint convertPointToScreen(final NSPoint point) {
        try (NativeStack stack = NativeStack.push()) {
            return NSPoint.read((MemorySegment) MH_convertPointToScreen_.invokeExact((SegmentAllocator) stack, this.handle, SEL_convertPointToScreen_, point.x(), point.y()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow convertPointFromScreen:]} */
    public NSPoint convertPointFromScreen(final NSPoint point) {
        try (NativeStack stack = NativeStack.push()) {
            return NSPoint.read((MemorySegment) MH_convertPointFromScreen_.invokeExact((SegmentAllocator) stack, this.handle, SEL_convertPointFromScreen_, point.x(), point.y()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow convertRectToBacking:]} */
    public NSRect convertRectToBacking(final NSRect rect) {
        try (NativeStack stack = NativeStack.push()) {
            return NSRect.read((MemorySegment) MH_convertRectToBacking_.invokeExact((SegmentAllocator) stack, this.handle, SEL_convertRectToBacking_, rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow convertRectFromBacking:]} */
    public NSRect convertRectFromBacking(final NSRect rect) {
        try (NativeStack stack = NativeStack.push()) {
            return NSRect.read((MemorySegment) MH_convertRectFromBacking_.invokeExact((SegmentAllocator) stack, this.handle, SEL_convertRectFromBacking_, rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow convertPointToBacking:]} */
    public NSPoint convertPointToBacking(final NSPoint point) {
        try (NativeStack stack = NativeStack.push()) {
            return NSPoint.read((MemorySegment) MH_convertPointToBacking_.invokeExact((SegmentAllocator) stack, this.handle, SEL_convertPointToBacking_, point.x(), point.y()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow convertPointFromBacking:]} */
    public NSPoint convertPointFromBacking(final NSPoint point) {
        try (NativeStack stack = NativeStack.push()) {
            return NSPoint.read((MemorySegment) MH_convertPointFromBacking_.invokeExact((SegmentAllocator) stack, this.handle, SEL_convertPointFromBacking_, point.x(), point.y()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow backingAlignedRect:options:]}
     *
     * @param options a combination of {@link NSAlignmentOptions} flags
     */
    public NSRect backingAlignedRect(final NSRect rect, final long options) {
        try (NativeStack stack = NativeStack.push()) {
            return NSRect.read((MemorySegment) MH_backingAlignedRect_options_.invokeExact((SegmentAllocator) stack, this.handle, SEL_backingAlignedRect_options_, rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height(), options));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow performClose:]} */
    public void performClose(@Nullable final NSObject sender) {
        try {
            MH_performClose_.invokeExact(this.handle, SEL_performClose_, sender == null ? 0L : sender.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow performMiniaturize:]} */
    public void performMiniaturize(@Nullable final NSObject sender) {
        try {
            MH_performMiniaturize_.invokeExact(this.handle, SEL_performMiniaturize_, sender == null ? 0L : sender.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow performZoom:]} */
    public void performZoom(@Nullable final NSObject sender) {
        try {
            MH_performZoom_.invokeExact(this.handle, SEL_performZoom_, sender == null ? 0L : sender.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow dataWithEPSInsideRect:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSData dataWithEPSInsideRect(final NSRect rect) {
        try {
            long result = (long) MH_dataWithEPSInsideRect_.invokeExact(this.handle, SEL_dataWithEPSInsideRect_, rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height());
            return new NSData(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow dataWithPDFInsideRect:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSData dataWithPDFInsideRect(final NSRect rect) {
        try {
            long result = (long) MH_dataWithPDFInsideRect_.invokeExact(this.handle, SEL_dataWithPDFInsideRect_, rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height());
            return new NSData(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow print:]} */
    public void print(@Nullable final NSObject sender) {
        try {
            MH_print_.invokeExact(this.handle, SEL_print_, sender == null ? 0L : sender.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setDynamicDepthLimit:]} */
    public void setDynamicDepthLimit(final boolean flag) {
        try {
            MH_setDynamicDepthLimit_.invokeExact(this.handle, SEL_setDynamicDepthLimit_, flag);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow invalidateShadow]} */
    public void invalidateShadow() {
        try {
            MH_invalidateShadow.invokeExact(this.handle, SEL_invalidateShadow);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow toggleFullScreen:]} */
    public void toggleFullScreen(@Nullable final NSObject sender) {
        try {
            MH_toggleFullScreen_.invokeExact(this.handle, SEL_toggleFullScreen_, sender == null ? 0L : sender.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setFrameFromString:]} */
    public void setFrameFromString(final String string) {
        final long nsString = ObjC.nsString(string);
        try {
            MH_setFrameFromString_.invokeExact(this.handle, SEL_setFrameFromString_, nsString);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsString);
        }
    }

    /** {@code -[NSWindow saveFrameUsingName:]} */
    public void saveFrameUsingName(final String name) {
        final long nsName = ObjC.nsString(name);
        try {
            MH_saveFrameUsingName_.invokeExact(this.handle, SEL_saveFrameUsingName_, nsName);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsName);
        }
    }

    /** {@code -[NSWindow setFrameUsingName:force:]} */
    public boolean setFrameUsingName(final String name, final boolean force) {
        final long nsName = ObjC.nsString(name);
        try {
            return (boolean) MH_setFrameUsingName_force_.invokeExact(this.handle, SEL_setFrameUsingName_force_, nsName, force);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsName);
        }
    }

    /** {@code -[NSWindow setFrameUsingName:]} */
    public boolean setFrameUsingName(final String name) {
        final long nsName = ObjC.nsString(name);
        try {
            return (boolean) MH_setFrameUsingName_.invokeExact(this.handle, SEL_setFrameUsingName_, nsName);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsName);
        }
    }

    /** {@code -[NSWindow setFrameAutosaveName:]} */
    public boolean setFrameAutosaveName(final String name) {
        final long nsName = ObjC.nsString(name);
        try {
            return (boolean) MH_setFrameAutosaveName_.invokeExact(this.handle, SEL_setFrameAutosaveName_, nsName);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsName);
        }
    }

    /** {@code +[NSWindow removeFrameUsingName:]} */
    public static void removeFrameUsingName(final String name) {
        final long nsName = ObjC.nsString(name);
        try {
            MH_CLASS_removeFrameUsingName_.invokeExact(CLS, SEL_CLASS_removeFrameUsingName_, nsName);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsName);
        }
    }

    /** {@code -[NSWindow beginSheet:completionHandler:]} */
    public void beginSheet(final NSWindow sheetWindow, final long handler) {
        try {
            MH_beginSheet_completionHandler_.invokeExact(this.handle, SEL_beginSheet_completionHandler_, sheetWindow.handle(), handler);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow beginCriticalSheet:completionHandler:]} */
    public void beginCriticalSheet(final NSWindow sheetWindow, final long handler) {
        try {
            MH_beginCriticalSheet_completionHandler_.invokeExact(this.handle, SEL_beginCriticalSheet_completionHandler_, sheetWindow.handle(), handler);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow endSheet:]} */
    public void endSheet(final NSWindow sheetWindow) {
        try {
            MH_endSheet_.invokeExact(this.handle, SEL_endSheet_, sheetWindow.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow endSheet:returnCode:]} */
    public void endSheet(final NSWindow sheetWindow, final long returnCode) {
        try {
            MH_endSheet_returnCode_.invokeExact(this.handle, SEL_endSheet_returnCode_, sheetWindow.handle(), returnCode);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSWindow standardWindowButton:forStyleMask:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     *
     * @param styleMask a combination of {@link NSWindowStyleMask} flags
     */
    @Nullable
    public static NSObject standardWindowButton(final NSWindowButton b, final long styleMask) {
        try {
            long result = (long) MH_CLASS_standardWindowButton_forStyleMask_.invokeExact(CLS, SEL_CLASS_standardWindowButton_forStyleMask_, b.value, styleMask);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow standardWindowButton:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject standardWindowButton(final NSWindowButton b) {
        try {
            long result = (long) MH_standardWindowButton_.invokeExact(this.handle, SEL_standardWindowButton_, b.value);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow addChildWindow:ordered:]} */
    public void addChildWindow(final NSWindow childWin, final NSWindowOrderingMode place) {
        try {
            MH_addChildWindow_ordered_.invokeExact(this.handle, SEL_addChildWindow_ordered_, childWin.handle(), place.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow removeChildWindow:]} */
    public void removeChildWindow(final NSWindow childWin) {
        try {
            MH_removeChildWindow_.invokeExact(this.handle, SEL_removeChildWindow_, childWin.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow canRepresentDisplayGamut:]} */
    public boolean canRepresentDisplayGamut(final NSDisplayGamut displayGamut) {
        try {
            return (boolean) MH_canRepresentDisplayGamut_.invokeExact(this.handle, SEL_canRepresentDisplayGamut_, displayGamut.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code +[NSWindow windowNumbersWithOptions:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     *
     * @param options a combination of {@link NSWindowNumberListOptions} flags
     */
    @Nullable
    public static NSArray<NSNumber> windowNumbers(final long options) {
        try {
            long result = (long) MH_CLASS_windowNumbersWithOptions_.invokeExact(CLS, SEL_CLASS_windowNumbersWithOptions_, options);
            return result == 0L ? null : new NSArray<>(result, NSNumber::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSWindow windowNumberAtPoint:belowWindowWithWindowNumber:]} */
    public static long windowNumberAtPoint(final NSPoint point, final long windowNumber) {
        try {
            return (long) MH_CLASS_windowNumberAtPoint_belowWindowWithWindowNumber_.invokeExact(CLS, SEL_CLASS_windowNumberAtPoint_belowWindowWithWindowNumber_, point.x(), point.y(), windowNumber);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSWindow windowWithContentViewController:]} */
    public static NSWindow window(final NSObject contentViewController) {
        try {
            long result = (long) MH_CLASS_windowWithContentViewController_.invokeExact(CLS, SEL_CLASS_windowWithContentViewController_, contentViewController.handle());
            return new NSWindow(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow performWindowDragWithEvent:]} */
    public void performWindowDrag(final NSObject event) {
        try {
            MH_performWindowDragWithEvent_.invokeExact(this.handle, SEL_performWindowDragWithEvent_, event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow selectNextKeyView:]} */
    public void selectNextKeyView(@Nullable final NSObject sender) {
        try {
            MH_selectNextKeyView_.invokeExact(this.handle, SEL_selectNextKeyView_, sender == null ? 0L : sender.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow selectPreviousKeyView:]} */
    public void selectPreviousKeyView(@Nullable final NSObject sender) {
        try {
            MH_selectPreviousKeyView_.invokeExact(this.handle, SEL_selectPreviousKeyView_, sender == null ? 0L : sender.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow selectKeyViewFollowingView:]} */
    public void selectKeyViewFollowingView(final NSView view) {
        try {
            MH_selectKeyViewFollowingView_.invokeExact(this.handle, SEL_selectKeyViewFollowingView_, view.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow selectKeyViewPrecedingView:]} */
    public void selectKeyViewPrecedingView(final NSView view) {
        try {
            MH_selectKeyViewPrecedingView_.invokeExact(this.handle, SEL_selectKeyViewPrecedingView_, view.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow disableKeyEquivalentForDefaultButtonCell]} */
    public void disableKeyEquivalentForDefaultButtonCell() {
        try {
            MH_disableKeyEquivalentForDefaultButtonCell.invokeExact(this.handle, SEL_disableKeyEquivalentForDefaultButtonCell);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow enableKeyEquivalentForDefaultButtonCell]} */
    public void enableKeyEquivalentForDefaultButtonCell() {
        try {
            MH_enableKeyEquivalentForDefaultButtonCell.invokeExact(this.handle, SEL_enableKeyEquivalentForDefaultButtonCell);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow recalculateKeyViewLoop]} */
    public void recalculateKeyViewLoop() {
        try {
            MH_recalculateKeyViewLoop.invokeExact(this.handle, SEL_recalculateKeyViewLoop);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow toggleToolbarShown:]} */
    public void toggleToolbarShown(@Nullable final NSObject sender) {
        try {
            MH_toggleToolbarShown_.invokeExact(this.handle, SEL_toggleToolbarShown_, sender == null ? 0L : sender.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow runToolbarCustomizationPalette:]} */
    public void runToolbarCustomizationPalette(@Nullable final NSObject sender) {
        try {
            MH_runToolbarCustomizationPalette_.invokeExact(this.handle, SEL_runToolbarCustomizationPalette_, sender == null ? 0L : sender.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow selectNextTab:]} */
    public void selectNextTab(@Nullable final NSObject sender) {
        try {
            MH_selectNextTab_.invokeExact(this.handle, SEL_selectNextTab_, sender == null ? 0L : sender.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow selectPreviousTab:]} */
    public void selectPreviousTab(@Nullable final NSObject sender) {
        try {
            MH_selectPreviousTab_.invokeExact(this.handle, SEL_selectPreviousTab_, sender == null ? 0L : sender.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow moveTabToNewWindow:]} */
    public void moveTabToNewWindow(@Nullable final NSObject sender) {
        try {
            MH_moveTabToNewWindow_.invokeExact(this.handle, SEL_moveTabToNewWindow_, sender == null ? 0L : sender.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow mergeAllWindows:]} */
    public void mergeAllWindows(@Nullable final NSObject sender) {
        try {
            MH_mergeAllWindows_.invokeExact(this.handle, SEL_mergeAllWindows_, sender == null ? 0L : sender.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow toggleTabBar:]} */
    public void toggleTabBar(@Nullable final NSObject sender) {
        try {
            MH_toggleTabBar_.invokeExact(this.handle, SEL_toggleTabBar_, sender == null ? 0L : sender.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow toggleTabOverview:]} */
    public void toggleTabOverview(@Nullable final NSObject sender) {
        try {
            MH_toggleTabOverview_.invokeExact(this.handle, SEL_toggleTabOverview_, sender == null ? 0L : sender.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow addTabbedWindow:ordered:]} */
    public void addTabbedWindow(final NSWindow window, final NSWindowOrderingMode ordered) {
        try {
            MH_addTabbedWindow_ordered_.invokeExact(this.handle, SEL_addTabbedWindow_ordered_, window.handle(), ordered.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow transferWindowSharingToWindow:completionHandler:]} */
    public void transferWindowSharingToWindow(final NSWindow window, final long completionHandler) {
        try {
            MH_transferWindowSharingToWindow_completionHandler_.invokeExact(this.handle, SEL_transferWindowSharingToWindow_completionHandler_, window.handle(), completionHandler);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow requestSharingOfWindow:completionHandler:]} */
    public void requestSharingOfWindow(final NSWindow window, final long completionHandler) {
        try {
            MH_requestSharingOfWindow_completionHandler_.invokeExact(this.handle, SEL_requestSharingOfWindow_completionHandler_, window.handle(), completionHandler);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow requestSharingOfWindowUsingPreview:title:completionHandler:]} */
    public void requestSharingOfWindowUsingPreview(final NSObject image, final String title, final long completionHandler) {
        final long nsTitle = ObjC.nsString(title);
        try {
            MH_requestSharingOfWindowUsingPreview_title_completionHandler_.invokeExact(this.handle, SEL_requestSharingOfWindowUsingPreview_title_completionHandler_, image.handle(), nsTitle, completionHandler);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsTitle);
        }
    }

    /** {@code +[NSWindow defaultDepthLimit]} */
    public static NSWindowDepth defaultDepthLimit() {
        try {
            return NSWindowDepth.of((int) MH_CLASS_defaultDepthLimit.invokeExact(CLS, SEL_CLASS_defaultDepthLimit));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow title]} */
    public String title() {
        try {
            long result = (long) MH_title.invokeExact(this.handle, SEL_title);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setTitle:]} */
    public void setTitle(final String title) {
        final long nsTitle = ObjC.nsString(title);
        try {
            MH_setTitle_.invokeExact(this.handle, SEL_setTitle_, nsTitle);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsTitle);
        }
    }

    /** {@code -[NSWindow subtitle]} */
    @Nullable
    public String subtitle() {
        try {
            long result = (long) MH_subtitle.invokeExact(this.handle, SEL_subtitle);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setSubtitle:]} */
    public void setSubtitle(@Nullable final String subtitle) {
        final long nsSubtitle = subtitle == null ? 0L : ObjC.nsString(subtitle);
        try {
            MH_setSubtitle_.invokeExact(this.handle, SEL_setSubtitle_, nsSubtitle);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsSubtitle);
        }
    }

    /** {@code -[NSWindow titleVisibility]} */
    public NSWindowTitleVisibility titleVisibility() {
        try {
            return NSWindowTitleVisibility.of((long) MH_titleVisibility.invokeExact(this.handle, SEL_titleVisibility));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setTitleVisibility:]} */
    public void setTitleVisibility(final NSWindowTitleVisibility titleVisibility) {
        try {
            MH_setTitleVisibility_.invokeExact(this.handle, SEL_setTitleVisibility_, titleVisibility.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow titlebarAppearsTransparent]} */
    public boolean titlebarAppearsTransparent() {
        try {
            return (boolean) MH_titlebarAppearsTransparent.invokeExact(this.handle, SEL_titlebarAppearsTransparent);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setTitlebarAppearsTransparent:]} */
    public void setTitlebarAppearsTransparent(final boolean titlebarAppearsTransparent) {
        try {
            MH_setTitlebarAppearsTransparent_.invokeExact(this.handle, SEL_setTitlebarAppearsTransparent_, titlebarAppearsTransparent);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow toolbarStyle]} */
    public NSWindowToolbarStyle toolbarStyle() {
        try {
            return NSWindowToolbarStyle.of((long) MH_toolbarStyle.invokeExact(this.handle, SEL_toolbarStyle));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setToolbarStyle:]} */
    public void setToolbarStyle(final NSWindowToolbarStyle toolbarStyle) {
        try {
            MH_setToolbarStyle_.invokeExact(this.handle, SEL_setToolbarStyle_, toolbarStyle.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow contentLayoutRect]} */
    public NSRect contentLayoutRect() {
        try (NativeStack stack = NativeStack.push()) {
            return NSRect.read((MemorySegment) MH_contentLayoutRect.invokeExact((SegmentAllocator) stack, this.handle, SEL_contentLayoutRect));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow contentLayoutGuide]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject contentLayoutGuide() {
        try {
            long result = (long) MH_contentLayoutGuide.invokeExact(this.handle, SEL_contentLayoutGuide);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow titlebarAccessoryViewControllers]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<NSObject> titlebarAccessoryViewControllers() {
        try {
            long result = (long) MH_titlebarAccessoryViewControllers.invokeExact(this.handle, SEL_titlebarAccessoryViewControllers);
            return result == 0L ? null : new NSArray<>(result, NSObject::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setTitlebarAccessoryViewControllers:]} */
    public void setTitlebarAccessoryViewControllers(@Nullable final NSArray<NSObject> titlebarAccessoryViewControllers) {
        try {
            MH_setTitlebarAccessoryViewControllers_.invokeExact(this.handle, SEL_setTitlebarAccessoryViewControllers_, titlebarAccessoryViewControllers == null ? 0L : titlebarAccessoryViewControllers.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow representedURL]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSURL representedURL() {
        try {
            long result = (long) MH_representedURL.invokeExact(this.handle, SEL_representedURL);
            return result == 0L ? null : new NSURL(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setRepresentedURL:]} */
    public void setRepresentedURL(@Nullable final NSURL representedURL) {
        try {
            MH_setRepresentedURL_.invokeExact(this.handle, SEL_setRepresentedURL_, representedURL == null ? 0L : representedURL.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow representedFilename]} */
    public String representedFilename() {
        try {
            long result = (long) MH_representedFilename.invokeExact(this.handle, SEL_representedFilename);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setRepresentedFilename:]} */
    public void setRepresentedFilename(final String representedFilename) {
        final long nsRepresentedFilename = ObjC.nsString(representedFilename);
        try {
            MH_setRepresentedFilename_.invokeExact(this.handle, SEL_setRepresentedFilename_, nsRepresentedFilename);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsRepresentedFilename);
        }
    }

    /** {@code -[NSWindow isExcludedFromWindowsMenu]} */
    public boolean isExcludedFromWindowsMenu() {
        try {
            return (boolean) MH_isExcludedFromWindowsMenu.invokeExact(this.handle, SEL_isExcludedFromWindowsMenu);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setExcludedFromWindowsMenu:]} */
    public void setExcludedFromWindowsMenu(final boolean excludedFromWindowsMenu) {
        try {
            MH_setExcludedFromWindowsMenu_.invokeExact(this.handle, SEL_setExcludedFromWindowsMenu_, excludedFromWindowsMenu);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow contentView]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSView contentView() {
        try {
            long result = (long) MH_contentView.invokeExact(this.handle, SEL_contentView);
            return result == 0L ? null : new NSView(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setContentView:]} */
    public void setContentView(@Nullable final NSView contentView) {
        try {
            MH_setContentView_.invokeExact(this.handle, SEL_setContentView_, contentView == null ? 0L : contentView.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow delegate]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject delegate() {
        try {
            long result = (long) MH_delegate.invokeExact(this.handle, SEL_delegate);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setDelegate:]} */
    public void setDelegate(@Nullable final NSObject delegate) {
        try {
            MH_setDelegate_.invokeExact(this.handle, SEL_setDelegate_, delegate == null ? 0L : delegate.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow windowNumber]} */
    public long windowNumber() {
        try {
            return (long) MH_windowNumber.invokeExact(this.handle, SEL_windowNumber);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow styleMask]}
     *
     * @return a combination of {@link NSWindowStyleMask} flags
     */
    public long styleMask() {
        try {
            return (long) MH_styleMask.invokeExact(this.handle, SEL_styleMask);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow setStyleMask:]}
     *
     * @param styleMask a combination of {@link NSWindowStyleMask} flags
     */
    public void setStyleMask(final long styleMask) {
        try {
            MH_setStyleMask_.invokeExact(this.handle, SEL_setStyleMask_, styleMask);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow cascadingReferenceFrame]} */
    public NSRect cascadingReferenceFrame() {
        try (NativeStack stack = NativeStack.push()) {
            return NSRect.read((MemorySegment) MH_cascadingReferenceFrame.invokeExact((SegmentAllocator) stack, this.handle, SEL_cascadingReferenceFrame));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow frame]} */
    public NSRect frame() {
        try (NativeStack stack = NativeStack.push()) {
            return NSRect.read((MemorySegment) MH_frame.invokeExact((SegmentAllocator) stack, this.handle, SEL_frame));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow inLiveResize]} */
    public boolean inLiveResize() {
        try {
            return (boolean) MH_inLiveResize.invokeExact(this.handle, SEL_inLiveResize);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow resizeIncrements]} */
    public NSSize resizeIncrements() {
        try (NativeStack stack = NativeStack.push()) {
            return NSSize.read((MemorySegment) MH_resizeIncrements.invokeExact((SegmentAllocator) stack, this.handle, SEL_resizeIncrements));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setResizeIncrements:]} */
    public void setResizeIncrements(final NSSize resizeIncrements) {
        try {
            MH_setResizeIncrements_.invokeExact(this.handle, SEL_setResizeIncrements_, resizeIncrements.width(), resizeIncrements.height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow aspectRatio]} */
    public NSSize aspectRatio() {
        try (NativeStack stack = NativeStack.push()) {
            return NSSize.read((MemorySegment) MH_aspectRatio.invokeExact((SegmentAllocator) stack, this.handle, SEL_aspectRatio));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setAspectRatio:]} */
    public void setAspectRatio(final NSSize aspectRatio) {
        try {
            MH_setAspectRatio_.invokeExact(this.handle, SEL_setAspectRatio_, aspectRatio.width(), aspectRatio.height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow contentResizeIncrements]} */
    public NSSize contentResizeIncrements() {
        try (NativeStack stack = NativeStack.push()) {
            return NSSize.read((MemorySegment) MH_contentResizeIncrements.invokeExact((SegmentAllocator) stack, this.handle, SEL_contentResizeIncrements));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setContentResizeIncrements:]} */
    public void setContentResizeIncrements(final NSSize contentResizeIncrements) {
        try {
            MH_setContentResizeIncrements_.invokeExact(this.handle, SEL_setContentResizeIncrements_, contentResizeIncrements.width(), contentResizeIncrements.height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow contentAspectRatio]} */
    public NSSize contentAspectRatio() {
        try (NativeStack stack = NativeStack.push()) {
            return NSSize.read((MemorySegment) MH_contentAspectRatio.invokeExact((SegmentAllocator) stack, this.handle, SEL_contentAspectRatio));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setContentAspectRatio:]} */
    public void setContentAspectRatio(final NSSize contentAspectRatio) {
        try {
            MH_setContentAspectRatio_.invokeExact(this.handle, SEL_setContentAspectRatio_, contentAspectRatio.width(), contentAspectRatio.height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow viewsNeedDisplay]} */
    public boolean viewsNeedDisplay() {
        try {
            return (boolean) MH_viewsNeedDisplay.invokeExact(this.handle, SEL_viewsNeedDisplay);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setViewsNeedDisplay:]} */
    public void setViewsNeedDisplay(final boolean viewsNeedDisplay) {
        try {
            MH_setViewsNeedDisplay_.invokeExact(this.handle, SEL_setViewsNeedDisplay_, viewsNeedDisplay);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow preservesContentDuringLiveResize]} */
    public boolean preservesContentDuringLiveResize() {
        try {
            return (boolean) MH_preservesContentDuringLiveResize.invokeExact(this.handle, SEL_preservesContentDuringLiveResize);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setPreservesContentDuringLiveResize:]} */
    public void setPreservesContentDuringLiveResize(final boolean preservesContentDuringLiveResize) {
        try {
            MH_setPreservesContentDuringLiveResize_.invokeExact(this.handle, SEL_setPreservesContentDuringLiveResize_, preservesContentDuringLiveResize);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow firstResponder]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSResponder firstResponder() {
        try {
            long result = (long) MH_firstResponder.invokeExact(this.handle, SEL_firstResponder);
            return result == 0L ? null : new NSResponder(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow resizeFlags]}
     *
     * @return a combination of {@link NSEventModifierFlags} flags
     */
    public long resizeFlags() {
        try {
            return (long) MH_resizeFlags.invokeExact(this.handle, SEL_resizeFlags);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow isReleasedWhenClosed]} */
    public boolean isReleasedWhenClosed() {
        try {
            return (boolean) MH_isReleasedWhenClosed.invokeExact(this.handle, SEL_isReleasedWhenClosed);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setReleasedWhenClosed:]} */
    public void setReleasedWhenClosed(final boolean releasedWhenClosed) {
        try {
            MH_setReleasedWhenClosed_.invokeExact(this.handle, SEL_setReleasedWhenClosed_, releasedWhenClosed);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow isZoomed]} */
    public boolean isZoomed() {
        try {
            return (boolean) MH_isZoomed.invokeExact(this.handle, SEL_isZoomed);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow isMiniaturized]} */
    public boolean isMiniaturized() {
        try {
            return (boolean) MH_isMiniaturized.invokeExact(this.handle, SEL_isMiniaturized);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow backgroundColor]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSObject backgroundColor() {
        try {
            long result = (long) MH_backgroundColor.invokeExact(this.handle, SEL_backgroundColor);
            return new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setBackgroundColor:]} */
    public void setBackgroundColor(@Nullable final NSObject backgroundColor) {
        try {
            MH_setBackgroundColor_.invokeExact(this.handle, SEL_setBackgroundColor_, backgroundColor == null ? 0L : backgroundColor.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow isMovable]} */
    public boolean isMovable() {
        try {
            return (boolean) MH_isMovable.invokeExact(this.handle, SEL_isMovable);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setMovable:]} */
    public void setMovable(final boolean movable) {
        try {
            MH_setMovable_.invokeExact(this.handle, SEL_setMovable_, movable);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow isMovableByWindowBackground]} */
    public boolean isMovableByWindowBackground() {
        try {
            return (boolean) MH_isMovableByWindowBackground.invokeExact(this.handle, SEL_isMovableByWindowBackground);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setMovableByWindowBackground:]} */
    public void setMovableByWindowBackground(final boolean movableByWindowBackground) {
        try {
            MH_setMovableByWindowBackground_.invokeExact(this.handle, SEL_setMovableByWindowBackground_, movableByWindowBackground);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow hidesOnDeactivate]} */
    public boolean hidesOnDeactivate() {
        try {
            return (boolean) MH_hidesOnDeactivate.invokeExact(this.handle, SEL_hidesOnDeactivate);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setHidesOnDeactivate:]} */
    public void setHidesOnDeactivate(final boolean hidesOnDeactivate) {
        try {
            MH_setHidesOnDeactivate_.invokeExact(this.handle, SEL_setHidesOnDeactivate_, hidesOnDeactivate);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow canHide]} */
    public boolean canHide() {
        try {
            return (boolean) MH_canHide.invokeExact(this.handle, SEL_canHide);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setCanHide:]} */
    public void setCanHide(final boolean canHide) {
        try {
            MH_setCanHide_.invokeExact(this.handle, SEL_setCanHide_, canHide);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow miniwindowImage]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject miniwindowImage() {
        try {
            long result = (long) MH_miniwindowImage.invokeExact(this.handle, SEL_miniwindowImage);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setMiniwindowImage:]} */
    public void setMiniwindowImage(@Nullable final NSObject miniwindowImage) {
        try {
            MH_setMiniwindowImage_.invokeExact(this.handle, SEL_setMiniwindowImage_, miniwindowImage == null ? 0L : miniwindowImage.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow miniwindowTitle]} */
    public String miniwindowTitle() {
        try {
            long result = (long) MH_miniwindowTitle.invokeExact(this.handle, SEL_miniwindowTitle);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setMiniwindowTitle:]} */
    public void setMiniwindowTitle(@Nullable final String miniwindowTitle) {
        final long nsMiniwindowTitle = miniwindowTitle == null ? 0L : ObjC.nsString(miniwindowTitle);
        try {
            MH_setMiniwindowTitle_.invokeExact(this.handle, SEL_setMiniwindowTitle_, nsMiniwindowTitle);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsMiniwindowTitle);
        }
    }

    /**
     * {@code -[NSWindow dockTile]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject dockTile() {
        try {
            long result = (long) MH_dockTile.invokeExact(this.handle, SEL_dockTile);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow isDocumentEdited]} */
    public boolean isDocumentEdited() {
        try {
            return (boolean) MH_isDocumentEdited.invokeExact(this.handle, SEL_isDocumentEdited);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setDocumentEdited:]} */
    public void setDocumentEdited(final boolean documentEdited) {
        try {
            MH_setDocumentEdited_.invokeExact(this.handle, SEL_setDocumentEdited_, documentEdited);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow isVisible]} */
    public boolean isVisible() {
        try {
            return (boolean) MH_isVisible.invokeExact(this.handle, SEL_isVisible);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow isKeyWindow]} */
    public boolean isKeyWindow() {
        try {
            return (boolean) MH_isKeyWindow.invokeExact(this.handle, SEL_isKeyWindow);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow isMainWindow]} */
    public boolean isMainWindow() {
        try {
            return (boolean) MH_isMainWindow.invokeExact(this.handle, SEL_isMainWindow);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow canBecomeKeyWindow]} */
    public boolean canBecomeKeyWindow() {
        try {
            return (boolean) MH_canBecomeKeyWindow.invokeExact(this.handle, SEL_canBecomeKeyWindow);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow canBecomeMainWindow]} */
    public boolean canBecomeMainWindow() {
        try {
            return (boolean) MH_canBecomeMainWindow.invokeExact(this.handle, SEL_canBecomeMainWindow);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow worksWhenModal]} */
    public boolean worksWhenModal() {
        try {
            return (boolean) MH_worksWhenModal.invokeExact(this.handle, SEL_worksWhenModal);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow preventsApplicationTerminationWhenModal]} */
    public boolean preventsApplicationTerminationWhenModal() {
        try {
            return (boolean) MH_preventsApplicationTerminationWhenModal.invokeExact(this.handle, SEL_preventsApplicationTerminationWhenModal);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setPreventsApplicationTerminationWhenModal:]} */
    public void setPreventsApplicationTerminationWhenModal(final boolean preventsApplicationTerminationWhenModal) {
        try {
            MH_setPreventsApplicationTerminationWhenModal_.invokeExact(this.handle, SEL_setPreventsApplicationTerminationWhenModal_, preventsApplicationTerminationWhenModal);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow backingScaleFactor]} */
    public double backingScaleFactor() {
        try {
            return (double) MH_backingScaleFactor.invokeExact(this.handle, SEL_backingScaleFactor);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow allowsToolTipsWhenApplicationIsInactive]} */
    public boolean allowsToolTipsWhenApplicationIsInactive() {
        try {
            return (boolean) MH_allowsToolTipsWhenApplicationIsInactive.invokeExact(this.handle, SEL_allowsToolTipsWhenApplicationIsInactive);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setAllowsToolTipsWhenApplicationIsInactive:]} */
    public void setAllowsToolTipsWhenApplicationIsInactive(final boolean allowsToolTipsWhenApplicationIsInactive) {
        try {
            MH_setAllowsToolTipsWhenApplicationIsInactive_.invokeExact(this.handle, SEL_setAllowsToolTipsWhenApplicationIsInactive_, allowsToolTipsWhenApplicationIsInactive);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow backingType]} */
    public NSBackingStoreType backingType() {
        try {
            return NSBackingStoreType.of((long) MH_backingType.invokeExact(this.handle, SEL_backingType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setBackingType:]} */
    public void setBackingType(final NSBackingStoreType backingType) {
        try {
            MH_setBackingType_.invokeExact(this.handle, SEL_setBackingType_, backingType.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow level]} */
    public long level() {
        try {
            return (long) MH_level.invokeExact(this.handle, SEL_level);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setLevel:]} */
    public void setLevel(final long level) {
        try {
            MH_setLevel_.invokeExact(this.handle, SEL_setLevel_, level);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow depthLimit]} */
    public NSWindowDepth depthLimit() {
        try {
            return NSWindowDepth.of((int) MH_depthLimit.invokeExact(this.handle, SEL_depthLimit));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setDepthLimit:]} */
    public void setDepthLimit(final NSWindowDepth depthLimit) {
        try {
            MH_setDepthLimit_.invokeExact(this.handle, SEL_setDepthLimit_, (int) depthLimit.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow hasDynamicDepthLimit]} */
    public boolean hasDynamicDepthLimit() {
        try {
            return (boolean) MH_hasDynamicDepthLimit.invokeExact(this.handle, SEL_hasDynamicDepthLimit);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow screen]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject screen() {
        try {
            long result = (long) MH_screen.invokeExact(this.handle, SEL_screen);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow deepestScreen]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject deepestScreen() {
        try {
            long result = (long) MH_deepestScreen.invokeExact(this.handle, SEL_deepestScreen);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow hasShadow]} */
    public boolean hasShadow() {
        try {
            return (boolean) MH_hasShadow.invokeExact(this.handle, SEL_hasShadow);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setHasShadow:]} */
    public void setHasShadow(final boolean hasShadow) {
        try {
            MH_setHasShadow_.invokeExact(this.handle, SEL_setHasShadow_, hasShadow);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow alphaValue]} */
    public double alphaValue() {
        try {
            return (double) MH_alphaValue.invokeExact(this.handle, SEL_alphaValue);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setAlphaValue:]} */
    public void setAlphaValue(final double alphaValue) {
        try {
            MH_setAlphaValue_.invokeExact(this.handle, SEL_setAlphaValue_, alphaValue);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow isOpaque]} */
    public boolean isOpaque() {
        try {
            return (boolean) MH_isOpaque.invokeExact(this.handle, SEL_isOpaque);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setOpaque:]} */
    public void setOpaque(final boolean opaque) {
        try {
            MH_setOpaque_.invokeExact(this.handle, SEL_setOpaque_, opaque);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow sharingType]} */
    public NSWindowSharingType sharingType() {
        try {
            return NSWindowSharingType.of((long) MH_sharingType.invokeExact(this.handle, SEL_sharingType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setSharingType:]} */
    public void setSharingType(final NSWindowSharingType sharingType) {
        try {
            MH_setSharingType_.invokeExact(this.handle, SEL_setSharingType_, sharingType.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow allowsConcurrentViewDrawing]} */
    public boolean allowsConcurrentViewDrawing() {
        try {
            return (boolean) MH_allowsConcurrentViewDrawing.invokeExact(this.handle, SEL_allowsConcurrentViewDrawing);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setAllowsConcurrentViewDrawing:]} */
    public void setAllowsConcurrentViewDrawing(final boolean allowsConcurrentViewDrawing) {
        try {
            MH_setAllowsConcurrentViewDrawing_.invokeExact(this.handle, SEL_setAllowsConcurrentViewDrawing_, allowsConcurrentViewDrawing);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow displaysWhenScreenProfileChanges]} */
    public boolean displaysWhenScreenProfileChanges() {
        try {
            return (boolean) MH_displaysWhenScreenProfileChanges.invokeExact(this.handle, SEL_displaysWhenScreenProfileChanges);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setDisplaysWhenScreenProfileChanges:]} */
    public void setDisplaysWhenScreenProfileChanges(final boolean displaysWhenScreenProfileChanges) {
        try {
            MH_setDisplaysWhenScreenProfileChanges_.invokeExact(this.handle, SEL_setDisplaysWhenScreenProfileChanges_, displaysWhenScreenProfileChanges);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow canBecomeVisibleWithoutLogin]} */
    public boolean canBecomeVisibleWithoutLogin() {
        try {
            return (boolean) MH_canBecomeVisibleWithoutLogin.invokeExact(this.handle, SEL_canBecomeVisibleWithoutLogin);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setCanBecomeVisibleWithoutLogin:]} */
    public void setCanBecomeVisibleWithoutLogin(final boolean canBecomeVisibleWithoutLogin) {
        try {
            MH_setCanBecomeVisibleWithoutLogin_.invokeExact(this.handle, SEL_setCanBecomeVisibleWithoutLogin_, canBecomeVisibleWithoutLogin);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow collectionBehavior]}
     *
     * @return a combination of {@link NSWindowCollectionBehavior} flags
     */
    public long collectionBehavior() {
        try {
            return (long) MH_collectionBehavior.invokeExact(this.handle, SEL_collectionBehavior);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow setCollectionBehavior:]}
     *
     * @param collectionBehavior a combination of {@link NSWindowCollectionBehavior} flags
     */
    public void setCollectionBehavior(final long collectionBehavior) {
        try {
            MH_setCollectionBehavior_.invokeExact(this.handle, SEL_setCollectionBehavior_, collectionBehavior);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow animationBehavior]} */
    public NSWindowAnimationBehavior animationBehavior() {
        try {
            return NSWindowAnimationBehavior.of((long) MH_animationBehavior.invokeExact(this.handle, SEL_animationBehavior));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setAnimationBehavior:]} */
    public void setAnimationBehavior(final NSWindowAnimationBehavior animationBehavior) {
        try {
            MH_setAnimationBehavior_.invokeExact(this.handle, SEL_setAnimationBehavior_, animationBehavior.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow isOnActiveSpace]} */
    public boolean isOnActiveSpace() {
        try {
            return (boolean) MH_isOnActiveSpace.invokeExact(this.handle, SEL_isOnActiveSpace);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow stringWithSavedFrame]} */
    public String stringWithSavedFrame() {
        try {
            long result = (long) MH_stringWithSavedFrame.invokeExact(this.handle, SEL_stringWithSavedFrame);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow frameAutosaveName]} */
    public String frameAutosaveName() {
        try {
            long result = (long) MH_frameAutosaveName.invokeExact(this.handle, SEL_frameAutosaveName);
            return ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow minSize]} */
    public NSSize minSize() {
        try (NativeStack stack = NativeStack.push()) {
            return NSSize.read((MemorySegment) MH_minSize.invokeExact((SegmentAllocator) stack, this.handle, SEL_minSize));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setMinSize:]} */
    public void setMinSize(final NSSize minSize) {
        try {
            MH_setMinSize_.invokeExact(this.handle, SEL_setMinSize_, minSize.width(), minSize.height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow maxSize]} */
    public NSSize maxSize() {
        try (NativeStack stack = NativeStack.push()) {
            return NSSize.read((MemorySegment) MH_maxSize.invokeExact((SegmentAllocator) stack, this.handle, SEL_maxSize));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setMaxSize:]} */
    public void setMaxSize(final NSSize maxSize) {
        try {
            MH_setMaxSize_.invokeExact(this.handle, SEL_setMaxSize_, maxSize.width(), maxSize.height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow contentMinSize]} */
    public NSSize contentMinSize() {
        try (NativeStack stack = NativeStack.push()) {
            return NSSize.read((MemorySegment) MH_contentMinSize.invokeExact((SegmentAllocator) stack, this.handle, SEL_contentMinSize));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setContentMinSize:]} */
    public void setContentMinSize(final NSSize contentMinSize) {
        try {
            MH_setContentMinSize_.invokeExact(this.handle, SEL_setContentMinSize_, contentMinSize.width(), contentMinSize.height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow contentMaxSize]} */
    public NSSize contentMaxSize() {
        try (NativeStack stack = NativeStack.push()) {
            return NSSize.read((MemorySegment) MH_contentMaxSize.invokeExact((SegmentAllocator) stack, this.handle, SEL_contentMaxSize));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setContentMaxSize:]} */
    public void setContentMaxSize(final NSSize contentMaxSize) {
        try {
            MH_setContentMaxSize_.invokeExact(this.handle, SEL_setContentMaxSize_, contentMaxSize.width(), contentMaxSize.height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow minFullScreenContentSize]} */
    public NSSize minFullScreenContentSize() {
        try (NativeStack stack = NativeStack.push()) {
            return NSSize.read((MemorySegment) MH_minFullScreenContentSize.invokeExact((SegmentAllocator) stack, this.handle, SEL_minFullScreenContentSize));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setMinFullScreenContentSize:]} */
    public void setMinFullScreenContentSize(final NSSize minFullScreenContentSize) {
        try {
            MH_setMinFullScreenContentSize_.invokeExact(this.handle, SEL_setMinFullScreenContentSize_, minFullScreenContentSize.width(), minFullScreenContentSize.height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow maxFullScreenContentSize]} */
    public NSSize maxFullScreenContentSize() {
        try (NativeStack stack = NativeStack.push()) {
            return NSSize.read((MemorySegment) MH_maxFullScreenContentSize.invokeExact((SegmentAllocator) stack, this.handle, SEL_maxFullScreenContentSize));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setMaxFullScreenContentSize:]} */
    public void setMaxFullScreenContentSize(final NSSize maxFullScreenContentSize) {
        try {
            MH_setMaxFullScreenContentSize_.invokeExact(this.handle, SEL_setMaxFullScreenContentSize_, maxFullScreenContentSize.width(), maxFullScreenContentSize.height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow deviceDescription]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSDictionary<NSObject, NSObject> deviceDescription() {
        try {
            long result = (long) MH_deviceDescription.invokeExact(this.handle, SEL_deviceDescription);
            return new NSDictionary<>(result, NSObject::new, NSObject::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow windowController]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject windowController() {
        try {
            long result = (long) MH_windowController.invokeExact(this.handle, SEL_windowController);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setWindowController:]} */
    public void setWindowController(@Nullable final NSObject windowController) {
        try {
            MH_setWindowController_.invokeExact(this.handle, SEL_setWindowController_, windowController == null ? 0L : windowController.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow sheets]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<NSWindow> sheets() {
        try {
            long result = (long) MH_sheets.invokeExact(this.handle, SEL_sheets);
            return result == 0L ? null : new NSArray<>(result, NSWindow::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow attachedSheet]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSWindow attachedSheet() {
        try {
            long result = (long) MH_attachedSheet.invokeExact(this.handle, SEL_attachedSheet);
            return result == 0L ? null : new NSWindow(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow isSheet]} */
    public boolean isSheet() {
        try {
            return (boolean) MH_isSheet.invokeExact(this.handle, SEL_isSheet);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow sheetParent]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSWindow sheetParent() {
        try {
            long result = (long) MH_sheetParent.invokeExact(this.handle, SEL_sheetParent);
            return result == 0L ? null : new NSWindow(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow childWindows]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<NSWindow> childWindows() {
        try {
            long result = (long) MH_childWindows.invokeExact(this.handle, SEL_childWindows);
            return result == 0L ? null : new NSArray<>(result, NSWindow::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow parentWindow]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSWindow parentWindow() {
        try {
            long result = (long) MH_parentWindow.invokeExact(this.handle, SEL_parentWindow);
            return result == 0L ? null : new NSWindow(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setParentWindow:]} */
    public void setParentWindow(@Nullable final NSWindow parentWindow) {
        try {
            MH_setParentWindow_.invokeExact(this.handle, SEL_setParentWindow_, parentWindow == null ? 0L : parentWindow.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow appearanceSource]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSObject appearanceSource() {
        try {
            long result = (long) MH_appearanceSource.invokeExact(this.handle, SEL_appearanceSource);
            return new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setAppearanceSource:]} */
    public void setAppearanceSource(@Nullable final NSObject appearanceSource) {
        try {
            MH_setAppearanceSource_.invokeExact(this.handle, SEL_setAppearanceSource_, appearanceSource == null ? 0L : appearanceSource.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow colorSpace]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject colorSpace() {
        try {
            long result = (long) MH_colorSpace.invokeExact(this.handle, SEL_colorSpace);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setColorSpace:]} */
    public void setColorSpace(@Nullable final NSObject colorSpace) {
        try {
            MH_setColorSpace_.invokeExact(this.handle, SEL_setColorSpace_, colorSpace == null ? 0L : colorSpace.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow occlusionState]}
     *
     * @return a combination of {@link NSWindowOcclusionState} flags
     */
    public long occlusionState() {
        try {
            return (long) MH_occlusionState.invokeExact(this.handle, SEL_occlusionState);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow titlebarSeparatorStyle]} */
    public NSTitlebarSeparatorStyle titlebarSeparatorStyle() {
        try {
            return NSTitlebarSeparatorStyle.of((long) MH_titlebarSeparatorStyle.invokeExact(this.handle, SEL_titlebarSeparatorStyle));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setTitlebarSeparatorStyle:]} */
    public void setTitlebarSeparatorStyle(final NSTitlebarSeparatorStyle titlebarSeparatorStyle) {
        try {
            MH_setTitlebarSeparatorStyle_.invokeExact(this.handle, SEL_setTitlebarSeparatorStyle_, titlebarSeparatorStyle.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow contentViewController]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject contentViewController() {
        try {
            long result = (long) MH_contentViewController.invokeExact(this.handle, SEL_contentViewController);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setContentViewController:]} */
    public void setContentViewController(@Nullable final NSObject contentViewController) {
        try {
            MH_setContentViewController_.invokeExact(this.handle, SEL_setContentViewController_, contentViewController == null ? 0L : contentViewController.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow initialFirstResponder]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSView initialFirstResponder() {
        try {
            long result = (long) MH_initialFirstResponder.invokeExact(this.handle, SEL_initialFirstResponder);
            return result == 0L ? null : new NSView(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setInitialFirstResponder:]} */
    public void setInitialFirstResponder(@Nullable final NSView initialFirstResponder) {
        try {
            MH_setInitialFirstResponder_.invokeExact(this.handle, SEL_setInitialFirstResponder_, initialFirstResponder == null ? 0L : initialFirstResponder.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow keyViewSelectionDirection]} */
    public NSSelectionDirection keyViewSelectionDirection() {
        try {
            return NSSelectionDirection.of((long) MH_keyViewSelectionDirection.invokeExact(this.handle, SEL_keyViewSelectionDirection));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow defaultButtonCell]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject defaultButtonCell() {
        try {
            long result = (long) MH_defaultButtonCell.invokeExact(this.handle, SEL_defaultButtonCell);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setDefaultButtonCell:]} */
    public void setDefaultButtonCell(@Nullable final NSObject defaultButtonCell) {
        try {
            MH_setDefaultButtonCell_.invokeExact(this.handle, SEL_setDefaultButtonCell_, defaultButtonCell == null ? 0L : defaultButtonCell.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow autorecalculatesKeyViewLoop]} */
    public boolean autorecalculatesKeyViewLoop() {
        try {
            return (boolean) MH_autorecalculatesKeyViewLoop.invokeExact(this.handle, SEL_autorecalculatesKeyViewLoop);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setAutorecalculatesKeyViewLoop:]} */
    public void setAutorecalculatesKeyViewLoop(final boolean autorecalculatesKeyViewLoop) {
        try {
            MH_setAutorecalculatesKeyViewLoop_.invokeExact(this.handle, SEL_setAutorecalculatesKeyViewLoop_, autorecalculatesKeyViewLoop);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow toolbar]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject toolbar() {
        try {
            long result = (long) MH_toolbar.invokeExact(this.handle, SEL_toolbar);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setToolbar:]} */
    public void setToolbar(@Nullable final NSObject toolbar) {
        try {
            MH_setToolbar_.invokeExact(this.handle, SEL_setToolbar_, toolbar == null ? 0L : toolbar.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow showsToolbarButton]} */
    public boolean showsToolbarButton() {
        try {
            return (boolean) MH_showsToolbarButton.invokeExact(this.handle, SEL_showsToolbarButton);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setShowsToolbarButton:]} */
    public void setShowsToolbarButton(final boolean showsToolbarButton) {
        try {
            MH_setShowsToolbarButton_.invokeExact(this.handle, SEL_setShowsToolbarButton_, showsToolbarButton);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSWindow allowsAutomaticWindowTabbing]} */
    public static boolean allowsAutomaticWindowTabbing() {
        try {
            return (boolean) MH_CLASS_allowsAutomaticWindowTabbing.invokeExact(CLS, SEL_CLASS_allowsAutomaticWindowTabbing);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSWindow setAllowsAutomaticWindowTabbing:]} */
    public static void setAllowsAutomaticWindowTabbing(final boolean allowsAutomaticWindowTabbing) {
        try {
            MH_CLASS_setAllowsAutomaticWindowTabbing_.invokeExact(CLS, SEL_CLASS_setAllowsAutomaticWindowTabbing_, allowsAutomaticWindowTabbing);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSWindow userTabbingPreference]} */
    public static NSWindowUserTabbingPreference userTabbingPreference() {
        try {
            return NSWindowUserTabbingPreference.of((long) MH_CLASS_userTabbingPreference.invokeExact(CLS, SEL_CLASS_userTabbingPreference));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow tabbingMode]} */
    public NSWindowTabbingMode tabbingMode() {
        try {
            return NSWindowTabbingMode.of((long) MH_tabbingMode.invokeExact(this.handle, SEL_tabbingMode));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setTabbingMode:]} */
    public void setTabbingMode(final NSWindowTabbingMode tabbingMode) {
        try {
            MH_setTabbingMode_.invokeExact(this.handle, SEL_setTabbingMode_, tabbingMode.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow tabbingIdentifier]} */
    @Nullable
    public String tabbingIdentifier() {
        try {
            long result = (long) MH_tabbingIdentifier.invokeExact(this.handle, SEL_tabbingIdentifier);
            return result == 0L ? null : ObjC.javaString(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setTabbingIdentifier:]} */
    public void setTabbingIdentifier(@Nullable final String tabbingIdentifier) {
        final long nsTabbingIdentifier = tabbingIdentifier == null ? 0L : ObjC.nsString(tabbingIdentifier);
        try {
            MH_setTabbingIdentifier_.invokeExact(this.handle, SEL_setTabbingIdentifier_, nsTabbingIdentifier);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsTabbingIdentifier);
        }
    }

    /**
     * {@code -[NSWindow tabbedWindows]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSArray<NSWindow> tabbedWindows() {
        try {
            long result = (long) MH_tabbedWindows.invokeExact(this.handle, SEL_tabbedWindows);
            return result == 0L ? null : new NSArray<>(result, NSWindow::new);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow tab]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject tab() {
        try {
            long result = (long) MH_tab.invokeExact(this.handle, SEL_tab);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow tabGroup]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject tabGroup() {
        try {
            long result = (long) MH_tabGroup.invokeExact(this.handle, SEL_tabGroup);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow hasActiveWindowSharingSession]} */
    public boolean hasActiveWindowSharingSession() {
        try {
            return (boolean) MH_hasActiveWindowSharingSession.invokeExact(this.handle, SEL_hasActiveWindowSharingSession);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow windowTitlebarLayoutDirection]} */
    public NSUserInterfaceLayoutDirection windowTitlebarLayoutDirection() {
        try {
            return NSUserInterfaceLayoutDirection.of((long) MH_windowTitlebarLayoutDirection.invokeExact(this.handle, SEL_windowTitlebarLayoutDirection));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow trackEventsMatchingMask:timeout:mode:handler:]}
     *
     * @param mask a combination of {@link NSEventMask} flags
     */
    public void trackEventsMatchingMask(final long mask, final double timeout, final String mode, final long trackingHandler) {
        final long nsMode = ObjC.nsString(mode);
        try {
            MH_trackEventsMatchingMask_timeout_mode_handler_.invokeExact(this.handle, SEL_trackEventsMatchingMask_timeout_mode_handler_, mask, timeout, nsMode, trackingHandler);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsMode);
        }
    }

    /**
     * {@code -[NSWindow nextEventMatchingMask:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     *
     * @param mask a combination of {@link NSEventMask} flags
     */
    @Nullable
    public NSObject nextEventMatchingMask(final long mask) {
        try {
            long result = (long) MH_nextEventMatchingMask_.invokeExact(this.handle, SEL_nextEventMatchingMask_, mask);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow nextEventMatchingMask:untilDate:inMode:dequeue:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     *
     * @param mask a combination of {@link NSEventMask} flags
     */
    @Nullable
    public NSObject nextEventMatchingMask(final long mask, @Nullable final NSDate expiration, final String mode, final boolean deqFlag) {
        final long nsMode = ObjC.nsString(mode);
        try {
            long result = (long) MH_nextEventMatchingMask_untilDate_inMode_dequeue_.invokeExact(this.handle, SEL_nextEventMatchingMask_untilDate_inMode_dequeue_, mask, expiration == null ? 0L : expiration.handle(), nsMode, deqFlag);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsMode);
        }
    }

    /**
     * {@code -[NSWindow discardEventsMatchingMask:beforeEvent:]}
     *
     * @param mask a combination of {@link NSEventMask} flags
     */
    public void discardEventsMatchingMask(final long mask, @Nullable final NSObject lastEvent) {
        try {
            MH_discardEventsMatchingMask_beforeEvent_.invokeExact(this.handle, SEL_discardEventsMatchingMask_beforeEvent_, mask, lastEvent == null ? 0L : lastEvent.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow postEvent:atStart:]} */
    public void postEvent(final NSObject event, final boolean flag) {
        try {
            MH_postEvent_atStart_.invokeExact(this.handle, SEL_postEvent_atStart_, event.handle(), flag);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow sendEvent:]} */
    public void sendEvent(final NSObject event) {
        try {
            MH_sendEvent_.invokeExact(this.handle, SEL_sendEvent_, event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow currentEvent]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject currentEvent() {
        try {
            long result = (long) MH_currentEvent.invokeExact(this.handle, SEL_currentEvent);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow acceptsMouseMovedEvents]} */
    public boolean acceptsMouseMovedEvents() {
        try {
            return (boolean) MH_acceptsMouseMovedEvents.invokeExact(this.handle, SEL_acceptsMouseMovedEvents);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setAcceptsMouseMovedEvents:]} */
    public void setAcceptsMouseMovedEvents(final boolean acceptsMouseMovedEvents) {
        try {
            MH_setAcceptsMouseMovedEvents_.invokeExact(this.handle, SEL_setAcceptsMouseMovedEvents_, acceptsMouseMovedEvents);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow ignoresMouseEvents]} */
    public boolean ignoresMouseEvents() {
        try {
            return (boolean) MH_ignoresMouseEvents.invokeExact(this.handle, SEL_ignoresMouseEvents);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setIgnoresMouseEvents:]} */
    public void setIgnoresMouseEvents(final boolean ignoresMouseEvents) {
        try {
            MH_setIgnoresMouseEvents_.invokeExact(this.handle, SEL_setIgnoresMouseEvents_, ignoresMouseEvents);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow mouseLocationOutsideOfEventStream]} */
    public NSPoint mouseLocationOutsideOfEventStream() {
        try (NativeStack stack = NativeStack.push()) {
            return NSPoint.read((MemorySegment) MH_mouseLocationOutsideOfEventStream.invokeExact((SegmentAllocator) stack, this.handle, SEL_mouseLocationOutsideOfEventStream));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow disableCursorRects]} */
    public void disableCursorRects() {
        try {
            MH_disableCursorRects.invokeExact(this.handle, SEL_disableCursorRects);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow enableCursorRects]} */
    public void enableCursorRects() {
        try {
            MH_enableCursorRects.invokeExact(this.handle, SEL_enableCursorRects);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow discardCursorRects]} */
    public void discardCursorRects() {
        try {
            MH_discardCursorRects.invokeExact(this.handle, SEL_discardCursorRects);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow invalidateCursorRectsForView:]} */
    public void invalidateCursorRectsForView(final NSView view) {
        try {
            MH_invalidateCursorRectsForView_.invokeExact(this.handle, SEL_invalidateCursorRectsForView_, view.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow resetCursorRects]} */
    public void resetCursorRects() {
        try {
            MH_resetCursorRects.invokeExact(this.handle, SEL_resetCursorRects);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow areCursorRectsEnabled]} */
    public boolean areCursorRectsEnabled() {
        try {
            return (boolean) MH_areCursorRectsEnabled.invokeExact(this.handle, SEL_areCursorRectsEnabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow beginDraggingSessionWithItems:event:source:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSObject beginDraggingSession(final NSArray<NSObject> items, final NSObject event, final NSObject source) {
        try {
            long result = (long) MH_beginDraggingSessionWithItems_event_source_.invokeExact(this.handle, SEL_beginDraggingSessionWithItems_event_source_, items.handle(), event.handle(), source.handle());
            return new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow dragImage:at:offset:event:pasteboard:source:slideBack:]} */
    public void dragImage(final NSObject image, final NSPoint baseLocation, final NSSize initialOffset, final NSObject event, final NSObject pboard, final NSObject sourceObj, final boolean slideFlag) {
        try {
            MH_dragImage_at_offset_event_pasteboard_source_slideBack_.invokeExact(this.handle, SEL_dragImage_at_offset_event_pasteboard_source_slideBack_, image.handle(), baseLocation.x(), baseLocation.y(), initialOffset.width(), initialOffset.height(), event.handle(), pboard.handle(), sourceObj.handle(), slideFlag);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow registerForDraggedTypes:]} */
    public void registerForDraggedTypes(final NSArray<NSObject> newTypes) {
        try {
            MH_registerForDraggedTypes_.invokeExact(this.handle, SEL_registerForDraggedTypes_, newTypes.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow unregisterDraggedTypes]} */
    public void unregisterDraggedTypes() {
        try {
            MH_unregisterDraggedTypes.invokeExact(this.handle, SEL_unregisterDraggedTypes);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow displayLinkWithTarget:selector:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSObject displayLink(final NSObject target, final long selector) {
        try {
            long result = (long) MH_displayLinkWithTarget_selector_.invokeExact(this.handle, SEL_displayLinkWithTarget_selector_, target.handle(), selector);
            return new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow cacheImageInRect:]} */
    public void cacheImageInRect(final NSRect rect) {
        try {
            MH_cacheImageInRect_.invokeExact(this.handle, SEL_cacheImageInRect_, rect.origin().x(), rect.origin().y(), rect.size().width(), rect.size().height());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow restoreCachedImage]} */
    public void restoreCachedImage() {
        try {
            MH_restoreCachedImage.invokeExact(this.handle, SEL_restoreCachedImage);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow discardCachedImage]} */
    public void discardCachedImage() {
        try {
            MH_discardCachedImage.invokeExact(this.handle, SEL_discardCachedImage);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code +[NSWindow menuChanged:]} */
    public static void menuChanged(final NSObject menu) {
        try {
            MH_CLASS_menuChanged_.invokeExact(CLS, SEL_CLASS_menuChanged_, menu.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow gState]} */
    public long gState() {
        try {
            return (long) MH_gState.invokeExact(this.handle, SEL_gState);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow convertBaseToScreen:]} */
    public NSPoint convertBaseToScreen(final NSPoint point) {
        try (NativeStack stack = NativeStack.push()) {
            return NSPoint.read((MemorySegment) MH_convertBaseToScreen_.invokeExact((SegmentAllocator) stack, this.handle, SEL_convertBaseToScreen_, point.x(), point.y()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow convertScreenToBase:]} */
    public NSPoint convertScreenToBase(final NSPoint point) {
        try (NativeStack stack = NativeStack.push()) {
            return NSPoint.read((MemorySegment) MH_convertScreenToBase_.invokeExact((SegmentAllocator) stack, this.handle, SEL_convertScreenToBase_, point.x(), point.y()));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow userSpaceScaleFactor]} */
    public double userSpaceScaleFactor() {
        try {
            return (double) MH_userSpaceScaleFactor.invokeExact(this.handle, SEL_userSpaceScaleFactor);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow useOptimizedDrawing:]} */
    public void useOptimizedDrawing(final boolean flag) {
        try {
            MH_useOptimizedDrawing_.invokeExact(this.handle, SEL_useOptimizedDrawing_, flag);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow canStoreColor]} */
    public boolean canStoreColor() {
        try {
            return (boolean) MH_canStoreColor.invokeExact(this.handle, SEL_canStoreColor);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow disableFlushWindow]} */
    public void disableFlushWindow() {
        try {
            MH_disableFlushWindow.invokeExact(this.handle, SEL_disableFlushWindow);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow enableFlushWindow]} */
    public void enableFlushWindow() {
        try {
            MH_enableFlushWindow.invokeExact(this.handle, SEL_enableFlushWindow);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow flushWindow]} */
    public void flushWindow() {
        try {
            MH_flushWindow.invokeExact(this.handle, SEL_flushWindow);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow flushWindowIfNeeded]} */
    public void flushWindowIfNeeded() {
        try {
            MH_flushWindowIfNeeded.invokeExact(this.handle, SEL_flushWindowIfNeeded);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow initWithWindowRef:]}
     * <p>Returns a retained (+1) object, release it when done.
     */
    @Nullable
    public NSWindow initWithWindowRef(final MemorySegment windowRef) {
        try {
            long result = (long) MH_initWithWindowRef_.invokeExact(this.handle, SEL_initWithWindowRef_, windowRef.address());
            return result == 0L ? null : new NSWindow(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow disableScreenUpdatesUntilFlush]} */
    public void disableScreenUpdatesUntilFlush() {
        try {
            MH_disableScreenUpdatesUntilFlush.invokeExact(this.handle, SEL_disableScreenUpdatesUntilFlush);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow isFlushWindowDisabled]} */
    public boolean isFlushWindowDisabled() {
        try {
            return (boolean) MH_isFlushWindowDisabled.invokeExact(this.handle, SEL_isFlushWindowDisabled);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow isAutodisplay]} */
    public boolean isAutodisplay() {
        try {
            return (boolean) MH_isAutodisplay.invokeExact(this.handle, SEL_isAutodisplay);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setAutodisplay:]} */
    public void setAutodisplay(final boolean autodisplay) {
        try {
            MH_setAutodisplay_.invokeExact(this.handle, SEL_setAutodisplay_, autodisplay);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSWindow graphicsContext]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject graphicsContext() {
        try {
            long result = (long) MH_graphicsContext.invokeExact(this.handle, SEL_graphicsContext);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow isOneShot]} */
    public boolean isOneShot() {
        try {
            return (boolean) MH_isOneShot.invokeExact(this.handle, SEL_isOneShot);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setOneShot:]} */
    public void setOneShot(final boolean oneShot) {
        try {
            MH_setOneShot_.invokeExact(this.handle, SEL_setOneShot_, oneShot);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow preferredBackingLocation]} */
    public NSWindowBackingLocation preferredBackingLocation() {
        try {
            return NSWindowBackingLocation.of((long) MH_preferredBackingLocation.invokeExact(this.handle, SEL_preferredBackingLocation));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setPreferredBackingLocation:]} */
    public void setPreferredBackingLocation(final NSWindowBackingLocation preferredBackingLocation) {
        try {
            MH_setPreferredBackingLocation_.invokeExact(this.handle, SEL_setPreferredBackingLocation_, preferredBackingLocation.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow backingLocation]} */
    public NSWindowBackingLocation backingLocation() {
        try {
            return NSWindowBackingLocation.of((long) MH_backingLocation.invokeExact(this.handle, SEL_backingLocation));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow showsResizeIndicator]} */
    public boolean showsResizeIndicator() {
        try {
            return (boolean) MH_showsResizeIndicator.invokeExact(this.handle, SEL_showsResizeIndicator);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow setShowsResizeIndicator:]} */
    public void setShowsResizeIndicator(final boolean showsResizeIndicator) {
        try {
            MH_setShowsResizeIndicator_.invokeExact(this.handle, SEL_setShowsResizeIndicator_, showsResizeIndicator);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSWindow windowRef]} */
    public MemorySegment windowRef() {
        try {
            return MemorySegment.ofAddress((long) MH_windowRef.invokeExact(this.handle, SEL_windowRef));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
