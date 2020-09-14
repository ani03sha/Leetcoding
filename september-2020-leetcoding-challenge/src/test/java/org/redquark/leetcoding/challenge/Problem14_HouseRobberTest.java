package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem14_HouseRobberTest {

    private final Problem14_HouseRobber testObject = new Problem14_HouseRobber();

    @Test
    void testRob() {
        int[] numbers = new int[]{1, 2, 3, 1};
        assertEquals(4, testObject.rob(numbers));

        numbers = new int[]{2, 7, 9, 3, 1};
        assertEquals(12, testObject.rob(numbers));
    }
}