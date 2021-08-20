package org.redquark.leetcoding.challenge;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Anirudh Sharma
 * <p>
 * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the
 * following rules:
 * <p>
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 * Note:
 * <p>
 * A Sudoku board (partially filled) could be valid but is not necessarily solvable.
 * Only the filled cells need to be validated according to the mentioned rules.
 * <p>
 * Constraints:
 * <p>
 * board.length == 9
 * board[i].length == 9
 * board[i][j] is a digit or '.'.
 */
public class Problem20_ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        // Special cases
        if (board == null || board.length < 9) {
            return false;
        }
        // Set to store all the values that we have
        // seen in row, column or 3X3 sub-boxes
        Set<String> seen = new HashSet<>();
        // Loop through the entire board cell by cell
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                // Current value
                char c = board[i][j];
                // Check if the current cell is not an
                // empty cell
                if (c != '.') {
                    // If we have already seen the value
                    // in respective row or column or
                    // sub-box then we will return false
                    if (!seen.add(c + " present in row " + i)
                            || !seen.add(c + " present in column " + j)
                            || !seen.add(c + " present in sub-box " + (i / 3) + " - " + (j / 3))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
