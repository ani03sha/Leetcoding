package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem25_CheckIfAll1sAreAtLeastLengthKPlacesAwayTest {

    private final Problem25_CheckIfAll1sAreAtLeastLengthKPlacesAway testObject =
            new Problem25_CheckIfAll1sAreAtLeastLengthKPlacesAway();

    @Test
    void testKLengthApart() {
        int[] nums = new int[]{1, 0, 0, 0, 1, 0, 0, 1};
        int k = 2;
        assertTrue(testObject.kLengthApart(nums, k));

        nums = new int[]{1, 0, 0, 1, 0, 1};
        k = 2;
        assertFalse(testObject.kLengthApart(nums, k));

        nums = new int[]{1, 1, 1, 1, 1};
        k = 0;
        assertTrue(testObject.kLengthApart(nums, k));

        nums = new int[]{0, 1, 0, 1};
        k = 1;
        assertTrue(testObject.kLengthApart(nums, k));
    }
}