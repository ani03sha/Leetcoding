package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * You are standing at position 0 on an infinite number line. There is a goal at
 * position target.
 * <p>
 * On each move, you can either go left or right. During the n-th move (starting from 1), you take n steps.
 * <p>
 * Return the minimum number of steps required to reach the destination.
 * <p>
 * Note:
 * target will be a non-zero integer in the range [-10^9, 10^9].
 */
public class Problem28_ReachANumber {

    /**
     * @param target - the point on the number line to reach to
     * @return - minimum number of steps required to reach target
     */
    public int reachNumber(int target) {
        // Handling negative values of target
        target = Math.abs(target);
        // Sum of all the steps
        int stepsSum = 0;
        // Number of steps
        int steps = 0;
        // Loop until the sum is smaller than the target
        // or the difference is odd
        while (stepsSum < target || (stepsSum - target) % 2 == 1) {
            steps++;
            stepsSum += steps;
        }
        return steps;
    }
}
