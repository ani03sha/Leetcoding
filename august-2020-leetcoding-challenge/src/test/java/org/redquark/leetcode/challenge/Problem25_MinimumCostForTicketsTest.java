package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem25_MinimumCostForTicketsTest {

    private final Problem25_MinimumCostForTickets testObject = new Problem25_MinimumCostForTickets();

    @Test
    void testMinCostTickets() {
        int[] days = new int[]{1, 4, 6, 7, 8, 20};
        int[] costs = new int[]{2, 7, 15};
        assertEquals(11, testObject.minCostTickets(days, costs));

        days = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 31};
        assertEquals(17, testObject.minCostTickets(days, costs));
    }
}