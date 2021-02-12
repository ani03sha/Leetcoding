package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a non-negative integer num, return the number of steps to reduce it to zero.
 * If the current number is even, you have to divide it by 2, otherwise, you have to
 * subtract 1 from it.
 * <p>
 * Constraints:
 * <p>
 * 0 <= num <= 10^6
 */
public class Problem12_NumberOfStepsToReduceANumberToZero {

    public int numberOfSteps(int num) {
        // Special case
        if (num == 0) {
            return 0;
        }
        // Total number of steps
        int steps = 0;
        // Loop until the num becomes zero
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            steps++;
        }
        return steps;
    }
}
