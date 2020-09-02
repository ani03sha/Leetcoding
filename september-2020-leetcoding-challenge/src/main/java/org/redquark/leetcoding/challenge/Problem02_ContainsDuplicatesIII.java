package org.redquark.leetcoding.challenge;

import java.util.TreeSet;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array of integers, find out whether there are two distinct indices i and j in the array such that
 * the absolute difference between nums[i] and nums[j] is at most t and the absolute difference between i and j
 * is at most k.
 */
public class Problem02_ContainsDuplicatesIII {

    /**
     * @param numbers - input array
     * @param k       - at most difference between i and j
     * @param t       - at most difference between numbers[i] and numbers[j]
     * @return - true, if the condition satisfies, false otherwise
     */
    public boolean containsNearbyAlmostDuplicate(int[] numbers, int k, int t) {
        if (numbers == null || numbers.length == 0) {
            return false;
        }
        TreeSet<Long> set = new TreeSet<>();
        set.add((long) numbers[0]);
        for (int i = 1; i < numbers.length; i++) {
            if (i > k) {
                set.remove((long) numbers[i - k - 1]);
            }
            long left = (long) numbers[i] - t;
            long right = (long) numbers[i] + t;
            if (left <= right && !set.subSet(left, right + 1).isEmpty()) {
                return true;
            }
            set.add((long) numbers[i]);
        }
        return false;
    }
}
