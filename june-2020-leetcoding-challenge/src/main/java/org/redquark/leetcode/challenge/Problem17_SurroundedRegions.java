package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a 2D board containing 'X' and 'O' (the letter O), capture all regions surrounded by 'X'.
 * <p>
 * A region is captured by flipping all 'O's into 'X's in that surrounded region.
 * <p>
 * Explanation:
 * <p>
 * Surrounded regions shouldn’t be on the border, which means that any 'O' on the border of the board are
 * not flipped to 'X'.
 * Any 'O' that is not on the border and it is not connected to an 'O' on the border will be flipped to 'X'.
 * Two cells are connected if they are adjacent cells connected horizontally or vertically.
 */
public class Problem17_SurroundedRegions {

    /**
     * @param board - input board of characters
     * @return updated board
     */
    public char[][] solve(char[][] board) {
        // Base condition
        if (board.length == 0 || board[0].length == 0) {
            return board;
        }
        // Find rows and columns
        int rows = board.length;
        int columns = board[0].length;
        // Check for the boundaries
        for (int i = 0; i < rows; i++) {
            if (board[i][0] == 'O') {
                dfs(board, i, 0);
            }
            if (board[i][columns - 1] == 'O') {
                dfs(board, i, columns - 1);
            }
        }
        for (int i = 0; i < columns; i++) {
            if (board[0][i] == 'O') {
                dfs(board, 0, i);
            }
            if (board[rows - 1][i] == 'O') {
                dfs(board, rows - 1, i);
            }
        }
        // Check for all others
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == '*') {
                    board[i][j] = 'O';
                }
            }
        }
        return board;
    }

    private void dfs(char[][] board, int i, int j) {
        if (i > board.length - 1 || i < 0 || j > board[0].length || j < 0) {
            return;
        }
        if (board[i][j] == 'O') {
            board[i][j] = '*';
        }
        if (i > 0 && board[i - 1][j] == 'O') {
            dfs(board, i - 1, j);
        }
        if (i < board.length - 1 && board[i + 1][j] == 'O') {
            dfs(board, i + 1, j);
        }
        if (j > 0 && board[i][j - 1] == 'O') {
            dfs(board, i, j - 1);
        }
        if (j < board[0].length - 1 && board[i][j + 1] == 'O') {
            dfs(board, i, j + 1);
        }
    }
}
