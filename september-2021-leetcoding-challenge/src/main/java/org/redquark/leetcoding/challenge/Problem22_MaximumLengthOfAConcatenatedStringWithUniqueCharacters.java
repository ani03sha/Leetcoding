package org.redquark.leetcoding.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array of strings arr. String s is a concatenation of a sub-sequence of arr which have unique characters.
 * <p>
 * Return the maximum possible length of s.
 * <p>
 * Constraints:
 * <p>
 * 1 <= arr.length <= 16
 * 1 <= arr[i].length <= 26
 * arr[i] contains only lower case English letters.
 */
public class Problem22_MaximumLengthOfAConcatenatedStringWithUniqueCharacters {

    public int maxLength(List<String> arr) {
        // Special case
        if (arr == null || arr.isEmpty()) {
            return 0;
        }
        // Variable to store the maximum length
        int maxLength = 0;
        // List to store all the combinations
        List<String> combinations = new ArrayList<>();
        // Add the empty string as the first element
        combinations.add("");
        // Loop for all the words in the array
        for (String word : arr) {
            // Check if all the characters in the string are unique
            if (checkForUniqueCharacters(word)) {
                // New list with current string
                List<String> currentCombinations = new ArrayList<>();
                for (String candidate : combinations) {
                    // Create a new word
                    String temp = candidate + word;
                    if (checkForUniqueCharacters(temp)) {
                        currentCombinations.add(temp);
                        maxLength = Math.max(maxLength, temp.length());
                    }
                }
                combinations.addAll(currentCombinations);
            }
        }
        return maxLength;
    }

    private boolean checkForUniqueCharacters(String word) {
        if (word.length() > 26) {
            return false;
        }
        int[] frequencyMap = new int[26];
        for (char c : word.toCharArray()) {
            frequencyMap[c - 'a']++;
            if (frequencyMap[c - 'a'] > 1) {
                return false;
            }
        }
        return true;
    }
}
