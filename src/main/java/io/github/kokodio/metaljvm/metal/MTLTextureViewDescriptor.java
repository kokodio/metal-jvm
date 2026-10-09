package io.github.kokodio.metaljvm.metal;

import io.github.kokodio.metaljvm.foundation.NSObject;
import io.github.kokodio.metaljvm.foundation.NSRange;
import io.github.kokodio.metaljvm.objc.NativeStack;
import io.github.kokodio.metaljvm.objc.ObjC;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_FLOAT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * {@code MTLTextureViewDescriptor}
 *
 * @see <a href="https://developer.apple.com/documentation/metal/mtltextureviewdescriptor">Apple documentation</a>
 */
public class MTLTextureViewDescriptor extends NSObject {
    private static final SymbolLookup FRAMEWORK = ObjC.framework("Metal");
    private static final long CLS = ObjC.clazz("MTLTextureViewDescriptor");
    private static final long SEL_pixelFormat = ObjC.selector("pixelFormat");
    private static final MethodHandle MH_pixelFormat = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setPixelFormat_ = ObjC.selector("setPixelFormat:");
    private static final MethodHandle MH_setPixelFormat_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_textureType = ObjC.selector("textureType");
    private static final MethodHandle MH_textureType = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setTextureType_ = ObjC.selector("setTextureType:");
    private static final MethodHandle MH_setTextureType_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_levelRange = ObjC.selector("levelRange");
    private static final MethodHandle MH_levelRange = ObjC.msgSendCritical(FunctionDescriptor.of(NSRange.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setLevelRange_ = ObjC.selector("setLevelRange:");
    private static final MethodHandle MH_setLevelRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_sliceRange = ObjC.selector("sliceRange");
    private static final MethodHandle MH_sliceRange = ObjC.msgSendCritical(FunctionDescriptor.of(NSRange.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSliceRange_ = ObjC.selector("setSliceRange:");
    private static final MethodHandle MH_setSliceRange_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_swizzle = ObjC.selector("swizzle");
    private static final MethodHandle MH_swizzle = ObjC.msgSendCritical(FunctionDescriptor.of(MTLTextureSwizzleChannels.LAYOUT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setSwizzle_ = ObjC.selector("setSwizzle:");
    private static final MethodHandle MH_setSwizzle_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, MTLTextureSwizzleChannels.LAYOUT));
    private static final long SEL_minLOD = ObjC.selector("minLOD");
    private static final MethodHandle MH_minLOD = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_FLOAT, JAVA_LONG, JAVA_LONG));
    private static final long SEL_setMinLOD_ = ObjC.selector("setMinLOD:");
    private static final MethodHandle MH_setMinLOD_ = ObjC.msgSendCritical(FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_FLOAT));
    private static final long SEL_alloc = ObjC.selector("alloc");
    private static final MethodHandle MH_alloc = ObjC.msgSendCritical(FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
    private static final long SEL_init = ObjC.selector("init");

    public MTLTextureViewDescriptor(final long handle) {
        super(handle);
    }

    /**
     * {@code +[MTLTextureViewDescriptor alloc]}
     * <p>Returns a retained (+1) object that still has to be initialized.
     */
    public static MTLTextureViewDescriptor alloc() {
        try {
            return new MTLTextureViewDescriptor((long) MH_alloc.invokeExact(CLS, SEL_alloc));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureViewDescriptor init]} */
    public MTLTextureViewDescriptor init() {
        try {
            this.handle = (long) MH_alloc.invokeExact(this.handle, SEL_init);
            return this;
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureViewDescriptor pixelFormat]} */
    public MTLPixelFormat pixelFormat() {
        try {
            return MTLPixelFormat.of((long) MH_pixelFormat.invokeExact(this.handle, SEL_pixelFormat));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureViewDescriptor setPixelFormat:]} */
    public void setPixelFormat(final MTLPixelFormat pixelFormat) {
        try {
            MH_setPixelFormat_.invokeExact(this.handle, SEL_setPixelFormat_, pixelFormat.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureViewDescriptor textureType]} */
    public MTLTextureType textureType() {
        try {
            return MTLTextureType.of((long) MH_textureType.invokeExact(this.handle, SEL_textureType));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureViewDescriptor setTextureType:]} */
    public void setTextureType(final MTLTextureType textureType) {
        try {
            MH_setTextureType_.invokeExact(this.handle, SEL_setTextureType_, textureType.value);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureViewDescriptor levelRange]} */
    public NSRange levelRange() {
        try (NativeStack stack = NativeStack.push()) {
            return NSRange.read((MemorySegment) MH_levelRange.invokeExact((SegmentAllocator) stack, this.handle, SEL_levelRange));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureViewDescriptor setLevelRange:]} */
    public void setLevelRange(final NSRange levelRange) {
        try {
            MH_setLevelRange_.invokeExact(this.handle, SEL_setLevelRange_, levelRange.location(), levelRange.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureViewDescriptor sliceRange]} */
    public NSRange sliceRange() {
        try (NativeStack stack = NativeStack.push()) {
            return NSRange.read((MemorySegment) MH_sliceRange.invokeExact((SegmentAllocator) stack, this.handle, SEL_sliceRange));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureViewDescriptor setSliceRange:]} */
    public void setSliceRange(final NSRange sliceRange) {
        try {
            MH_setSliceRange_.invokeExact(this.handle, SEL_setSliceRange_, sliceRange.location(), sliceRange.length());
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureViewDescriptor swizzle]} */
    public MTLTextureSwizzleChannels swizzle() {
        try (NativeStack stack = NativeStack.push()) {
            return MTLTextureSwizzleChannels.read((MemorySegment) MH_swizzle.invokeExact((SegmentAllocator) stack, this.handle, SEL_swizzle));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureViewDescriptor setSwizzle:]} */
    public void setSwizzle(final MTLTextureSwizzleChannels swizzle) {
        try (NativeStack stack = NativeStack.push()) {
            MH_setSwizzle_.invokeExact(this.handle, SEL_setSwizzle_, swizzle.on(stack));
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureViewDescriptor minLOD]} */
    public float minLOD() {
        try {
            return (float) MH_minLOD.invokeExact(this.handle, SEL_minLOD);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }

    /** {@code -[MTLTextureViewDescriptor setMinLOD:]} */
    public void setMinLOD(final float minLOD) {
        try {
            MH_setMinLOD_.invokeExact(this.handle, SEL_setMinLOD_, minLOD);
        } catch (Throwable throwable) {
            throw new AssertionError(throwable);
        }
    }
}
