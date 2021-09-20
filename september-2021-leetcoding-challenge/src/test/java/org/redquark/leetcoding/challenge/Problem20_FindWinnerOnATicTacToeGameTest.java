package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem20_FindWinnerOnATicTacToeGameTest {

    private final Problem20_FindWinnerOnATicTacToeGame testObject = new Problem20_FindWinnerOnATicTacToeGame();

    @Test
    void testTicTacToe() {
        int[][] moves = new int[][]{
                {0, 0},
                {2, 0},
                {1, 1},
                {2, 1},
                {2, 2}
        };
        assertEquals("A", testObject.ticTacToe(moves));

        moves = new int[][]{
                {0, 0},
                {1, 1},
                {0, 1},
                {0, 2},
                {1, 0},
                {2, 0}
        };
        assertEquals("B", testObject.ticTacToe(moves));

        moves = new int[][]{
                {0, 0},
                {1, 1},
                {2, 0},
                {1, 0},
                {1, 2},
                {2, 1},
                {0, 1},
                {0, 2},
                {2, 2}
        };
        assertEquals("Draw", testObject.ticTacToe(moves));

        moves = new int[][]{
                {0, 0},
                {1, 1}
        };
        assertEquals("Pending", testObject.ticTacToe(moves));
    }
}