package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an input string s, reverse the order of the words.
 * <p>
 * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
 * <p>
 * Return a string of the words in reverse order concatenated by a single space.
 * <p>
 * Note that s may contain leading or trailing spaces or multiple spaces between two words.
 * The returned string should only have a single space separating the words. Do not include any extra spaces.
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 10^4
 * s contains English letters (upper-case and lower-case), digits, and spaces ' '.
 * There is at least one word in s.
 * <p>
 * Follow-up: If the string data type is mutable in your language, can you solve it in-place with O(1) extra space?
 */
public class Problem20_ReverseWordsInAString {

    public String reverseWords(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return s;
        }
        // Split the words in string by space
        String[] words = s.split(" ");
        // Output
        StringBuilder output = new StringBuilder();
        // Loop from right to left
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isEmpty()) {
                output.append(words[i]).append(" ");
            }
        }
        return output.length() == 0 ? "" : output.substring(0, output.length() - 1);
    }
}
