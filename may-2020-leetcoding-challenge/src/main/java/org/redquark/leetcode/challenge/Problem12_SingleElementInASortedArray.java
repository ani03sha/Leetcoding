package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given a sorted array consisting of only integers where every element appears exactly twice,
 * except for one element which appears exactly once. Find this single element that appears only once.
 * <p>
 * Follow up: Your solution should run in O(log n) time and O(1) space.
 */
public class Problem12_SingleElementInASortedArray {

    public int singleNonDuplicate(int[] numbers) {
        // low and high indices
        int low = 0;
        int high = numbers.length - 1;
        // Loop until low is less than or equals to high
        while (low < high) {
            // Middle element of current low and high
            int middle = low + (high - low) / 2;
            // If the middle element is odd
            if (middle % 2 == 1) {
                middle--;
            }
            if (numbers[middle] != numbers[middle + 1]) {
                // We did not find the pair, hence the single number must be on the left
                high = middle;
            } else {
                // We found a pair, hence the single number must be on the right
                low = middle + 2;
            }
        }
        return numbers[low];
    }
}
