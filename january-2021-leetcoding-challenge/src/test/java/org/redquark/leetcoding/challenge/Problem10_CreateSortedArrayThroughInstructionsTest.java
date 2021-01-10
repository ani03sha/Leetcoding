package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem10_CreateSortedArrayThroughInstructionsTest {

    private final Problem10_CreateSortedArrayThroughInstructions testObject =
            new Problem10_CreateSortedArrayThroughInstructions();

    @Test
    void testCreateSortedArray() {
        int[] instructions = new int[]{1, 5, 6, 2};
        assertEquals(1, testObject.createSortedArray(instructions));

        instructions = new int[]{1, 2, 3, 6, 5, 4};
        assertEquals(3, testObject.createSortedArray(instructions));

        instructions = new int[]{1, 3, 3, 3, 2, 4, 2, 1, 2};
        assertEquals(4, testObject.createSortedArray(instructions));
    }
}