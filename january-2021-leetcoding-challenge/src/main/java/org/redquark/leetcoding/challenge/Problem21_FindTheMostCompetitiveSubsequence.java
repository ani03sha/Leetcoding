package org.redquark.leetcoding.challenge;

import java.util.Stack;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an integer array nums and a positive integer k, return the most competitive
 * subsequence of nums of size k.
 * <p>
 * An array's subsequence is a resulting sequence obtained by erasing some (possibly zero)
 * elements from the array.
 * <p>
 * We define that a subsequence a is more competitive than a subsequence b (of the same length)
 * if in the first position where a and b differ, subsequence a has a number less than the
 * corresponding number in b. For example, [1,3,4] is more competitive than [1,3,5] because
 * the first position they differ is at the final number, and 4 is less than 5.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 10^5
 * 0 <= nums[i] <= 10^9
 * 1 <= k <= nums.length
 */
public class Problem21_FindTheMostCompetitiveSubsequence {

    /**
     * @param nums - array of numbers
     * @param k    - length of the subsequence
     * @return most competitive subsequence
     */
    public int[] mostCompetitive(int[] nums, int k) {
        // Monotone stack
        Stack<Integer> monotoneStack = new Stack<>();
        // Remaining elements
        int remaining = nums.length - k;
        // Loop for all the elements in the array
        for (int n : nums) {
            // Loop for removing any element out of order
            // in the monotone stack
            while (!monotoneStack.isEmpty() && remaining > 0 && n < monotoneStack.peek()) {
                monotoneStack.pop();
                remaining--;
            }
            monotoneStack.push(n);
        }
        // Check if extra elements are present in the stack
        while (remaining > 0) {
            monotoneStack.pop();
            remaining--;
        }
        // Resultant array
        int[] result = new int[k];
        while (k > 0) {
            result[k - 1] = monotoneStack.pop();
            k--;
        }
        return result;
    }
}
