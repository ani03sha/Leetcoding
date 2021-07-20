package org.redquark.leetcode.challenge;

import java.util.Random;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an integer array nums, design an algorithm to randomly shuffle the array.
 * All permutations of the array should be equally likely as a result of the shuffling.
 * <p>
 * Implement the Solution class:
 * <p>
 * Solution(int[] nums) Initializes the object with the integer array nums.
 * int[] reset() Resets the array to its original configuration and returns it.
 * int[] shuffle() Returns a random shuffling of the array.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 200
 * -10^6 <= nums[i] <= 10^6
 * All the elements of nums are unique.
 * At most 5 * 10^4 calls in total will be made to reset and shuffle.
 */
public class Problem20_ShuffleAnArray {

    private final int[] nums;
    private final Random random;

    public Problem20_ShuffleAnArray(int[] nums) {
        this.nums = nums;
        random = new Random();
    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {
        return nums;
    }

    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {
        int[] temp = nums.clone();
        for (int i = 0; i < temp.length; i++) {
            swap(temp, i, random.nextInt(temp.length));
        }
        return temp;
    }

    private void swap(int[] temp, int i, int j) {
        int x = temp[i];
        temp[i] = temp[j];
        temp[j] = x;
    }
}
