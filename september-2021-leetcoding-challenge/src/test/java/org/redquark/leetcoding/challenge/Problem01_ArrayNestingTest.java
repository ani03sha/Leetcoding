package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem01_ArrayNestingTest {

    private final Problem01_ArrayNesting testObject = new Problem01_ArrayNesting();

    @Test
    void testArrayNesting() {
        int[] nums = new int[]{5, 4, 0, 3, 1, 6, 2};
        assertEquals(4, testObject.arrayNesting(nums));

        nums = new int[]{0, 1, 2};
        assertEquals(1, testObject.arrayNesting(nums));
    }
}