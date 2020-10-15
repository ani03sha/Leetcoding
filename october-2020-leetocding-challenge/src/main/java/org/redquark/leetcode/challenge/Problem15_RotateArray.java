package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 * <p>
 * Follow up:
 * <p>
 * Try to come up as many solutions as you can, there are at least 3 different ways to solve
 * this problem.
 * Could you do it in-place with O(1) extra space?
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 2 * 10^4
 * -2^31 <= nums[i] <= 2^31 - 1
 * 0 <= k <= 10^5
 */
public class Problem15_RotateArray {

    /**
     * @param nums - input array
     * @param k    - steps by which we need to rotate the array
     */
    public int[] rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        return nums;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
