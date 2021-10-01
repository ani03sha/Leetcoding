package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given two strings text1 and text2, return the length of their longest common subsequence.
 * If there is no common subsequence, return 0.
 * <p>
 * A subsequence of a string is a new string generated from the original string with some characters
 * (can be none) deleted without changing the relative order of the remaining characters.
 * <p>
 * For example, "ace" is a subsequence of "abcde".
 * A common subsequence of two strings is a subsequence that is common to both strings.
 * <p>
 * Constraints:
 * <p>
 * 1 <= text1.length, text2.length <= 1000
 * text1 and text2 consist of only lowercase English characters.
 */
public class Problem01_LongestCommonSubsequence {

    public int longestCommonSubsequence(String text1, String text2) {
        // Special case
        if (text1 == null || text1.isEmpty() || text2 == null || text2.isEmpty()) {
            return 0;
        }
        // Lengths of both the strings
        int m = text1.length();
        int n = text2.length();
        // Lookup table to store the longest common subsequence until the
        // i-th character of text1 and j-th character of text2
        int[][] lookup = new int[m + 1][n + 1];
        // Loop through the string
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // If the current characters of both the strings are same
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    lookup[i][j] = 1 + lookup[i - 1][j - 1];
                } else {
                    lookup[i][j] = Math.max(lookup[i - 1][j], lookup[i][j - 1]);
                }
            }
        }
        return lookup[m][n];
    }
}
