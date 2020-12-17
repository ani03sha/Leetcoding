package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem17_4SumIITest {

    private final Problem17_4SumII testObject = new Problem17_4SumII();

    @Test
    void testFourSumCount() {
        int[] A = {1, 2};
        int[] B = {-2, -1};
        int[] C = {-1, 2};
        int[] D = {0, 2};
        assertEquals(2, testObject.fourSumCount(A, B, C, D));
    }
}