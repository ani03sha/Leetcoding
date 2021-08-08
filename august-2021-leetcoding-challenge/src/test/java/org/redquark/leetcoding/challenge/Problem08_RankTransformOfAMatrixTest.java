package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem08_RankTransformOfAMatrixTest {

    private final Problem08_RankTransformOfAMatrix testObject = new Problem08_RankTransformOfAMatrix();

    @Test
    void testMatrixRankTransform() {
        int[][] matrix = new int[][]{
                {1, 2},
                {3, 4}
        };
        int[][] expected = new int[][]{
                {1, 2},
                {2, 3}
        };
        assertArrayEquals(expected, testObject.matrixRankTransform(matrix));

        matrix = new int[][]{
                {7, 7},
                {7, 7}
        };
        expected = new int[][]{
                {1, 1},
                {1, 1}
        };
        assertArrayEquals(expected, testObject.matrixRankTransform(matrix));

        matrix = new int[][]{
                {20, -21, 14},
                {-19, 4, 19},
                {22, -47, 24},
                {-19, 4, 19}
        };
        expected = new int[][]{
                {4, 2, 3},
                {1, 3, 4},
                {5, 1, 6},
                {1, 3, 4}
        };
        assertArrayEquals(expected, testObject.matrixRankTransform(matrix));
    }
}