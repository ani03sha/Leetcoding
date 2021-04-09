package org.redquark.leetcode.challenge;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * In an alien language, surprisingly they also use english lowercase letters,
 * but possibly in a different order.
 * The order of the alphabet is some permutation of lowercase letters.
 * <p>
 * Given a sequence of words written in the alien language, and the order of the alphabet,
 * return true if and only if the given words are sorted lexicographicaly in this alien language.
 * <p>
 * Constraints:
 * <p>
 * 1 <= words.length <= 100
 * 1 <= words[i].length <= 20
 * order.length == 26
 * All characters in words[i] and order are English lowercase letters.
 */
public class Problem09_VerifyingAnAlienDictionary {

    public boolean isAlienSorted(String[] words, String order) {
        // Map to store custom lexicographical order
        Map<Character, Integer> customOrder = new HashMap<>(26);
        // Populate this map
        for (int i = 0; i < order.length(); i++) {
            customOrder.put(order.charAt(i), i);
        }
        // Loop through every word in the array
        for (int i = 0; i < words.length - 1; i++) {
            if (!compareWords(words[i], words[i + 1], customOrder)) {
                return false;
            }
        }
        return true;
    }

    private boolean compareWords(String firstWord, String secondWord, Map<Character, Integer> customOrder) {
        // Index to iterate through the strings
        int index = 0;
        // Loop through both words character by character
        while (index < firstWord.length() && index < secondWord.length()) {
            // Order for both words from the map
            int firstWordOrder = customOrder.get(firstWord.charAt(index));
            int secondWordOrder = customOrder.get(secondWord.charAt(index));
            // Check if the words are in wrong order
            if (firstWordOrder > secondWordOrder) {
                return false;
            } else if (firstWordOrder < secondWordOrder) {
                return true;
            }
            index++;
        }
        // Check if the words are of different lengths
        return index >= firstWord.length();
    }
}
