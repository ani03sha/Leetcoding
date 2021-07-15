package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem15_ValidTriangleNumberTest {

    private final Problem15_ValidTriangleNumber testObject = new Problem15_ValidTriangleNumber();

    @Test
    void testTriangleNumber() {
        int[] nums = new int[]{2, 2, 3, 4};
        assertEquals(3, testObject.triangleNumber(nums));

        nums = new int[]{4, 2, 3, 4};
        assertEquals(4, testObject.triangleNumber(nums));
    }
}