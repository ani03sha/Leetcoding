package org.redquark.leetcode.challenge;

import java.util.Arrays;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given a string s of even length. Split this string into two halves of equal lengths,
 * and let a be the first half and b be the second half.
 * <p>
 * Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I',
 * 'O', 'U'). Notice that s contains uppercase and lowercase letters.
 * <p>
 * Return true if a and b are alike. Otherwise, return false.
 * <p>
 * Constraints:
 * <p>
 * 2 <= s.length <= 1000
 * s.length is even.
 * s consists of uppercase and lowercase letters.
 */
public class Problem07_DetermineIfStringHalvesAreAlike {

    public boolean halvesAreAlike(String s) {
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        if (s.length() % 2 == 1) {
            return false;
        }
        int vowelCount = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            char first = s.charAt(i);
            char second = s.charAt(s.length() / 2 + i);
            if (vowels.contains(first)) {
                vowelCount++;
            }
            if (vowels.contains(second)) {
                vowelCount--;
            }
        }
        return vowelCount == 0;
    }
}
