package org.redquark.leetcoding.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 * <p>
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must appear as many times as it shows in both arrays, and you may return the
 * result in any order.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums1.length, nums2.length <= 1000
 * 0 <= nums1[i], nums2[i] <= 1000
 * <p>
 * <p>
 * Follow up:
 * <p>
 * What if the given array is already sorted? How would you optimize your algorithm?
 * What if nums1's size is small compared to nums2's size? Which algorithm is better?
 * What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all
 * elements into the memory at once?
 */
public class Problem17_IntersectionOfTwoArraysII {

    public int[] intersect(int[] nums1, int[] nums2) {
        // If nums2 is bigger than nums1
        if (nums1.length < nums2.length) {
            return intersect(nums2, nums1);
        }
        // Array to store the frequencies of the elements in nums1
        int[] frequencies = new int[1001];
        // Populate frequencies array
        for (int num : nums1) {
            frequencies[num]++;
        }
        // Traverse through the second array and extract common elements
        List<Integer> intersection = new ArrayList<>();
        for (int num : nums2) {
            if (frequencies[num] > 0) {
                intersection.add(num);
                frequencies[num]--;
            }
        }
        // Final output array
        int[] output = new int[intersection.size()];
        for (int i = 0; i < output.length; i++) {
            output[i] = intersection.get(i);
        }
        return output;
    }
}
