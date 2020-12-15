package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem15_SquaresOfASortedArrayTest {

    private final Problem15_SquaresOfASortedArray testObject = new Problem15_SquaresOfASortedArray();

    @Test
    void testSortedSquares() {
        int[] nums = new int[]{-4, -1, 0, 3, 10};
        int[] expected = new int[]{0, 1, 9, 16, 100};
        assertArrayEquals(expected, testObject.sortedSquares(nums));

        nums = new int[]{-7, -3, 2, 3, 11};
        expected = new int[]{4, 9, 9, 49, 121};
        assertArrayEquals(expected, testObject.sortedSquares(nums));
    }
}