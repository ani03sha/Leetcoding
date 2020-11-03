package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a string s, the power of the string is the maximum length of a non-empty substring that contains
 * only one unique character.
 * <p>
 * Return the power of the string.
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 500
 * s contains only lowercase English letters.
 */
public class Problem03_ConsecutiveCharacters {

    /**
     * @param s - input string
     * @return maximum power of the string
     */
    public int maxPower(String s) {
        // Base condition
        if (s.length() == 1) {
            return 1;
        }
        // Last encountered character
        char lastChar = ' ';
        // Global maximum
        int globalMax = 1;
        // Local maximum
        int localMax = 0;
        // Loop through the string
        for (char c : s.toCharArray()) {
            if (c == lastChar) {
                localMax++;
                globalMax = Math.max(localMax, globalMax);
            } else {
                localMax = 1;
                lastChar = c;
            }
        }
        return globalMax;
    }
}
