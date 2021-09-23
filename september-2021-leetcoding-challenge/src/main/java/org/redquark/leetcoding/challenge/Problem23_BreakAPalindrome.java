package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a palindromic string of lowercase English letters palindrome, replace exactly one character with any
 * lowercase English letter so that the resulting string is not a palindrome and that it is the lexicographically
 * smallest one possible.
 * <p>
 * Return the resulting string. If there is no way to replace a character to make it not a palindrome, return an
 * empty string.
 * <p>
 * A string a is lexicographically smaller than a string b (of the same length) if in the first position where a
 * and b differ, a has a character strictly smaller than the corresponding character in b.
 * <p>
 * For example, "abcc" is lexicographically smaller than "abcd" because the first position they differ is at the
 * fourth character, and 'c' is smaller than 'd'.
 * <p>
 * Constraints:
 * <p>
 * 1 <= palindrome.length <= 1000
 * palindrome consists of only lowercase English letters.
 */
public class Problem23_BreakAPalindrome {

    public String breakPalindrome(String palindrome) {
        // Special case
        if (palindrome == null || palindrome.length() < 2) {
            return "";
        }
        // Loop through the string
        for (int i = 0; i < palindrome.length() / 2; i++) {
            if (palindrome.charAt(i) != 'a') {
                return palindrome.substring(0, i) + 'a' + palindrome.substring(i + 1);
            }
        }
        return palindrome.substring(0, palindrome.length() - 1) + 'b';
    }
}
