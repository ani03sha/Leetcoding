package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a string s and a string t, check if s is subsequence of t.
 * <p>
 * A subsequence of a string is a new string which is formed from the original string by deleting some
 * (can be none) of the characters without disturbing the relative positions of the remaining characters.
 * (ie, "ace" is a subsequence of "abcde" while "aec" is not).
 * <p>
 * Follow up:
 * If there are lots of incoming S, say S1, S2, ... , Sk where k >= 1B, and you want to check one by one to
 * see if T has its subsequence. In this scenario, how would you change your code?
 * <p>
 * Constraints:
 * <p>
 * 0 <= s.length <= 100
 * 0 <= t.length <= 10^4
 * Both strings consists only of lowercase characters.
 */
public class Problem09_Subsequence {

    /**
     * @param s - smaller string
     * @param t - bigger string
     * @return true, if s is a subsequence of t
     */
    public boolean isSubsequence(String s, String t) {
        // Base condition
        if (s.equals("")) {
            return true;
        }
        // Pointer for string s
        int pointer = 0;
        // Loop for the whole length of t
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(pointer)) {
                pointer++;
            }
            if (pointer >= s.length()) {
                return true;
            }
        }
        return false;
    }
}
