package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given two string arrays word1 and word2, return true if the two arrays represent the same string,
 * and false otherwise.
 * <p>
 * A string is represented by an array if the array elements concatenated in order forms the string.
 * <p>
 * Constraints:
 * <p>
 * 1 <= word1.length, word2.length <= 103
 * 1 <= word1[i].length, word2[i].length <= 103
 * 1 <= sum(word1[i].length), sum(word2[i].length) <= 103
 * word1[i] and word2[i] consist of lowercase letters.
 */
public class Problem08_CheckIfTwoStringArraysAreEquivalent {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder firstString = new StringBuilder();
        StringBuilder secondString = new StringBuilder();
        for (String s : word1) {
            firstString.append(s);
        }
        for (String s : word2) {
            secondString.append(s);
        }
        return firstString.toString().equals(secondString.toString());
    }
}
