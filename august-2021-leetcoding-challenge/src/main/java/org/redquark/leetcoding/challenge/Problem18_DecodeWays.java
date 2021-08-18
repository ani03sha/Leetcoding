package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * A message containing letters from A-Z can be encoded into numbers using the following mapping:
 * <p>
 * 'A' -> "1"
 * 'B' -> "2"
 * ...
 * 'Z' -> "26"
 * To decode an encoded message, all the digits must be grouped then mapped back into letters using
 * the reverse of the mapping above (there may be multiple ways). For example, "11106" can be mapped into:
 * <p>
 * "AAJF" with the grouping (1 1 10 6)
 * "KJF" with the grouping (11 10 6)
 * Note that the grouping (1 11 06) is invalid because "06" cannot be mapped into 'F' since "6"
 * is different from "06".
 * <p>
 * Given a string s containing only digits, return the number of ways to decode it.
 * <p>
 * The answer is guaranteed to fit in a 32-bit integer.
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 100
 * s contains only digits and may contain leading zero(s).
 */
public class Problem18_DecodeWays {

    public int numDecodings(String s) {
        // Length of the string
        int n = s.length();
        // Lookup table which store the number of decode
        // ways for length i.
        int[] lookup = new int[n + 1];
        // Base initialization
        lookup[0] = 1;
        lookup[1] = s.charAt(0) == '0' ? 0 : 1;
        // Populate the remaining table
        for (int i = 2; i <= n; i++) {
            // Get only the current digit
            int oneDigit = Integer.parseInt(s.substring(i - 1, i));
            // Get the current and previous digit
            int twoDigits = Integer.parseInt(s.substring(i - 2, i));
            // Check if we have valid digit(s)
            if (oneDigit >= 1) {
                lookup[i] += lookup[i - 1];
            }
            if (twoDigits >= 10 && twoDigits <= 26) {
                lookup[i] += lookup[i - 2];
            }
        }
        return lookup[n];
    }
}
