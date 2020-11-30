package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem30_TheSkylineProblemTest {

    private final Problem30_TheSkylineProblem testObject = new Problem30_TheSkylineProblem();

    @Test
    void testGetSkyline() {
        int[][] buildings = new int[][]{
                {2, 9, 10},
                {3, 7, 15},
                {5, 12, 12},
                {15, 20, 10},
                {19, 24, 8}
        };
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(2, 10));
        expected.add(Arrays.asList(3, 15));
        expected.add(Arrays.asList(7, 12));
        expected.add(Arrays.asList(12, 0));
        expected.add(Arrays.asList(15, 10));
        expected.add(Arrays.asList(20, 8));
        expected.add(Arrays.asList(24, 0));
        assertEquals(expected, testObject.getSkyline(buildings));
    }
}