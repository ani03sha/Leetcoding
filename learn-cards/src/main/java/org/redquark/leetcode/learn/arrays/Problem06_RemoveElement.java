package org.redquark.leetcode.learn.arrays;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array nums and a value val, remove all instances of that value in-place and return the new length.
 * <p>
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with
 * O(1) extra memory.
 * <p>
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */
public class Problem06_RemoveElement {

    /**
     * @param numbers - input array
     * @param val     - value to be removed
     * @return length of the modified array
     * <p>
     * Algorithm:
     * Initialize count at 0
     * Fill all the elements except the input number while increasing the count
     */
    public int removeElement(int[] numbers, int val) {
        // Counter
        int count = 0;
        // Loop through each element of the array
        for (int i = 0; i < numbers.length; i++) {
            // Check if the given number is equal to the current element
            if (numbers[i] != val) {
                // Fill the array only with the elements that are not equal to value
                numbers[count] = numbers[i];
                count++;
            }
        }
        return count;
    }
}
