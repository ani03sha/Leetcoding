package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem08_ShiftingLettersTest {

    private final Problem08_ShiftingLetters testObject = new Problem08_ShiftingLetters();

    @Test
    void testShiftingLetters() {
        String s = "abc";
        int[] shifts = new int[]{3, 5, 9};
        assertEquals("rpl", testObject.shiftingLetters(s, shifts));

        s = "aaa";
        shifts = new int[]{1, 2, 3};
        assertEquals("gfd", testObject.shiftingLetters(s, shifts));
    }
}