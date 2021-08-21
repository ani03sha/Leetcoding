package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Write a program to solve a Sudoku puzzle by filling the empty cells.
 * <p>
 * A sudoku solution must satisfy all-of-the following rules:
 * <p>
 * Each of the digits 1-9 must occur exactly once in each row.
 * Each of the digits 1-9 must occur exactly once in each column.
 * Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
 * The '.' character indicates empty cells.
 * <p>
 * Constraints:
 * <p>
 * board.length == 9
 * board[i].length == 9
 * board[i][j] is a digit or '.'.
 * It is guaranteed that the input board has only one solution.
 */
public class Problem21_SudokuSolver {

    public char[][] solveSudoku(char[][] board) {
        solveSudokuHelper(board, 0, 0);
        return board;
    }

    private boolean solveSudokuHelper(char[][] board, int row, int column) {
        // Terminal case - it means we have solved
        // the board
        if (row == 9) {
            return true;
        }
        // Next indices to consider
        int nextRow;
        int nextColumn;
        // If we have reached to the last column, then
        // we will move to the next row
        if (column == 8) {
            nextRow = row + 1;
            nextColumn = 0;
        }
        // For all other cases
        else {
            nextRow = row;
            nextColumn = column + 1;
        }
        // Solve for empty cells
        if (board[row][column] != '.') {
            return solveSudokuHelper(board, nextRow, nextColumn);
        } else {
            // Check for every possible value from 1 to 9
            for (char value = '1'; value <= '9'; value++) {
                // Check if the board is valid after putting
                // current value in the current cell
                if (isValidEntry(board, row, column, value)) {
                    board[row][column] = value;
                    // Solve for next cell
                    if (solveSudokuHelper(board, nextRow, nextColumn)) {
                        return true;
                    }
                    // Backtrack
                    board[row][column] = '.';
                }
            }
        }
        return false;
    }

    private boolean isValidEntry(char[][] board, int row, int column, char value) {
        // Check in all the columns
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == value) {
                return false;
            }
        }
        // Check in all rows
        for (int i = 0; i < 9; i++) {
            if (board[i][column] == value) {
                return false;
            }
        }
        // Check in all corresponding sub-matrix
        int x = row / 3 * 3;
        int y = column / 3 * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i + x][j + y] == value) {
                    return false;
                }
            }
        }
        return true;
    }
}
