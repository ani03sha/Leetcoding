package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an integer array arr, return the length of a maximum size turbulent subarray of arr.
 * <p>
 * A subarray is turbulent if the comparison sign flips between each adjacent pair of elements in the subarray.
 * <p>
 * More formally, a subarray [arr[i], arr[i + 1], ..., arr[j]] of arr is said to be turbulent if and only if:
 * <p>
 * For i <= k < j:
 * arr[k] > arr[k + 1] when k is odd, and
 * arr[k] < arr[k + 1] when k is even.
 * Or, for i <= k < j:
 * arr[k] > arr[k + 1] when k is even, and
 * arr[k] < arr[k + 1] when k is odd.
 * <p>
 * Constraints:
 * <p>
 * 1 <= arr.length <= 4 * 10^4
 * 0 <= arr[i] <= 10^9
 */
public class Problem15_LongestTurbulentSubarray {

    public int maxTurbulenceSize(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Length of the array
        int n = nums.length;
        // Left and right pointers
        int left = 0;
        int right = 1;
        // Longest length
        int longestLength = 1;
        // Previous difference
        long previousDifference = 0;
        // Loop until the right pointer reaches the end
        while (right < n) {
            // Current difference
            int currentDifference = nums[right] - nums[right - 1];
            // Check for the sign
            if (currentDifference * previousDifference > 0) {
                left = right - 1;
            } else if (nums[right] == nums[right - 1]) {
                left = right;
            }
            // Update the longest length, if required
            longestLength = Math.max(longestLength, right - left + 1);
            // Make the current difference as previous difference
            previousDifference = currentDifference;
            right++;
        }
        return longestLength;
    }
}
