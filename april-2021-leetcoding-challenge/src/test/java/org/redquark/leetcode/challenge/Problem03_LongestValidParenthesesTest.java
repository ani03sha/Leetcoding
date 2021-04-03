package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem03_LongestValidParenthesesTest {

    private final Problem03_LongestValidParentheses testObject = new Problem03_LongestValidParentheses();

    @Test
    void testLongestValidParentheses() {
        String s = "(()";
        assertEquals(2, testObject.longestValidParentheses(s));

        s = ")()())";
        assertEquals(4, testObject.longestValidParentheses(s));

        s = "";
        assertEquals(0, testObject.longestValidParentheses(s));
    }
}