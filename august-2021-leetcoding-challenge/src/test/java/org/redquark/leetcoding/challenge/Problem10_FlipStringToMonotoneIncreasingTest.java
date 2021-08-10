package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem10_FlipStringToMonotoneIncreasingTest {

    private final Problem10_FlipStringToMonotoneIncreasing testObject = new Problem10_FlipStringToMonotoneIncreasing();

    @Test
    void testMinFlipsMonoIncr() {
        String s = "00110";
        assertEquals(1, testObject.minFlipsMonoIncr(s));

        s = "010110";
        assertEquals(2, testObject.minFlipsMonoIncr(s));

        s = "00011000";
        assertEquals(2, testObject.minFlipsMonoIncr(s));
    }
}