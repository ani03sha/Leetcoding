package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem28_ReachANumberTest {

    private final Problem28_ReachANumber testObject = new Problem28_ReachANumber();

    @Test
    void testReachNumber() {
        assertEquals(2, testObject.reachNumber(3));
        assertEquals(3, testObject.reachNumber(2));
    }
}