package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.
 * <p>
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 * <p>
 * Note: You are not supposed to use the library's sort function for this problem.
 * <p>
 * Follow up:
 * <p>
 * A rather straight forward solution is a two-pass algorithm using counting sort.
 * First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total number of 0's, then 1's and followed by 2's.
 * Could you come up with a one-pass algorithm using only constant space?
 */
public class Problem11_SortColors {

    /**
     * @param numbers - input array
     * @return sorted in-place array
     */
    public int[] sortColors(int[] numbers) {
        // Base conditions
        if (numbers.length == 0 || numbers.length == 1) {
            return numbers;
        }
        // Start and end pointers
        int start = 0;
        int end = numbers.length - 1;
        // Current element pointer
        int index = 0;
        // Loop until the conditions holds true
        while (index <= end && start < end) {
            if (numbers[index] == 0) {
                numbers[index] = numbers[start];
                numbers[start] = 0;
                index++;
                start++;
            } else if (numbers[index] == 2) {
                numbers[index] = numbers[end];
                numbers[end] = 2;
                end--;
            } else {
                index++;
            }
        }
        return numbers;
    }
}
