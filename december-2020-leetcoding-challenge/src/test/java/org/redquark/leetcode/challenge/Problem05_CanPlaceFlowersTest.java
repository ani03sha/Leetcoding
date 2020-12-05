package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem05_CanPlaceFlowersTest {

    private final Problem05_CanPlaceFlowers testObject = new Problem05_CanPlaceFlowers();

    @Test
    void testCanPlaceFlowers() {
        int[] flowerbed = new int[]{1, 0, 0, 0, 1};
        int n = 1;
        assertTrue(testObject.canPlaceFlowers(flowerbed, n));

        flowerbed = new int[]{1, 0, 0, 0, 1};
        n = 2;
        assertFalse(testObject.canPlaceFlowers(flowerbed, n));
    }
}