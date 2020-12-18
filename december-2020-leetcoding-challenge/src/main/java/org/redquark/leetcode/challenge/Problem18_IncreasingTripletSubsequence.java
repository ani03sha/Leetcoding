package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that
 * i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 10^5
 * -2^31 <= nums[i] <= 2^31 - 1
 * <p>
 * Follow up: Could you implement a solution that runs in O(n) time complexity and O(1)
 * space complexity?
 */
public class Problem18_IncreasingTripletSubsequence {

    /**
     * @param nums - array of integers
     * @return true, if increasing triplet occurs, false otherwise
     */
    public boolean increasingTriplet(int[] nums) {
        // Base condition
        if (nums == null || nums.length < 3) {
            return false;
        }
        // Two minimums
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        // Loop through all the numbers of the array
        for (int n : nums) {
            if (n <= firstMin) {
                firstMin = n;
            } else if (n <= secondMin) {
                secondMin = n;
            } else {
                return true;
            }
        }
        return false;
    }

}
