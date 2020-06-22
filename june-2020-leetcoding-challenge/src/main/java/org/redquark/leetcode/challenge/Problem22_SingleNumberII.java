package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * Given a non-empty array of integers, every element appears three times except for one, which appears exactly once.
 * Find that single one.
 * <p>
 * Note:
 * <p>
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
public class Problem22_SingleNumberII {

    /**
     * @param numbers - input array of numbers
     * @return number that appears once
     */
    public int singleNumber(int[] numbers) {
        // Counters of elements appearing one time, two times and three times
        int ones = 0, twos = 0, threes;
        for (int n : numbers) {
            twos = twos | (ones & n);
            ones = ones ^ n;
            threes = ones & twos;
            ones &= ~threes;
            twos &= ~threes;
        }
        return ones;
    }
}
