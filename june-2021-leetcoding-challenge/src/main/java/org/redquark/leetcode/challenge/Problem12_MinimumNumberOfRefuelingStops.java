package org.redquark.leetcode.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * A car travels from a starting position to a destination which is target miles east of the starting position.
 * <p>
 * Along the way, there are gas stations. Each station[i] represents a gas station that is station[i][0] miles
 * east of the starting position, and has station[i][1] liters of gas.
 * <p>
 * The car starts with an infinite tank of gas, which initially has startFuel liters of fuel in it.
 * It uses 1 liter of gas per 1 mile that it drives.
 * <p>
 * When the car reaches a gas station, it may stop and refuel, transferring all the gas from the station into the car.
 * <p>
 * What is the least number of refueling stops the car must make in order to reach its destination?
 * If it cannot reach the destination, return -1.
 * <p>
 * Note that if the car reaches a gas station with 0 fuel left, the car can still refuel there
 * If the car reaches the destination with 0 fuel left, it is still considered to have arrived.
 * <p>
 * Note:
 * <p>
 * 1 <= target, startFuel, stations[i][1] <= 10^9
 * 0 <= stations.length <= 500
 * 0 < stations[0][0] < stations[1][0] < ... < stations[stations.length-1][0] < target
 */
public class Problem12_MinimumNumberOfRefuelingStops {

    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        // Total fuel stations
        int n = stations.length;
        // Lookup table to store the farthest distance
        // that can be travelled after refuleling i.e.,
        // dp[i] => farthest distance that can be travelled
        // after refueling i times
        long[] lookup = new long[n + 1];
        // Base initialization
        lookup[0] = startFuel;
        // Traverse for all stations
        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                // If we are able to reach to the station
                if (lookup[j] >= stations[i][0]) {
                    lookup[j + 1] = Math.max(lookup[j + 1], lookup[j] + stations[i][1]);
                }
            }
        }
        for (int i = 0; i <= n; i++) {
            if (lookup[i] >= target) {
                return i;
            }
        }
        return -1;
    }
}
