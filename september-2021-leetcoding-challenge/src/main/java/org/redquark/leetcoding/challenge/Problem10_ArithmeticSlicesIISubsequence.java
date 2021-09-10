package org.redquark.leetcoding.challenge;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an integer array nums, return the number of all the arithmetic subsequences of nums.
 * <p>
 * A sequence of numbers is called arithmetic if it consists of at least three elements and if the
 * difference between any two consecutive elements is the same.
 * <p>
 * For example, [1, 3, 5, 7, 9], [7, 7, 7, 7], and [3, -1, -5, -9] are arithmetic sequences.
 * For example, [1, 1, 2, 5, 7] is not an arithmetic sequence.
 * A subsequence of an array is a sequence that can be formed by removing some elements (possibly none) of the array.
 * <p>
 * For example, [2,5,10] is a subsequence of [1,2,1,2,4,1,5,10].
 * The test cases are generated so that the answer fits in 32-bit integer.
 * <p>
 * Constraints:
 * <p>
 * 1  <= nums.length <= 1000
 * -2^31 <= nums[i] <= 2^31 - 1
 */
public class Problem10_ArithmeticSlicesIISubsequence {

    @SuppressWarnings("unchecked")
    public int numberOfArithmeticSlices(int[] nums) {
        // Special case
        if (nums == null || nums.length < 3) {
            return 0;
        }
        // Length of the array
        int n = nums.length;
        // Total number of valid arithmetic sequences
        int count = 0;
        // Lookup table
        Map<Long, Integer>[] lookup = new HashMap[n];
        // Loop through array
        for (int i = 0; i < n; i++) {
            lookup[i] = new HashMap<>();
            for (int j = i - 1; j >= 0; j--) {
                long difference = (long) nums[i] - nums[j];
                int a = lookup[i].getOrDefault(difference, 0);
                int b = lookup[j].getOrDefault(difference, 0);
                count += b;
                lookup[i].put(difference, a + b + 1);
            }
        }
        return count;
    }
}
