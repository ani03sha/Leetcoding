package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array of n integers nums, a 132 pattern is a subsequence of three integers nums[i],
 * nums[j] and nums[k] such that i < j < k and nums[i] < nums[k] < nums[j].
 * <p>
 * Return true if there is a 132 pattern in nums, otherwise, return false.
 * <p>
 * Follow up: The O(n^2) is trivial, could you come up with the O(n logn) or the O(n) solution?
 * <p>
 * Constraints:
 * <p>
 * n == nums.length
 * 1 <= n <= 10^4
 * -10^9 <= nums[i] <= 10^9
 */
public class Problem23_132Pattern {

    /**
     * @param nums - input array
     * @return true, if 132 pattern exists, false, otherwise
     */
    public boolean find132pattern(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }
        int top = nums.length;
        int third = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < third) {
                return true;
            }
            while (top < nums.length && nums[i] > nums[top]) {
                third = nums[top];
                top++;
            }
            top--;
            nums[top] = nums[i];
        }
        return false;
    }
}
