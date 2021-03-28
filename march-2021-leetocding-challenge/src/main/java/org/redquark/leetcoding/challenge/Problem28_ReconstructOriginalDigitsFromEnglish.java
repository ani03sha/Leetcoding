package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a non-empty string containing an out-of-order English representation of digits 0-9,
 * output the digits in ascending order.
 * <p>
 * Note:
 * - Input contains only lowercase English letters.
 * - Input is guaranteed to be valid and can be transformed to its original digits.
 * That means invalid inputs such as "abc" or "zerone" are not permitted.
 * - Input length is less than 50,000.
 */
public class Problem28_ReconstructOriginalDigitsFromEnglish {

    public String originalDigits(String s) {
        // Frequency map for all the characters
        // in the string
        int[] frequencyMap = new int[26];
        // Update the frequency map
        for (char c : s.toCharArray()) {
            frequencyMap[c - 'a']++;
        }
        // Below array will store the frequency
        // of every digit from 0-9
        int[] digitsFrequency = new int[10];
        digitsFrequency[0] = frequencyMap['z' - 'a'];
        digitsFrequency[2] = frequencyMap['w' - 'a'];
        digitsFrequency[4] = frequencyMap['u' - 'a'];
        digitsFrequency[6] = frequencyMap['x' - 'a'];
        digitsFrequency[8] = frequencyMap['g' - 'a'];
        digitsFrequency[1] = frequencyMap['o' - 'a'] - digitsFrequency[0] - digitsFrequency[2] - digitsFrequency[4];
        digitsFrequency[3] = frequencyMap['h' - 'a'] - digitsFrequency[8];
        digitsFrequency[5] = frequencyMap['f' - 'a'] - digitsFrequency[4];
        digitsFrequency[7] = frequencyMap['s' - 'a'] - digitsFrequency[6];
        digitsFrequency[9] = frequencyMap['i' - 'a'] - digitsFrequency[5] - digitsFrequency[6] - digitsFrequency[8];
        // Result
        StringBuilder result = new StringBuilder();
        // Loop for evey digit and every character
        for (int i = 0; i < 10; i++) {
            result.append(String.valueOf(i).repeat(Math.max(0, digitsFrequency[i])));
        }
        return result.toString();
    }
}
