package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem05_ClimbingStairsTest {

    private final Problem05_ClimbingStairs testObject = new Problem05_ClimbingStairs();

    @Test
    void testClimbStairs() {
        assertEquals(2, testObject.climbStairs(2));
        assertEquals(3, testObject.climbStairs(3));
    }
}