package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Your are given an array of positive integers nums.
 * <p>
 * Count and print the number of (contiguous) subarrays where the product of all the elements in the
 * subarray is less than k.
 * <p>
 * Note:
 * <p>
 * 0 < nums.length <= 50000.
 * 0 < nums[i] < 1000.
 * 0 <= k < 10^6.
 */
public class Problem28_MaximumSubarrayProductLessThanK {

    /**
     * @param numbers - input array
     * @param k       - the k
     * @return - number of subarrays whose product is less than k
     */
    public int numSubarrayProductLessThanK(int[] numbers, int k) {
        if (k <= 1) {
            return 0;
        }
        int count = 0;
        int product = 1;
        int start = 0;
        int end = 0;
        while (end < numbers.length) {
            product *= numbers[end];
            while (product >= k) {
                product /= numbers[start];
                start++;
            }
            count += end - start + 1;
            end++;
        }
        return count;
    }
}
