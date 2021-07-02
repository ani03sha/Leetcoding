package org.redquark.leetcode.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array.
 * The result should also be sorted in ascending order.
 * <p>
 * An integer a is closer to x than an integer b if:
 * <p>
 * |a - x| < |b - x|, or
 * |a - x| == |b - x| and a < b
 * <p>
 * Constraints:
 * <p>
 * 1 <= k <= nums.length
 * 1 <= nums.length <= 10^4
 * nums is sorted in ascending order.
 * -10^4 <= nums[i], x <= 10^4
 */
public class Problem02_FindKClosestElements {

    public List<Integer> findClosestElements(int[] nums, int k, int x) {
        // List to store all the closest elements
        List<Integer> closestElements = new ArrayList<>();
        // Left and right pointers
        int left = 0;
        int right = nums.length - 1;
        // Loop until we reach to the boundary of
        // length k between left and right pointers
        while (right - left >= k) {
            if (Math.abs(nums[left] - x) > Math.abs(nums[right] - x)) {
                left++;
            } else {
                right--;
            }
        }
        // Now, we have found the range, add all
        // the elements between left and right
        // pointers to the list
        while (left <= right) {
            closestElements.add(nums[left]);
            left++;
        }
        return closestElements;
    }
}
