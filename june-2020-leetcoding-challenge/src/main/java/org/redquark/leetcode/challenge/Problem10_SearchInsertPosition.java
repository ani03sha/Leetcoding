package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a sorted array and a target value, return the index if the target is found. If not,
 * return the index where it would be if it were inserted in order.
 * <p>
 * You may assume no duplicates in the array.
 */
public class Problem10_SearchInsertPosition {

    /**
     * @param numbers - input array
     * @param target  - number to find/insert
     * @return - index of the target
     */
    public int searchInsert(int[] numbers, int target) {
        // Left and right pointers
        int left = 0;
        int right = numbers.length - 1;
        // Loop until the condition holds
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (target > numbers[middle]) {
                left = middle + 1;
            } else if (target < numbers[middle]) {
                right = middle - 1;
            } else {
                return middle;
            }
        }
        return left;
    }
}
