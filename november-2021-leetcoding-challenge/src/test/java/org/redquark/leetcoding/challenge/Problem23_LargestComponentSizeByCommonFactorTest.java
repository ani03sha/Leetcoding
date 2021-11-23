package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem23_LargestComponentSizeByCommonFactorTest {

    private final Problem23_LargestComponentSizeByCommonFactor testObject = new Problem23_LargestComponentSizeByCommonFactor();

    @Test
    void testLargestComponentSize() {
        int[] nums = new int[]{4, 6, 15, 35};
        assertEquals(4, testObject.largestComponentSize(nums));

        nums = new int[]{20, 50, 9, 63};
        assertEquals(2, testObject.largestComponentSize(nums));

        nums = new int[]{2, 3, 6, 7, 4, 12, 21, 39};
        assertEquals(8, testObject.largestComponentSize(nums));
    }
}