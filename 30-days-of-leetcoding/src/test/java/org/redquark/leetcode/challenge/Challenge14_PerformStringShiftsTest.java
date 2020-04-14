package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Challenge14_PerformStringShiftsTest {

    private Challenge14_PerformStringShifts testObject = new Challenge14_PerformStringShifts();

    @Test
    void stringShift() {
        String s = "abc";
        int[][] shift = new int[][]{{0, 1}, {1, 2}};
        assertEquals("cab", testObject.stringShift(s, shift));

        s = "abcdefg";
        shift = new int[][]{{1, 1}, {1, 1}, {0, 2}, {1, 3}};
        assertEquals("efgabcd", testObject.stringShift(s, shift));

        s = "yisxjwry";
        shift = new int[][]{{1, 8}, {1, 4}, {1, 3}, {1, 6}, {0, 6}, {1, 4}, {0, 2}, {0, 1}};
        assertEquals("yisxjwry", testObject.stringShift(s, shift));
    }
}