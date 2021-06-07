package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem07_MinCostClimbingStairsTest {

    private final Problem07_MinCostClimbingStairs testObject = new Problem07_MinCostClimbingStairs();

    @Test
    void testMinCostClimbingStairs() {
        int[] cost = new int[]{10, 15, 20};
        assertEquals(15, testObject.minCostClimbingStairs(cost));

        cost = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        assertEquals(6, testObject.minCostClimbingStairs(cost));
    }
}