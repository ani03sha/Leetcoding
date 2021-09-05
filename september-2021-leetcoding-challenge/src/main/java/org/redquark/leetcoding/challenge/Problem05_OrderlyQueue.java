package org.redquark.leetcoding.challenge;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given a string s and an integer k. You can choose one of the first k letters of s and append
 * it at the end of the string.
 * <p>
 * Return the lexicographically smallest string you could have after applying the mentioned step any number of moves.
 * <p>
 * Constraints:
 * <p>
 * 1 <= k <= s.length <= 1000
 * s consist of lowercase English letters.
 */
public class Problem05_OrderlyQueue {

    public String orderlyQueue(String s, int k) {
        // Special case
        if (s == null || s.isEmpty()) {
            return s;
        }
        // For k >= 2
        if (k > 1) {
            char[] characters = s.toCharArray();
            Arrays.sort(characters);
            return new String(characters);
        }
        // For k = 1, we will just rotate the string
        String temp = s;
        for (int i = 1; i < s.length(); i++) {
            String x = s.substring(i) + s.substring(0, i);
            if (temp.compareTo(x) > 0) {
                temp = x;
            }
        }
        return temp;
    }
}
