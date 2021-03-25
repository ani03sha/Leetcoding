package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem25_PacificAtlanticWaterFlowTest {

    private final Problem25_PacificAtlanticWaterFlow testObject = new Problem25_PacificAtlanticWaterFlow();

    @Test
    void testPacificAtlantic() {
        int[][] matrix = {{1, 2, 2, 3, 5}, {3, 2, 3, 4, 4}, {2, 4, 5, 3, 1}, {6, 7, 1, 4, 5}, {5, 1, 1, 2, 4}};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(0, 4));
        expected.add(Arrays.asList(1, 3));
        expected.add(Arrays.asList(1, 4));
        expected.add(Arrays.asList(2, 2));
        expected.add(Arrays.asList(3, 0));
        expected.add(Arrays.asList(3, 1));
        expected.add(Arrays.asList(4, 0));
        assertEquals(expected, testObject.pacificAtlantic(matrix));
    }
}