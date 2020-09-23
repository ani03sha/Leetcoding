package org.redquark.leetcoding.challenge;

/**
 * @author Anirudh Sharma
 * <p>
 * There are N gas stations along a circular route, where the amount of gas at station i is gas[i].
 * <p>
 * You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from station i to
 * its next station (i+1). You begin the journey with an empty tank at one of the gas stations.
 * <p>
 * Return the starting gas station's index if you can travel around the circuit once in the clockwise
 * direction, otherwise return -1.
 * <p>
 * Note:
 * <p>
 * If there exists a solution, it is guaranteed to be unique.
 * Both input arrays are non-empty and have the same length.
 * Each element in the input arrays is a non-negative integer.
 */
public class Problem23_GasStation {

    /**
     * @param gas  - amount of gas at each station
     * @param cost - cost of gas at each station
     * @return index of starting gas station
     */
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int currentRemaining = 0;
        int totalRemaining = 0;
        // Start index
        int start = 0;
        // Loop for all the elements
        for (int i = 0; i < gas.length; i++) {
            int remaining = gas[i] - cost[i];
            if (currentRemaining < 0) {
                start = i;
                currentRemaining = remaining;
            } else {
                currentRemaining += remaining;
            }
            totalRemaining += remaining;
        }
        return totalRemaining < 0 ? -1 : start;
    }
}
