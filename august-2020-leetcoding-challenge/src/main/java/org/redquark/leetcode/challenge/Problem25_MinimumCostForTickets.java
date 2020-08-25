package org.redquark.leetcode.challenge;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Anirudh Sharma
 * <p>
 * In a country popular for train travel, you have planned some train travelling one year in advance.
 * The days of the year that you will travel is given as an array days.
 * Each day is an integer from 1 to 365.
 * <p>
 * Train tickets are sold in 3 different ways:
 * <p>
 * a 1-day pass is sold for costs[0] dollars;
 * a 7-day pass is sold for costs[1] dollars;
 * a 30-day pass is sold for costs[2] dollars.
 * The passes allow that many days of consecutive travel.
 * For example, if we get a 7-day pass on day 2, then we can travel for 7 days: day 2, 3, 4, 5, 6, 7, and 8.
 * <p>
 * Return the minimum number of dollars you need to travel every day in the given list of days.
 * <p>
 * Note:
 * <p>
 * 1. 1 <= days.length <= 365
 * 2. 1 <= days[i] <= 365
 * 3. days is in strictly increasing order.
 * 4. costs.length == 3
 * 5. 1 <= costs[i] <= 1000
 */
public class Problem25_MinimumCostForTickets {

    // This will store the costs of the passes
    int[] costs;
    // This will be used for memoization
    int[] memoization;
    // This will store the days on which we wish to travel
    Set<Integer> daySet;

    /**
     * @param days  - array containing day numbers
     * @param costs - costs of 1 day, 7 days and 30 days
     * @return - minimum cost
     */
    public int minCostTickets(int[] days, int[] costs) {
        // Assign costs to the given costs
        this.costs = costs;
        // Create memoization arrays
        memoization = new int[days[days.length - 1]];
        // Create hashset
        daySet = new HashSet<>();
        // Loop for all the travelling days
        for (int day : days) {
            daySet.add(day);
        }
        return dp(days[days.length - 1]);
    }

    private int dp(int day) {
        if (day <= 0) {
            return 0;
        }
        if (memoization[day - 1] != 0) {
            return memoization[day - 1];
        }
        int result;
        if (daySet.contains(day)) {
            int one = dp(day - 1) + costs[0];
            int seven = dp(day - 7) + costs[1];
            int thirty = dp(day - 30) + costs[2];
            result = Math.min(one, Math.min(seven, thirty));
        } else {
            result = dp(day - 1);
        }
        memoization[day - 1] = result;
        return result;
    }
}
