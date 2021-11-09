package org.redquark.leetcoding.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Anirudh Sharma
 * <p>
 * With respect to a given puzzle string, a word is valid if both the following conditions are satisfied:
 * - word contains the first letter of puzzle.
 * - For each letter in word, that letter is in puzzle.
 * - For example, if the puzzle is "abcdefg", then valid words are "faced", "cabbage", and "baggage", while
 * - invalid words are "beefed" (does not include 'a') and "based" (includes 's' which is not in the puzzle).
 * <p>
 * Return an array answer, where answer[i] is the number of words in the given word list words that is valid with
 * respect to the puzzle puzzles[i].
 * <p>
 * Constraints:
 * <p>
 * 1 <= words.length <= 10^5
 * 4 <= words[i].length <= 50
 * 1 <= puzzles.length <= 10^4
 * puzzles[i].length == 7
 * words[i] and puzzles[i] consist of lowercase English letters.
 * Each puzzles[i] does not contain repeated characters.
 */
public class Problem09_NumberOfValidWordsForEachPuzzle {

    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        // List to store the output
        List<Integer> output = new ArrayList<>();
        // Special case
        if (words == null || words.length == 0 || puzzles == null || puzzles.length == 0) {
            return output;
        }
        // Map to store the characters and their corresponding bitmask value
        Map<Character, List<Integer>> map = new HashMap<>();
        // Initialize all the buckets
        for (int i = 0; i < 26; i++) {
            map.put((char) ('a' + i), new ArrayList<>());
        }
        // Loop for all the words
        for (String word : words) {
            // Mask of the current word
            int mask = 0;
            for (char c : word.toCharArray()) {
                // Turn on the bit corresponding to the current character
                mask |= (1 << (c - 'a'));
            }
            // Set to make sure we don't add masks multiple times
            Set<Character> uniques = new HashSet<>();
            for (char c : word.toCharArray()) {
                if (uniques.contains(c)) {
                    continue;
                }
                uniques.add(c);
                map.get(c).add(mask);
            }
        }
        // Loop for all the puzzles
        for (String puzzle : puzzles) {
            // Mask for the current puzzle
            int mask = 0;
            for (char c : puzzle.toCharArray()) {
                mask |= (1 << (c - 'a'));
            }
            // Check for first character
            char firstCharacter = puzzle.charAt(0);
            // Get the list of masks which represent the words which
            // start with the first character
            List<Integer> wordMasks = map.get(firstCharacter);
            // Count of valid words
            int count = 0;
            // Check for all the word masks
            for (int wordMask : wordMasks) {
                if ((wordMask & mask) == wordMask) {
                    count++;
                }
            }
            output.add(count);
        }
        return output;
    }
}
