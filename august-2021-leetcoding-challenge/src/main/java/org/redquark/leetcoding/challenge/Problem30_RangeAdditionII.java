package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given an m x n matrix M initialized with all 0's and an array of operations ops, where ops[i] =
 * [ai, bi] means M[x][y] should be incremented by one for all 0 <= x < ai and 0 <= y < bi.
 * <p>
 * Count and return the number of maximum integers in the matrix after performing all the operations.
 * <p>
 * Constraints:
 * <p>
 * 1 <= m, n <= 4 * 10^4
 * 1 <= ops.length <= 10^4
 * ops[i].length == 2
 * 1 <= ai <= m
 * 1 <= bi <= n
 */
public class Problem30_RangeAdditionII {

    public int maxCount(int m, int n, int[][] ops) {
        if (ops == null || ops.length == 0) {
            return m * n;
        }
        for (int[] op : ops) {
            m = Math.min(op[0], m);
            n = Math.min(op[1], n);
        }
        return m * n;
    }
}
