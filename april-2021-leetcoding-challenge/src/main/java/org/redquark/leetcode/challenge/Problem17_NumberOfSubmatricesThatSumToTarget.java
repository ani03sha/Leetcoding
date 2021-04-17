package org.redquark.leetcode.challenge;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a matrix and a target, return the number of non-empty submatrices that sum to target.
 * <p>
 * A submatrix x1, y1, x2, y2 is the set of all cells matrix[x][y] with x1 <= x <= x2 and y1 <= y <= y2.
 * <p>
 * Two submatrices (x1, y1, x2, y2) and (x1', y1', x2', y2') are different if they have some coordinate
 * that is different: for example, if x1 != x1'.
 * <p>
 * Constraints:
 * <p>
 * 1 <= matrix.length <= 100
 * 1 <= matrix[0].length <= 100
 * -1000 <= matrix[i] <= 1000
 * -10^8 <= target <= 10^8
 */
public class Problem17_NumberOfSubmatricesThatSumToTarget {

    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int x = matrix[0].length;
        // Count of valid submatrices
        int count = 0;
        // Map to store sum
        Map<Integer, Integer> sumMap = new HashMap<>();
        // Loop through the matrix
        for (int[] row : matrix) {
            for (int i = 1; i < x; i++) {
                row[i] += row[i - 1];
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = i; j < x; j++) {
                sumMap.clear();
                sumMap.put(0, 1);
                int cumulativeSum = 0;
                for (int[] columns : matrix) {
                    cumulativeSum += columns[j] - (i > 0 ? columns[i - 1] : 0);
                    count += sumMap.getOrDefault(cumulativeSum - target, 0);
                    sumMap.put(cumulativeSum, sumMap.getOrDefault(cumulativeSum, 0) + 1);
                }
            }
        }
        return count;
    }
}
