package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem16_MinimumHeightTreesTest {

    private final Problem16_MinimumHeightTrees testObject = new Problem16_MinimumHeightTrees();

    @Test
    void testFindMinHeightTrees() {
        int n = 4;
        int[][] edges = new int[][]{
                {1, 0},
                {1, 2},
                {1, 3}
        };
        List<Integer> expected = Collections.singletonList(1);
        assertEquals(expected, testObject.findMinHeightTrees(n, edges));
    }
}