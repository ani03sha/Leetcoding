package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem21_CarPoolingTest {

    private final Problem21_CarPooling testObject = new Problem21_CarPooling();

    @Test
    void testCarPooling() {
        int[][] trips = new int[][]{{2, 1, 5}, {3, 3, 7}};
        int capacity = 4;
        assertFalse(testObject.carPooling(trips, capacity));

        capacity = 5;
        assertTrue(testObject.carPooling(trips, capacity));

        trips = new int[][]{{2, 1, 5}, {3, 5, 7}};
        capacity = 3;
        assertTrue(testObject.carPooling(trips, capacity));

        trips = new int[][]{{3, 2, 7}, {3, 7, 9}, {8, 3, 9}};
        capacity = 11;
        assertTrue(testObject.carPooling(trips, capacity));
    }
}