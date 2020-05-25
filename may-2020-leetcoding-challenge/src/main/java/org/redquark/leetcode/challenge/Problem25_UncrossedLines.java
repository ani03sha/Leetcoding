package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * We write the integers of A and B (in the order they are given) on two separate horizontal lines.
 * <p>
 * Now, we may draw connecting lines: a straight line connecting two numbers A[i] and B[j] such that:
 * <p>
 * A[i] == B[j];
 * The line we draw does not intersect any other connecting (non-horizontal) line.
 * Note that a connecting lines cannot intersect even at the endpoints: each number can only belong
 * to one connecting line.
 * <p>
 * Return the maximum number of connecting lines we can draw in this way.
 * <p>
 * Note:
 * <p>
 * 1 <= A.length <= 500
 * 1 <= B.length <= 500
 * 1 <= A[i], B[i] <= 2000
 */
public class Problem25_UncrossedLines {

    /**
     * @param A - first array of points
     * @param B - second array of points
     * @return - number of uncrossed lines
     */
    public int maxUncrossedLines(int[] A, int[] B) {
        // Length of both the arrays
        int x = A.length;
        int y = B.length;
        // DP array
        Integer[][] dp = new Integer[x + 1][y + 1];
        return maxUncrossedLines(A, 0, B, 0, dp);
    }

    private int maxUncrossedLines(int[] A, int i, int[] B, int j, Integer[][] dp) {
        if (i >= A.length || j >= B.length) {
            return 0;
        }
        if (dp[i][j] != null) {
            return dp[i][j];
        }
        if (A[i] == B[j]) {
            dp[i][j] = 1 + maxUncrossedLines(A, i + 1, B, j + 1, dp);
        } else {
            dp[i][j] = Math.max(maxUncrossedLines(A, i + 1, B, j, dp), maxUncrossedLines(A, i, B, j + 1, dp));
        }
        return dp[i][j];
    }
}
