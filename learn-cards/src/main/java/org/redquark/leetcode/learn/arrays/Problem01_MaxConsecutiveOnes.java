package org.redquark.leetcode.learn.arrays;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 * <p>
 * Note:
 * The input array will only contain 0 and 1.
 * The length of input array is a positive integer and will not exceed 10,000
 */
public class Problem01_MaxConsecutiveOnes {

    /**
     * @param numbers - input array
     * @return - count of maximum number of consecutive ones
     * <p>
     * Algorithm:
     * 1. Loop through the entire array
     * 2. If the current element is one, increase the counter
     * 3. If the current element is zero, save the last value of counter and reset it
     * 4. Once the loop ends, compare the current count with the last stored value for boundary condition
     */
    public int findMaxConsecutiveOnes(int[] numbers) {
        // This variable will store the max consecutive ones upto the current element
        int maxCount = 0;
        // This variable will count the consecutive ones
        int count = 0;
        // Loop through the entire array
        for (int num : numbers) {
            // Check if the current element is 1
            if (num == 1) {
                // Increment the counter
                count++;
            } else {
                // If the element is zero, check if ihe current count is less than the maxCount
                if (maxCount < count) {
                    // If it is, then update the maxCount
                    maxCount = count;
                }
                // Reset the current counter
                count = 0;
            }
        }
        // Check if after the loop, the count is greater than the maxCount
        if (maxCount < count) {
            // If it is, update the maxCount
            maxCount = count;
        }
        return maxCount;
    }
}
