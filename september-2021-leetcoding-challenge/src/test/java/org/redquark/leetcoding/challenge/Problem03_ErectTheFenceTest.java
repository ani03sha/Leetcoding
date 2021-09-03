package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Problem03_ErectTheFenceTest {

    private final Problem03_ErectTheFence testObject = new Problem03_ErectTheFence();

    @Test
    public void testOuterTrees() {
        int[][] points = new int[][]{
                {1, 1},
                {2, 2},
                {2, 0},
                {2, 4},
                {3, 3},
                {4, 2}
        };
        int[][] expected = new int[][]{
                {2, 0},
                {4, 2},
                {2, 4},
                {1, 1},
                {3, 3}
        };
        assertArrayEquals(expected, testObject.outerTrees(points));

        points = new int[][]{
                {1, 2},
                {2, 2},
                {4, 2}
        };
        expected = new int[][]{
                {1, 2},
                {2, 2},
                {4, 2}
        };
        assertArrayEquals(expected, testObject.outerTrees(points));
    }
}