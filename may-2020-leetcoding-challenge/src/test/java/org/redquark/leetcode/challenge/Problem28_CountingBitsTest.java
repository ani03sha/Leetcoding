package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem28_CountingBitsTest {

    private final Problem28_CountingBits testObject = new Problem28_CountingBits();

    @Test
    void testCountBits() {
        int[] expected = new int[]{0, 1, 1};
        assertArrayEquals(expected, testObject.countBits(2));

        expected = new int[]{0, 1, 1, 2, 1, 2};
        assertArrayEquals(expected, testObject.countBits(5));
    }
}