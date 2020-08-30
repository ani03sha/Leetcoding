package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem30_LargestComponentSizeByCommonFactorTest {

    private final Problem30_LargestComponentSizeByCommonFactor testObject =
            new Problem30_LargestComponentSizeByCommonFactor();

    @Test
    void testLargestComponentSize() {
        int[] A = new int[]{4, 6, 15, 35};
        assertEquals(4, testObject.largestComponentSize(A));

        A = new int[]{20, 50, 9, 63};
        assertEquals(2, testObject.largestComponentSize(A));

        A = new int[]{2, 3, 6, 7, 4, 12, 21, 39};
        assertEquals(8, testObject.largestComponentSize(A));
    }
}