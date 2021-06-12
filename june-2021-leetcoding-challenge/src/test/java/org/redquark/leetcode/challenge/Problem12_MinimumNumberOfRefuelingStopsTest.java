package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem12_MinimumNumberOfRefuelingStopsTest {

    private final Problem12_MinimumNumberOfRefuelingStops testObject = new Problem12_MinimumNumberOfRefuelingStops();

    @Test
    void testMinRefuelStops() {
        int target = 100;
        int startFuel = 1;
        int[][] stations = new int[][]{{10, 100}};
        assertEquals(-1, testObject.minRefuelStops(target, startFuel, stations));

        target = 100;
        startFuel = 10;
        stations = new int[][]{
                {10, 60},
                {20, 30},
                {30, 30},
                {60, 40}
        };
        assertEquals(2, testObject.minRefuelStops(target, startFuel, stations));
    }
}