package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Challenge16_ValidParenthesisStringTest {

    private Challenge16_ValidParenthesisString testObject = new Challenge16_ValidParenthesisString();

    @Test
    void checkValidString() {
        String s = "()";
        assertTrue(testObject.checkValidString(s));

        s = "((()))";
        assertTrue(testObject.checkValidString(s));

        s = "()(";
        assertFalse(testObject.checkValidString(s));

        s = "()()";
        assertTrue(testObject.checkValidString(s));

        s = "))(";
        assertFalse(testObject.checkValidString(s));

        s = "(*))";
        assertTrue(testObject.checkValidString(s));

        s = "(*)";
        assertTrue(testObject.checkValidString(s));

        s = "*";
        assertTrue(testObject.checkValidString(s));

        s = "";
        assertTrue(testObject.checkValidString(s));
    }
}