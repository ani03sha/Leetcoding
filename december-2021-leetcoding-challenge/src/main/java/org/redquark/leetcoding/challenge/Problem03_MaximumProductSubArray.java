package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product,
 * and return the product.
 * <p>
 * It is guaranteed that the answer will fit in a 32-bit integer.
 * <p>
 * A subarray is a contiguous subsequence of the array.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 2 * 10^4
 * -10 <= nums[i] <= 10
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 */
public class Problem03_MaximumProductSubArray {

    public int maxProduct(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        // Global max
        int globalMax = nums[0];
        // Local max and min - which represent max and min product
        // until the current number
        int localMax = nums[0];
        int localMin = nums[0];
        // Traverse through the array
        for (int i = 1; i < nums.length; i++) {
            // If the current number is negative, then swap max and min
            if (nums[i] < 0) {
                int temp = localMax;
                localMax = localMin;
                localMin = temp;
            }
            // Max and min can be calculated by considering the product
            // of current number with the previous product or only the
            // current number
            localMax = Math.max(localMax * nums[i], nums[i]);
            localMin = Math.min(localMin * nums[i], nums[i]);
            // Update global max
            globalMax = Math.max(globalMax, localMax);
        }
        return globalMax;
    }
}
