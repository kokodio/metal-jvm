# metal-jvm

Java bindings for Apple Metal, in the spirit of metal-cpp: thin wrappers over the Objective-C API built on the
Foreign Function & Memory API. No native code, no JNI.

Not affiliated with Apple. Metal is a trademark of Apple Inc.

## Layout

| Package | Contents |
|---|---|
| `objc` | Objective-C runtime access: `ObjC`, `NativeStack`, `AutoreleasePool`, `ObjCBlock` |
| `foundation` | `NSObject`, `NSString`, `NSArray`, `NSDictionary`, `NSSet`, `NSData`, `NSURL`, `NSError`, `NSNumber`, `NSBundle`, `NSDate`, `NSProcessInfo` and friends |
| `metal` | everything named `MTL*`, plus the C functions and constants in `Metal` |
| `metalfx` | MetalFX scalers and frame interpolation: `MTLFX*`, `MTL4FX*` |
| `quartzcore` | `CALayer`, `CAMetalLayer`, `CAMetalDrawable` |
| `coregraphics` | `CGSize`, `CGPoint`, `CGRect`, `CGAffineTransform`, and the `CGColorSpace` functions |
| `appkit` | `NSResponder`, `NSView`, `NSWindow` |

## Requirements

macOS on Apple silicon, Java 25 or newer, and `--enable-native-access=ALL-UNNAMED`
(or `--enable-native-access=io.github.kokodio.metaljvm` on the module path).

## Building

```
./gradlew build
```
