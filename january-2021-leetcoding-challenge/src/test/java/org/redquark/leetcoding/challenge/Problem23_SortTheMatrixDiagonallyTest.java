package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem23_SortTheMatrixDiagonallyTest {

    private final Problem23_SortTheMatrixDiagonally testObject = new Problem23_SortTheMatrixDiagonally();

    @Test
    void testDiagonalSort() {
        int[][] matrix = new int[][]{{3, 3, 1, 1}, {2, 2, 1, 2}, {1, 1, 1, 2}};
        int[][] expected = new int[][]{{1, 1, 1, 1}, {1, 2, 2, 2}, {1, 2, 3, 3}};
        assertArrayEquals(expected, testObject.diagonalSort(matrix));
    }
}