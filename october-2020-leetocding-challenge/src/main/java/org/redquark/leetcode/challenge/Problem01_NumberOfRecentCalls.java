package org.redquark.leetcode.challenge;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 * <p>
 * You have a RecentCounter class which counts the number of recent requests within a certain time frame.
 * <p>
 * Implement the RecentCounter class:
 * <p>
 * RecentCounter() Initializes the counter with zero recent requests.
 * int ping(int t) Adds a new request at time t, where t represents some time in milliseconds, and returns the
 * number of requests that has happened in the past 3000 milliseconds (including the new request).
 * <p>
 * Specifically, return the number of requests that have happened in the inclusive range [t - 3000, t].
 * It is guaranteed that every call to ping uses a strictly larger value of t than the previous call.
 * <p>
 * Constraints:
 * <p>
 * 1 <= t <= 10^4
 * Each test case will call ping with strictly increasing values of t.
 * At most 10^4 calls will be made to ping.
 */
public class Problem01_NumberOfRecentCalls {

    private final Queue<Integer> counter;

    Problem01_NumberOfRecentCalls() {
        this.counter = new LinkedList<>();
    }

    /**
     * @param t - time at which a new request is added
     * @return number of requests in past 3000 seconds
     */
    public int ping(int t) {
        counter.add(t);
        while (counter.peek() < t - 3000) {
            counter.poll();
        }
        return counter.size();
    }
}
