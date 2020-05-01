package org.redquark.leetcode.learn.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem12_SortArrayByParityTest {

    private final Problem12_SortArrayByParity testObject = new Problem12_SortArrayByParity();

    @Test
    void testSortArrayByParity() {
        int[] A = new int[]{3, 1, 2, 4};
        int[] expected = new int[]{2, 4, 3, 1};
        assertArrayEquals(expected, testObject.sortArrayByParity(A));

        A = new int[]{1, 2, 3, 4, 5};
        expected = new int[]{2, 4, 3, 1, 5};
        assertArrayEquals(expected, testObject.sortArrayByParity(A));
    }
}