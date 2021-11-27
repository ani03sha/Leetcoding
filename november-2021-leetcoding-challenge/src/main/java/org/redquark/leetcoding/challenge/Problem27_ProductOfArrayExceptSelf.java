package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the
 * elements of nums except nums[i].
 * <p>
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * <p>
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 * <p>
 * Constraints:
 * <p>
 * 2 <= nums.length <= 10^5
 * -30 <= nums[i] <= 30
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * <p>
 * Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as
 * extra space for space complexity analysis.)
 */
public class Problem27_ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }
        // Length of the array
        int n = nums.length;
        // Array to store the output
        int[] output = new int[n];
        output[0] = 1;
        // Loop from left to right
        for (int i = 1; i < n; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }
        // Variable to store the product from right to left
        int product = 1;
        for (int i = n - 1; i >= 0; i--) {
            output[i] *= product;
            product *= nums[i];
        }
        return output;
    }
}
