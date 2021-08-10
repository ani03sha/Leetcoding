package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * A binary string is monotone increasing if it consists of some number of 0's (possibly none),
 * followed by some number of 1's (also possibly none).
 * <p>
 * You are given a binary string s. You can flip s[i] changing it from 0 to 1 or from 1 to 0.
 * <p>
 * Return the minimum number of flips to make s monotone increasing.
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 10^5
 * s[i] is either '0' or '1'.
 */
public class Problem10_FlipStringToMonotoneIncreasing {

    public int minFlipsMonoIncr(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return 0;
        }
        // Count of ones
        int ones = 0;
        // Total flips
        int flips = 0;
        // Loop through the string character by character
        for (char c : s.toCharArray()) {
            // If the current character is 0 then we have two cases
            // 1. If we haven't encountered 1 yet, then we will continue
            // 2. If we have encountered 1, then we will update the flip count
            if (c == '0') {
                if (ones == 0) {
                    continue;
                } else {
                    flips++;
                }
            }
            // Else, we will update the one count
            else {
                ones++;
            }
            flips = Math.min(flips, ones);
        }
        return flips;
    }
}
