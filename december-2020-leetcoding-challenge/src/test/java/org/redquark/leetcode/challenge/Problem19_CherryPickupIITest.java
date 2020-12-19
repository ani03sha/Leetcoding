package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem19_CherryPickupIITest {

    private final Problem19_CherryPickupII testObject = new Problem19_CherryPickupII();

    @Test
    void testCherryPickup() {
        int[][] grid = new int[][]{{3, 1, 1}, {2, 5, 1}, {1, 5, 5}, {2, 1, 1}};
        assertEquals(24, testObject.cherryPickup(grid));

        grid = new int[][]{{1, 0, 0, 0, 0, 0, 1}, {2, 0, 0, 0, 0, 3, 0}, {2, 0, 9, 0, 0, 0, 0}, {0, 3, 0, 5, 4, 0, 0}, {1, 0, 2, 3, 0, 0, 6}};
        assertEquals(28, testObject.cherryPickup(grid));

        grid = new int[][]{{1, 0, 0, 3}, {0, 0, 0, 3}, {0, 0, 3, 3}, {9, 0, 3, 3}};
        assertEquals(22, testObject.cherryPickup(grid));

        grid = new int[][]{{1, 1}, {1, 1}};
        assertEquals(4, testObject.cherryPickup(grid));
    }
}