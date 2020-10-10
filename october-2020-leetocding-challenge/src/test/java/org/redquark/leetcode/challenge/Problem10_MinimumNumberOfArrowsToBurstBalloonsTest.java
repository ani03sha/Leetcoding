package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem10_MinimumNumberOfArrowsToBurstBalloonsTest {

    private final Problem10_MinimumNumberOfArrowsToBurstBalloons testObject =
            new Problem10_MinimumNumberOfArrowsToBurstBalloons();

    @Test
    void testFindMinArrowShots() {
        int[][] points = new int[][]{{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        assertEquals(2, testObject.findMinArrowShots(points));

        points = new int[][]{{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        assertEquals(4, testObject.findMinArrowShots(points));

        points = new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        assertEquals(2, testObject.findMinArrowShots(points));

        points = new int[][]{{1, 2}};
        assertEquals(1, testObject.findMinArrowShots(points));

        points = new int[][]{{2, 3}, {2, 3}};
        assertEquals(1, testObject.findMinArrowShots(points));
    }
}