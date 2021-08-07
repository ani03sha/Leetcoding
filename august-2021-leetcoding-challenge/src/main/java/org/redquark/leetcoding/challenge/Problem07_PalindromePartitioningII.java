package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a string s, partition s such that every substring of the partition is a palindrome.
 * <p>
 * Return the minimum cuts needed for a palindrome partitioning of s.
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 2000
 * s consists of lower-case English letters only.
 */
public class Problem07_PalindromePartitioningII {

    public int minCut(String s) {
        // Special case
        if (s == null || s.length() < 2) {
            return 0;
        }
        // Length of the string
        int n = s.length();
        // Lookup array to track partition position
        boolean[][] lookup = new boolean[n][n];
        // Lookup array to store minimum cuts
        int[] cuts = new int[n];
        // Loop through the array
        for (int i = 0; i < n; i++) {
            // Maximum number of cuts
            cuts[i] = i;
            // Loop for all the combinations
            for (int j = 0; j <= i; j++) {
                // Compare the characters at two indices
                if (s.charAt(i) == s.charAt(j) && (i - j <= 1 || lookup[j + 1][i - 1])) {
                    lookup[j][i] = true;
                    // If need to cut, add 1 to previous cut
                    if (j > 0) {
                        cuts[i] = Math.min(cuts[i], cuts[j - 1] + 1);
                    } else {
                        cuts[i] = 0;
                    }
                }
            }
        }
        return cuts[n - 1];
    }
}
