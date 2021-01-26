package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem26_PathWithMinimumEffortTest {

    private final Problem26_PathWithMinimumEffort testObject =
            new Problem26_PathWithMinimumEffort();

    @Test
    void testMinimumEffortPath() {
        int[][] heights = new int[][]{{1, 2, 2}, {3, 8, 2}, {5, 3, 5}};
        assertEquals(2, testObject.minimumEffortPath(heights));

        heights = new int[][]{{1, 2, 3}, {3, 8, 4}, {5, 3, 5}};
        assertEquals(1, testObject.minimumEffortPath(heights));

        heights = new int[][]{{1, 2, 1, 1, 1}, {1, 2, 1, 2, 1}, {1, 2, 1, 2, 1}, {1, 2, 1, 2, 1}, {1, 1, 1, 2, 1}};
        assertEquals(0, testObject.minimumEffortPath(heights));
    }
}