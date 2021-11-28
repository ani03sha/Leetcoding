package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem28_AllPathsFromSourceToTargetTest {

    private final Problem28_AllPathsFromSourceToTarget testObject = new Problem28_AllPathsFromSourceToTarget();

    @Test
    void testAllPathsSourceTarget() {
        int[][] graph = new int[][]{
                {4, 3, 1},
                {3, 2, 4},
                {3},
                {4},
                {}
        };
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(0, 4));
        expected.add(Arrays.asList(0, 3, 4));
        expected.add(Arrays.asList(0, 1, 3, 4));
        expected.add(Arrays.asList(0, 1, 2, 3, 4));
        expected.add(Arrays.asList(0, 1, 4));
        assertEquals(expected, testObject.allPathsSourceTarget(graph));

        graph = new int[][]{
                {1, 2},
                {3},
                {3},
                {}
        };
        expected = new ArrayList<>();
        expected.add(Arrays.asList(0, 1, 3));
        expected.add(Arrays.asList(0, 2, 3));
        assertEquals(expected, testObject.allPathsSourceTarget(graph));
    }
}