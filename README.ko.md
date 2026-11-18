# hangulkt

[English](README.md) | 한국어

[es-hangul](https://github.com/toss/es-hangul)을 Kotlin Multiplatform으로 옮긴 라이브러리로, Kotlin다운 API로 한글을 다루는 기능을 제공합니다.

> [!IMPORTANT]
> **hangulkt**는 현재 개발 중인 프로젝트이며 아직 프로덕션 사용에 적합하지 않습니다.

**hangulkt**는 [es-hangul](https://github.com/toss/es-hangul)과 같은 기능을 Kotlin에서 자연스럽게 사용할 수 있도록 하는 것을 목표로 합니다.

- 단순히 1:1로 API를 옮기는 대신 `Char`와 `String`의 확장 함수를 제공합니다.
- 가벼운 단일 아티팩트로 제공합니다.
- Kotlin 표준 라이브러리를 제외한 다른 의존성을 사용하지 않습니다.
- 가능한 한 많은 Kotlin Multiplatform 타깃을 지원합니다.
- Kotlin/JVM에서는 Java 친화적인 API를 제공합니다.

반면, 다음과 같은 항목은 **hangulkt**의 목표가 아닙니다.

- [es-hangul](https://github.com/toss/es-hangul)과의 1:1 API 호환. API는 Kotlin 컨벤션에 맞게 설계됩니다.
- [es-hangul](https://github.com/toss/es-hangul)의 범위를 벗어나는 한국어 처리 기능.

## 감사의 말

훌륭한 라이브러리를 만드신 Toss 팀과 [es-hangul](https://github.com/toss/es-hangul)의 모든 기여자분께 감사드립니다.

## 라이선스

hangulkt는 [MIT License](LICENSE.txt)를 따릅니다.

이 프로젝트는 [es-hangul](https://github.com/toss/es-hangul)의 비공식 포트이며, es-hangul 역시 Viva Republica, Inc의 [MIT License](https://github.com/toss/es-hangul/blob/main/LICENSE)를 따릅니다.
