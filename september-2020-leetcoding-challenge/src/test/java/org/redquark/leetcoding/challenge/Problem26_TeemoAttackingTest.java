package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem26_TeemoAttackingTest {

    private final Problem26_TeemoAttacking testObject = new Problem26_TeemoAttacking();

    @Test
    void testFindPoisonedDuration() {
        int[] timeSeries = new int[]{1, 4};
        int duration = 2;
        assertEquals(4, testObject.findPoisonedDuration(timeSeries, duration));

        timeSeries = new int[]{1, 2};
        duration = 2;
        assertEquals(3, testObject.findPoisonedDuration(timeSeries, duration));
    }
}