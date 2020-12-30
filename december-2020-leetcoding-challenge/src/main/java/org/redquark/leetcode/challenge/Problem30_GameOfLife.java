package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * According to Wikipedia's article: "The Game of Life, also known simply as Life, is a cellular automaton
 * devised by the British mathematician John Horton Conway in 1970."
 * <p>
 * The board is made up of an m x n grid of cells, where each cell has an initial state: live (represented by a 1)
 * or dead (represented by a 0). Each cell interacts with its eight neighbors (horizontal, vertical, diagonal)
 * using the following four rules (taken from the above Wikipedia article):
 * <p>
 * 1. Any live cell with fewer than two live neighbors dies as if caused by under-population.
 * 2. Any live cell with two or three live neighbors lives on to the next generation.
 * 3. Any live cell with more than three live neighbors dies, as if by over-population.
 * 4. Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
 * 5. The next state is created by applying the above rules simultaneously to every cell in the current state,
 * where births and deaths occur simultaneously. Given the current state of the m x n grid board, return the next state.
 * <p>
 * Constraints:
 * <p>
 * m == board.length
 * n == board[i].length
 * 1 <= m, n <= 25
 * board[i][j] is 0 or 1.
 * <p>
 * <p>
 * Follow up:
 * <p>
 * Could you solve it in-place? Remember that the board needs to be updated simultaneously:
 * You cannot update some cells first and then use their updated values to update other cells.
 * In this question, we represent the board using a 2D array. In principle, the board is infinite,
 * which would cause problems when the active area encroaches upon the border of the array (i.e.,
 * live cells reach the border). How would you address these problems?
 */
public class Problem30_GameOfLife {

    /**
     * @param board - input board
     * @return next state of board
     */
    public int[][] gameOfLife(int[][] board) {
        // Base condition
        if (board == null || board.length == 0 || board[0].length == 0) {
            return board;
        }
        // Rows and columns
        int rows = board.length;
        int columns = board[0].length;
        // Resulant
        int[][] result = new int[rows][columns];
        // Loop through each element of the board
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int liveNeighbors = getLiveNeighbors(board, i, j, rows, columns);
                if (board[i][j] == 1 && liveNeighbors < 2) {
                    result[i][j] = 0;
                }
                if (board[i][j] == 1 && (liveNeighbors == 2 || liveNeighbors == 3)) {
                    result[i][j] = board[i][j];
                }
                if (board[i][j] == 1 && liveNeighbors > 3) {
                    result[i][j] = 0;
                }
                if (board[i][j] == 0 && liveNeighbors == 3) {
                    result[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            System.arraycopy(result[i], 0, board[i], 0, columns);
        }
        return board;
    }

    private int getLiveNeighbors(int[][] board, int i, int j, int rows, int columns) {
        int count = 0;
        if (i - 1 >= 0 && j - 1 >= 0 && board[i - 1][j - 1] == 1) {
            count++;
        }
        if (i - 1 >= 0 && j >= 0 && board[i - 1][j] == 1) {
            count++;
        }
        if (i - 1 >= 0 && j + 1 < columns && board[i - 1][j + 1] == 1) {
            count++;
        }
        if (i >= 0 && j - 1 >= 0 && i < rows && board[i][j - 1] == 1) {
            count++;
        }
        if (i >= 0 && i < rows && j + 1 < columns && board[i][j + 1] == 1) {
            count++;
        }
        if (i + 1 < rows && j - 1 >= 0 && board[i + 1][j - 1] == 1) {
            count++;
        }
        if (i + 1 < rows && j >= 0 && j < columns && board[i + 1][j] == 1) {
            count++;
        }
        if (i + 1 < rows && j + 1 < columns && board[i + 1][j + 1] == 1) {
            count++;
        }
        return count;
    }
}
