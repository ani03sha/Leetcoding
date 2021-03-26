package org.redquark.leetcoding.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * We are given two arrays A and B of words.  Each word is a string of lowercase letters.
 * <p>
 * Now, say that word b is a subset of word a if every letter in b occurs in a, including multiplicity.
 * For example, "wrr" is a subset of "warrior", but is not a subset of "world".
 * <p>
 * Now say a word a from A is universal if for every b in B, b is a subset of a.
 * <p>
 * Return a list of all universal words in A.  You can return the words in any order.
 * <p>
 * Note:
 * <p>
 * - 1 <= A.length, B.length <= 10000
 * - 1 <= A[i].length, B[i].length <= 10
 * - A[i] and B[i] consist only of lowercase letters.
 * - All words in A[i] are unique: there isn't i != j with A[i] == A[j].
 */
public class Problem26_WordSubsets {

    public List<String> wordSubsets(String[] A, String[] B) {
        // List to store the result
        List<String> result = new ArrayList<>();
        // Array to store the maximum frequency of a character
        // among all words in B
        int[] maxBFrequency = new int[26];
        // Loop through the B array
        for (String word : B) {
            // Get the frequency map for current word
            int[] currentWordFrequencyMap = getCharacterFrequency(word);
            // Now, we will determine the maximum frequency of a character
            // in all the words combine
            for (int i = 0; i < 26; i++) {
                maxBFrequency[i] = Math.max(maxBFrequency[i], currentWordFrequencyMap[i]);
            }
        }
        // Now loop through the A array
        for (String word : A) {
            // Get the frequency map for current word
            int[] currentWordFrequencyMap = getCharacterFrequency(word);
            // Boolean to check if the current word is a valid word
            boolean isValidWord = true;
            // Loop through for each character
            for (int i = 0; i < 26; i++) {
                if (currentWordFrequencyMap[i] < maxBFrequency[i]) {
                    isValidWord = false;
                    break;
                }
            }
            if (isValidWord) {
                result.add(word);
            }
        }
        return result;
    }

    private int[] getCharacterFrequency(String s) {
        int[] frequency = new int[26];
        for (char c : s.toCharArray()) {
            frequency[c - 'a']++;
        }
        return frequency;
    }
}
