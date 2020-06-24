package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given n, how many structurally unique BST's (binary search trees) that store values 1 ... n?
 */
public class Problem24_UniqueBinarySearchTrees {

    /**
     * @param n - input number fo nodes in BST
     * @return number of unique BSTs that can be generated using n
     */
    public int numTrees(int n) {
        // Base condition
        if (n < 2) {
            return 1;
        }
        // DP array
        int[] dp = new int[n + 1];
        // Add some base results
        dp[0] = 1;
        dp[1] = 1;
        // Loop for remaining combinations
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }
        return dp[n];
    }
}
