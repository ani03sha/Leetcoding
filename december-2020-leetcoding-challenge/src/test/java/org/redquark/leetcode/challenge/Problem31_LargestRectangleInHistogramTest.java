package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem31_LargestRectangleInHistogramTest {

    private final Problem31_LargestRectangleInHistogram testObject =
            new Problem31_LargestRectangleInHistogram();

    @Test
    void testLargestRectangleArea() {
        assertEquals(10, testObject.largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3}));
    }
}