package org.redquark.leetcoding.challenge;

import java.util.Stack;

/**
 * @author Anirudh Sharma
 * <p>
 * Given an array of integers temperatures represents the daily temperatures, return an array answer such that
 * answer[i] is the number of days you have to wait after the ith day to get a warmer temperature.
 * If there is no future day for which this is possible, keep answer[i] == 0 instead.
 * <p>
 * Constraints:
 * <p>
 * 1 <= temperatures.length <= 10^5
 * 30 <= temperatures[i] <= 100
 */
public class Problem13_DailyTemperatures {

    public int[] dailyTemperatures(int[] temperatures) {
        // Special case
        if (temperatures == null || temperatures.length == 0) {
            return temperatures;
        }
        // Length of the array
        int n = temperatures.length;
        // Array to store the output
        int[] nextWarmers = new int[n];
        // Monotone stack
        Stack<Integer> monotone = new Stack<>();
        // Loop through the temperature array
        for (int i = 0; i < n; i++) {
            while (!monotone.isEmpty() && temperatures[monotone.peek()] < temperatures[i]) {
                // Index of element against which we need to find the
                // next warmer temperature
                int index = monotone.pop();
                // Populate the value for that element
                nextWarmers[index] = i - index;
            }
            monotone.push(i);
        }
        return nextWarmers;
    }
}
