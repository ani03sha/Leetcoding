package org.redquark.leetcode.challenge;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a m * n matrix mat of ones (representing soldiers) and zeros (representing civilians),
 * return the indexes of the k weakest rows in the matrix ordered from the weakest to the strongest.
 * <p>
 * A row i is weaker than row j, if the number of soldiers in row i is less than the number of
 * soldiers in row j, or they have the same number of soldiers but i is less than j.
 * <p>
 * Soldiers are always stand in the frontier of a row, that is, always ones may appear first
 * and then zeros.
 * <p>
 * Constraints:
 * <p>
 * m == mat.length
 * n == mat[i].length
 * 2 <= n, m <= 100
 * 1 <= k <= m
 * matrix[i][j] is either 0 or 1.
 */
public class Problem15_TheKWeakestRowsInAMatrix {

    public int[] kWeakestRows(int[][] matrix, int k) {
        // Result to be stored in this array
        int[] weakestRows = new int[k];
        // 2D array to store sum of the row and index
        // of the row
        int[][] rowSum = new int[matrix.length][2];
        for (int i = 0; i < matrix.length; i++) {
            rowSum[i][0] = IntStream.of(matrix[i]).sum();
            rowSum[i][1] = i;
        }
        // Sort the array by sum of the rows
        Arrays.sort(rowSum, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        // Loop until k to get the results
        for (int i = 0; i < k; i++) {
            weakestRows[i] = rowSum[i][1];
        }
        return weakestRows;
    }
}
