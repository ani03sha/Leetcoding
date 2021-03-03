package org.redquark.leetcoding.challenge;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the
 * range that is missing from the array.
 * <p>
 * Follow up: Could you implement a solution using only O(1) extra space complexity and O(n)
 * runtime complexity?
 * <p>
 * Constraints:
 * <p>
 * n == nums.length
 * 1 <= n <= 10^4
 * 0 <= nums[i] <= n
 * All the numbers of nums are unique.
 */
public class Problem03_MissingNumber {

    public int missingNumber(int[] nums) {
        return ((nums.length) * (nums.length + 1) / 2) - Arrays.stream(nums).sum();
    }
}
