package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if
 * you can flip at most k 0's.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 10^5
 * nums[i] is either 0 or 1.
 * 0 <= k <= nums.length
 */
public class Problem29_MaxConsecutiveOnesIII {

    public int longestOnes(int[] nums, int k) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Maximum consecutive ones
        int maxConsecutiveOnes = 0;
        // Variable to store the count of
        // consecutive ones in the current
        // sliding window
        int currentConsecutiveOnes = 0;
        // Start and end indices of the window
        int start = 0;
        int end = 0;
        // Loop until the end reaches to the
        // end of the array
        while (end < nums.length) {
            // If we find one, then everything
            // is hunky dory, increment the counters
            if (nums[end] == 1) {
                end++;
                currentConsecutiveOnes++;
            }
            // If we encounter zero but we have
            // value of k > 0
            else if (nums[end] == 0 && k > 0) {
                k--;
                end++;
                currentConsecutiveOnes++;
            }
            // If we don't encounter one and we
            // don't have k left
            else {
                // Update the maxConsecutiveOnes
                maxConsecutiveOnes = Math.max(maxConsecutiveOnes, currentConsecutiveOnes);
                // Move start to the position where
                // the zero is present
                while (nums[start] == 1) {
                    start++;
                }
                start++;
                end++;
                // Update the currentConsecutiveOnes (actual)
                // without flipping any of the zeros
                currentConsecutiveOnes = end - start;
            }
        }
        return Math.max(maxConsecutiveOnes, currentConsecutiveOnes);
    }
}
