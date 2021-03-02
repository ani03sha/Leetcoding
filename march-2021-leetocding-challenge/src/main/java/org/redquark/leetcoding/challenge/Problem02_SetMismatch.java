package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * You have a set of integers s, which originally contains all the numbers from 1 to n.
 * Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set,
 * which results in repetition of one number and loss of another number.
 * <p>
 * You are given an integer array nums representing the data status of this set after the error.
 * <p>
 * Find the number that occurs twice and the number that is missing and return them in the form of an array.
 * <p>
 * Constraints:
 * <p>
 * 2 <= nums.length <= 10^4
 * 1 <= nums[i] <= 10^4
 */
public class Problem02_SetMismatch {

    public int[] findErrorNums(int[] nums) {
        // Array to store the result
        int[] result = new int[2];
        // Array to store the count of elements
        int[] elementCount = new int[nums.length];
        // Loop for each element in the array
        for (int n : nums) {
            elementCount[n - 1]++;
        }
        // Again loop for each element in the array
        for (int i = 0; i < nums.length; i++) {
            // Check for the element with count 2
            if (elementCount[i] == 2) {
                result[0] = i + 1;
            }
            // Check for the element count 0
            if (elementCount[i] == 0) {
                result[1] = i + 1;
            }
        }
        return result;
    }
}
