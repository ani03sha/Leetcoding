package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem19_MinimumMovesToEqualArrayElementsIITest {

    private final Problem19_MinimumMovesToEqualArrayElementsII testObject =
            new Problem19_MinimumMovesToEqualArrayElementsII();

    @Test
    void testMinMoves2() {
        int[] nums = new int[]{1, 2, 3};
        assertEquals(2, testObject.minMoves2(nums));

        nums = new int[]{1, 10, 2, 9};
        assertEquals(16, testObject.minMoves2(nums));
    }
}