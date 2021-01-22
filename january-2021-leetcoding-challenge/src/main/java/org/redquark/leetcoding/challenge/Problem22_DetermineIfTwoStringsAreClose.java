package org.redquark.leetcoding.challenge;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 * <p>
 * Two strings are considered close if you can attain one from the other using the following operations:
 * <p>
 * Operation 1: Swap any two existing characters.
 * For example, abcde -> aecdb
 * <p>
 * Operation 2: Transform every occurrence of one existing character into another existing character,
 * and do the same with the other character.
 * For example, aacabb -> bbcbaa (all a's turn into b's, and all b's turn into a's)
 * <p>
 * You can use the operations on either string as many times as necessary.
 * <p>
 * Given two strings, word1 and word2, return true if word1 and word2 are close, and false otherwise.
 * <p>
 * Constraints:
 * <p>
 * 1 <= word1.length, word2.length <= 10^5
 * word1 and word2 contain only lowercase English letters.
 */
public class Problem22_DetermineIfTwoStringsAreClose {

    /**
     * @param word1 - first string
     * @param word2 - second string
     * @return - true, if strings are close, false otherwise
     */
    public boolean closeStrings(String word1, String word2) {
        // Arrays to store frequencies of every character
        // in both the words
        int[] word1Frequencies = new int[26];
        int[] word2Frequencies = new int[26];
        // Array to signify if a certain character is present
        int[] word1Present = new int[26];
        int[] word2Present = new int[26];
        // Loop through both the arrays
        for (char c : word1.toCharArray()) {
            word1Frequencies[c - 'a']++;
            word1Present[c - 'a'] = 1;
        }
        for (char c : word2.toCharArray()) {
            word2Frequencies[c - 'a']++;
            word2Present[c - 'a'] = 1;
        }
        Arrays.sort(word1Frequencies);
        Arrays.sort(word2Frequencies);
        return Arrays.equals(word1Frequencies, word2Frequencies) && Arrays.equals(word1Present, word2Present);
    }
}
