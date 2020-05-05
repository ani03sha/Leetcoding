package org.redquark.leetcode.challenge;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 * Note: You may assume the string contain only lowercase letters.
 */
public class Problem05_FirstUniqueCharacter {

    /**
     * @param s - input string
     * @return - index of the first non repeating character
     */
    public int firstUniqueCharacter(String s) {
        // Map that will store the frequency of characters
        Map<Character, Integer> characterMap = new LinkedHashMap<>(26);
        // Loop through each character of the String to store the frequency of each character in the map
        for (char c : s.toCharArray()) {
            if (characterMap.containsKey(c)) {
                characterMap.put(c, characterMap.get(c) + 1);
            } else {
                characterMap.put(c, 1);
            }
        }
        // First unique character
        char firstUniqueCharacter = 0;
        // Loop through the map for each key and check whose value is 1
        for (Map.Entry<Character, Integer> entry : characterMap.entrySet()) {
            if (entry.getValue() == 1) {
                firstUniqueCharacter = entry.getKey();
                break;
            }
        }
        // Return the index of the first unique character
        return firstUniqueCharacter != 0 ? s.indexOf(firstUniqueCharacter) : -1;
    }

    /**
     * @param s - input string
     * @return - index of the first unique character
     * <p>
     * This method is same as above but slightly faster as it uses arrays instead of Hashtables
     */
    public int optimizedFirstUniqueCharacter(String s) {
        char[] characterCount = new char[256];
        for (char c : s.toCharArray()) {
            characterCount[c]++;
        }
        // Index of first unique character
        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (characterCount[c] == 1) {
                index = i;
                break;
            }
        }
        return index;
    }
}
