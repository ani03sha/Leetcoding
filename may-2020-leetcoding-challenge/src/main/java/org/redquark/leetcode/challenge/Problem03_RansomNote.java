package org.redquark.leetcode.challenge;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an arbitrary ransom note string and another string containing letters from all the magazines,
 * write a function that will return true if the ransom note can be constructed from the magazines;
 * otherwise, it will return false.
 * <p>
 * Each letter in the magazine string can only be used once in your ransom note.
 * <p>
 * Note:
 * You may assume that both strings contain only lowercase letters.
 */
public class Problem03_RansomNote {

    /**
     * @param ransomNote - characters of ransom note
     * @param magazine   - characters of magazine
     * @return true, if a ransom note can be constructed
     */
    public boolean canConstruct(String ransomNote, String magazine) {
        // This map will store the frequency of each character in the magazine
        Map<Character, Integer> characters = new HashMap<>();
        // Loop through magazine and update the frequency of each character
        for (char c : magazine.toCharArray()) {
            characters.merge(c, 1, Integer::sum);
        }
        // Loop through the ransom note string
        for (char c : ransomNote.toCharArray()) {
            // Check if the map does not contain current character or its frequency is less or equal to zero
            if (!characters.containsKey(c) || characters.get(c) <= 0) {
                return false;
            }
            // If the character is found, then decrement its frequency by 1.
            characters.put(c, characters.get(c) - 1);
        }
        return true;
    }
}
