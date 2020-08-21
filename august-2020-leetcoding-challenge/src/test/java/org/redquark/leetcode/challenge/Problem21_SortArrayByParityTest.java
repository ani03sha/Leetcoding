package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem21_SortArrayByParityTest {

    private final Problem21_SortArrayByParity testObject = new Problem21_SortArrayByParity();

    @Test
    void testSortArrayByParity() {
        int[] A = {3, 1, 2, 4};
        int[] expected = {2, 4, 3, 1};
        assertArrayEquals(expected, testObject.sortArrayByParity(A));
    }
}