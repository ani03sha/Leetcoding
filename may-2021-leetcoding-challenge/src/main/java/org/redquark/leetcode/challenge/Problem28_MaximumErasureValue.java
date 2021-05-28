package org.redquark.leetcode.challenge;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given an array of positive integers nums and want to erase a subarray containing unique elements.
 * The score you get by erasing the subarray is equal to the sum of its elements.
 * <p>
 * Return the maximum score you can get by erasing exactly one subarray.
 * <p>
 * An array b is called to be a subarray of a if it forms a contiguous subsequence of a, that is,
 * if it is equal to a[l],a[l+1],...,a[r] for some (l,r).
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 10^5
 * 1 <= nums[i] <= 10^4
 */
public class Problem28_MaximumErasureValue {

    public int maximumUniqueSubarray(int[] nums) {
        // Special cases
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        // Two pointers for the traversal
        int slow = 0;
        int fast = 0;
        // Set to store the numbers encountered so far
        Set<Integer> elements = new HashSet<>();
        // Variable to store maximum sum subarray
        int maxSum = 0;
        int currentSum = 0;
        // Loop until the fast reaches to the end
        while (fast < nums.length) {
            while (fast < nums.length && !elements.contains(nums[fast])) {
                currentSum += nums[fast];
                elements.add(nums[fast]);
                fast++;
            }
            maxSum = Math.max(currentSum, maxSum);
            elements.remove(nums[slow]);
            currentSum -= nums[slow];
            slow++;
        }
        return maxSum;
    }
}
