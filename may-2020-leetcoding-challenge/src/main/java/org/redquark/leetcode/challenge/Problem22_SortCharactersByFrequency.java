package org.redquark.leetcode.challenge;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a string, sort it in decreasing order based on the frequency of characters.
 */
public class Problem22_SortCharactersByFrequency {

    /**
     * @param s - input string
     * @return - sorted string
     */
    public String frequencySort(String s) {
        // Map to store the frequency of characters in the String
        Map<Character, Integer> frequencyMap = new HashMap<>();
        // Add each character and its frequency to the map
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        // Create a max heap
        Queue<Character> maxHeap = new PriorityQueue<>((a, b) -> frequencyMap.get(b) - frequencyMap.get(a));
        // Add all elements of the frequency map in the max heap
        maxHeap.addAll(frequencyMap.keySet());
        // This variable will store the final result
        StringBuilder result = new StringBuilder();
        //Loop for each element in the heap
        while (!maxHeap.isEmpty()) {
            // Get the current character from the heap
            char currentCharacter = maxHeap.remove();
            // Add the character to result as many times its frequency
            for (int i = 0; i < frequencyMap.get(currentCharacter); i++) {
                result.append(currentCharacter);
            }
        }
        return result.toString();
    }
}
