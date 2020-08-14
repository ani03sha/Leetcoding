package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a string which consists of lowercase or uppercase letters, find the length of the longest
 * palindromes that can be built with those letters.
 * <p>
 * This is case sensitive, for example "Aa" is not considered a palindrome here.
 * <p>
 * Note:
 * Assume the length of given string will not exceed 1,010.
 */
public class Problem14_LongestPalindrome {

    /**
     * @param s input string
     * @return length of the longest palindrome made from characters of s
     */
    public int longestPalindrome(String s) {
        // Base condition
        if (s.length() == 0) {
            return 0;
        }
        // Array to store counts of characters
        int[] characterFrequency = new int[127];
        // Loop through the array to find frequency of all characters
        for (int i = 0; i < s.length(); i++) {
            characterFrequency[s.charAt(i)]++;
        }
        // This will store the maximum length
        int sum = 0;
        // This flag will be set when we occur odd occurences of a character
        boolean isOddPresent = false;
        for (int j : characterFrequency) {
            if (j % 2 == 0) {
                sum += j;
            } else {
                sum += j - 1;
                isOddPresent = true;
            }
        }
        return isOddPresent ? sum + 1 : sum;
    }
}
