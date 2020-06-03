package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem03_TwoCitySchedulingTest {

    private final Problem03_TwoCityScheduling testObject = new Problem03_TwoCityScheduling();

    @Test
    void testTwoCitySchedulingCost() {
        int[][] costs = new int[][]{{10, 20}, {30, 200}, {400, 50}, {30, 20}};
        assertEquals(110, testObject.twoCitySchedulingCost(costs));

        costs = new int[][]{{12, 8}, {31, 65}, {43, 21}, {17, 12}};
        assertEquals(76, testObject.twoCitySchedulingCost(costs));
    }
}