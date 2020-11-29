package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem29_JumpGameIIITest {

    private final Problem29_JumpGameIII testObject = new Problem29_JumpGameIII();

    @Test
    void testCanReach() {
        int[] arr = new int[]{4, 2, 3, 0, 3, 1, 2};
        int start = 5;
        assertTrue(testObject.canReach(arr, start));

        arr = new int[]{4, 2, 3, 0, 3, 1, 2};
        start = 0;
        assertTrue(testObject.canReach(arr, start));

        arr = new int[]{3, 0, 2, 1, 2};
        start = 2;
        assertFalse(testObject.canReach(arr, start));
    }
}