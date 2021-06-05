package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem05_MaximumPerformanceOfATeamTest {

    private final Problem05_MaximumPerformanceOfATeam testObject = new Problem05_MaximumPerformanceOfATeam();

    @Test
    void testMaxPerformance() {
        int n = 6;
        int[] speed = new int[]{2, 10, 3, 1, 5, 8};
        int[] efficiency = new int[]{5, 4, 3, 9, 7, 2};
        int k = 2;
        assertEquals(60, testObject.maxPerformance(n, speed, efficiency, k));

        n = 6;
        speed = new int[]{2, 10, 3, 1, 5, 8};
        efficiency = new int[]{5, 4, 3, 9, 7, 2};
        k = 3;
        assertEquals(68, testObject.maxPerformance(n, speed, efficiency, k));

        n = 6;
        speed = new int[]{2, 10, 3, 1, 5, 8};
        efficiency = new int[]{5, 4, 3, 9, 7, 2};
        k = 4;
        assertEquals(72, testObject.maxPerformance(n, speed, efficiency, k));
    }
}