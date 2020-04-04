package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of
 * the non-zero elements.
 * <p>
 * Note:
 * 1. You must do this in-place without making a copy of the array.
 * 2. Minimize the total number of operations.
 */
public class Challenge04_MoveZeroes {

    /**
     * @param numbers - array of numbers to be arranged
     * @return array with all the zeros in the right side
     * <p>
     * Algorithm:
     * 1. Iterate through the array
     * 2. If the current element is zero, increment the zeroCount variable
     * 3. If it is non zero, shift the current element to the current index minus number of zeros
     * 4. After completion of iteration, append number of zeros equal to the zeroCount at the end
     */
    public int[] move(int[] numbers) {
        // Variable that will keep track of the number of zeros in an array
        int zeroCount = 0;
        // Iterate through each element of the array
        for (int i = 0; i < numbers.length; i++) {
            // Check if the number is zero
            if (numbers[i] == 0) {
                // If it is zero, increment the zeroCount
                zeroCount++;
            } else {
                // Else shift the current element to its desired position
                numbers[i - zeroCount] = numbers[i];
            }
        }
        // Iterate for the number of zeros at the end of the array
        for (int i = 0; i < zeroCount; i++) {
            numbers[numbers.length - 1 - i] = 0;
        }
        return numbers;
    }
}
