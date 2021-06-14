package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem14_MaximumUnitsOnATruckTest {

    private final Problem14_MaximumUnitsOnATruck testObject = new Problem14_MaximumUnitsOnATruck();

    @Test
    void testMaximumUnits() {
        int[][] boxTypes = new int[][]{
                {1, 3},
                {2, 2},
                {3, 1}
        };
        int truckSize = 4;
        assertEquals(8, testObject.maximumUnits(boxTypes, truckSize));

        boxTypes = new int[][]{
                {5, 10},
                {2, 5},
                {4, 7},
                {3, 9}
        };
        truckSize = 10;
        assertEquals(91, testObject.maximumUnits(boxTypes, truckSize));
    }
}