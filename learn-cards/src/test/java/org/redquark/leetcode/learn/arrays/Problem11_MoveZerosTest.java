package org.redquark.leetcode.learn.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem11_MoveZerosTest {

    private final Problem11_MoveZeros testObject = new Problem11_MoveZeros();

    @Test
    void testMoveZeroes() {
        int[] arr = new int[]{0, 1, 0, 3, 12};
        int[] expected = new int[]{1, 3, 12, 0, 0};
        assertArrayEquals(expected, testObject.moveZeroes(arr));
    }
}