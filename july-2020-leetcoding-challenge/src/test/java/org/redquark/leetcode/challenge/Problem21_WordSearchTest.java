package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem21_WordSearchTest {

    private final Problem21_WordSearch testObject = new Problem21_WordSearch();

    @Test
    void testExist() {
        char[][] board = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word = "ABCCED";
        assertTrue(testObject.exist(board, word));
        word = "SEE";
        assertTrue(testObject.exist(board, word));
        word = "ABCB";
        assertFalse(testObject.exist(board, word));
    }
}