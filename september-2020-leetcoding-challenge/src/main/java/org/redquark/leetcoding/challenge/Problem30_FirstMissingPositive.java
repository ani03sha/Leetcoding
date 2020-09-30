package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an unsorted integer array, find the smallest missing positive integer.
 * <p>
 * Follow up:
 * <p>
 * Your algorithm should run in O(n) time and uses constant extra space.
 */
public class Problem30_FirstMissingPositive {

    /**
     * @param numbers - input array
     * @return -smallest missing positive number
     */
    public int firstMissingPositive(int[] numbers) {
        boolean doesOneExist = false;
        for (int n : numbers) {
            if (n == 1) {
                doesOneExist = true;
                break;
            }
        }
        if (!doesOneExist) {
            return 1;
        }
        // Making sure we will never see a number in the array apart from 1...n
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] <= 0 || numbers[i] > numbers.length) {
                numbers[i] = 1;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            int n = Math.abs(numbers[i]);
            if (n == numbers.length) {
                numbers[0] = -1 * Math.abs(numbers[0]);
            } else {
                numbers[n] = -1 * Math.abs(numbers[n]);
            }
        }
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                return i;
            }
        }
        if (numbers[0] > 0) {
            return numbers.length;
        }
        return numbers.length + 1;
    }
}
