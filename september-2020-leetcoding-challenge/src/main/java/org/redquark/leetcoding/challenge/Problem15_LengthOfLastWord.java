package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ',
 * return the length of last word
 * (last word means the last appearing word if we loop from left to right) in the string.
 * <p>
 * If the last word does not exist, return 0.
 * <p>
 * Note: A word is defined as a maximal substring consisting of non-space characters only.
 */
public class Problem15_LengthOfLastWord {

    /**
     * @param s - input string
     * @return lenght of last word
     */
    public int lengthOfLastWord(String s) {
        String[] words = s.split("\\s+");
        if (words.length == 0) {
            return 0;
        }
        return words[words.length - 1].length();
    }
}
