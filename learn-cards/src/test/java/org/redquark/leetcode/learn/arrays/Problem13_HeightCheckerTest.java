package org.redquark.leetcode.learn.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem13_HeightCheckerTest {

    private final Problem13_HeightChecker testObject = new Problem13_HeightChecker();

    @Test
    void testHeightChecker() {
        int[] heights = new int[]{1, 1, 4, 2, 1, 3};
        assertEquals(3, testObject.heightChecker(heights));

        heights = new int[]{1, 2, 3, 4, 5};
        assertEquals(0, testObject.heightChecker(heights));

        heights = new int[]{5, 1, 2, 3, 4};
        assertEquals(5, testObject.heightChecker(heights));
    }
}