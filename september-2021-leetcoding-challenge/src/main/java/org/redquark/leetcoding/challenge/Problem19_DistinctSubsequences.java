package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given two strings s and t, return the number of distinct subsequences of s which equals t.
 * <p>
 * A string's subsequence is a new string formed from the original string by deleting some (can be none)
 * of the characters without disturbing the remaining characters' relative positions. (i.e., "ACE" is a
 * subsequence of "ABCDE" while "AEC" is not).
 * <p>
 * It is guaranteed the answer fits on a 32-bit signed integer.
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length, t.length <= 1000
 * s and t consist of English letters.
 */
public class Problem19_DistinctSubsequences {

    public int numDistinct(String s, String t) {
        // Special case
        if (s == null || s.isEmpty() || t == null || t.isEmpty()) {
            return 0;
        }
        // Lengths of both the strings
        int m = s.length();
        int n = t.length();
        // Lookup table to store distinct subsequences until i-th character
        // of s and j-th character of t
        int[][] lookup = new int[m + 1][n + 1];
        // Populate lookup table for base initialization
        for (int i = 0; i < m; i++) {
            lookup[i][0] = 1;
        }
        // Populate lookup table for remaining cells
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    lookup[i][j] = lookup[i - 1][j - 1] + lookup[i - 1][j];
                } else {
                    lookup[i][j] = lookup[i - 1][j];
                }
            }
        }
        return lookup[m][n];
    }
}
