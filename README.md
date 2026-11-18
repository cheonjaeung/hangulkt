# hangulkt

English | [한국어](README.ko.md)

A Kotlin Multiplatform port of [es-hangul](https://github.com/toss/es-hangul) with idiomatic Kotlin APIs for handling Hangul (Korean) characters.

> [!IMPORTANT]
> **hangulkt** is under development and not ready for production use.

**hangulkt** aims to provide the same features as [es-hangul](https://github.com/toss/es-hangul), while feeling natural in Kotlin.

- Extension functions on `Char` and `String` instead of a plain 1:1 port of the API.
- Lightweight single artifact.
- No dependencies except the Kotlin standard library.
- As many Kotlin Multiplatform targets as possible.
- Java-friendly API on Kotlin/JVM.

On the other hand, the following are not goals of **hangulkt**:

- 1:1 API compatibility with [es-hangul](https://github.com/toss/es-hangul). APIs are designed to fit Kotlin conventions.
- Korean language processing beyond the scope of [es-hangul](https://github.com/toss/es-hangul).

## Thanks to

Special thanks to the Toss team and all contributors of [es-hangul](https://github.com/toss/es-hangul) for their great work.

## License

**hangulkt** is licensed under the [MIT License](LICENSE.txt).

This project is an unofficial port of [es-hangul](https://github.com/toss/es-hangul), which is also licensed under the [MIT License](https://github.com/toss/es-hangul/blob/main/LICENSE) by Viva Republica, Inc.
