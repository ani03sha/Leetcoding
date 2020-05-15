package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem08_CheckIfStraightLineTest {

    private final Problem08_CheckIfStraightLine testObject = new Problem08_CheckIfStraightLine();

    @Test
    void testCheckStraightLine() {
        int[][] coordinates = new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
        assertTrue(testObject.checkStraightLine(coordinates));

        coordinates = new int[][]{{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}};
        assertFalse(testObject.checkStraightLine(coordinates));

        coordinates = new int[][]{{0, 0}, {0, 1}, {0, -1}};
        assertTrue(testObject.checkStraightLine(coordinates));

        coordinates = new int[][]{{1, -8}, {2, -3}, {1, 2}};
        assertFalse(testObject.checkStraightLine(coordinates));

        coordinates = new int[][]{{0, 0}, {0, 5}, {5, 5}, {5, 0}};
        assertFalse(testObject.checkStraightLine(coordinates));

        coordinates = new int[][]{{0, 0}, {0, 5}, {5, 0}, {1337, 0}, {0, 1337}};
        assertFalse(testObject.checkStraightLine(coordinates));
    }
}