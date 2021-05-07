package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given two strings word1 and word2, return the minimum number of steps required to make word1 and word2 the same.
 * <p>
 * In one step, you can delete exactly one character in either string.
 * <p>
 * Constraints:
 * <p>
 * 1 <= word1.length, word2.length <= 500
 * word1 and word2 consist of only lowercase English letters.
 */
public class Problem07_DeleteOperationOfTwoStrings {

    public int minDistance(String word1, String word2) {
        // Lengths of the two strings
        int a = word1.length();
        int b = word2.length();
        // DP array to store the distances - dp[i][j] stands
        // for distance of first i characters of word1 and
        // first j characters of word2
        int[][] dp = new int[a + 1][b + 1];
        // Fill the values for first row and first column
        for (int i = 0; i <= a; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= b; j++) {
            dp[0][j] = j;
        }
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1] + 2, dp[i - 1][j] + 1), dp[i][j - 1] + 1);
                }
            }
        }
        return dp[a][b];
    }
}
