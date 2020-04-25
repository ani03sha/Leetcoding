package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 * <p>
 * Each element in the array represents your maximum jump length at that position.
 * <p>
 * Determine if you are able to reach the last index.
 * <p>
 * Example 1:
 * <p>
 * Input: [2,3,1,1,4]
 * Output: true
 * Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
 * Example 2:
 * <p>
 * Input: [3,2,1,0,4]
 * Output: false
 * Explanation: You will always arrive at index 3 no matter what. Its maximum
 * jump length is 0, which makes it impossible to reach the last index.
 */
public class Challenge25_JumpGame {

    /**
     * @param numbers - input array
     * @return - true, if the user can jump
     * <p>
     * Algorithm:
     * 1. Track backwards in array
     * 2. Starting from the last index, check if the jump can be happened
     * 3. Ar the index, we should be at index = 0
     */
    public boolean canJump(int[] numbers) {
        // Last good index
        int lastGoodIndex = numbers.length - 1;
        // Loop through the array backwards
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i >= numbers[i]) {
                lastGoodIndex = i;
            }
        }
        return lastGoodIndex == 0;
    }
}
