package org.redquark.leetcode.learn.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem04_DuplicateZerosTest {

    private final Problem04_DuplicateZeros testObject = new Problem04_DuplicateZeros();

    @Test
    void testDuplicateZeros() {
        int[] arr = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
        int[] expected = new int[]{1, 0, 0, 2, 3, 0, 0, 4};
        assertArrayEquals(expected, testObject.duplicateZeros(arr));

        arr = new int[]{1, 2, 3};
        expected = new int[]{1, 2, 3};
        assertArrayEquals(expected, testObject.duplicateZeros(arr));
    }
}