package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem01_HouseRobberTest {

    private final Problem01_HouseRobber testObject = new Problem01_HouseRobber();

    @Test
    void testRob() {
        int[] nums = new int[]{1, 2, 3, 1};
        assertEquals(4, testObject.rob(nums));

        nums = new int[]{2, 7, 9, 3, 1};
        assertEquals(12, testObject.rob(nums));
    }
}