package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array nums with n integers, your task is to check if it could become non-decreasing by
 * modifying at most one element.
 * <p>
 * We define an array is non-decreasing if nums[i] <= nums[i + 1] holds for every i (0-based) such that
 * (0 <= i <= n - 2).
 * <p>
 * Constraints:
 * <p>
 * n == nums.length
 * 1 <= n <= 10^4
 * -10^5 <= nums[i] <= 10^5
 */
public class Problem04_NonDecreasingArray {

    public boolean checkPossibility(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                if (count == 1) {
                    return false;
                }
                if (i > 0 && nums[i + 1] < nums[i - 1]) {
                    nums[i + 1] = nums[i];
                }
                count++;
            }
        }
        return count <= 1;
    }
}
