package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a 2D board and a word, find if the word exists in the grid.
 * <p>
 * The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are
 * those horizontally or vertically neighboring. The same letter cell may not be used more than once.
 * <p>
 * Constraints:
 * <p>
 * 1. board and word consists only of lowercase and uppercase English letters.
 * 2. 1 <= board.length <= 200
 * 3. 1 <= board[i].length <= 200
 * 4. 1 <= word.length <= 10^3
 */
public class Problem21_WordSearch {

    // This array represents if the element at i,j is visited
    private boolean[][] visited;

    /**
     * @param board - board of characters
     * @param word  - word to be searched
     * @return true, if word exists, false, otherwise
     */
    public boolean exist(char[][] board, String word) {
        // Lengths of rows and columns
        int rows = board.length;
        int columns = board[0].length;
        // Initialize the visited array
        visited = new boolean[rows][columns];
        // Loop for the board
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (word.charAt(0) == board[i][j] && searchWord(i, j, 0, word, board)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean searchWord(int i, int j, int index, String word, char[][] board) {
        if (index == word.length()) {
            return true;
        }
        if (i < 0 || i >= board.length
                || j < 0 || j >= board[0].length
                || word.charAt(index) != board[i][j]
                || visited[i][j]) {
            return false;
        }
        visited[i][j] = true;
        if (searchWord(i + 1, j, index + 1, word, board) ||
                searchWord(i - 1, j, index + 1, word, board) ||
                searchWord(i, j + 1, index + 1, word, board) ||
                searchWord(i, j - 1, index + 1, word, board)) {
            return true;
        }
        visited[i][j] = false;
        return false;
    }
}
