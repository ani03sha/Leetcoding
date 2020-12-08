package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given a list of songs where the ith song has a duration of time[i] seconds.
 * <p>
 * Return the number of pairs of songs for which their total duration in seconds is divisible by 60.
 * Formally, we want the number of indices i, j such that i < j with (time[i] + time[j]) % 60 == 0.
 * <p>
 * Constraints:
 * <p>
 * 1 <= time.length <= 6 * 10^4
 * 1 <= time[i] <= 500
 */
public class Problem08_PairsOfSongsWithTotalDurationsDivisibleBy60 {

    /**
     * @param time - array of song lengths
     * @return - number of pairs divisible by 60
     */
    public int numPairsDivisibleBy60(int[] time) {
        // Base condition
        if (time == null || time.length < 2) {
            return 0;
        }
        // Count array
        int[] count = new int[60];
        // Resultant count
        int result = 0;
        // Loop through all the elements of the array
        for (int t : time) {
            result += count[(60 - t % 60) % 60];
            count[t % 60] += 1;
        }
        return result;
    }
}
