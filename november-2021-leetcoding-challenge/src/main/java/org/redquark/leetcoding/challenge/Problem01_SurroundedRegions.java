package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an m x n matrix board containing 'X' and 'O', capture all regions that are 4-directionally surrounded by 'X'.
 * <p>
 * A region is captured by flipping all 'O's into 'X's in that surrounded region.
 * <p>
 * Constraints:
 * <p>
 * m == board.length
 * n == board[i].length
 * 1 <= m, n <= 200
 * board[i][j] is 'X' or 'O'.
 */
public class Problem01_SurroundedRegions {

    public char[][] solve(char[][] board) {
        // Special case
        if (board == null || board.length == 0) {
            return board;
        }
        // Dimensions of the matrix
        int m = board.length;
        int n = board[0].length;
        // Loop through the cells at the borders and mark them
        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O') {
                markCells(board, i, 0);
            }
        }
        for (int i = 0; i < m; i++) {
            if (board[i][n - 1] == 'O') {
                markCells(board, i, n - 1);
            }
        }
        for (int j = 0; j < n; j++) {
            if (board[0][j] == 'O') {
                markCells(board, 0, j);
            }
        }
        for (int j = 0; j < n; j++) {
            if (board[m - 1][j] == 'O') {
                markCells(board, m - 1, j);
            }
        }
        // Now, mark the cells appropriately
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == 'Q') {
                    board[i][j] = 'O';
                }
            }
        }
        return board;
    }

    private void markCells(char[][] board, int i, int j) {
        // Base case
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] == 'Q' || board[i][j] == 'X') {
            return;
        }
        // Mark this cell as visited
        board[i][j] = 'Q';
        // Traverse the neighbors
        markCells(board, i - 1, j);
        markCells(board, i + 1, j);
        markCells(board, i, j - 1);
        markCells(board, i, j + 1);
    }
}
