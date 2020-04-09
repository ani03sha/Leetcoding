package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Challenge09_BackspaceStringCompareTest {

    private Challenge09_BackspaceStringCompare testObject = new Challenge09_BackspaceStringCompare();

    @Test
    void backspaceCompare() {
        String S = "ab#c";
        String T = "ad#c";
        assertTrue(testObject.backspaceCompare(S, T));

        S = "a#c";
        T = "b";
        assertFalse(testObject.backspaceCompare(S, T));

        S = "a##c";
        T = "#a#c";
        assertTrue(testObject.backspaceCompare(S, T));

        S = "ab##";
        T = "c#d#";
        assertTrue(testObject.backspaceCompare(S, T));

    }
}