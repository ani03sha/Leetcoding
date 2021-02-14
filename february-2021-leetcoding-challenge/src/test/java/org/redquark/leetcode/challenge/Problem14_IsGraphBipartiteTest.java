package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem14_IsGraphBipartiteTest {

    private final Problem14_IsGraphBipartite testObject = new Problem14_IsGraphBipartite();

    @Test
    void testIsBipartite() {
        int[][] graph = new int[][]{{1, 3}, {0, 2}, {1, 3}, {0, 2}};
        assertTrue(testObject.isBipartite(graph));

        graph = new int[][]{{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}};
        assertFalse(testObject.isBipartite(graph));

    }
}