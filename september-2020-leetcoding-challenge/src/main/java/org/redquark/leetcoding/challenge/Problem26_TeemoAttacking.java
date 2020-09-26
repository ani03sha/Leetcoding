package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * In LOL world, there is a hero called Teemo and his attacking can make his enemy Ashe be in poisoned condition.
 * Now, given the Teemo's attacking ascending time series towards Ashe and the poisoning time duration per
 * Teemo's attacking, you need to output the total time that Ashe is in poisoned condition.
 * <p>
 * You may assume that Teemo attacks at the very beginning of a specific time point, and makes Ashe be
 * in poisoned condition immediately.
 * <p>
 * Note:
 * <p>
 * - You may assume the length of given time series array won't exceed 10000.
 * - You may assume the numbers in the Teemo's attacking time series and
 * his poisoning time duration per attacking are non-negative integers, which won't exceed 10,000,000.
 */
public class Problem26_TeemoAttacking {

    /**
     * @param timeSeries - Teemo's time series
     * @param duration   - duration of each attack
     * @return total duration of poisoned Ashe
     */
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        // Total duration of poisoned Ashe
        int totalDuration = 0;
        // Base condition
        if (timeSeries.length == 0) {
            return totalDuration;
        }
        for (int i = 0; i < timeSeries.length - 1; i++) {
            totalDuration += Math.min(duration, timeSeries[i + 1] - timeSeries[i]);
        }
        totalDuration += duration;
        return totalDuration;
    }
}
