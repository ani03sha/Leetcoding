package org.redquark.leetcoding.challenge;

import java.util.TreeSet;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given an array nums of n positive integers.
 * <p>
 * You can perform two types of operations on any element of the array any number of times:
 * <p>
 * If the element is even, divide it by 2.
 * For example, if the array is [1,2,3,4], then you can do this operation on the last element,
 * and the array will be [1,2,3,2].
 * <p>
 * If the element is odd, multiply it by 2.
 * For example, if the array is [1,2,3,4], then you can do this operation on the first element,
 * and the array will be [2,2,3,4].
 * <p>
 * The deviation of the array is the maximum difference between any two elements in the array.
 * <p>
 * Return the minimum deviation the array can have after performing some number of operations.
 * <p>
 * Constraints:
 * <p>
 * n == nums.length
 * 2 <= n <= 10^5
 * 1 <= nums[i] <= 10^9
 */
public class Problem30_MinimizeDeviationInArray {

    /**
     * @param nums - array of integers
     * @return minimum deviation
     */
    public int minimumDeviation(int[] nums) {
        // Set to add the elements in the array after applying rules
        TreeSet<Integer> elements = new TreeSet<>();
        for (int n : nums) {
            if (n % 2 == 1) {
                elements.add(2 * n);
            } else {
                elements.add(n);
            }
        }
        // Minimum deviation
        int minimumDeviation = Integer.MAX_VALUE;
        // Loop until the biggest even element in the
        // set becomes odd
        while (true) {
            int minValue = elements.first();
            int maxValue = elements.last();
            // Current difference
            int currentDifference = maxValue - minValue;
            minimumDeviation = Math.min(currentDifference, minimumDeviation);
            if (maxValue % 2 == 0) {
                elements.remove(maxValue);
                elements.add(maxValue / 2);
            } else {
                return minimumDeviation;
            }
        }
    }
}
