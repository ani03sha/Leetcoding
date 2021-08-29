package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a sorted integer array nums and an integer n, add/patch elements to the array such that any
 * number in the range [1, n] inclusive can be formed by the sum of some elements in the array.
 * <p>
 * Return the minimum number of patches required.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 1000
 * 1 <= nums[i] <= 10^4
 * nums is sorted in ascending order.
 * 1 <= n <= 2^31 - 1
 */
public class Problem29_PatchingArray {

    public int minPatches(int[] nums, int n) {
        long missed = 1;
        int patches = 0;
        int i = 0;
        while (missed <= n) {
            if (i < nums.length && nums[i] <= missed) {
                missed += nums[i];
                i++;
            } else {
                missed *= 2;
                patches++;
            }
        }
        return patches;
    }
}
