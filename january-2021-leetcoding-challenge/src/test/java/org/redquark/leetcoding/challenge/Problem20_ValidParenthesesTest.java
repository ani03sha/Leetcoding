package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem20_ValidParenthesesTest {

    private final Problem20_ValidParentheses testObject = new Problem20_ValidParentheses();

    @Test
    void testIsValid() {
        assertTrue(testObject.isValid("()"));
        assertTrue(testObject.isValid("()[]{}"));
        assertFalse(testObject.isValid("(]"));
        assertFalse(testObject.isValid("([)]"));
        assertTrue(testObject.isValid("{[]}"));
    }
}