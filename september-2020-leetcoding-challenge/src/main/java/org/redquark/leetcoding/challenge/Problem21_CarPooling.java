package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * You are driving a vehicle that has capacity empty seats initially available for passengers.
 * The vehicle only drives east (ie. it cannot turn around and drive west.)
 * <p>
 * Given a list of trips, trip[i] = [num_passengers, start_location, end_location] contains information
 * about the i-th trip: the number of passengers that must be picked up, and the locations to pick them
 * up and drop them off.  The locations are given as the number of kilometers due east from your vehicle's
 * initial location.
 * <p>
 * Return true if and only if it is possible to pick up and drop off all passengers for all the given trips.
 * <p>
 * Constraints:
 * <p>
 * trips.length <= 1000
 * trips[i].length == 3
 * 1 <= trips[i][0] <= 100
 * 0 <= trips[i][1] < trips[i][2] <= 1000
 * 1 <= capacity <= 100000
 */
public class Problem21_CarPooling {

    /**
     * @param trips    - list of trips
     * @param capacity - capacity of the vehicle
     * @return true, if all the passengers can be picket up and dropped off, false otherwise
     */
    public boolean carPooling(int[][] trips, int capacity) {
        int[] stops = new int[1001];
        // Loop for all the trips
        for (int[] t : trips) {
            stops[t[1]] += t[0];
            stops[t[2]] -= t[0];
        }
        for (int i = 0; capacity >= 0 && i < 1001; i++) {
            capacity -= stops[i];
        }
        return capacity >= 0;
    }
}
