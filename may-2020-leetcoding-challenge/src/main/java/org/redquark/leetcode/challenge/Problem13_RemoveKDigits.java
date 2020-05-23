package org.redquark.leetcode.challenge;

import java.util.Stack;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a non-negative integer num represented as a string, remove k digits from the number so that the
 * new number is the smallest possible.
 * <p>
 * Note:
 * The length of num is less than 10002 and will be ≥ k.
 * The given num does not contain any leading zero.
 */
public class Problem13_RemoveKDigits {

    public String removeKdigits(String num, int k) {
        // Size of the String
        int size = num.length();
        // Base condition - if k is equal to the size then we will be removing every digit from the string
        if (size == k) {
            return "0";
        }
        // Stack that will store each digit
        Stack<Character> digits = new Stack<>();
        // Put numbers on the stack
        for (char c : num.toCharArray()) {
            while (k > 0 && !digits.isEmpty() && digits.peek() > c) {
                digits.pop();
                k--;
            }
            digits.push(c);
        }
        // Handing repeating digits' case
        while (k > 0) {
            digits.pop();
            k--;
        }
        // Resultant string
        StringBuilder result = new StringBuilder();
        // Add every character from stack to string builder
        while (!digits.isEmpty()) {
            char currentCharacter = digits.pop();
            result.append(currentCharacter);
        }
        // Reverse the string
        result.reverse();
        // Logic for removing leading zeros
        while (result.length() > 1 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }
        return result.toString();
    }
}
