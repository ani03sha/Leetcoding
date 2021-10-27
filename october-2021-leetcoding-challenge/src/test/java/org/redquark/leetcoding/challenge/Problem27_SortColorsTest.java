package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem27_SortColorsTest {

    private final Problem27_SortColors testObject = new Problem27_SortColors();

    @Test
    void testSortColors() {
        int[] nums = new int[]{2, 0, 2, 1, 1, 0};
        int[] expected = new int[]{0, 0, 1, 1, 2, 2};
        assertArrayEquals(expected, testObject.sortColors(nums));

        nums = new int[]{2, 0, 1};
        expected = new int[]{0, 1, 2};
        assertArrayEquals(expected, testObject.sortColors(nums));

        nums = new int[]{0};
        expected = new int[]{0};
        assertArrayEquals(expected, testObject.sortColors(nums));

        nums = new int[]{1};
        expected = new int[]{1};
        assertArrayEquals(expected, testObject.sortColors(nums));
    }
}