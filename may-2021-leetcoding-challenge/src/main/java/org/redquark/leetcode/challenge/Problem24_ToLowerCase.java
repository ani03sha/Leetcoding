package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.
 * <p>
 * 1 <= s.length <= 100
 * s consists of printable ASCII characters.
 */
public class Problem24_ToLowerCase {

    public String toLowerCase(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return s;
        }
        // Convert the string into character array
        char[] characters = s.toCharArray();
        // Loop through every character
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] >= 65 && characters[i] <= 90) {
                characters[i] += 32;
            }
        }
        return new String(characters);
    }
}
