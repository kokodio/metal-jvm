package io.github.kokodio.metaljvm.appkit;

import io.github.kokodio.metaljvm.foundation.NSArray;
import io.github.kokodio.metaljvm.foundation.NSError;
import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.objc.ObjC;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_BOOLEAN;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code NSResponder}
 *
 * @see <a href="https://developer.apple.com/documentation/appkit/nsresponder">Apple documentation</a>
 */
public class NSResponder extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("AppKit");
    private static final long CLS = ObjC.clazz("NSResponder");
    private static final long SEL_init = ObjC.selector("init");
    private static final MethodHandle MH_init = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_initWithCoder_ = ObjC.selector("initWithCoder:");
    private static final MethodHandle MH_initWithCoder_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_tryToPerform_with_ = ObjC.selector("tryToPerform:with:");
    private static final MethodHandle MH_tryToPerform_with_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_performKeyEquivalent_ = ObjC.selector("performKeyEquivalent:");
    private static final MethodHandle MH_performKeyEquivalent_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_validRequestorForSendType_returnType_ = ObjC.selector("validRequestorForSendType:returnType:");
    private static final MethodHandle MH_validRequestorForSendType_returnType_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_mouseDown_ = ObjC.selector("mouseDown:");
    private static final MethodHandle MH_mouseDown_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_rightMouseDown_ = ObjC.selector("rightMouseDown:");
    private static final MethodHandle MH_rightMouseDown_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_otherMouseDown_ = ObjC.selector("otherMouseDown:");
    private static final MethodHandle MH_otherMouseDown_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_mouseUp_ = ObjC.selector("mouseUp:");
    private static final MethodHandle MH_mouseUp_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_rightMouseUp_ = ObjC.selector("rightMouseUp:");
    private static final MethodHandle MH_rightMouseUp_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_otherMouseUp_ = ObjC.selector("otherMouseUp:");
    private static final MethodHandle MH_otherMouseUp_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_mouseMoved_ = ObjC.selector("mouseMoved:");
    private static final MethodHandle MH_mouseMoved_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_mouseDragged_ = ObjC.selector("mouseDragged:");
    private static final MethodHandle MH_mouseDragged_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_mouseCancelled_ = ObjC.selector("mouseCancelled:");
    private static final MethodHandle MH_mouseCancelled_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_scrollWheel_ = ObjC.selector("scrollWheel:");
    private static final MethodHandle MH_scrollWheel_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_rightMouseDragged_ = ObjC.selector("rightMouseDragged:");
    private static final MethodHandle MH_rightMouseDragged_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_otherMouseDragged_ = ObjC.selector("otherMouseDragged:");
    private static final MethodHandle MH_otherMouseDragged_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_mouseEntered_ = ObjC.selector("mouseEntered:");
    private static final MethodHandle MH_mouseEntered_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_mouseExited_ = ObjC.selector("mouseExited:");
    private static final MethodHandle MH_mouseExited_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_keyDown_ = ObjC.selector("keyDown:");
    private static final MethodHandle MH_keyDown_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_keyUp_ = ObjC.selector("keyUp:");
    private static final MethodHandle MH_keyUp_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_flagsChanged_ = ObjC.selector("flagsChanged:");
    private static final MethodHandle MH_flagsChanged_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_tabletPoint_ = ObjC.selector("tabletPoint:");
    private static final MethodHandle MH_tabletPoint_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_tabletProximity_ = ObjC.selector("tabletProximity:");
    private static final MethodHandle MH_tabletProximity_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_cursorUpdate_ = ObjC.selector("cursorUpdate:");
    private static final MethodHandle MH_cursorUpdate_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_magnifyWithEvent_ = ObjC.selector("magnifyWithEvent:");
    private static final MethodHandle MH_magnifyWithEvent_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_rotateWithEvent_ = ObjC.selector("rotateWithEvent:");
    private static final MethodHandle MH_rotateWithEvent_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_swipeWithEvent_ = ObjC.selector("swipeWithEvent:");
    private static final MethodHandle MH_swipeWithEvent_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_beginGestureWithEvent_ = ObjC.selector("beginGestureWithEvent:");
    private static final MethodHandle MH_beginGestureWithEvent_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_endGestureWithEvent_ = ObjC.selector("endGestureWithEvent:");
    private static final MethodHandle MH_endGestureWithEvent_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_smartMagnifyWithEvent_ = ObjC.selector("smartMagnifyWithEvent:");
    private static final MethodHandle MH_smartMagnifyWithEvent_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_changeModeWithEvent_ = ObjC.selector("changeModeWithEvent:");
    private static final MethodHandle MH_changeModeWithEvent_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_touchesBeganWithEvent_ = ObjC.selector("touchesBeganWithEvent:");
    private static final MethodHandle MH_touchesBeganWithEvent_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_touchesMovedWithEvent_ = ObjC.selector("touchesMovedWithEvent:");
    private static final MethodHandle MH_touchesMovedWithEvent_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_touchesEndedWithEvent_ = ObjC.selector("touchesEndedWithEvent:");
    private static final MethodHandle MH_touchesEndedWithEvent_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_touchesCancelledWithEvent_ = ObjC.selector("touchesCancelledWithEvent:");
    private static final MethodHandle MH_touchesCancelledWithEvent_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_quickLookWithEvent_ = ObjC.selector("quickLookWithEvent:");
    private static final MethodHandle MH_quickLookWithEvent_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_pressureChangeWithEvent_ = ObjC.selector("pressureChangeWithEvent:");
    private static final MethodHandle MH_pressureChangeWithEvent_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_contextMenuKeyDown_ = ObjC.selector("contextMenuKeyDown:");
    private static final MethodHandle MH_contextMenuKeyDown_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_noResponderFor_ = ObjC.selector("noResponderFor:");
    private static final MethodHandle MH_noResponderFor_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_becomeFirstResponder = ObjC.selector("becomeFirstResponder");
    private static final MethodHandle MH_becomeFirstResponder = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_resignFirstResponder = ObjC.selector("resignFirstResponder");
    private static final MethodHandle MH_resignFirstResponder = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_interpretKeyEvents_ = ObjC.selector("interpretKeyEvents:");
    private static final MethodHandle MH_interpretKeyEvents_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_flushBufferedKeyEvents = ObjC.selector("flushBufferedKeyEvents");
    private static final MethodHandle MH_flushBufferedKeyEvents = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
    private static final long SEL_showContextHelp_ = ObjC.selector("showContextHelp:");
    private static final MethodHandle MH_showContextHelp_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_helpRequested_ = ObjC.selector("helpRequested:");
    private static final MethodHandle MH_helpRequested_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_shouldBeTreatedAsInkEvent_ = ObjC.selector("shouldBeTreatedAsInkEvent:");
    private static final MethodHandle MH_shouldBeTreatedAsInkEvent_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_wantsScrollEventsForSwipeTrackingOnAxis_ = ObjC.selector("wantsScrollEventsForSwipeTrackingOnAxis:");
    private static final MethodHandle MH_wantsScrollEventsForSwipeTrackingOnAxis_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_wantsForwardedScrollEventsForAxis_ = ObjC.selector("wantsForwardedScrollEventsForAxis:");
    private static final MethodHandle MH_wantsForwardedScrollEventsForAxis_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_supplementalTargetForAction_sender_ = ObjC.selector("supplementalTargetForAction:sender:");
    private static final MethodHandle MH_supplementalTargetForAction_sender_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_nextResponder = ObjC.selector("nextResponder");
    private static final MethodHandle MH_nextResponder = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setNextResponder_ = ObjC.selector("setNextResponder:");
    private static final MethodHandle MH_setNextResponder_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_acceptsFirstResponder = ObjC.selector("acceptsFirstResponder");
    private static final MethodHandle MH_acceptsFirstResponder = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG));
    private static final long SEL_menu = ObjC.selector("menu");
    private static final MethodHandle MH_menu = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMenu_ = ObjC.selector("setMenu:");
    private static final MethodHandle MH_setMenu_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_undoManager = ObjC.selector("undoManager");
    private static final MethodHandle MH_undoManager = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_validateProposedFirstResponder_forEvent_ = ObjC.selector("validateProposedFirstResponder:forEvent:");
    private static final MethodHandle MH_validateProposedFirstResponder_forEvent_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_presentError_modalForWindow_delegate_didPresentSelector_contextInfo_ = ObjC.selector("presentError:modalForWindow:delegate:didPresentSelector:contextInfo:");
    private static final MethodHandle MH_presentError_modalForWindow_delegate_didPresentSelector_contextInfo_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_presentError_ = ObjC.selector("presentError:");
    private static final MethodHandle MH_presentError_ = ObjC.msgSend(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_willPresentError_ = ObjC.selector("willPresentError:");
    private static final MethodHandle MH_willPresentError_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_performTextFinderAction_ = ObjC.selector("performTextFinderAction:");
    private static final MethodHandle MH_performTextFinderAction_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_newWindowForTab_ = ObjC.selector("newWindowForTab:");
    private static final MethodHandle MH_newWindowForTab_ = ObjC.msgSend(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_showWritingTools_ = ObjC.selector("showWritingTools:");
    private static final MethodHandle MH_showWritingTools_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_performMnemonic_ = ObjC.selector("performMnemonic:");
    private static final MethodHandle MH_performMnemonic_ = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_updateUserActivityState_ = ObjC.selector("updateUserActivityState:");
    private static final MethodHandle MH_updateUserActivityState_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_userActivity = ObjC.selector("userActivity");
    private static final MethodHandle MH_userActivity = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setUserActivity_ = ObjC.selector("setUserActivity:");
    private static final MethodHandle MH_setUserActivity_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    public NSResponder(final long handle) {
        super(handle);
    }

    /**
     * {@code +[NSResponder alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static NSResponder alloc() {
        try {
            return new NSResponder((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder init]} */
    public NSResponder init() {
        try {
            long result = (long) MH_init.invokeExact(this.handle, SEL_init);
            this.handle = result;
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder initWithCoder:]} */
    @Nullable
    public NSResponder initWithCoder(final NSObject coder) {
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

    /** {@code -[NSResponder tryToPerform:with:]} */
    public boolean tryToPerform(final long action, @Nullable final NSObject object) {
        try {
            return (boolean) MH_tryToPerform_with_.invokeExact(this.handle, SEL_tryToPerform_with_, action, object == null ? 0L : object.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder performKeyEquivalent:]} */
    public boolean performKeyEquivalent(final NSObject event) {
        try {
            return (boolean) MH_performKeyEquivalent_.invokeExact(this.handle, SEL_performKeyEquivalent_, event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSResponder validRequestorForSendType:returnType:]}
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

    /** {@code -[NSResponder mouseDown:]} */
    public void mouseDown(final NSObject event) {
        try {
            MH_mouseDown_.invokeExact(this.handle, SEL_mouseDown_, event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder rightMouseDown:]} */
    public void rightMouseDown(final NSObject event) {
        try {
            MH_rightMouseDown_.invokeExact(this.handle, SEL_rightMouseDown_, event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder otherMouseDown:]} */
    public void otherMouseDown(final NSObject event) {
        try {
            MH_otherMouseDown_.invokeExact(this.handle, SEL_otherMouseDown_, event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder mouseUp:]} */
    public void mouseUp(final NSObject event) {
        try {
            MH_mouseUp_.invokeExact(this.handle, SEL_mouseUp_, event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder rightMouseUp:]} */
    public void rightMouseUp(final NSObject event) {
        try {
            MH_rightMouseUp_.invokeExact(this.handle, SEL_rightMouseUp_, event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder otherMouseUp:]} */
    public void otherMouseUp(final NSObject event) {
        try {
            MH_otherMouseUp_.invokeExact(this.handle, SEL_otherMouseUp_, event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder mouseMoved:]} */
    public void mouseMoved(final NSObject event) {
        try {
            MH_mouseMoved_.invokeExact(this.handle, SEL_mouseMoved_, event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder mouseDragged:]} */
    public void mouseDragged(final NSObject event) {
        try {
            MH_mouseDragged_.invokeExact(this.handle, SEL_mouseDragged_, event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder mouseCancelled:]} */
    public void mouseCancelled(final NSObject event) {
        try {
            MH_mouseCancelled_.invokeExact(this.handle, SEL_mouseCancelled_, event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder scrollWheel:]} */
    public void scrollWheel(final NSObject event) {
        try {
            MH_scrollWheel_.invokeExact(this.handle, SEL_scrollWheel_, event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder rightMouseDragged:]} */
    public void rightMouseDragged(final NSObject event) {
        try {
            MH_rightMouseDragged_.invokeExact(this.handle, SEL_rightMouseDragged_, event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder otherMouseDragged:]} */
    public void otherMouseDragged(final NSObject event) {
        try {
            MH_otherMouseDragged_.invokeExact(this.handle, SEL_otherMouseDragged_, event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder mouseEntered:]} */
    public void mouseEntered(final NSObject event) {
        try {
            MH_mouseEntered_.invokeExact(this.handle, SEL_mouseEntered_, event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder mouseExited:]} */
    public void mouseExited(final NSObject event) {
        try {
            MH_mouseExited_.invokeExact(this.handle, SEL_mouseExited_, event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder keyDown:]} */
    public void keyDown(final NSObject event) {
        try {
            MH_keyDown_.invokeExact(this.handle, SEL_keyDown_, event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder keyUp:]} */
    public void keyUp(final NSObject event) {
        try {
            MH_keyUp_.invokeExact(this.handle, SEL_keyUp_, event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder flagsChanged:]} */
    public void flagsChanged(final NSObject event) {
        try {
            MH_flagsChanged_.invokeExact(this.handle, SEL_flagsChanged_, event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder tabletPoint:]} */
    public void tabletPoint(final NSObject event) {
        try {
            MH_tabletPoint_.invokeExact(this.handle, SEL_tabletPoint_, event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder tabletProximity:]} */
    public void tabletProximity(final NSObject event) {
        try {
            MH_tabletProximity_.invokeExact(this.handle, SEL_tabletProximity_, event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder cursorUpdate:]} */
    public void cursorUpdate(final NSObject event) {
        try {
            MH_cursorUpdate_.invokeExact(this.handle, SEL_cursorUpdate_, event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder magnifyWithEvent:]} */
    public void magnify(final NSObject event) {
        try {
            MH_magnifyWithEvent_.invokeExact(this.handle, SEL_magnifyWithEvent_, event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder rotateWithEvent:]} */
    public void rotate(final NSObject event) {
        try {
            MH_rotateWithEvent_.invokeExact(this.handle, SEL_rotateWithEvent_, event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder swipeWithEvent:]} */
    public void swipe(final NSObject event) {
        try {
            MH_swipeWithEvent_.invokeExact(this.handle, SEL_swipeWithEvent_, event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder beginGestureWithEvent:]} */
    public void beginGesture(final NSObject event) {
        try {
            MH_beginGestureWithEvent_.invokeExact(this.handle, SEL_beginGestureWithEvent_, event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder endGestureWithEvent:]} */
    public void endGesture(final NSObject event) {
        try {
            MH_endGestureWithEvent_.invokeExact(this.handle, SEL_endGestureWithEvent_, event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder smartMagnifyWithEvent:]} */
    public void smartMagnify(final NSObject event) {
        try {
            MH_smartMagnifyWithEvent_.invokeExact(this.handle, SEL_smartMagnifyWithEvent_, event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder changeModeWithEvent:]} */
    public void changeMode(final NSObject event) {
        try {
            MH_changeModeWithEvent_.invokeExact(this.handle, SEL_changeModeWithEvent_, event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder touchesBeganWithEvent:]} */
    public void touchesBegan(final NSObject event) {
        try {
            MH_touchesBeganWithEvent_.invokeExact(this.handle, SEL_touchesBeganWithEvent_, event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder touchesMovedWithEvent:]} */
    public void touchesMoved(final NSObject event) {
        try {
            MH_touchesMovedWithEvent_.invokeExact(this.handle, SEL_touchesMovedWithEvent_, event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder touchesEndedWithEvent:]} */
    public void touchesEnded(final NSObject event) {
        try {
            MH_touchesEndedWithEvent_.invokeExact(this.handle, SEL_touchesEndedWithEvent_, event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder touchesCancelledWithEvent:]} */
    public void touchesCancelled(final NSObject event) {
        try {
            MH_touchesCancelledWithEvent_.invokeExact(this.handle, SEL_touchesCancelledWithEvent_, event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder quickLookWithEvent:]} */
    public void quickLook(final NSObject event) {
        try {
            MH_quickLookWithEvent_.invokeExact(this.handle, SEL_quickLookWithEvent_, event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder pressureChangeWithEvent:]} */
    public void pressureChange(final NSObject event) {
        try {
            MH_pressureChangeWithEvent_.invokeExact(this.handle, SEL_pressureChangeWithEvent_, event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder contextMenuKeyDown:]} */
    public void contextMenuKeyDown(final NSObject event) {
        try {
            MH_contextMenuKeyDown_.invokeExact(this.handle, SEL_contextMenuKeyDown_, event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder noResponderFor:]} */
    public void noResponderFor(final long eventSelector) {
        try {
            MH_noResponderFor_.invokeExact(this.handle, SEL_noResponderFor_, eventSelector);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder becomeFirstResponder]} */
    public boolean becomeFirstResponder() {
        try {
            return (boolean) MH_becomeFirstResponder.invokeExact(this.handle, SEL_becomeFirstResponder);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder resignFirstResponder]} */
    public boolean resignFirstResponder() {
        try {
            return (boolean) MH_resignFirstResponder.invokeExact(this.handle, SEL_resignFirstResponder);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder interpretKeyEvents:]} */
    public void interpretKeyEvents(final NSArray<NSObject> eventArray) {
        try {
            MH_interpretKeyEvents_.invokeExact(this.handle, SEL_interpretKeyEvents_, eventArray.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder flushBufferedKeyEvents]} */
    public void flushBufferedKeyEvents() {
        try {
            MH_flushBufferedKeyEvents.invokeExact(this.handle, SEL_flushBufferedKeyEvents);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder showContextHelp:]} */
    public void showContextHelp(@Nullable final NSObject sender) {
        try {
            MH_showContextHelp_.invokeExact(this.handle, SEL_showContextHelp_, sender == null ? 0L : sender.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder helpRequested:]} */
    public void helpRequested(final NSObject eventPtr) {
        try {
            MH_helpRequested_.invokeExact(this.handle, SEL_helpRequested_, eventPtr.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder shouldBeTreatedAsInkEvent:]} */
    public boolean shouldBeTreatedAsInkEvent(final NSObject event) {
        try {
            return (boolean) MH_shouldBeTreatedAsInkEvent_.invokeExact(this.handle, SEL_shouldBeTreatedAsInkEvent_, event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder wantsScrollEventsForSwipeTrackingOnAxis:]} */
    public boolean wantsScrollEventsForSwipeTrackingOnAxis(final NSEventGestureAxis axis) {
        try {
            return (boolean) MH_wantsScrollEventsForSwipeTrackingOnAxis_.invokeExact(this.handle, SEL_wantsScrollEventsForSwipeTrackingOnAxis_, axis.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder wantsForwardedScrollEventsForAxis:]} */
    public boolean wantsForwardedScrollEventsForAxis(final NSEventGestureAxis axis) {
        try {
            return (boolean) MH_wantsForwardedScrollEventsForAxis_.invokeExact(this.handle, SEL_wantsForwardedScrollEventsForAxis_, axis.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSResponder supplementalTargetForAction:sender:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject supplementalTargetForAction(final long action, @Nullable final NSObject sender) {
        try {
            long result = (long) MH_supplementalTargetForAction_sender_.invokeExact(this.handle, SEL_supplementalTargetForAction_sender_, action, sender == null ? 0L : sender.handle());
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSResponder nextResponder]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSResponder nextResponder() {
        try {
            long result = (long) MH_nextResponder.invokeExact(this.handle, SEL_nextResponder);
            return result == 0L ? null : new NSResponder(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder setNextResponder:]} */
    public void setNextResponder(@Nullable final NSResponder nextResponder) {
        try {
            MH_setNextResponder_.invokeExact(this.handle, SEL_setNextResponder_, nextResponder == null ? 0L : nextResponder.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder acceptsFirstResponder]} */
    public boolean acceptsFirstResponder() {
        try {
            return (boolean) MH_acceptsFirstResponder.invokeExact(this.handle, SEL_acceptsFirstResponder);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSResponder menu]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject menu() {
        try {
            long result = (long) MH_menu.invokeExact(this.handle, SEL_menu);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder setMenu:]} */
    public void setMenu(@Nullable final NSObject menu) {
        try {
            MH_setMenu_.invokeExact(this.handle, SEL_setMenu_, menu == null ? 0L : menu.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSResponder undoManager]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject undoManager() {
        try {
            long result = (long) MH_undoManager.invokeExact(this.handle, SEL_undoManager);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder validateProposedFirstResponder:forEvent:]} */
    public boolean validateProposedFirstResponder(final NSResponder responder, @Nullable final NSObject event) {
        try {
            return (boolean) MH_validateProposedFirstResponder_forEvent_.invokeExact(this.handle, SEL_validateProposedFirstResponder_forEvent_, responder.handle(), event == null ? 0L : event.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder presentError:modalForWindow:delegate:didPresentSelector:contextInfo:]} */
    public void presentError(final NSError error, final NSWindow window, @Nullable final NSObject delegate, final long didPresentSelector, final MemorySegment contextInfo) {
        try {
            MH_presentError_modalForWindow_delegate_didPresentSelector_contextInfo_.invokeExact(this.handle, SEL_presentError_modalForWindow_delegate_didPresentSelector_contextInfo_, error.handle(), window.handle(), delegate == null ? 0L : delegate.handle(), didPresentSelector, contextInfo.address());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder presentError:]} */
    public boolean presentError(final NSError error) {
        try {
            return (boolean) MH_presentError_.invokeExact(this.handle, SEL_presentError_, error.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSResponder willPresentError:]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    public NSError willPresentError(final NSError error) {
        try {
            long result = (long) MH_willPresentError_.invokeExact(this.handle, SEL_willPresentError_, error.handle());
            return new NSError(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder performTextFinderAction:]} */
    public void performTextFinderAction(@Nullable final NSObject sender) {
        try {
            MH_performTextFinderAction_.invokeExact(this.handle, SEL_performTextFinderAction_, sender == null ? 0L : sender.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder newWindowForTab:]} */
    public void newWindowForTab(@Nullable final NSObject sender) {
        try {
            MH_newWindowForTab_.invokeExact(this.handle, SEL_newWindowForTab_, sender == null ? 0L : sender.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder showWritingTools:]} */
    public void showWritingTools(@Nullable final NSObject sender) {
        try {
            MH_showWritingTools_.invokeExact(this.handle, SEL_showWritingTools_, sender == null ? 0L : sender.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder performMnemonic:]} */
    public boolean performMnemonic(final String string) {
        final long nsString = ObjC.nsString(string);
        try {
            return (boolean) MH_performMnemonic_.invokeExact(this.handle, SEL_performMnemonic_, nsString);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        } finally {
            ObjC.release(nsString);
        }
    }

    /** {@code -[NSResponder updateUserActivityState:]} */
    public void updateUserActivityState(final NSObject userActivity) {
        try {
            MH_updateUserActivityState_.invokeExact(this.handle, SEL_updateUserActivityState_, userActivity.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /**
     * {@code -[NSResponder userActivity]}
     * <p>Returns an object the caller does not own, retain it to keep it.
     */
    @Nullable
    public NSObject userActivity() {
        try {
            long result = (long) MH_userActivity.invokeExact(this.handle, SEL_userActivity);
            return result == 0L ? null : new NSObject(result);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[NSResponder setUserActivity:]} */
    public void setUserActivity(@Nullable final NSObject userActivity) {
        try {
            MH_setUserActivity_.invokeExact(this.handle, SEL_setUserActivity_, userActivity == null ? 0L : userActivity.handle());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
