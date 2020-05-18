package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Given two strings s1 and s2, write a function to return true if s2 contains the permutation of s1.
 * In other words, one of the first string's permutations is the substring of the second string.
 * <p>
 * Note:
 * <p>
 * The input strings only contain lower case letters.
 * The length of both given strings is in range [1, 10,000].
 */
public class Problem18_PermutationInString {

    /**
     * @param s1 - input string
     * @param s2 - input string
     * @return true, if s2 contains permutation of s1
     */
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        List<Integer> anagrams = findAnagrams(s2, s1);
        return !anagrams.isEmpty();
    }

    /**
     * @param s - input string
     * @param p - input string
     * @return - list of start indices of anagrams of p in s
     */
    private List<Integer> findAnagrams(String s, String p) {
        // This list will store the result
        List<Integer> result = new ArrayList<>();
        // Base condition
        if (s == null || p == null || s.length() == 0 || p.length() == 0) {
            return result;
        }
        // This array will store the frequency of each character in the p string
        int[] charCount = new int[256];
        for (char c : p.toCharArray()) {
            charCount[c]++;
        }
        // Start and End indices
        int start = 0;
        int end = 0;
        // Length of the p string
        int count = p.length();
        // Loop until the end pointer reaches to the end of the s string
        while (end < s.length()) {
            // Move right every time, if the character is present in the charCount array, then decrease the count
            if (charCount[s.charAt(end)] >= 1) {
                count--;
            }
            charCount[s.charAt(end)]--;
            end++;
            // When the count is down to zero, it means we have found the anagram of p in s
            if (count == 0) {
                result.add(start);
            }
            // If the window's size is equal to p then we will move left
            if (end - start == p.length()) {
                if (charCount[s.charAt(start)] >= 0) {
                    count++;
                }
                charCount[s.charAt(start)]++;
                start++;
            }
        }
        return result;
    }
}
