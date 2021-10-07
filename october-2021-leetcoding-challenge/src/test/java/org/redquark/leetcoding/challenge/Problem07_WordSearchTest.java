package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem07_WordSearchTest {

    private final Problem07_WordSearch testObject = new Problem07_WordSearch();

    @Test
    void testExist() {
        char[][] board = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        assertTrue(testObject.exist(board, word));

        board = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        word = "SEE";
        assertTrue(testObject.exist(board, word));

        board = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        word = "ABCB";
        assertFalse(testObject.exist(board, word));
    }
}