package org.redquark.leetcode.learn.arrays;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of
 * the non-zero elements.
 */
public class Problem11_MoveZeros {

    /**
     * @param numbers - input array
     */
    public int[] moveZeroes(int[] numbers) {
        // Keeps count of zeros
        int zeroCount = 0;
        // Loop through the array
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                zeroCount++;
            } else {
                numbers[i - zeroCount] = numbers[i];
            }
        }
        // Move all the zeros to the end
        for (int i = 0; i < zeroCount; i++) {
            numbers[numbers.length - 1 - i] = 0;
        }
        return numbers;
    }
}
