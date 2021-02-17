package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem17_ContainerWithMostWaterTest {

    private final Problem17_ContainerWithMostWater testObject = new Problem17_ContainerWithMostWater();

    @Test
    void testMaxArea() {
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        assertEquals(49, testObject.maxArea(height));

        height = new int[]{1, 1};
        assertEquals(1, testObject.maxArea(height));

        height = new int[]{4, 3, 2, 1, 4};
        assertEquals(16, testObject.maxArea(height));

        height = new int[]{1, 2, 1};
        assertEquals(2, testObject.maxArea(height));
    }
}