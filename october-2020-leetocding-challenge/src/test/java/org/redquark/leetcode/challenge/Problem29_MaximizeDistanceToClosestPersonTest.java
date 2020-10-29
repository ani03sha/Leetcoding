package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem29_MaximizeDistanceToClosestPersonTest {

    private final Problem29_MaximizeDistanceToClosestPerson testObject =
            new Problem29_MaximizeDistanceToClosestPerson();

    @Test
    void testMaxDistToClosest() {
        int[] seats = new int[]{1, 0, 0, 0, 1, 0, 1};
        assertEquals(2, testObject.maxDistToClosest(seats));

        seats = new int[]{1, 0, 0, 0};
        assertEquals(3, testObject.maxDistToClosest(seats));

        seats = new int[]{0, 1};
        assertEquals(1, testObject.maxDistToClosest(seats));
    }
}