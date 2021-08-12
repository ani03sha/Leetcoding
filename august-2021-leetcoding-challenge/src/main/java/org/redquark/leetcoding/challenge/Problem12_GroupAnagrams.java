package org.redquark.leetcoding.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 * <p>
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 * <p>
 * Constraints:
 * <p>
 * 1 <= strs.length <= 10^4
 * 0 <= strs[i].length <= 100
 * strs[i] consists of lower-case English letters.
 */
public class Problem12_GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        // Ouput list
        List<List<String>> output = new ArrayList<>();
        // Special case
        if (strs == null || strs.length == 0) {
            return output;
        }
        // Create a map to store same words
        Map<String, List<String>> sameWords = new HashMap<>();
        // Loop through the array and sort every word in the array alphabetically
        for (String str : strs) {
            String sortedWord = str
                    .chars()
                    .sorted()
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();
            if (!sameWords.containsKey(sortedWord)) {
                // Create a new list corresponding to this one
                sameWords.put(sortedWord, new ArrayList<>());
            }
            sameWords.get(sortedWord).add(str);
        }
        // Add all the grouped same words
        output.addAll(sameWords.values());
        return output;
    }
}
