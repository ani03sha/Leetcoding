package org.redquark.leetcode.challenge;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Anirudh Sharma
 * <p>
 * There are 2N people a company is planning to interview. The cost of flying the i-th person to city A is costs[i][0],
 * and the cost of flying the i-th person to city B is costs[i][1].
 * <p>
 * Return the minimum cost to fly every person to a city such that exactly N people arrive in each city.
 * <p>
 * Note:
 * <p>
 * 1 <= costs.length <= 100
 * It is guaranteed that costs.length is even.
 * 1 <= costs[i][0], costs[i][1] <= 1000
 */
public class Problem03_TwoCityScheduling {

    /**
     * @param costs - cost array
     * @return - minimized cost
     */
    public int twoCitySchedulingCost(int[][] costs) {
        // Comparator for sorting the items based on the difference of costs of sending someone to two cities
        Comparator<int[]> costComparator = (a, b) -> Math.abs(b[0] - b[1]) - Math.abs(a[0] - a[1]);
        // Sort the array based on the above comparator
        Arrays.sort(costs, costComparator);
        // Counters for people to both the cities
        int a = 0;
        int b = 0;
        // Total costs
        int totalCost = 0;
        // Loop until we send all candidates to their respective cities
        int i = 0;
        while (i < costs.length) {
            if ((costs[i][0] <= costs[i][1] && a < costs.length / 2) || b == costs.length / 2) {
                totalCost += costs[i++][0];
                a++;
            } else {
                totalCost += costs[i++][1];
                b++;
            }
        }
        return totalCost;
    }
}