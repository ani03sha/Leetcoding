package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem25_RotateImageTest {

    private final Problem25_RotateImage testObject = new Problem25_RotateImage();

    @Test
    void testRotate() {
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] expected = new int[][]{
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };
        assertArrayEquals(expected, testObject.rotate(matrix));

        matrix = new int[][]{
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}
        };
        expected = new int[][]{
                {15, 13, 2, 5},
                {14, 3, 4, 1},
                {12, 6, 8, 9},
                {16, 7, 10, 11}
        };
        assertArrayEquals(expected, testObject.rotate(matrix));

        matrix = new int[][]{
                {1}
        };
        expected = new int[][]{
                {1}
        };
        assertArrayEquals(expected, testObject.rotate(matrix));

        matrix = new int[][]{
                {1, 2},
                {3, 4}
        };
        expected = new int[][]{
                {3, 1},
                {4, 2}
        };
        assertArrayEquals(expected, testObject.rotate(matrix));
    }
}