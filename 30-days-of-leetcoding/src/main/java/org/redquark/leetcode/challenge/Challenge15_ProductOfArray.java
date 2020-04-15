package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to
 * the product of all the elements of nums except nums[i].
 */
public class Challenge15_ProductOfArray {

    /**
     * @param numbers- input array
     * @return result array
     * <p>
     * Algorithm:
     * 1. Left traversal - in the result array, current position will have the product of all elements to its left
     * 2. Right traversal - in the result array, current position will have the product of all elements to its right
     * 3. After these traversals, we will have the resultant array
     */
    public int[] productExceptSelf(int[] numbers) {
        // Result array
        int[] result = new int[numbers.length];
        // Temporary variable that will keep track of the products
        int temp = 1;
        // Initialize first element of the result array with 1 as there are no elements before it
        result[0] = temp;
        // Multiply from the left
        for (int i = 1; i < numbers.length; i++) {
            // Temp will contain the products of elements before the current element
            temp = temp * numbers[i - 1];
            // Assign temp to the current element's position
            result[i] = temp;
        }
        // Reinitialized temp to 1 for right traversal
        temp = 1;
        // Right traversal; multiply from the right
        for (int i = numbers.length - 1; i >= 0; i--) {
            // Now multiply each element with all the elements to its right
            result[i] = result[i] * temp;
            // This will keep track of product of all elements to the right of the current element
            temp = temp * numbers[i];
        }
        return result;
    }
}
