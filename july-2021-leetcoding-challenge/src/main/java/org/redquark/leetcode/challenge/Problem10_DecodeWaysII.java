package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * A message containing letters from A-Z can be encoded into numbers using the following mapping:
 * <p>
 * 'A' -> "1"
 * 'B' -> "2"
 * ...
 * 'Z' -> "26"
 * To decode an encoded message, all the digits must be grouped then mapped back into letters using the
 * reverse of the mapping above (there may be multiple ways). For example, "11106" can be mapped into:
 * <p>
 * "AAJF" with the grouping (1 1 10 6)
 * "KJF" with the grouping (11 10 6)
 * Note that the grouping (1 11 06) is invalid because "06" cannot be mapped into 'F' since "6" is different
 * from "06".
 * <p>
 * In addition to the mapping above, an encoded message may contain the '*' character, which can represent
 * any digit from '1' to '9' ('0' is excluded). For example, the encoded message "1*" may represent any of
 * the encoded messages "11", "12", "13", "14", "15", "16", "17", "18", or "19". Decoding "1*" is equivalent
 * to decoding any of the encoded messages it can represent.
 * <p>
 * Given a string s containing digits and the '*' character, return the number of ways to decode it.
 * <p>
 * Since the answer may be very large, return it modulo 10^9 + 7.
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 105
 * s[i] is a digit or '*'.
 */
public class Problem10_DecodeWaysII {

    public int numDecodings(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return 0;
        }
        // Modulus value
        final int MODULUS = 1000000007;
        // Length of the string
        int n = s.length();
        // Lookup table to store the number of decodings for a certain length
        long[] lookup = new long[n + 1];
        // Base initialization
        lookup[0] = 1;
        lookup[1] = s.charAt(0) == '*' ? 9 : s.charAt(0) == '0' ? 0 : 1;
        // Populate the table for remaining lengths
        for (int i = 2; i <= n; i++) {
            if (s.charAt(i - 1) == '*') {
                lookup[i] = 9 * lookup[i - 1] % MODULUS;
                if (s.charAt(i - 2) == '1') {
                    lookup[i] = (lookup[i] + 9 * lookup[i - 2]) % MODULUS;
                } else if (s.charAt(i - 2) == '2') {
                    lookup[i] = (lookup[i] + 6 * lookup[i - 2]) % MODULUS;
                } else if (s.charAt(i - 2) == '*') {
                    lookup[i] = (lookup[i] + 15 * lookup[i - 2]) % MODULUS;
                }
            } else {
                lookup[i] = s.charAt(i - 1) != '0' ? lookup[i - 1] : 0;
                if (s.charAt(i - 2) == '1') {
                    lookup[i] = (lookup[i] + lookup[i - 2]) % MODULUS;
                } else if (s.charAt(i - 2) == '2' && s.charAt(i - 1) <= '6') {
                    lookup[i] = (lookup[i] + lookup[i - 2]) % MODULUS;
                } else if (s.charAt(i - 2) == '*') {
                    lookup[i] = (lookup[i] + (s.charAt(i - 1) <= '6' ? 2 : 1) * lookup[i - 2]) % MODULUS;
                }
            }
        }
        return (int) lookup[n];
    }
}
