package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * You are given an array representing a row of seats where seats[i] = 1 represents a person
 * sitting in the ith seat, and seats[i] = 0 represents that the ith seat is empty (0-indexed).
 * <p>
 * There is at least one empty seat, and at least one person sitting.
 * <p>
 * Alex wants to sit in the seat such that the distance between him and the closest person to
 * him is maximized.
 * <p>
 * Return that maximum distance to the closest person.
 * <p>
 * Constraints:
 * <p>
 * 2 <= seats.length <= 2 * 10^4
 * seats[i] is 0 or 1.
 * At least one seat is empty.
 * At least one seat is occupied.
 */
public class Problem29_MaximizeDistanceToClosestPerson {

    /**
     * @param seats - array of seat configuration
     * @return max distance from a sitting person
     */
    public int maxDistToClosest(int[] seats) {
        int maxDistance = 0;
        int last = -1;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1) {
                maxDistance = last < 0 ? i : Math.max(maxDistance, (i - last) / 2);
                last = i;
            }
        }
        maxDistance = Math.max(maxDistance, seats.length - last - 1);
        return maxDistance;
    }
}
