package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem26_TransformToChessboardTest {

    private final Problem26_TransformToChessboard testObject = new Problem26_TransformToChessboard();

    @Test
    void testMovesToChessboard() {
        int[][] board = new int[][]{
                {0, 1, 1, 0},
                {0, 1, 1, 0},
                {1, 0, 0, 1},
                {1, 0, 0, 1}
        };
        assertEquals(2, testObject.movesToChessboard(board));

        board = new int[][]{
                {0, 1},
                {1, 0}
        };
        assertEquals(0, testObject.movesToChessboard(board));

        board = new int[][]{
                {1, 0},
                {1, 0}
        };
        assertEquals(-1, testObject.movesToChessboard(board));
    }
}