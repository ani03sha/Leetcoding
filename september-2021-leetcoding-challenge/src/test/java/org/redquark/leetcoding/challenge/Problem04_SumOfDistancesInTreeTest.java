package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem04_SumOfDistancesInTreeTest {

    private final Problem04_SumOfDistancesInTree testObject = new Problem04_SumOfDistancesInTree();


    @Test
    void testSumOfDistancesInTree() {
        int n = 6;
        int[][] edges = new int[][]{
                {0, 1},
                {0, 2},
                {2, 3},
                {2, 4},
                {2, 5}
        };
        int[] expected = new int[]{8, 12, 6, 10, 10, 10};
        assertArrayEquals(expected, testObject.sumOfDistancesInTree(n, edges));

        n = 1;
        edges = new int[][]{};
        expected = new int[]{0};
        assertArrayEquals(expected, testObject.sumOfDistancesInTree(n, edges));

        n = 2;
        edges = new int[][]{
                {0, 1}
        };
        expected = new int[]{1, 1};
        assertArrayEquals(expected, testObject.sumOfDistancesInTree(n, edges));
    }
}