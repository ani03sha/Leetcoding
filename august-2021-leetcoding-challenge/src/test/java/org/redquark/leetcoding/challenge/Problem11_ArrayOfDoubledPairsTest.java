package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem11_ArrayOfDoubledPairsTest {

    private final Problem11_ArrayOfDoubledPairs testObject = new Problem11_ArrayOfDoubledPairs();

    @Test
    void testCanReorderDoubled() {
        int[] nums = new int[]{3, 1, 3, 6};
        assertFalse(testObject.canReorderDoubled(nums));

        nums = new int[]{2, 1, 2, 6};
        assertFalse(testObject.canReorderDoubled(nums));

        nums = new int[]{4, -2, 2, -4};
        assertTrue(testObject.canReorderDoubled(nums));

        nums = new int[]{1, 2, 4, 16, 8, 4};
        assertFalse(testObject.canReorderDoubled(nums));
    }
}