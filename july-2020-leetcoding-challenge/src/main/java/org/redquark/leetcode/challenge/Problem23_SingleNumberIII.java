package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array of numbers nums, in which exactly two elements appear only once and all the other
 * elements appear exactly twice. Find the two elements that appear only once.
 * <p>
 * Note:
 * <p>
 * The order of the result is not important. So in the above example, [5, 3] is also correct.
 * Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?
 */
public class Problem23_SingleNumberIII {

    /**
     * @param numbers - input array of numbers
     * @return two numbers that appear only once
     */
    public int[] singleNumber(int[] numbers) {
        // This variable will store XORs of all the elements in the array
        int xor = numbers[0];
        // Loop through the array and find the combined XOR
        for (int i = 1; i < numbers.length; i++) {
            xor ^= numbers[i];
        }
        // AND the xor with its negative
        xor &= -xor;
        // Resultant array
        int[] result = new int[2];
        for (int n : numbers) {
            // Check if the bit is zero
            if ((xor & n) == 0) {
                result[0] ^= n;
            } else {
                result[1] ^= n;
            }
        }
        return result;
    }
}
