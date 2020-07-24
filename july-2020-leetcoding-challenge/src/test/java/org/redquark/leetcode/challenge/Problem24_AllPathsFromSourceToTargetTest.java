package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem24_AllPathsFromSourceToTargetTest {

    private final Problem24_AllPathsFromSourceToTarget testObject = new Problem24_AllPathsFromSourceToTarget();

    @Test
    void testAllPathsSourceTarget() {
        int[][] graph = {{1, 2}, {3}, {3}, {}};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(0, 1, 3));
        expected.add(Arrays.asList(0, 2, 3));
        assertEquals(expected, testObject.allPathsSourceTarget(graph));
    }
}