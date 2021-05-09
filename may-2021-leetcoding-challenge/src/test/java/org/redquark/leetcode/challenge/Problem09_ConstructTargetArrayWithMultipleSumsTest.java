package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem09_ConstructTargetArrayWithMultipleSumsTest {

    private final Problem09_ConstructTargetArrayWithMultipleSums testObject =
            new Problem09_ConstructTargetArrayWithMultipleSums();

    @Test
    void testIsPossible() {
        int[] target = new int[]{9, 3, 5};
        assertTrue(testObject.isPossible(target));

        target = new int[]{1, 1, 1, 2};
        assertFalse(testObject.isPossible(target));

        target = new int[]{8, 5};
        assertTrue(testObject.isPossible(target));
    }
}