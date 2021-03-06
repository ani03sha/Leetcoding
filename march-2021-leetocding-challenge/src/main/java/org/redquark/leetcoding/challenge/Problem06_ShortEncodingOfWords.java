package org.redquark.leetcoding.challenge;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Anirudh Sharma
 * <p>
 * A valid encoding of an array of words is any reference string s and array of indices indices such that:
 * <p>
 * - words.length == indices.length
 * - The reference string s ends with the '#' character.
 * - For each index indices[i], the substring of s starting from indices[i] and up to
 * (but not including) the next '#' character is equal to words[i].
 * - Given an array of words, return the length of the shortest reference string s possible
 * of any valid encoding of words.
 * <p>
 * Constraints:
 * <p>
 * 1 <= words.length <= 2000
 * 1 <= words[i].length <= 7
 * words[i] consists of only lowercase letters.
 */
public class Problem06_ShortEncodingOfWords {

    public int minimumLengthEncoding(String[] words) {
        // Set to store the words
        Set<String> wordSet = new HashSet<>(Arrays.asList(words));
        // Loop for each word in the array
        for (String word : words) {
            // Check if the set contains the word
            if (wordSet.contains(word)) {
                for (int i = 1; i < word.length(); i++) {
                    wordSet.remove(word.substring(i));
                }
            }
        }
        // Shortest length encoding
        int length = wordSet.size();
        // Loop for each word in the set and add its
        // length
        for (String word : wordSet) {
            length += word.length();
        }
        return length;
    }
}
