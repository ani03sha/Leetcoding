package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a list of strings words and a string pattern, return a list of words[i] that match pattern.
 * You may return the answer in any order.
 * <p>
 * A word matches the pattern if there exists a permutation of letters p so that after replacing every letter
 * x in the pattern with p(x), we get the desired word.
 * <p>
 * Recall that a permutation of letters is a bijection from letters to letters: every letter maps to another
 * letter, and no two letters map to the same letter.
 * <p>
 * Constraints:
 * <p>
 * 1 <= pattern.length <= 20
 * 1 <= words.length <= 50
 * words[i].length == pattern.length
 * pattern and words[i] are lowercase English letters.
 */
public class Problem21_FindAndReplacePattern {

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        // List to store the matching patterns
        List<String> matchingPatterns = new ArrayList<>();
        // Special case
        if (words == null || words.length == 0 || pattern == null || pattern.isEmpty()) {
            return matchingPatterns;
        }
        // Character to character mapping map
        Map<Character, Character> mapping = new HashMap<>();
        // Loop through the array
        for (String word : words) {
            // Flag to check if we encountered different characters
            boolean isSame = true;
            // Check if the length of the word and pattern is same
            if (word.length() == pattern.length()) {
                // Loop through the word
                for (int i = 0; i < word.length(); i++) {
                    // Get current characters from pattern and word
                    char p = pattern.charAt(i);
                    char w = word.charAt(i);
                    if (!mapping.containsKey(p) && !mapping.containsValue(w)) {
                        mapping.put(p, w);
                    } else if (mapping.get(p) == null || w != mapping.get(p)) {
                        isSame = false;
                        break;
                    }
                }
                if (isSame) {
                    matchingPatterns.add(word);
                }
            }
            mapping.clear();
        }
        return matchingPatterns;
    }
}
