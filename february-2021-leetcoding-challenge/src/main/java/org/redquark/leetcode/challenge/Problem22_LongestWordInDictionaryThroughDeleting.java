package org.redquark.leetcode.challenge;

import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a string and a string dictionary, find the longest string in the dictionary
 * that can be formed by deleting some characters of the given string.
 * <p>
 * If there are more than one possible results, return the longest word with the
 * smallest lexicographical order. If there is no possible result, return the empty string.
 * <p>
 * Note:
 * 1. All the strings in the input will only contain lower-case letters.
 * 2. The size of the dictionary won't exceed 1,000.
 * 3. The length of all the strings in the input won't exceed 1,000.
 */
public class Problem22_LongestWordInDictionaryThroughDeleting {

    public String findLongestWord(String s, List<String> d) {
        // Final output
        String output = "";
        // Loop for each word in the dictionary
        for (String word : d) {
            // Check if the current word is a subsequence
            // of the string s.
            if (isSubsequence(word, s)) {
                // Check for the bigger length
                if (word.length() > output.length()) {
                    output = word;
                }
                // Check for lexicographically shorter word
                else if (word.length() == output.length() && word.compareTo(output) < 0) {
                    output = word;
                }
            }
        }
        return output;
    }

    private boolean isSubsequence(String word, String s) {
        // Base case
        if (word.length() > s.length()) {
            return false;
        }
        // Position of character
        int position = 0;
        // Check if word is a subsequence of s.
        for (char c : word.toCharArray()) {
            position = s.indexOf(c, position);
            // If the character does not exist in s
            if (position == -1) {
                return false;
            }
            position++;
        }
        return true;
    }
}
