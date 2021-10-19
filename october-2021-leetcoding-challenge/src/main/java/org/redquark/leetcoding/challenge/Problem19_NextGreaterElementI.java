package org.redquark.leetcoding.challenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author Anirudh Sharma
 * <p>
 * The next greater element of some element x in an array is the first greater element that is to the right of x in
 * the same array.
 * <p>
 * You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.
 * <p>
 * For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater
 * element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.
 * <p>
 * Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums1.length <= nums2.length <= 1000
 * 0 <= nums1[i], nums2[i] <= 10^4
 * All integers in nums1 and nums2 are unique.
 * All the integers of nums1 also appear in nums2.
 * <p>
 * Follow up: Could you find an O(nums1.length + nums2.length) solution?
 */
public class Problem19_NextGreaterElementI {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // Special cases
        if (nums1 == null || nums1.length == 0) {
            return nums1;
        }
        // Map to store the pair of element of nums2 as key and its next
        // greatest element in nums2 as value
        Map<Integer, Integer> nextGreatest = new HashMap<>();
        // A monotone stack to keep track of the current element
        Stack<Integer> monotone = new Stack<>();
        // Loop through the nums2
        for (int num : nums2) {
            // If there is/are an/a element(s) in the stack and the
            // current value is greater than the value at the top
            // of stack, we will map the top with the current value
            while (!monotone.isEmpty() && monotone.peek() < num) {
                nextGreatest.put(monotone.pop(), num);
            }
            // Add the current element to the stack
            monotone.push(num);
        }
        // Loop through the array nums1 and update it with the next
        // greatest element with the help of map
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = nextGreatest.getOrDefault(nums1[i], -1);
        }
        return nums1;
    }
}
