package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * order and str are strings composed of lowercase letters. In order, no letter occurs more than once.
 * <p>
 * order was sorted in some custom order previously. We want to permute the characters of str so that
 * they match the order that order was sorted.
 * More specifically, if x occurs before y in order, then x should occur before y in the returned string.
 * <p>
 * Return any permutation of str (as a string) that satisfies this property.
 * <p>
 * Note:
 * <p>
 * order has length at most 26, and no character is repeated in order.
 * str has length at most 200.
 * order and str consist of lowercase letters only.
 */
public class Problem14_CustomSortString {

    public String customSortString(String order, String str) {
        // Special cases
        if (order == null || order.isEmpty() || str == null || str.isEmpty()) {
            return str;
        }
        // Array to store the frequency of characters in str
        int[] characterFrequencyMap = new int[26];
        // Populate the array
        for (char c : str.toCharArray()) {
            characterFrequencyMap[c - 'a']++;
        }
        // Final output
        StringBuilder output = new StringBuilder();
        // Scan the order string and add the characters whose frequency
        // is zero in the output
        for (int i = 0; i < order.length(); i++) {
            char c = order.charAt(i);
            while (characterFrequencyMap[c - 'a'] > 0) {
                output.append(c);
                characterFrequencyMap[c - 'a']--;
            }
        }
        // Scan the frequency array again and append anything that is not zero
        for (int i = 0; i < characterFrequencyMap.length; i++) {
            while (characterFrequencyMap[i] > 0) {
                output.append((char) (i + 'a'));
                characterFrequencyMap[i]--;
            }
        }
        return output.toString();
    }
}
