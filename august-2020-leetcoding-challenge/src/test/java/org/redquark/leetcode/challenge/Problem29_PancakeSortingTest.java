package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem29_PancakeSortingTest {

    private final Problem29_PancakeSorting testObject = new Problem29_PancakeSorting();

    @Test
    void testPancakeSort() {
        int[] A = new int[]{3, 2, 4, 1};
        assertTrue(10 * A.length > testObject.pancakeSort(A).size());

        A = new int[]{1, 2, 3};
        assertTrue(10 * A.length > testObject.pancakeSort(A).size());
    }
}