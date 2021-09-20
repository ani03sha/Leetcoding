package org.redquark.leetcoding.challenge;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 * <p>
 * Tic-tac-toe is played by two players A and B on a 3 x 3 grid.
 * <p>
 * Here are the rules of Tic-Tac-Toe:
 * <p>
 * Players take turns placing characters into empty squares (" ").
 * The first player A always places "X" characters, while the second player B always places "O" characters.
 * "X" and "O" characters are always placed into empty squares, never on filled ones.
 * The game ends when there are 3 of the same (non-empty) character filling any row, column, or diagonal.
 * The game also ends if all squares are non-empty.
 * No more moves can be played if the game is over.
 * Given an array moves where each element is another array of size 2 corresponding to the row and column of
 * the grid where they mark their respective character in the order in which A and B play.
 * <p>
 * Return the winner of the game if it exists (A or B), in case the game ends in a draw return "Draw",
 * if there are still movements to play return "Pending".
 * <p>
 * You can assume that moves is valid (It follows the rules of Tic-Tac-Toe), the grid is initially empty and A
 * will play first.
 * <p>
 * Constraints:
 * <p>
 * 1 <= moves.length <= 9
 * moves[i].length == 2
 * 0 <= moves[i][j] <= 2
 * There are no repeated elements on moves.
 * moves follow the rules of tic-tac-toe.
 */
public class Problem20_FindWinnerOnATicTacToeGame {

    public String ticTacToe(int[][] moves) {
        // Length of the moves array
        int n = moves.length;
        // Create a board
        char[][] board = new char[3][3];
        // Create the board with default values
        Arrays.stream(board).forEach(cell -> Arrays.fill(cell, '.'));
        // Populate the board according to the moves array
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                board[moves[i][0]][moves[i][1]] = 'X';
            } else {
                board[moves[i][0]][moves[i][1]] = 'O';
            }
        }
        // Check the board state
        // Check for all rows
        for (int i = 0; i < 3; i++) {
            // Count of Xs and Os
            int countX = 0;
            int countO = 0;
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 'X') {
                    countX++;
                } else if (board[i][j] == 'O') {
                    countO++;
                }
            }
            if (countX == 3) {
                return "A";
            }
            if (countO == 3) {
                return "B";
            }
        }
        // Check for all columns
        for (int i = 0; i < 3; i++) {
            // Count of Xs and Os
            int countX = 0;
            int countO = 0;
            for (int j = 0; j < 3; j++) {
                if (board[j][i] == 'X') {
                    countX++;
                } else if (board[j][i] == 'O') {
                    countO++;
                }
            }
            if (countX == 3) {
                return "A";
            }
            if (countO == 3) {
                return "B";
            }
        }
        // Check diagonals
        if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
            return "A";
        }
        if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
            return "B";
        }
        if (board[2][0] == 'X' && board[1][1] == 'X' && board[0][2] == 'X') {
            return "A";
        }
        if (board[2][0] == 'O' && board[1][1] == 'O' && board[0][2] == 'O') {
            return "B";
        }
        // Count of filled cells
        int filledCells = 0;
        // Check for draw
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 'X' || board[i][j] == 'O') {
                    filledCells++;
                }
            }
        }
        return filledCells == 9 ? "Draw" : "Pending";
    }
}
