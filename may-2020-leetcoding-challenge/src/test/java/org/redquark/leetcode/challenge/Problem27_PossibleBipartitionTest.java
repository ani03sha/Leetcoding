package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem27_PossibleBipartitionTest {

    private final Problem27_PossibleBipartition testObject = new Problem27_PossibleBipartition();

    @Test
    void testPossibleBipartition() {
        int N = 4;
        int[][] dislikes = new int[][]{{1, 2}, {1, 3}, {2, 4}};
        assertTrue(testObject.possibleBipartition(N, dislikes));

        N = 3;
        dislikes = new int[][]{{1, 2}, {1, 3}, {2, 3}};
        assertFalse(testObject.possibleBipartition(N, dislikes));

        N = 5;
        dislikes = new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {1, 5}};
        assertFalse(testObject.possibleBipartition(N, dislikes));
    }
}