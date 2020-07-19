package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given two binary strings, return their sum (also a binary string).
 * <p>
 * The input strings are both non-empty and contains only characters 1 or 0.
 * <p>
 * Constraints:
 * <p>
 * Each string consists only of '0' or '1' characters.
 * 1 <= a.length, b.length <= 10^4
 * Each string is either "0" or doesn't contain any leading zero.
 */
public class Problem19_AddBinary {

    /**
     * @param a - First binary string
     * @param b - Second binary string
     * @return binary sum of a and b
     */
    public String addBinary(String a, String b) {
        // Resultant String
        StringBuilder result = new StringBuilder();
        // Indices for a and b
        int i = a.length() - 1;
        int j = b.length() - 1;
        // Carry
        int carry = 0;
        while (i >= 0 || j >= 0) {
            // Sum of two bits
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            // Add the bit to the result
            result.insert(0, sum % 2);
            // Modify carry
            carry = sum / 2;
        }
        // Final check if carry exists
        if (carry > 0) {
            result.insert(0, 1);
        }
        return result.toString();
    }
}
