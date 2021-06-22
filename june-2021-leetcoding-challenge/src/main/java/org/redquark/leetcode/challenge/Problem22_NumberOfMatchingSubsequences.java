package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a string s and an array of strings words, return the number of words[i] that is a subsequence of s.
 * <p>
 * A subsequence of a string is a new string generated from the original string with some characters
 * (can be none) deleted without changing the relative order of the remaining characters.
 * <p>
 * For example, "ace" is a subsequence of "abcde".
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 5 * 10^4
 * 1 <= words.length <= 5000
 * 1 <= words[i].length <= 50
 * s and words[i] consist of only lowercase English letters.
 */
public class Problem22_NumberOfMatchingSubsequences {

    public int numMatchingSubsequences(String s, String[] words) {
        // Special cases
        if (s == null || s.isEmpty() || words == null || words.length == 0) {
            return 0;
        }
        // Total count of valid subsequences
        int count = 0;
        // Map to store indices of characters in s
        Map<Character, List<Integer>> characterIndexMap = new HashMap<>();
        // Populate the map
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!characterIndexMap.containsKey(c)) {
                characterIndexMap.put(c, new ArrayList<>());
            }
            characterIndexMap.get(c).add(i);
        }
        // Loop for every word in the array
        for (String word : words) {
            // Check if the current word is the subsequence of s
            if (isSubsequence(word, characterIndexMap, 0)) {
                count++;
            }
        }
        return count;
    }

    private boolean isSubsequence(String word, Map<Character, List<Integer>> characterIndexMap, int startIndex) {
        if (word.isEmpty()) {
            return true;
        }
        if (!characterIndexMap.containsKey(word.charAt(0))) {
            return false;
        }
        for (int start : characterIndexMap.get(word.charAt(0))) {
            if (start < startIndex) {
                continue;
            }
            String newWord = word.substring(1);
            return isSubsequence(newWord, characterIndexMap, start + 1);
        }
        return false;
    }
}
