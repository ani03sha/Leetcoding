package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a string containing just the characters '(' and ')', find the length of the longest valid
 * (well-formed) parentheses substring.
 * <p>
 * Constraints:
 * <p>
 * 0 <= s.length <= 3 * 10^4
 * s[i] is '(', or ')'.
 */
public class Problem03_LongestValidParentheses {

    public int longestValidParentheses(String s) {
        // Count of longest valid substring
        int count = 0;
        // Count of left and right parentheses
        int left = 0;
        int right = 0;
        // Loop from left to right
        for (int i = 0; i < s.length(); i++) {
            // Current character
            char c = s.charAt(i);
            if (c == '(') {
                left++;
            } else {
                right++;
            }
            // If both left and right are equal,
            // it means we have valid substring
            if (left == right) {
                count = Math.max(count, left + right);
            }
            // If right is greater than left,
            // it means we need to set both
            // counters to zero
            if (right > left) {
                left = right = 0;
            }
        }
        // Reset left and right
        left = right = 0;
        // Follow the same approach but now loop the string
        // from right to left. This will take care of extra
        // left parentheses
        for (int i = s.length() - 1; i >= 0; i--) {
            // Current character
            char c = s.charAt(i);
            if (c == '(') {
                left++;
            } else {
                right++;
            }
            // If both left and right are equal,
            // it means we have a valid substring
            if (left == right) {
                count = Math.max(count, left + right);
            }
            // If right is greater than left,
            // it means we need to set both
            // counters to zero
            if (left > right) {
                left = right = 0;
            }
        }
        return count;
    }
}
