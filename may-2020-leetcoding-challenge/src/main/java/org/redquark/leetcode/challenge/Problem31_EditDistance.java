package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given two words word1 and word2, find the minimum number of operations required to convert word1
 * to word2.
 * <p>
 * You have the following 3 operations permitted on a word:
 * <p>
 * Insert a character
 * Delete a character
 * Replace a character
 */
public class Problem31_EditDistance {

    /**
     * @param word1 - first word
     * @param word2 - second word
     * @return - number of operations required
     */
    public int minDistance(String word1, String word2) {
        // Base conditions
        if (word1 == null || word1.length() == 0) {
            return word2.length();
        }

        if (word2 == null || word2.length() == 0) {
            return word1.length();
        }
        int m = word1.length();
        int n = word2.length();
        // DP array
        int[][] dp = new int[m + 1][n + 1];

        // Update the first row
        for (int i = 1; i <= n; i++) {
            dp[0][i] = i;
        }
        // Update the first column
        for (int i = 1; i <= m; i++) {
            dp[i][0] = i;
        }

        // Fill this array in bottom up manner
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    int replace = dp[i - 1][j - 1] + 1;
                    int insert = dp[i][j - 1] + 1;
                    int delete = dp[i - 1][j] + 1;

                    dp[i][j] = Math.min(replace, Math.min(insert, delete));
                }
            }
        }
        return dp[m][n];
    }
}
