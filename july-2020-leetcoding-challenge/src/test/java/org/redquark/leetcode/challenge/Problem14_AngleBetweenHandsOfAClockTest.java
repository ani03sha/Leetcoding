package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem14_AngleBetweenHandsOfAClockTest {

    private final Problem14_AngleBetweenHandsOfAClock testObject = new Problem14_AngleBetweenHandsOfAClock();

    @Test
    void testAngleClock() {
        int hour = 12;
        int minute = 30;
        assertEquals(165, testObject.angleClock(hour, minute));

        hour = 3;
        minute = 30;
        assertEquals(75, testObject.angleClock(hour, minute));

        hour = 3;
        minute = 15;
        assertEquals(7.5, testObject.angleClock(hour, minute));

        hour = 4;
        minute = 50;
        assertEquals(155, testObject.angleClock(hour, minute));

        hour = 12;
        minute = 0;
        assertEquals(0, testObject.angleClock(hour, minute));
    }
}