package org.redquark.leetcode.challenge;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a list of words, each word consists of English lowercase letters.
 * <p>
 * Let's say word1 is a predecessor of word2 if and only if we can add exactly one letter anywhere in word1 to
 * make it equal to word2. For example, "abc" is a predecessor of "abac".
 * <p>
 * A word chain is a sequence of words [word_1, word_2, ..., word_k] with k >= 1, where word_1 is a predecessor
 * of word_2, word_2 is a predecessor of word_3, and so on.
 * <p>
 * Return the longest possible length of a word chain with words chosen from the given list of words.
 * <p>
 * Constraints:
 * <p>
 * 1 <= words.length <= 1000
 * 1 <= words[i].length <= 16
 * words[i] only consists of English lowercase letters.
 */
public class Problem17_LongestStringChain {

    public int longestStrChain(String[] words) {
        // Sort the array of strings by word lengths
        Arrays.sort(words, Comparator.comparingInt(String::length));
        // Lookup table to store the lengths of the longest chain
        Map<String, Integer> lookup = new HashMap<>();
        // Maximum length of the chain
        int maxLength = 0;
        // Loop for every word
        for (String word : words) {
            // Get the current longest length
            int current = 0;
            for (int i = 0; i < word.length(); i++) {
                String previous = word.substring(0, i) + word.substring(i + 1);
                current = Math.max(current, lookup.getOrDefault(previous, 0) + 1);
            }
            lookup.put(word, current);
            maxLength = Math.max(maxLength, current);
        }
        return maxLength;
    }
}
