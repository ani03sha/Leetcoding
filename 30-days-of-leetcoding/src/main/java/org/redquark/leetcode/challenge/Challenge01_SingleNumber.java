package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Problem Statement
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory.
 */
public class Challenge01_SingleNumber {

    /**
     * @param numbers - the array of numbers
     * @return - the element which is not repeated
     * <p>
     * Algorithm:
     * 1. Assign first element of the array to a variable
     * 2. Loop the array for the rest of the element
     * 3. In each iteration XOR the above variable with the current element of the array
     * 4. After the iteration the variable will contain the value of the unique element
     * 5. Return the value in the variable
     */
    public int findSingleNumber(int[] numbers) {
        // Temp variable
        int temp = numbers[0];
        // Loop for the remaining elements in the array
        for (int i = 1; i < numbers.length; i++) {
            // XOR the current element with the temp variable
            temp = temp ^ numbers[i];
        }
        // Return the temp
        return temp;
    }
}
