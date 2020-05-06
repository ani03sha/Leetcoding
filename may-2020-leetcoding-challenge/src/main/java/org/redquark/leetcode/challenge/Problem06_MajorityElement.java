package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array of size n, find the majority element. The majority element is the element that appears more than
 * ⌊ n/2 ⌋ times.
 * <p>
 * You may assume that the array is non-empty and the majority element always exist in the array.
 * <p>
 * Example 1:
 * <p>
 * Input: [3,2,3]
 * Output: 3
 * Example 2:
 * <p>
 * Input: [2,2,1,1,1,2,2]
 * Output: 2
 */
public class Problem06_MajorityElement {

    /**
     * @param numbers - input array
     * @return - majority element
     * <p>
     * Algorithm:
     * 1. Keep count of majority element
     * 2. If the next element is greater than majority element, increment count
     * 3. Else, decrement count
     * 4. If count is zero then assign current element as the majority element
     */
    public int majorityElement(int[] numbers) {
        // Variable to store the majority element
        int majority = -1;
        // Counter for majority element
        int count = 0;
        // Loop through the array
        for (int n : numbers) {
            if (count == 0) {
                majority = n;
                count = 1;
            } else if (majority == n) {
                count++;
            } else {
                count--;
            }
        }
        return majority;
    }
}
