package org.redquark.leetcode.challenge;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array of integers nums and an integer threshold, we will choose a positive integer
 * divisor and divide all the array by it and sum the result of the division.
 * <p>
 * Find the smallest divisor such that the result mentioned above is less than or equal to threshold.
 * <p>
 * Each result of division is rounded to the nearest integer greater than or equal to that element.
 * (For example: 7/3 = 3 and 10/2 = 5).
 * <p>
 * It is guaranteed that there will be an answer.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 5 * 10^4
 * 1 <= nums[i] <= 10^6
 * nums.length <= threshold <= 10^6
 */
public class Problem06_FindTheSmallestDivisorGivenAThreshold {

    /**
     * @param nums      - input array
     * @param threshold - value of threshold
     * @return smalled divisor
     */
    public int smallestDivisor(int[] nums, int threshold) {
        Arrays.sort(nums);
        int left = 1;
        int right = nums[nums.length - 1];
        int result = 0;
        while (left <= right) {
            long sum = 0;
            int mid = left + (right - left) / 2;
            for (int num : nums) {
                if (num % mid == 0) {
                    sum += num / mid;
                } else {
                    sum += num / mid + 1;
                }
            }
            if (sum > threshold) {
                left = mid + 1;
            } else {
                result = mid;
                right = mid - 1;
            }
        }
        return result;
    }
}
