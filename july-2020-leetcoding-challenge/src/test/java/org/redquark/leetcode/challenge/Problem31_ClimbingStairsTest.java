package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem31_ClimbingStairsTest {

    private final Problem31_ClimbingStairs testObject = new Problem31_ClimbingStairs();

    @Test
    void testClimbStairs() {
        assertEquals(2, testObject.climbStairs(2));
        assertEquals(3, testObject.climbStairs(3));
        assertEquals(5, testObject.climbStairs(4));
    }
}