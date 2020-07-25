package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 * <p>
 * (i.e.,  [0,1,2,4,5,6,7] might become  [4,5,6,7,0,1,2]).
 * <p>
 * Find the minimum element.
 * <p>
 * The array may contain duplicates.
 */
public class Problem25_MinimumInRotatedSortedArrayII {

    /**
     * @param numbers - input rotated sorted array
     * @return minimum element in the array
     */
    public int findMin(int[] numbers) {
        // Pointers
        int start = 0;
        int end = numbers.length - 1;
        // Loop for the entire array
        while (start < end) {
            // Middle point
            int middle = start + (end - start) / 2;
            if (numbers[middle] == numbers[end]) {
                end--;
            } else if (numbers[middle] > numbers[end]) {
                start = middle + 1;
            } else {
                end = middle;
            }
        }
        return numbers[end];
    }
}
