package org.redquark.leetcode.challenge;

import java.util.Stack;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an encoded string, return its decoded string.
 * <p>
 * The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets
 * is being repeated exactly k times. Note that k is guaranteed to be a positive integer.
 * <p>
 * You may assume that the input string is always valid; No extra white spaces, square brackets
 * are well-formed, etc.
 * <p>
 * Furthermore, you may assume that the original data does not contain any digits and that digits
 * are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 30
 * s consists of lowercase English letters, digits, and square brackets '[]'.
 * s is guaranteed to be a valid input.
 * All the integers in s are in the range [1, 300].
 */
public class Problem19_DecodeString {

    /**
     * @param s - encode string
     * @return decoded string
     */
    public String decodeString(String s) {
        // Base condition
        if (s == null || s.isEmpty()) {
            return s;
        }
        // Stacks for storing strings and their counts
        Stack<String> stringStack = new Stack<>();
        Stack<Integer> countStack = new Stack<>();
        // Decoded string
        StringBuilder decodedString = new StringBuilder();
        // Index for traversing through the string
        int index = 0;
        // Loop for each character
        while (index < s.length()) {
            // If we encounter a digit in the string
            if (Character.isDigit(s.charAt(index))) {
                // Actual number in the string
                int n = 0;
                // Let's find out the exact number
                while (Character.isDigit(s.charAt(index))) {
                    n = 10 * n + (s.charAt(index) - '0');
                    index++;
                }
                countStack.push(n);
            }
            // If we encounter the opening bracket
            else if (s.charAt(index) == '[') {
                // We need to push the internal string to the stack
                stringStack.push(decodedString.toString());
                decodedString = new StringBuilder();
                index++;
            }
            // If we encounter the closing bracket
            else if (s.charAt(index) == ']') {
                // String to be repeated
                StringBuilder temp = new StringBuilder(stringStack.pop());
                // Number of times a string to be repeated
                int n = countStack.pop();
                temp.append(String.valueOf(decodedString).repeat(Math.max(0, n)));
                decodedString = temp;
                index++;
            }
            // If a character is occurred
            else {
                decodedString.append(s.charAt(index++));
            }
        }
        return decodedString.toString();
    }
}
