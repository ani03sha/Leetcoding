package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
 * <p>
 * You must solve the problem without using any built-in library for handling large integers (such as BigInteger).
 * You must also not convert the inputs to integers directly.
 * <p>
 * Constraints:
 * <p>
 * 1 <= num1.length, num2.length <= 10^4
 * num1 and num2 consist of only digits.
 * num1 and num2 don't have any leading zeros except for the zero itself.
 */
public class Problem09_AddStrings {

    public String addStrings(String num1, String num2) {
        // String to store the output
        StringBuilder sum = new StringBuilder();
        // Lengths of two strings
        int m = num1.length();
        int n = num2.length();
        // Indices for traversal
        int i = m - 1;
        int j = n - 1;
        // Carry for addition
        int carry = 0;
        // Loop until the indices are valid
        while (i >= 0 && j >= 0) {
            // Get the digits to add
            int a = num1.charAt(i) - '0';
            int b = num2.charAt(j) - '0';
            // Add the numbers
            int c = a + b + carry;
            carry = c / 10;
            sum.append(c % 10);
            // decrement the counters
            i--;
            j--;
        }
        // If some characters are left to be processed
        while (i >= 0) {
            int a = num1.charAt(i) - '0' + carry;
            carry = a / 10;
            sum.append(a % 10);
            i--;
        }
        while (j >= 0) {
            int a = num2.charAt(j) - '0' + carry;
            carry = a / 10;
            sum.append(a % 10);
            j--;
        }
        if (carry > 0) {
            sum.append(carry);
        }
        return sum.reverse().toString();
    }
}
