package org.redquark.leetcode.challenge;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
 * <p>
 * You must write an algorithm that runs in O(n) time.
 * <p>
 * Constraints:
 * <p>
 * 0 <= nums.length <= 10^5
 * -10^9 <= nums[i] <= 10^9
 */
public class Problem06_LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Maximum length of the consecutive sequence
        int length = 0;
        // Set to store all the elements in the array
        Set<Integer> elements = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        // Traverse through the array one element at a time
        for (int num : nums) {
            // Check if this element is the first element of the sequence
            if (!elements.contains(num - 1)) {
                // Current element
                int j = num;
                while (elements.contains(j)) {
                    j++;
                }
                // Update the length
                length = Math.max(length, j - num);
            }
        }
        return length;
    }
}
