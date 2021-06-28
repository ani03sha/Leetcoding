package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing
 * two adjacent and equal letters and removing them.
 * <p>
 * We repeatedly make duplicate removals on s until we no longer can.
 * <p>
 * Return the final string after all such duplicate removals have been made. It can be proven that the
 * answer is unique.
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 10^5
 * s consists of lowercase English letters.
 */
public class Problem28_RemoveAllAdjacentDuplicatesInString {

    public String removeDuplicates(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return s;
        }
        // Length of the string
        int n = s.length();
        // Array to store final result
        char[] characters = new char[n];
        // Index for the characters array
        int index = 0;
        // Loop through the string character by character
        for (int i = 0; i < n; i++) {
            // Current character
            char c = s.charAt(i);
            // If the character at right of the array
            // is same as the current character, we will
            // ignore it
            if (index > 0 && characters[index - 1] == c) {
                index--;
            }
            // If the character is not duplicate
            else {
                characters[index] = c;
                index++;
            }
        }
        return new String(characters, 0, index);
    }
}