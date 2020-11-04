package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem04_MinimumHeightTreesTest {

    private final Problem04_MinimumHeightTrees testObject = new Problem04_MinimumHeightTrees();

    @Test
    void testFindMinHeightTrees() {
        int n = 4;
        int[][] edges = new int[][]{{1, 0}, {1, 2}, {1, 3}};
        List<Integer> expected = Collections.singletonList(1);
        assertEquals(expected, testObject.findMinHeightTrees(n, edges));

        n = 6;
        edges = new int[][]{{3, 0}, {3, 1}, {3, 2}, {3, 4}, {5, 4}};
        expected = Arrays.asList(3, 4);
        assertEquals(expected, testObject.findMinHeightTrees(n, edges));

        n = 1;
        edges = new int[][]{};
        expected = Collections.singletonList(0);
        assertEquals(expected, testObject.findMinHeightTrees(n, edges));

        n = 2;
        edges = new int[][]{{0, 1}};
        expected = Arrays.asList(0, 1);
        assertEquals(expected, testObject.findMinHeightTrees(n, edges));
    }
}