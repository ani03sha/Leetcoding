package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given an n x n binary grid board. In each move, you can swap any two rows with each other,
 * or any two columns with each other.
 * <p>
 * Return the minimum number of moves to transform the board into a chessboard board. If the task is impossible,
 * return -1.
 * <p>
 * A chessboard board is a board where no 0's and no 1's are 4-directionally adjacent.
 * <p>
 * Constraints:
 * <p>
 * n == board.length
 * n == board[i].length
 * 2 <= n <= 30
 * board[i][j] is either 0 or 1.
 */
public class Problem26_TransformToChessboard {

    public int movesToChessboard(int[][] board) {
        // Special case
        if (board == null || board.length == 0) {
            return 0;
        }
        // Dimension of the board
        int n = board.length;
        // Number of moves needed in rows
        int rowMovesNeeded = 0;
        // Number of moves needed in columns
        int columnMovesNeeded = 0;
        // Number of ones in first row
        int onesCountInFirstRow = 0;
        // Number of ones in first column
        int onesCountInFirstColumn = 0;
        // Loop through each cell of the grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (((board[0][0] ^ board[i][0]) ^ (board[i][j] ^ board[0][j])) == 1) {
                    return -1;
                }
            }
        }
        // Loop row-wise and column-wise
        for (int i = 0; i < n; i++) {
            onesCountInFirstRow += board[i][0];
            onesCountInFirstColumn += board[0][i];
            // Find the swaps needed
            if (board[i][0] == i % 2) {
                rowMovesNeeded++;
            }
            if (board[0][i] == i % 2) {
                columnMovesNeeded++;
            }
        }
        if (onesCountInFirstRow < n / 2 || onesCountInFirstRow > (n + 1) / 2) {
            return -1;
        }
        if (onesCountInFirstColumn < n / 2 || onesCountInFirstColumn > (n + 1) / 2) {
            return -1;
        }
        // Cases for odd and even n
        if (n % 2 == 1) {
            if (rowMovesNeeded % 2 == 1) {
                rowMovesNeeded = n - rowMovesNeeded;
            }
            if (columnMovesNeeded % 2 == 1) {
                columnMovesNeeded = n - columnMovesNeeded;
            }
        } else {
            rowMovesNeeded = Math.min(rowMovesNeeded, n - rowMovesNeeded);
            columnMovesNeeded = Math.min(columnMovesNeeded, n - columnMovesNeeded);
        }
        return (rowMovesNeeded + columnMovesNeeded) / 2;
    }
}
