package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * For an integer array nums, an inverse pair is a pair of integers [i, j] where 0 <= i < j < nums.length and
 * nums[i] > nums[j].
 * <p>
 * Given two integers n and k, return the number of different arrays consist of numbers from 1 to n such that
 * there are exactly k inverse pairs. Since the answer can be huge, return it modulo 10^9 + 7.
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 1000
 * 0 <= k <= 1000
 */
public class Problem19_KInversePairsArray {

    public int kInversePairs(int n, int k) {
        // Lookup table which store permutations
        // for a particular combination of n and k
        int[][] lookup = new int[n + 1][k + 1];
        // Populate the table
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                if (j == 0) {
                    lookup[i][j] = 1;
                } else {
                    for (int l = 0; l <= Math.min(i - 1, j); l++) {
                        lookup[i][j] = (lookup[i][j] + lookup[i - 1][j - l]) % 1000000007;
                    }
                }
            }
        }
        return lookup[n][k];
    }
}
