package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem14_HouseRobberTest {

    private final Problem14_HouseRobber testObject = new Problem14_HouseRobber();

    @Test
    void testRob() {
        int[] nums = new int[]{2, 3, 2};
        assertEquals(3, testObject.rob(nums));

        nums = new int[]{1, 2, 3, 1};
        assertEquals(4, testObject.rob(nums));

        nums = new int[]{0};
        assertEquals(0, testObject.rob(nums));
    }
}