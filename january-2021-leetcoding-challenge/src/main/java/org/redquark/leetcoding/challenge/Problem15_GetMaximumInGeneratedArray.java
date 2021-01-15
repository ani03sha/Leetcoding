package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given an integer n. An array nums of length n + 1 is generated in the following way:
 * <p>
 * nums[0] = 0
 * nums[1] = 1
 * nums[2 * i] = nums[i] when 2 <= 2 * i <= n
 * nums[2 * i + 1] = nums[i] + nums[i + 1] when 2 <= 2 * i + 1 <= n
 * <p>
 * Return the maximum integer in the array nums.
 * <p>
 * Constraints:
 * <p>
 * 0 <= n <= 100
 */
public class Problem15_GetMaximumInGeneratedArray {

    /**
     * @param n - given integer
     * @return maximum integer in the array
     */
    public int getMaximumGenerated(int n) {
        // Base condition
        if (n <= 1) {
            return n;
        }
        // Create a new array
        int[] a = new int[n + 1];
        // Populate first and second value
        a[0] = 0;
        a[1] = 1;
        // Array index
        int index = 2;
        // Variable to store max value
        int max = Integer.MIN_VALUE;
        // Loop until n
        while (index <= n) {
            // Different cases
            if (index % 2 == 0) {
                a[index] = a[index / 2];
            } else {
                a[index] = a[index / 2] + a[index / 2 + 1];
            }
            max = Math.max(max, a[index]);
            index++;
        }
        return max;
    }
}
