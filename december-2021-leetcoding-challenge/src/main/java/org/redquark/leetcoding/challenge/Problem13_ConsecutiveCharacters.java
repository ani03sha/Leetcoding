package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * The power of the string is the maximum length of a non-empty substring that contains only one unique character.
 * <p>
 * Given a string s, return the power of s.
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 500
 * s consists of only lowercase English letters.
 */
public class Problem13_ConsecutiveCharacters {

    public int maxPower(String s) {
        if (s.length() == 1) {
            return 1;
        }
        char lastChar = ' ';
        int localMax = 0;
        int globalMax = 1;
        for (char c : s.toCharArray()) {
            if (lastChar == c) {
                localMax++;
                globalMax = Math.max(localMax, globalMax);
            } else {
                lastChar = c;
                localMax = 1;
            }
        }
        return globalMax;
    }
}
