package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an integer array nums, in which exactly two elements appear only once and all the other elements appear
 * exactly twice. Find the two elements that appear only once. You can return the answer in any order.
 * <p>
 * You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.
 * <p>
 * Constraints:
 * <p>
 * 2 <= nums.length <= 3 * 10^4
 * -2^31 <= nums[i] <= 2^31 - 1
 * Each integer in nums will appear twice, only two integers will appear once.
 */
public class Problem06_SingleNumberIII {

    public int[] singleNumber(int[] nums) {
        // This variable will store XORs of all the elements in the array
        int xor = nums[0];
        // Loop through the array and find the combined XOR
        for (int i = 1; i < nums.length; i++) {
            xor ^= nums[i];
        }
        // AND the xor with its negative
        xor &= -xor;
        // Resultant array
        int[] result = new int[2];
        for (int n : nums) {
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
