package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * A message containing letters from A-Z is being encoded to numbers using the following
 * mapping:
 * <p>
 * 'A' -> 1
 * 'B' -> 2
 * ...
 * 'Z' -> 26
 * Given a non-empty string containing only digits, determine the total number of ways
 * to decode it.
 * <p>
 * The answer is guaranteed to fit in a 32-bit integer.
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 100
 * s contains only digits and may contain leading zero(s).
 */
public class Problem26_DecodeWays {

    /**
     * @param s - input string
     * @return number of ways of decoding
     */
    public int numDecodings(String s) {
        // Base conditions
        if (s.charAt(0) == '0') {
            return 0;
        }
        // Variable to store the ways to decode last character
        int last = 1;
        // Variable to store the way to decode last to last character
        int lastToLast = 1;
        // Loop through the string
        for (int i = 1; i < s.length(); i++) {
            // If the current character is zero then there will be zero
            // ways to decode it
            if (s.charAt(i) == '0') {
                last = 0;
            }
            // For possible two character string, last will be sum of
            // both last and lastToLast while lastToLast will be old
            // last
            if (s.charAt(i - 1) == '1' || s.charAt(i - 1) == '2' && s.charAt(i) <= '6') {
                last += lastToLast;
                lastToLast = last - lastToLast;
            }
            // For one character string, no new way is added
            else {
                lastToLast = last;
            }
        }
        return last;
    }
}
