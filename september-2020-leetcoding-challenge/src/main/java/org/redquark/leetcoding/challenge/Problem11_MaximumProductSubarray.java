package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an integer array nums, find the contiguous subarray within an array (containing at least one number)
 * which has the largest product.
 */
public class Problem11_MaximumProductSubarray {

    public int maxProduct(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        int globalMax = numbers[0];
        int localMax = numbers[0];
        int localMin = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                int temp = localMax;
                localMax = localMin;
                localMin = temp;
            }
            localMax = Math.max(numbers[i], numbers[i] * localMax);
            localMin = Math.min(numbers[i], numbers[i] * localMin);
            globalMax = Math.max(globalMax, localMax);
        }
        return globalMax;
    }
}
