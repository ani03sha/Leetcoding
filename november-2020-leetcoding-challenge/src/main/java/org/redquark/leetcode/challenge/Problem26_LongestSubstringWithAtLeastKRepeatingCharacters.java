package org.redquark.leetcode.challenge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a string s and an integer k, return the length of the longest substring of s such that
 * the frequency of each character in this substring is less than or equal to k.
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 10^4
 * s consists of only lowercase English letters.
 * 1 <= k <= 10^5
 */
public class Problem26_LongestSubstringWithAtLeastKRepeatingCharacters {

    /**
     * @param s - input string
     * @param k - minimum occurrence of characters
     * @return length of longest substring
     */
    public int longestSubstring(String s, int k) {
        // Base condition
        if (s.length() < k) {
            return 0;
        }
        if (k == 1) {
            return s.length();
        }
        Map<Character, Integer> characterFrequencies = new HashMap<>();
        // Add frequency of each character in the map
        for (char c : s.toCharArray()) {
            characterFrequencies.merge(c, 1, Integer::sum);
        }
        // Set of all the characters whose frequency is less than k
        Set<Character> splits = new HashSet<>();
        for (char c : characterFrequencies.keySet()) {
            if (characterFrequencies.get(c) < k) {
                splits.add(c);
            }
        }
        if (splits.isEmpty()) {
            return s.length();
        }
        int maxLength = 0;
        // Left and right pointers of string
        int left = 0;
        int right = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            if (splits.contains(c)) {
                if (right != left) {
                    maxLength = Math.max(maxLength, longestSubstring(s.substring(left, right), k));
                }
                left = right + 1;
            }
            right++;
        }
        if (left != right) {
            maxLength = Math.max(maxLength, longestSubstring(s.substring(left, right), k));
        }
        return maxLength;
    }
}
