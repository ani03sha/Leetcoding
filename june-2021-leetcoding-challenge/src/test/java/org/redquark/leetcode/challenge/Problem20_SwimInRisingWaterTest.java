package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem20_SwimInRisingWaterTest {

    private final Problem20_SwimInRisingWater testObject = new Problem20_SwimInRisingWater();

    @Test
    void testSwimInWater() {
        int[][] grid = new int[][]{
                {0, 2},
                {1, 3}
        };
        assertEquals(3, testObject.swimInWater(grid));

        grid = new int[][]{
                {0, 1, 2, 3, 4},
                {24, 23, 22, 21, 5},
                {12, 13, 14, 15, 16},
                {11, 17, 18, 19, 20},
                {10, 9, 8, 7, 6}
        };
        assertEquals(16, testObject.swimInWater(grid));
    }
}