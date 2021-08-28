package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem28_MaximumProfitInJobSchedulingTest {

    private final Problem28_MaximumProfitInJobScheduling testObject = new Problem28_MaximumProfitInJobScheduling();

    @Test
    void testJobScheduling() {
        int[] startTime = new int[]{1, 2, 3, 3};
        int[] endTime = new int[]{3, 4, 5, 6};
        int[] profit = new int[]{50, 10, 40, 70};
        assertEquals(120, testObject.jobScheduling(startTime, endTime, profit));

        startTime = new int[]{1, 2, 3, 4, 6};
        endTime = new int[]{3, 5, 10, 6, 9};
        profit = new int[]{20, 20, 100, 70, 60};
        assertEquals(150, testObject.jobScheduling(startTime, endTime, profit));

        startTime = new int[]{1, 1, 1};
        endTime = new int[]{2, 3, 4};
        profit = new int[]{5, 6, 4};
        assertEquals(6, testObject.jobScheduling(startTime, endTime, profit));
    }
}