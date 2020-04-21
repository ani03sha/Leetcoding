package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.leetcode.challenge.Challenge21_LeftmostColumnWithAtleastAOne.BinaryMatrix;
import static org.redquark.leetcode.challenge.Challenge21_LeftmostColumnWithAtleastAOne.BinaryMatrixImpl;


class Challenge21_LeftmostColumnWithAtleastAOneTest {

    private final Challenge21_LeftmostColumnWithAtleastAOne testObject = new Challenge21_LeftmostColumnWithAtleastAOne();

    @Test
    void leftMostColumnWithOne() {
        int[][] matrix = new int[][]{{0, 0}, {1, 1}};
        BinaryMatrix binaryMatrix = new BinaryMatrixImpl(matrix);
        assertEquals(1, testObject.leftMostColumnWithOne(binaryMatrix));

        matrix = new int[][]{{0, 0}, {0, 1}};
        binaryMatrix = new BinaryMatrixImpl(matrix);
        assertEquals(1, testObject.leftMostColumnWithOne(binaryMatrix));

        matrix = new int[][]{{0, 0}, {0, 0}};
        binaryMatrix = new BinaryMatrixImpl(matrix);
        assertEquals(-1, testObject.leftMostColumnWithOne(binaryMatrix));

        matrix = new int[][]{{0, 0, 0, 1}, {0, 0, 1, 1}, {0, 1, 1, 1}};
        binaryMatrix = new BinaryMatrixImpl(matrix);
        assertEquals(1, testObject.leftMostColumnWithOne(binaryMatrix));
    }
}