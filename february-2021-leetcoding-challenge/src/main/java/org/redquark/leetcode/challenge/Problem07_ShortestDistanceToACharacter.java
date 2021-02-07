package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a string s and a character c that occurs in s, return an array of integers answer where
 * answer.length == s.length and answer[i] is the shortest distance from s[i] to the character c in s.
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 10^4
 * s[i] and c are lowercase English letters.
 * c occurs at least once in s.
 */
public class Problem07_ShortestDistanceToACharacter {

    /**
     * @param s - Given string in which we need to find the shortest distance
     * @param c - Character of which the shortest distance is to be found
     * @return - Array of integers representing the shortest distance for each character in s.
     */
    public int[] shortestToChar(String s, char c) {
        // Length of the string
        int n = s.length();
        // Array to store the result
        int[] shortestDistance = new int[n];
        // Variable to store the last index of c
        int lastIndexOfC = -n;
        // Loop through the array left to right
        for (int i = 0; i < n; i++) {
            // Check if the current character is the character we need
            if (s.charAt(i) == c) {
                lastIndexOfC = i;
            }
            // Store the distance of current character from c
            shortestDistance[i] = i - lastIndexOfC;
        }
        // Loop through the array right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            // Check if the current character is the character we need
            if (s.charAt(i) == c) {
                lastIndexOfC = i;
            }
            shortestDistance[i] = Math.min(shortestDistance[i], Math.abs(i - lastIndexOfC));
        }
        return shortestDistance;
    }
}
