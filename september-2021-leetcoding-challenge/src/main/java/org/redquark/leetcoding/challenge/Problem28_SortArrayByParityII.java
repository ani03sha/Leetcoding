package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array of integers nums, half of the integers in nums are odd, and the other half are even.
 * <p>
 * Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.
 * <p>
 * Return any answer array that satisfies this condition.
 * <p>
 * Constraints:
 * <p>
 * 2 <= nums.length <= 2 * 10^4
 * nums.length is even.
 * Half of the integers in nums are even.
 * 0 <= nums[i] <= 1000
 * <p>
 * Follow Up: Could you solve it in-place?
 */
public class Problem28_SortArrayByParityII {

    public int[] sortArrayByParityII(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return nums;
        }
        // Length of the array
        int n = nums.length;
        // Left and right pointers
        int left = 0;
        int right = n - 1;
        // Loop until the condition is met
        while (left < n && right >= 0) {
            // If both the numbers at wrong positions, we will swap them
            if (nums[left] % 2 == 1 && nums[right] % 2 == 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left += 2;
                right -= 2;
            }
            // If the left number is at wrong position but right
            // number is at correct position, we will move right
            // pointer two steps before
            else if (nums[left] % 2 == 1 && nums[right] % 2 == 1) {
                right -= 2;
            }
            // If the right number is at wrong position but left
            // number is at correct position, we will move left
            // pointer two steps after
            else if (nums[left] % 2 == 0 && nums[right] % 2 == 0) {
                left += 2;
            }
            // If both the numbers are at correct position, we just move
            // both the pointers
            else {
                left += 2;
                right -= 2;
            }
        }
        return nums;
    }
}
