package org.redquark.leetcoding.challenge;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Anirudh Sharma
 * <p>
 * We have n jobs, where every job is scheduled to be done from startTime[i] to endTime[i], obtaining a profit of profit[i].
 * <p>
 * You're given the startTime, endTime and profit arrays, return the maximum profit you can take such that there
 * are no two jobs in the subset with overlapping time range.
 * <p>
 * If you choose a job that ends at time X you will be able to start another job that starts at time X.
 * <p>
 * Constraints:
 * <p>
 * 1 <= startTime.length == endTime.length == profit.length <= 5 * 10^4
 * 1 <= startTime[i] < endTime[i] <= 10^9
 * 1 <= profit[i] <= 10^4
 */
public class Problem28_MaximumProfitInJobScheduling {

    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        // Total number of jobs
        int n = startTime.length;
        // 2D array to store the start time, end time and profit
        int[][] jobs = new int[n][3];
        // Populate the array
        for (int i = 0; i < n; i++) {
            jobs[i][0] = startTime[i];
            jobs[i][1] = endTime[i];
            jobs[i][2] = profit[i];
        }
        // Sort the array based on start time
        Arrays.sort(jobs, Comparator.comparingInt(a -> a[0]));
        // Lookup table to store the intermediate results
        int[] lookup = new int[n];
        Arrays.fill(lookup, -1);
        return helper(jobs, 0, 0, lookup);
    }

    private int helper(int[][] jobs, int previousEndTime, int index, int[] lookup) {
        // If all the jobs are observed
        if (index == jobs.length) {
            return 0;
        }
        // If the end time of previous job is greater than
        // the start time of current job
        if (previousEndTime > jobs[index][0]) {
            return helper(jobs, previousEndTime, index + 1, lookup);
        }
        // If the value for this is already calculated
        if (lookup[index] != -1) {
            return lookup[index];
        }
        return lookup[index] = Math.max(jobs[index][2] + helper(jobs, jobs[index][1], index + 1, lookup),
                helper(jobs, previousEndTime, index + 1, lookup));
    }
}
