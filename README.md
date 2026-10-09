# metal-jvm

Java bindings for Apple Metal, in the spirit of metal-cpp: thin wrappers over the Objective-C API built on the
Foreign Function & Memory API.

## Requirements

macOS on Apple silicon, Java 25 or newer, and `--enable-native-access=ALL-UNNAMED`
(or `--enable-native-access=io.github.kokodio.metaljvm` on the module path).

## Building

```
./gradlew build
```
