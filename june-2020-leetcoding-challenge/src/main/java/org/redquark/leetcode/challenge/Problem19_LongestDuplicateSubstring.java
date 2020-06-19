package org.redquark.leetcode.challenge;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a string S, consider all duplicated substrings: (contiguous) substrings of S that occur 2 or more times.
 * (The occurrences may overlap.)
 * <p>
 * Return any duplicated substring that has the longest possible length.
 * (If S does not have a duplicated substring, the answer is "".)
 * <p>
 * Note:
 * <p>
 * 2 <= S.length <= 10^5
 * S consists of lowercase English letters.
 */
public class Problem19_LongestDuplicateSubstring {

    // Number of characters - all lowercase English letters
    private int alphabet;
    // Modulus value
    private long modulus;

    /**
     * @param S -input string
     * @return longest duplicate substring
     */
    public String longestDupSubstring(String S) {
        alphabet = 26;
        modulus = (long) Math.pow(2, 32);
        // Left and right pointers
        int left = 1;
        int right = S.length() - 1;
        // Resultant string
        String result = "";
        // Loop until the condition holds true
        while (left <= right) {
            // Middle index
            int middle = left + (right - left) / 2;
            // Longest substring
            String temp = search(S, middle);
            if (temp != null) {
                result = temp;
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return result;
    }

    private String search(String s, int middle) {
        // Set to store the hash the substring
        Set<Long> set = new HashSet<>();
        // Hash for this string
        long hash = 0;
        long aL = 1;
        for (int i = 1; i <= middle; i++) {
            aL = (aL * alphabet) % modulus;
        }
        for (int i = 0; i < middle; i++) {
            hash = (hash * alphabet + (s.charAt(i) - 'a')) % modulus;
        }
        set.add(hash);
        for (int i = 1; i + middle - 1 < s.length(); i++) {
            int j = i + middle - 1;
            hash = (hash * alphabet - (s.charAt(i - 1) - 'a') * aL % modulus + modulus) % modulus;
            hash = (hash + (s.charAt(j) - 'a')) % modulus;
            if (set.contains(hash)) {
                return s.substring(i, j + 1);
            }
            set.add(hash);
        }
        return null;
    }
}
