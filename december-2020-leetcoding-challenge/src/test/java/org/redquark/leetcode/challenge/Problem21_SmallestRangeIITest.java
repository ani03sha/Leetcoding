package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem21_SmallestRangeIITest {

    private final Problem21_SmallestRangeII testObject = new Problem21_SmallestRangeII();

    @Test
    void testSmallestRangeII() {
        int[] A = new int[]{1};
        int K = 0;
        assertEquals(0, testObject.smallestRangeII(A, K));

        A = new int[]{0, 10};
        K = 2;
        assertEquals(6, testObject.smallestRangeII(A, K));

        A = new int[]{1, 3, 6};
        K = 3;
        assertEquals(3, testObject.smallestRangeII(A, K));
    }
}