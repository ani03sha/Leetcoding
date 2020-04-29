package org.redquark.leetcode.learn.arrays;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once
 * and return the new length.
 * <p>
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place
 * with O(1) extra memory.
 */
public class Problem07_RemoveDuplicatesFromSortedArray {

    /**
     * @param numbers - input array
     * @return count of unique elements
     * <p>
     * Algorithm:
     * 1. Store first element in a variable
     * 2. Compare it to its next
     * 3. If equal, move one step further
     * 4. If not, add it to the array
     */
    public int removeDuplicates(int[] numbers) {
        // Base condition
        if (numbers.length == 0) {
            return 0;
        }
        // Counter for unique elements
        int count = 1;
        // This variable will keep track for the unique elements' indices
        int temp = numbers[0];
        // This variable will loop through the entire array
        int i = 1;
        while (i < numbers.length) {
            // Check if the current element is equal to the previous element
            if (temp == numbers[i]) {
                // Move the pointer one element ahead
                i++;
            } else {
                // If the element is unique, add it to its appropriate position
                numbers[count] = numbers[i];
                // Update the value of temp
                temp = numbers[i];
                // Increment counter
                count++;
            }
        }
        return count;
    }
}
