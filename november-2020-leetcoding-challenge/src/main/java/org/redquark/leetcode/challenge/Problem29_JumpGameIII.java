package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array of non-negative integers arr, you are initially positioned at start index
 * of the array. When you are at index i, you can jump to i + arr[i] or i - arr[i],
 * check if you can reach to any index with value 0.
 * <p>
 * Notice that you can not jump outside of the array at any time.
 * <p>
 * Constraints:
 * <p>
 * 1 <= arr.length <= 5 * 10^4
 * 0 <= arr[i] < arr.length
 * 0 <= start < arr.length
 */
public class Problem29_JumpGameIII {

    /**
     * @param arr   - input array
     * @param start - start index
     * @return true, if can reach to index 0, false otherwise
     */
    public boolean canReach(int[] arr, int start) {
        if (start >= arr.length || start < 0 || arr[start] < 0) {
            return false;
        }
        if (arr[start] == 0) {
            return true;
        }
        arr[start] = -arr[start];
        return canReach(arr, start + arr[start]) || canReach(arr, start - arr[start]);
    }
}
