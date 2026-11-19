package com.cheonjaeung.hangulkt

/**
 * Returns `true` if this string ends with a batchim (받침, final consonant).
 *
 * Batchim is a final consonant in a complete Hangul syllable, such as `ㄱ` in `각` or `ㅄ` in `값`.
 *
 * It returns `false` if this string is empty or the last character isn't a complete Hangul
 * syllable, such as `ㄱ` or `ㅏ`, or a non-Hangul character.
 *
 * For example, it returns the following results:
 *
 * ```
 * "가".endsWithBatchim() // false
 * "각".endsWithBatchim() // true
 * "값".endsWithBatchim() // true
 * "사과".endsWithBatchim() // false
 * "감귤".endsWithBatchim() // true
 * "용과".endsWithBatchim() // false
 * "밥값".endsWithBatchim() // true
 * "ㄱ".endsWithBatchim() // false
 * "a".endsWithBatchim() // false
 * "".endsWithBatchim() // false
 * ```
 *
 * @see endsWithSingleBatchim
 * @see endsWithDoubleBatchim
 */
public fun String.endsWithBatchim(): Boolean {
    if (this.isEmpty()) return false
    val lastChar = this.last()
    if (!lastChar.isCompleteHangul()) return false
    return lastChar.jongseongIndex() != 0
}

/**
 * Returns `true` if this string ends with a single batchim (홑받침, single consonant).
 *
 * Batchim is a final consonant in a complete Hangul syllable, such as `ㄱ` in `각` or `ㅄ` in `값`.
 * Single batchim is a batchim with one consonant, such as `ㄱ` in `각` or `ㅂ` in `밥`.
 * A batchim with two of the same consonant, such as `ㄲ` in `깎`, is a single batchim, not a double
 * batchim.
 *
 * It returns `false` if this string is empty or the last character isn't a complete Hangul
 * syllable, such as `ㄱ` or `ㅏ`, or a non-Hangul character.
 *
 * For example, it returns the following results:
 *
 * ```
 * "가".endsWithSingleBatchim() // false
 * "각".endsWithSingleBatchim() // true
 * "깎".endsWithSingleBatchim() // true
 * "값".endsWithSingleBatchim() // false
 * "사과".endsWithSingleBatchim() // false
 * "감귤".endsWithSingleBatchim() // true
 * "용과".endsWithSingleBatchim() // false
 * "밥값".endsWithSingleBatchim() // false
 * "ㄱ".endsWithSingleBatchim() // false
 * "a".endsWithSingleBatchim() // false
 * "".endsWithSingleBatchim() // false
 * ```
 *
 * @see endsWithBatchim
 * @see endsWithDoubleBatchim
 */
public fun String.endsWithSingleBatchim(): Boolean {
    if (this.isEmpty()) return false
    val lastChar = this.last()
    if (!lastChar.isCompleteHangul()) return false
    val jongseongIndex = lastChar.jongseongIndex()
    return jongseongIndex != 0 && !jongseongIndex.isDoubleJongseongIndex()
}

/**
 * Returns `true` if this string ends with a double batchim (겹받침, double consonant or
 * consonant cluster).
 *
 * Batchim is a final consonant in a complete Hangul syllable, such as `ㄱ` in `각` or `ㅄ` in `값`.
 * Double batchim is a batchim with two different consonants, such as `ㅄ` in `값` or `ㄳ` in `넋`.
 * A batchim with two of the same consonant, such as `ㄲ` in `깎`, is a single batchim, not a double
 * batchim.
 *
 * It returns `false` if this string is empty or the last character isn't a complete Hangul
 * syllable, such as `ㄱ` or `ㅏ`, or a non-Hangul character.
 *
 * For example, it returns the following results:
 *
 * ```
 * "가".endsWithDoubleBatchim() // false
 * "각".endsWithDoubleBatchim() // false
 * "깎".endsWithDoubleBatchim() // false
 * "값".endsWithDoubleBatchim() // true
 * "사과".endsWithDoubleBatchim() // false
 * "감귤".endsWithDoubleBatchim() // false
 * "용과".endsWithDoubleBatchim() // false
 * "밥값".endsWithDoubleBatchim() // true
 * "ㄱ".endsWithDoubleBatchim() // false
 * "a".endsWithDoubleBatchim() // false
 * "".endsWithDoubleBatchim() // false
 * ```
 *
 * @see endsWithBatchim
 * @see endsWithSingleBatchim
 */
public fun String.endsWithDoubleBatchim(): Boolean {
    if (this.isEmpty()) return false
    val lastChar = this.last()
    val jongseongIndex = lastChar.jongseongIndex()
    return jongseongIndex != 0 && jongseongIndex.isDoubleJongseongIndex()
}

/**
 * Returns `true` if this [Char] is a complete Hangul character, such as '가'.
 */
private fun Char.isCompleteHangul(): Boolean = this in '가'..'힣'

private fun Char.jongseongIndex(): Int = (this.code - '가'.code) % JONGSEONG_COUNT

private fun Int.isDoubleJongseongIndex(): Boolean {
    return this == 3 || this == 5 || this == 6 || this in 9..15 || this == 18
}

private const val JONGSEONG_COUNT: Int = 28
