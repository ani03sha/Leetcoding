package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an integer array nums sorted in non-decreasing order, return an array of the
 * squares of each number sorted in non-decreasing order.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 10^4
 * -104 <= nums[i] <= 10^4
 * nums is sorted in non-decreasing order.
 */
public class Problem15_SquaresOfASortedArray {

    /**
     * @param nums - input array of numbers
     * @return sorted squared array
     */
    public int[] sortedSquares(int[] nums) {
        // Find the first non-negative number
        int index = 0;
        while (nums[index] < 0) {
            index++;
        }
        // Positive index and negative index
        int positiveIndex = index;
        int negativeIndex = index - 1;
        // Resultant array to store squares
        int[] square = new int[nums.length];
        // Index for square array
        int count = 0;
        // Loop for array elements
        while (negativeIndex >= 0 && positiveIndex < nums.length) {
            if (nums[negativeIndex] * nums[negativeIndex] < nums[positiveIndex] * nums[positiveIndex]) {
                square[count] = nums[negativeIndex] * nums[negativeIndex];
                negativeIndex--;
            } else {
                square[count] = nums[positiveIndex] * nums[positiveIndex];
                positiveIndex++;
            }
            count++;
        }
        // Remaining negative elements, if any
        while (negativeIndex >= 0) {
            square[count] = nums[negativeIndex] * nums[negativeIndex];
            negativeIndex--;
            count++;
        }
        // Remaining positive elements, if any
        while (positiveIndex < nums.length) {
            square[count] = nums[positiveIndex] * nums[positiveIndex];
            positiveIndex++;
            count++;
        }
        return square;
    }
}
