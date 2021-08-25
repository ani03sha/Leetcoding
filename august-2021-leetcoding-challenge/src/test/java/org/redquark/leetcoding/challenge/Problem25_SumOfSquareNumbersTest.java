package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem25_SumOfSquareNumbersTest {

    private final Problem25_SumOfSquareNumbers testObject = new Problem25_SumOfSquareNumbers();

    @Test
    void testJudgeSquareSum() {
        assertTrue(testObject.judgeSquareSum(5));
        assertFalse(testObject.judgeSquareSum(3));
        assertTrue(testObject.judgeSquareSum(4));
        assertTrue(testObject.judgeSquareSum(2));
        assertTrue(testObject.judgeSquareSum(1));
    }
}