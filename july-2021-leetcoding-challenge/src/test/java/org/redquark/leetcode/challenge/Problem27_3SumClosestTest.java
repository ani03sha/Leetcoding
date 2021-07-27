package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem27_3SumClosestTest {

    private final Problem27_3SumClosest testObject = new Problem27_3SumClosest();

    @Test
    void testThreeSumClosest() {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        assertEquals(2, testObject.threeSumClosest(nums, target));
    }
}