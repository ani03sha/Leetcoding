package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem26_ValidStackSequencesTest {

    private final Problem26_ValidStackSequences testObject = new Problem26_ValidStackSequences();

    @Test
    void testValidateStackSequences() {
        int[] pushed = new int[]{1, 2, 3, 4, 5};
        int[] popped = new int[]{4, 5, 3, 2, 1};
        assertTrue(testObject.validateStackSequences(pushed, popped));

        pushed = new int[]{1, 2, 3, 4, 5};
        popped = new int[]{4, 3, 5, 1, 2};
        assertFalse(testObject.validateStackSequences(pushed, popped));
    }
}