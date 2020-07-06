package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 * <p>
 * The digits are stored such that the most significant digit is at the head of the list, and each
 * element in the array contain a single digit.
 * <p>
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 */
public class Problem06_PlusOne {

    /**
     * @param digits - array of digits
     * @return output array with plus one
     */
    public int[] plusOne(int[] digits) {
        // Length of the digits array
        int n = digits.length;
        // Loop for each element in the array backwards
        for (int i = n - 1; i >= 0; i--) {
            // Check if the current digit is less than 9
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        // Create the result array
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}
