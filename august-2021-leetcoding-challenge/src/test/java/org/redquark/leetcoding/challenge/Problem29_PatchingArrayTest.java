package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem29_PatchingArrayTest {

    private final Problem29_PatchingArray testObject = new Problem29_PatchingArray();

    @Test
    void testMinPatches() {
        int[] nums = new int[]{1, 3};
        int n = 6;
        assertEquals(1, testObject.minPatches(nums, n));

        nums = new int[]{1, 5, 10};
        n = 20;
        assertEquals(2, testObject.minPatches(nums, n));

        nums = new int[]{1, 2, 2};
        n = 5;
        assertEquals(0, testObject.minPatches(nums, n));
    }
}