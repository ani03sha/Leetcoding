package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem18_NumbersWithSameConsecutiveDifferencesTest {

    private final Problem18_NumbersWithSameConsecutiveDifferences testObject
            = new Problem18_NumbersWithSameConsecutiveDifferences();

    @Test
    void testNumbersSameConsecutiveDifference() {
        int N = 3;
        int K = 7;
        int[] expected = new int[]{181, 292, 707, 818, 929};
        assertArrayEquals(expected, testObject.numbersSameConsecutiveDifference(N, K));

        N = 2;
        K = 1;
        expected = new int[]{10, 12, 21, 23, 32, 34, 43, 45, 54, 56, 65, 67, 76, 78, 87, 89, 98};
        assertArrayEquals(expected, testObject.numbersSameConsecutiveDifference(N, K));
    }
}