package org.redquark.leetcoding.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a string s, sort it in decreasing order based on the frequency of the characters.
 * The frequency of a character is the number of times it appears in the string.
 * <p>
 * Return the sorted string. If there are multiple answers, return any of them.
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 5 * 10^5
 * s consists of uppercase and lowercase English letters and digits.
 */
public class Problem22_SortCharactersByFrequency {

    public String frequencySort(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return s;
        }
        // Map to store the frequency of characters of the string
        Map<Character, Integer> frequencyMap = new HashMap<>();
        // Variable to keep track of the maximum frequency
        int maxFrequency = 0;
        // Populate the map
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            maxFrequency = Math.max(maxFrequency, frequencyMap.get(c));
        }
        // Create a List of List to store the characters at indices which
        // is equal to their frequencies in the map
        List<List<Character>> frequencyToIndex = new ArrayList<>(maxFrequency);
        // Initialize the internal lists
        for (int i = 0; i <= maxFrequency; i++) {
            frequencyToIndex.add(new ArrayList<>());
        }
        // Loop over the map
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            // Get the value which will represent the index in the list and then
            // set the current character in the list at that index
            frequencyToIndex.get(entry.getValue()).add(entry.getKey());
        }
        // Output string
        StringBuilder output = new StringBuilder();
        // Loop over the list
        for (int i = frequencyToIndex.size() - 1; i > 0; i--) {
            for (char character : frequencyToIndex.get(i)) {
                output.append(String.valueOf(character).repeat(i));
            }
        }
        return output.toString();
    }
}
