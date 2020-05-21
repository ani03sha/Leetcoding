package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem21_CountSquareSubmatricesTest {

    private final Problem21_CountSquareSubmatrices testObject = new Problem21_CountSquareSubmatrices();

    @Test
    void testCountSquares() {
        int[][] matrix = new int[][]{{0, 1, 1, 1}, {1, 1, 1, 1}, {0, 1, 1, 1}};
        assertEquals(15, testObject.countSquares(matrix));

    }
}