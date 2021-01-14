package org.redquark.leetcoding.challenge;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given an integer array nums and an integer x.
 * <p>
 * In one operation, you can either remove the leftmost or the rightmost element from
 * the array nums and subtract its value from x.
 * Note that this modifies the array for future operations.
 * <p>
 * Return the minimum number of operations to reduce x to exactly 0 if it's possible,
 * otherwise, return -1.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 10^5
 * 1 <= nums[i] <= 10^4
 * 1 <= x <= 10^9
 */
public class Problem14_MinimumOperationsToReduceXToZero {

    /**
     * @param nums - array of elements to be subtracted
     * @param x    - number to be made zero
     * @return minimum number of operations required to reduce x to 0
     */
    public int minOperations(int[] nums, int x) {
        // Length of the array
        int n = nums.length;
        // Map to store the sum and corresponding index
        Map<Integer, Integer> sumIndex = new HashMap<>();
        // Sum of elements
        int sum = 0;
        // Populate the map
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            sumIndex.put(sum, i);
        }
        // Get remaining sum
        int remaining = sum - x;
        // Check if sum is already less than zero
        if (remaining < 0) {
            return -1;
        }
        // Populate map for 0
        sumIndex.put(0, -1);
        // Make sum zero again
        sum = 0;
        // Number of operations required
        int operations = Integer.MIN_VALUE;
        // Loop through the array to find max sum subarray
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (sumIndex.containsKey(sum - remaining)) {
                operations = Math.max(operations, i - sumIndex.get(sum - remaining));
            }
        }
        return operations == Integer.MIN_VALUE ? -1 : n - operations;
    }
}
