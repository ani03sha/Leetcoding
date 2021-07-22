package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array nums, partition it into two (contiguous) subarrays left and right so that:
 * <p>
 * Every element in left is less than or equal to every element in right.
 * left and right are non-empty.
 * left has the smallest possible size.
 * Return the length of left after such a partitioning.  It is guaranteed that such a partitioning exists.
 * <p>
 * Note:
 * <p>
 * 2 <= nums.length <= 30000
 * 0 <= nums[i] <= 10^6
 * It is guaranteed there is at least one way to partition nums as described.
 */
public class Problem22_PartitionArrayIntoDisjointIntervals {

    public int partitionDisjoint(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int localMax = nums[0];
        int globalMax = nums[0];
        int partitionIndex = 0;
        // Loop through the array
        for (int i = 1; i < nums.length; i++) {
            if (localMax > nums[i]) {
                localMax = globalMax;
                partitionIndex = i;
            } else {
                globalMax = Math.max(globalMax, nums[i]);
            }
        }
        return partitionIndex + 1;
    }
}
