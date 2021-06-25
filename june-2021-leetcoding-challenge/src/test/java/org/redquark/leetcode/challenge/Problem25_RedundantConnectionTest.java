package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem25_RedundantConnectionTest {

    private final Problem25_RedundantConnection testObject = new Problem25_RedundantConnection();

    @Test
    void testFindRedundantConnection() {
        int[][] edges = new int[][]{
                {1, 2},
                {1, 3},
                {2, 3}
        };
        int[] expected = new int[]{2, 3};
        assertArrayEquals(expected, testObject.findRedundantConnection(edges));

        edges = new int[][]{
                {1, 2},
                {2, 3},
                {3, 4},
                {1, 4},
                {1, 5}
        };
        expected = new int[]{1, 4};
        assertArrayEquals(expected, testObject.findRedundantConnection(edges));
    }
}