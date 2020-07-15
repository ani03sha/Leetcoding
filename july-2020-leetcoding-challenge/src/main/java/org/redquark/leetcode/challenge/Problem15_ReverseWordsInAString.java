package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an input string, reverse the string word by word.
 * <p>
 * Note:
 * <p>
 * A word is defined as a sequence of non-space characters.
 * Input string may contain leading or trailing spaces. However, your reversed string should not
 * contain leading or trailing spaces.
 * <p>
 * You need to reduce multiple spaces between two words to a single space in the reversed string.
 */
public class Problem15_ReverseWordsInAString {

    /**
     * @param s - input string
     * @return - reversed string
     */
    public String reverseWords(String s) {
        // Base condition
        if (s == null || s.length() == 0) {
            return "";
        }
        // Split the string by space
        String[] words = s.split(" ");
        // Result
        StringBuilder result = new StringBuilder();
        // Loop for all the parts
        for (int i = words.length - 1; i >= 0; i--) {
            if (!"".equals(words[i])) {
                result.append(words[i]).append(" ");
            }
        }
        return result.length() == 0 ? "" : result.toString().substring(0, result.length() - 1);
    }
}
