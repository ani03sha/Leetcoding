package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * There is an m x n grid with a ball. The ball is initially at the position [startRow, startColumn].
 * You are allowed to move the ball to one of the four adjacent four cells in the grid (possibly out
 * of the grid crossing the grid boundary). You can apply at most maxMove moves to the ball.
 * <p>
 * Given the five integers m, n, maxMove, startRow, startColumn, return the number of paths to move the
 * ball out of the grid boundary. Since the answer can be very large, return it modulo 10^9 + 7.
 * <p>
 * Constraints:
 * <p>
 * 1 <= m, n <= 50
 * 0 <= maxMove <= 50
 * 0 <= startRow <= m
 * 0 <= startColumn <= n
 */
public class Problem24_OutOfBoundaryPaths {

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        // Special case
        if (maxMove == 0) {
            return 0;
        }
        // Directions array
        int[][] directions = new int[][]{{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
        // Lookup table to store intermediate results
        int[][][] lookup = new int[maxMove + 1][m][n];
        // Populate the table for all moves and combinations
        // of rows and columns
        for (int move = 1; move <= maxMove; move++) {
            for (int row = 0; row < m; row++) {
                for (int column = 0; column < n; column++) {
                    int rowTemp;
                    int columnTemp;
                    for (int direction = 0; direction < 4; direction++) {
                        rowTemp = row + directions[direction][0];
                        columnTemp = column + directions[direction][1];
                        // Boundary limits
                        if (rowTemp < 0 || rowTemp >= m || columnTemp < 0 || columnTemp >= n) {
                            lookup[move][row][column] += 1;
                        } else {
                            lookup[move][row][column] = (lookup[move][row][column] + lookup[move - 1][rowTemp][columnTemp]) % 1000000007;
                        }
                    }
                }
            }
        }
        return lookup[maxMove][startRow][startColumn];
    }
}
