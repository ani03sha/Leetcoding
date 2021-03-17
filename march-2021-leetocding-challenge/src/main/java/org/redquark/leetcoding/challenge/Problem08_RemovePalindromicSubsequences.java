package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a string s consisting only of letters 'a' and 'b'.
 * In a single step you can remove one palindromic subsequence from s.
 * <p>
 * Return the minimum number of steps to make the given string empty.
 * <p>
 * A string is a subsequence of a given string, if it is generated by deleting
 * some characters of a given string without changing its order.
 * <p>
 * A string is called palindrome if is one that reads the same backward as well as forward.
 * <p>
 * Constraints:
 * <p>
 * 0 <= s.length <= 1000
 * s only consists of letters 'a' and 'b'
 */
public class Problem08_RemovePalindromicSubsequences {

    public int removePalindromeSub(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return 0;
        }
        // Start and end pointers
        int start = 0;
        int end = s.length() - 1;
        // Loop to check for palindrome
        while (start < end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                return 2;
            }
        }
        return 1;
    }
}