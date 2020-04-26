package org.redquark.leetcode.learn.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem03_SquaresOfSortedArrayTest {

    private final Problem03_SquaresOfSortedArray testObject = new Problem03_SquaresOfSortedArray();

    @Test
    void sortedSquares() {
        int[] A = new int[]{-4, -1, 0, 3, 10};
        int[] expected = new int[]{0, 1, 9, 16, 100};
        assertArrayEquals(expected, testObject.sortedSquares(A));

        A = new int[]{-7, -3, 2, 3, 11};
        expected = new int[]{4, 9, 9, 49, 121};
        assertArrayEquals(expected, testObject.sortedSquares(A));
    }
}