package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
 * <p>
 * Strings consists of lowercase English letters only and the length of both strings s and p will not
 * be larger than 20,100.
 * <p>
 * The order of output does not matter.
 */
public class Problem17_FindAllAnagrams {

    /**
     * @param s - input string
     * @param p - input string
     * @return - list of start indices of anagrams of p in s
     */
    public List<Integer> findAnagrams(String s, String p) {
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
