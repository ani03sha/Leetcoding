package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem01_NumberOfRecentCallsTest {

    private final Problem01_NumberOfRecentCalls testObject = new Problem01_NumberOfRecentCalls();

    @Test
    void testPing() {
        assertEquals(1, testObject.ping(1));
        assertEquals(2, testObject.ping(100));
        assertEquals(3, testObject.ping(3001));
        assertEquals(3, testObject.ping(3002));
    }
}