package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array nums of 0s and 1s and an integer k, return True if all 1's are at least k
 * places away from each other, otherwise return False.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 10^5
 * 0 <= k <= nums.length
 * nums[i] is 0 or 1
 */
public class Problem25_CheckIfAll1sAreAtLeastLengthKPlacesAway {

    /**
     * @param nums - array of 0s and 1s
     * @param k    - distance
     * @return if all 1s are at least k position apart
     */
    public boolean kLengthApart(int[] nums, int k) {
        // Index that will store the last encountered 1
        int lastOneIndex = nums[0] == 1 ? 0 : -1;
        // Loop through the array
        for (int i = 1; i < nums.length; i++) {
            // If the current element is 1 then we
            // will check for the condition
            if (nums[i] == 1) {
                if (i - lastOneIndex <= k) {
                    return false;
                }
                lastOneIndex = i;
            }
        }
        return true;
    }
}
