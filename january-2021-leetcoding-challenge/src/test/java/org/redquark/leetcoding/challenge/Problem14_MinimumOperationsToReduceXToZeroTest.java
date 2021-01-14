package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem14_MinimumOperationsToReduceXToZeroTest {

    private final Problem14_MinimumOperationsToReduceXToZero testObject =
            new Problem14_MinimumOperationsToReduceXToZero();

    @Test
    void testMinOperations() {
        assertEquals(2, testObject.minOperations(new int[]{1, 1, 4, 2, 3}, 5));
        assertEquals(-1, testObject.minOperations(new int[]{5, 6, 7, 8, 9}, 4));
        assertEquals(5, testObject.minOperations(new int[]{3, 2, 20, 1, 1, 3}, 10));
    }
}