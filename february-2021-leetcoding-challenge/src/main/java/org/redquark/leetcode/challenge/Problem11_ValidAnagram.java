package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given two strings s and t , write a function to determine if t is an anagram of s.
 * <p>
 * Note:
 * You may assume the string contains only lowercase alphabets.
 * <p>
 * Follow up:
 * What if the inputs contain unicode characters? How would you adapt your solution to such case?
 */
public class Problem11_ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] characterCount = new int[26];
        for (int i = 0; i < s.length(); i++) {
            characterCount[s.charAt(i) - 'a']++;
            characterCount[t.charAt(i) - 'a']--;
        }
        for (int i : characterCount) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
