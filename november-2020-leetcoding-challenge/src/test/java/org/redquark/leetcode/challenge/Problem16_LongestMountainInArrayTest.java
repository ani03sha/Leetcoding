package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem16_LongestMountainInArrayTest {

    private final Problem16_LongestMountainInArray testObject = new Problem16_LongestMountainInArray();

    @Test
    void testLongestMountain() {
        int[] A = new int[]{2, 1, 4, 7, 3, 2, 5};
        assertEquals(5, testObject.longestMountain(A));

        A = new int[]{2, 2, 2};
        assertEquals(0, testObject.longestMountain(A));
    }
}