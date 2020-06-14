package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem14_CheapestFlightTest {

    private final Problem14_CheapestFlight testObject = new Problem14_CheapestFlight();

    @Test
    void testFindCheapestPrice() {
        int n = 3;
        int[][] flights = new int[][]{{0, 1, 100}, {1, 2, 100}, {0, 2, 500}};
        int src = 0;
        int dst = 2;
        int K = 1;
        assertEquals(200, testObject.findCheapestPrice(n, flights, src, dst, K));

        K = 0;
        assertEquals(500, testObject.findCheapestPrice(n, flights, src, dst, K));
    }
}