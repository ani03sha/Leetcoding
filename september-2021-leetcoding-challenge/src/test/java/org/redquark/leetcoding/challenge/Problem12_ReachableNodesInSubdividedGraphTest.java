package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem12_ReachableNodesInSubdividedGraphTest {

    private final Problem12_ReachableNodesInSubdividedGraph testObject =
            new Problem12_ReachableNodesInSubdividedGraph();

    @Test
    void testReachableNodes() {
        int[][] edges = new int[][]{
                {0, 1, 10},
                {0, 2, 1},
                {1, 2, 2}
        };
        int maxMoves = 6;
        int n = 3;
        assertEquals(13, testObject.reachableNodes(edges, maxMoves, n));

        edges = new int[][]{
                {0, 1, 4},
                {1, 2, 6},
                {0, 2, 8},
                {1, 3, 1}
        };
        maxMoves = 10;
        n = 4;
        assertEquals(23, testObject.reachableNodes(edges, maxMoves, n));

        edges = new int[][]{
                {1, 2, 4},
                {1, 4, 5},
                {1, 3, 1},
                {2, 3, 4},
                {3, 4, 5}
        };
        maxMoves = 17;
        n = 5;
        assertEquals(1, testObject.reachableNodes(edges, maxMoves, n));
    }
}