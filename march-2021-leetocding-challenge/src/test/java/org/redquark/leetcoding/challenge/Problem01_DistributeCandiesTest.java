package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem01_DistributeCandiesTest {

    private final Problem01_DistributeCandies testObject = new Problem01_DistributeCandies();

    @Test
    void testDistributeCandies() {
        int[] candyType = new int[]{1, 1, 2, 2, 3, 3};
        assertEquals(3, testObject.distributeCandies(candyType));

        candyType = new int[]{1, 1, 2, 3};
        assertEquals(2, testObject.distributeCandies(candyType));

        candyType = new int[]{6, 6, 6, 6};
        assertEquals(1, testObject.distributeCandies(candyType));
    }
}