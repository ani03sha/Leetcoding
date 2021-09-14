package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a string s, reverse the string according to the following rules:
 * <p>
 * All the characters that are not English letters remain in the same position.
 * All the English letters (lowercase or uppercase) should be reversed.
 * Return s after reversing it.
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 100
 * s consists of characters with ASCII values in the range [33, 122].
 * s does not contain '\"' or '\\'.
 */
public class Problem14_ReverseOnlyLetters {

    public String reverseOnlyLetters(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return s;
        }
        // Left and right pointers
        int left = 0;
        int right = s.length() - 1;
        // Characters in the input string
        char[] characters = s.toCharArray();
        // Loop until the two pointers meet
        while (left < right) {
            if (!Character.isLetter(characters[left])) {
                left++;
            }
            if (!Character.isLetter(characters[right])) {
                right--;
            }
            if (Character.isLetter(characters[left]) && Character.isLetter(characters[right])) {
                char temp = characters[left];
                characters[left] = characters[right];
                characters[right] = temp;
                left++;
                right--;
            }
        }
        return new String(characters);
    }
}
