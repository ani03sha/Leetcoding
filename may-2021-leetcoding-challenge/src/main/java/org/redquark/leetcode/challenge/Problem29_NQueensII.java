package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no
 * two queens attack each other.
 * <p>
 * Given an integer n, return the number of distinct solutions to the n-queens puzzle.
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 9
 */
public class Problem29_NQueensII {

    private int count = 0;

    public int totalNQueens(int n) {
        // Boolean arrays to mark if there is a queen on
        // the same column, same diagonal or same anti-diagonal
        boolean[] columns = new boolean[n];
        boolean[] diagonals = new boolean[2 * n];
        boolean[] antiDiagonals = new boolean[2 * n];
        // Backtracking
        backtrack(0, n, columns, diagonals, antiDiagonals);
        return count;
    }

    private void backtrack(int row, int n, boolean[] columns, boolean[] diagonals, boolean[] antiDiagonals) {
        if (row == n) {
            count++;
        }
        for (int column = 0; column < n; column++) {
            // Diagonal level
            int diagonal = row - column + n;
            // Anti diagonal level
            int antiDiagonal = row + column;
            if (columns[column] || diagonals[diagonal] || antiDiagonals[antiDiagonal]) {
                continue;
            }
            columns[column] = true;
            diagonals[diagonal] = true;
            antiDiagonals[antiDiagonal] = true;
            backtrack(row + 1, n, columns, diagonals, antiDiagonals);
            columns[column] = false;
            diagonals[diagonal] = false;
            antiDiagonals[antiDiagonal] = false;
        }
    }
}
