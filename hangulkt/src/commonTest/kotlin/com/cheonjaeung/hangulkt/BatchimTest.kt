package com.cheonjaeung.hangulkt

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class BatchimTest {
    @Test
    fun testEndsWithBatchimReturnsTrueForStringWithTrailingBatchim() {
        assertTrue("받침".endsWithBatchim())
        assertTrue("한글".endsWithBatchim())
        assertTrue("서울".endsWithBatchim())
        assertTrue("밥값".endsWithBatchim())
        assertTrue("창밖".endsWithBatchim())
    }

    @Test
    fun testEndsWithBatchimReturnsFalseForStringWithNoTrailingBatchim() {
        assertFalse("사과".endsWithBatchim())
        assertFalse("딸기".endsWithBatchim())
        assertFalse("안녕!".endsWithBatchim())
    }

    @Test
    fun testEndsWithBatchimReturnsFalseForNonHangul() {
        assertFalse("".endsWithBatchim())
        assertFalse("a".endsWithBatchim())
        assertFalse("1".endsWithBatchim())
        assertFalse("&".endsWithBatchim())
    }

    @Test
    fun testEndsWithBatchimReturnsFalseForNotCompleteHangul() {
        assertFalse("ㄱ".endsWithBatchim())
        assertFalse("ㄲ".endsWithBatchim())
        assertFalse("ㄳ".endsWithBatchim())
        assertFalse("ㅏ".endsWithBatchim())
    }

    @Test
    fun testEndsWithSingleBatchimReturnsTrueForStringWithTrailingSingleBatchim() {
        assertTrue("받침".endsWithSingleBatchim())
        assertTrue("한글".endsWithSingleBatchim())
        assertTrue("서울".endsWithSingleBatchim())
        assertTrue("창밖".endsWithSingleBatchim())
    }

    @Test
    fun testEndsWithSingleBatchimReturnsFalseForStringWithNoTrailingSingleBatchim() {
        assertFalse("밥값".endsWithSingleBatchim())
        assertFalse("사과".endsWithSingleBatchim())
        assertFalse("딸기".endsWithSingleBatchim())
        assertFalse("안녕!".endsWithSingleBatchim())
    }

    @Test
    fun testEndsWithSingleBatchimReturnsFalseForNonHangul() {
        assertFalse("".endsWithSingleBatchim())
        assertFalse("a".endsWithSingleBatchim())
        assertFalse("1".endsWithSingleBatchim())
        assertFalse("&".endsWithSingleBatchim())
    }

    @Test
    fun testEndsWithSingleBatchimReturnsFalseForNotCompleteHangul() {
        assertFalse("ㄱ".endsWithSingleBatchim())
        assertFalse("ㄲ".endsWithSingleBatchim())
        assertFalse("ㄳ".endsWithSingleBatchim())
        assertFalse("ㅏ".endsWithSingleBatchim())
    }

    @Test
    fun testEndsWithDoubleBatchimReturnsTrueForStringWithTrailingDoubleBatchim() {
        assertTrue("밥값".endsWithDoubleBatchim())
        assertTrue("뱃삯".endsWithDoubleBatchim())
    }

    @Test
    fun testEndsWithDoubleBatchimReturnsFalseForStringWithNoTrailingDoubleBatchim() {
        assertFalse("창밖".endsWithDoubleBatchim())
        assertFalse("서울".endsWithDoubleBatchim())
        assertFalse("사과".endsWithDoubleBatchim())
        assertFalse("닭고기".endsWithDoubleBatchim())
        assertFalse("안녕!".endsWithDoubleBatchim())
    }

    @Test
    fun testEndsWithDoubleBatchimReturnsFalseForNonHangul() {
        assertFalse("".endsWithDoubleBatchim())
        assertFalse("a".endsWithDoubleBatchim())
        assertFalse("1".endsWithDoubleBatchim())
        assertFalse("&".endsWithDoubleBatchim())
    }

    @Test
    fun testEndsWithDoubleBatchimReturnsFalseForNotCompleteHangul() {
        assertFalse("ㄱ".endsWithDoubleBatchim())
        assertFalse("ㄲ".endsWithDoubleBatchim())
        assertFalse("ㄳ".endsWithDoubleBatchim())
        assertFalse("ㅏ".endsWithDoubleBatchim())
    }
}
