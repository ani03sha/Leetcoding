package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a word, you need to judge whether the usage of capitals in it is right or not.
 * <p>
 * We define the usage of capitals in a word to be right when one of the following cases holds:
 * <p>
 * 1. All letters in this word are capitals, like "USA".
 * 2. All letters in this word are not capitals, like "leetcode".
 * 3. Only the first letter in this word is capital, like "Google".
 * <p>
 * therwise, we define that this word doesn't use capitals in a right way.
 * <p>
 * Note: The input will be a non-empty word consisting of uppercase and lowercase latin letters.
 */
public class Problem01_DetectCapital {

    /**
     * @param word - input word
     * @return true, if the use of capital is right, false, otherwise
     */
    public boolean detectCapitalUse(String word) {
        // Count of capital letters
        int capitalCount = 0;
        // Loop through all the characters in the list
        for (char c : word.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                capitalCount++;
            }
        }
        if (capitalCount == 0 || capitalCount == word.length()) {
            return true;
        }
        return capitalCount == 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z';
    }
}
