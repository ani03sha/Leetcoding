package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Give a string s, count the number of non-empty (contiguous) substrings that have the
 * same number of 0's and 1's, and all the 0's and all the 1's in these substrings are
 * grouped consecutively.
 * <p>
 * Substrings that occur multiple times are counted the number of times they occur.
 * <p>
 * Note:
 * <p>
 * s.length will be between 1 and 50,000.
 * s will only consist of "0" or "1" characters.
 */
public class Problem23_CountBinarySubstrings {

    public int countBinarySubstrings(String s) {
        // Base case
        if (s == null || s.length() == 0) {
            return 0;
        }
        // Count of valid substrings
        int count = 0;
        // Current and previous groups
        int current = 1;
        int previous = 0;
        // Loop through the entire string
        for (int i = 1; i < s.length(); i++) {
            // Check if the consecutive characters are same
            if (s.charAt(i) == s.charAt(i - 1)) {
                current++;
            } else {
                count += Math.min(current, previous);
                previous = current;
                current = 1;
            }
        }
        return count + Math.min(current, previous);
    }
}
