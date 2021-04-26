package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem26_FurthestBuildingYouCanReachTest {

    private final Problem26_FurthestBuildingYouCanReach testObject = new Problem26_FurthestBuildingYouCanReach();

    @Test
    void testFurthestBuilding() {
        int[] heights = new int[]{4, 2, 7, 6, 9, 14, 12};
        int bricks = 5;
        int ladders = 1;
        assertEquals(4, testObject.furthestBuilding(heights, bricks, ladders));

        heights = new int[]{4, 12, 2, 7, 3, 18, 20, 3, 19};
        bricks = 10;
        ladders = 2;
        assertEquals(7, testObject.furthestBuilding(heights, bricks, ladders));

        heights = new int[]{14, 3, 19, 3};
        bricks = 17;
        ladders = 0;
        assertEquals(3, testObject.furthestBuilding(heights, bricks, ladders));
    }
}