package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem13_BoatsToSavePeopleTest {

    private final Problem13_BoatsToSavePeople testObject = new Problem13_BoatsToSavePeople();

    @Test
    void testNumRescueBoats() {
        int[] people = new int[]{1, 2};
        int limit = 3;
        assertEquals(1, testObject.numRescueBoats(people, limit));

        people = new int[]{3, 2, 2, 1};
        limit = 3;
        assertEquals(3, testObject.numRescueBoats(people, limit));

        people = new int[]{3, 5, 3, 4};
        limit = 5;
        assertEquals(4, testObject.numRescueBoats(people, limit));
    }
}