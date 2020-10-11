package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a string s, remove duplicate letters so that every letter appears once and only once.
 * You must make sure your result is the smallest in lexicographical order among all possible results.
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 10^4
 * s consists of lowercase English letters.
 */
public class Problem11_RemoveDuplicateCharacters {

    /**
     * @param s - input string
     * @return - string without duplicate letters
     */
    public String removeDuplicateLetters(String s) {
        // Frequency array
        int[] frequency = new int[26];
        // Loop through the string to find the frequency of each letter
        for (char c : s.toCharArray()) {
            frequency[c - 'a']++;
        }
        // Position of letter
        int position = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(position) > s.charAt(i)) {
                position = i;
            }
            if (--frequency[s.charAt(i) - 'a'] == 0) {
                break;
            }
        }
        return s.length() == 0
                ? ""
                : s.charAt(position) + removeDuplicateLetters(s.substring(position + 1)
                .replaceAll("" + s.charAt(position), ""));
    }
}
