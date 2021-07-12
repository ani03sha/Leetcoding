package org.redquark.leetcode.challenge;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * Given two strings s and t, determine if they are isomorphic.
 * <p>
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * <p>
 * All occurrences of a character must be replaced with another character while preserving the order of characters.
 * No two characters may map to the same character, but a character may map to itself.
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 5 * 10^4
 * t.length == s.length
 * s and t consist of any valid ascii character.
 */
public class Problem12_IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        // Lengths of the strings
        int m = s.length();
        int n = t.length();
        // If lengths are not equal, return false
        if (m != n) {
            return false;
        }
        // Mapping of characters of s and t.
        Map<Character, Character> stMapping = new HashMap<>();
        // Boolean array to store characters which are
        // already mapped
        boolean[] visited = new boolean[256];
        // Loop through the strings
        for (int i = 0; i < m; i++) {
            // Current characters of both strings
            char a = s.charAt(i);
            char b = t.charAt(i);
            // If we have already seen a
            if (stMapping.containsKey(a)) {
                // Return false if a is mapped to different
                // character
                if (stMapping.get(a) != b) {
                    return false;
                }
            }
            // If we are seeing a for the first time
            else {
                // Return false if b is already mapped
                if (visited[b]) {
                    return false;
                }
                // Otherwise do the mapping
                stMapping.put(a, b);
                visited[b] = true;
            }
        }
        return true;
    }
}
