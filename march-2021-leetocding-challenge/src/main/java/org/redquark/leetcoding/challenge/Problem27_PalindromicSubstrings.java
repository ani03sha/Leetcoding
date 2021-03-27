package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a string, your task is to count how many palindromic substrings in this string.
 * <p>
 * The substrings with different start indexes or end indexes are counted as different
 * substrings even they consist of same characters.
 * <p>
 * Note:
 * The input string length won't exceed 1000.
 */
public class Problem27_PalindromicSubstrings {

    public int countSubstrings(String s) {
        // Count to store the number of palindromes
        int count = 0;
        // Loop through the string
        for (int i = 0; i < s.length(); i++) {
            // For odd length string, s[i] is the midpoint
            count += expandFromMiddle(s, i, i);
            // For even length string, s[i] and s[i + 1] are
            // the midpoints
            count += expandFromMiddle(s, i, i + 1);
        }
        return count;
    }

    private int expandFromMiddle(String s, int low, int high) {
        int count = 0;
        while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
            count++;
            // Expand in both directions
            low--;
            high++;
        }
        return count;
    }
}
