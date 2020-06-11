package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem11_SortColorsTest {

    private final Problem11_SortColors testObject = new Problem11_SortColors();

    @Test
    void testSortColors() {
        int[] numbers = {2, 0, 1, 0, 1, 2, 1, 0, 2, 0};
        int[] expected = {0, 0, 0, 0, 1, 1, 1, 2, 2, 2};
        assertArrayEquals(expected, testObject.sortColors(numbers));
    }
}