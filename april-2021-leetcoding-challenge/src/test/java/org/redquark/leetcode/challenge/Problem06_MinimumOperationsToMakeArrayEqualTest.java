package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem06_MinimumOperationsToMakeArrayEqualTest {

    private final Problem06_MinimumOperationsToMakeArrayEqual testObject =
            new Problem06_MinimumOperationsToMakeArrayEqual();

    @Test
    void testMinOperations() {
        assertEquals(2, testObject.minOperations(3));
        assertEquals(9, testObject.minOperations(6));
    }
}