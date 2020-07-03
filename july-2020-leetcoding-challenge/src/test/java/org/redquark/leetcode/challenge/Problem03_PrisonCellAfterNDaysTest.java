package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem03_PrisonCellAfterNDaysTest {

    private final Problem03_PrisonCellAfterNDays testObject = new Problem03_PrisonCellAfterNDays();

    @Test
    void testPrisonAfterNDays() {
        int[] cells = new int[]{0, 1, 0, 1, 1, 0, 0, 1};
        int[] expected = new int[]{0, 1, 1, 0, 0, 0, 0, 0};
        assertArrayEquals(expected, testObject.prisonAfterNDays(cells, 1));
        expected = new int[]{0, 0, 0, 0, 0, 1, 0, 0};
        assertArrayEquals(expected, testObject.prisonAfterNDays(cells, 4));
        expected = new int[]{0, 0, 1, 1, 0, 0, 0, 0};
        assertArrayEquals(expected, testObject.prisonAfterNDays(cells, 7));
    }
}