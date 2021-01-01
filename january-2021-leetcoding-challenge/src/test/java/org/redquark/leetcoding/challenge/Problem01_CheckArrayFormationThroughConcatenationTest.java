package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem01_CheckArrayFormationThroughConcatenationTest {

    private final Problem01_CheckArrayFormationThroughConcatenation testObject =
            new Problem01_CheckArrayFormationThroughConcatenation();

    @Test
    void testCanFormArray() {
        int[] arr = new int[]{85};
        int[][] pieces = new int[][]{{85}};
        assertTrue(testObject.canFormArray(arr, pieces));

        arr = new int[]{15, 88};
        pieces = new int[][]{{88}, {15}};
        assertTrue(testObject.canFormArray(arr, pieces));

        arr = new int[]{49, 18, 16};
        pieces = new int[][]{{16, 18, 49}};
        assertFalse(testObject.canFormArray(arr, pieces));

        arr = new int[]{91, 4, 64, 78};
        pieces = new int[][]{{78}, {4, 64}, {91}};
        assertTrue(testObject.canFormArray(arr, pieces));

        arr = new int[]{1, 3, 5, 7};
        pieces = new int[][]{{2, 4, 6, 8}};
        assertFalse(testObject.canFormArray(arr, pieces));
    }
}