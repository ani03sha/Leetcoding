package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem19_MinimumRemoveToMakeValidParenthesesTest {

    private final Problem19_MinimumRemoveToMakeValidParentheses testObject =
            new Problem19_MinimumRemoveToMakeValidParentheses();

    @Test
    void testMinRemoveToMakeValid() {
        String s = "lee(t(c)o)de)";
        assertEquals("lee(t(c)o)de", testObject.minRemoveToMakeValid(s));

        s = "a)b(c)d";
        assertEquals("ab(c)d", testObject.minRemoveToMakeValid(s));

        s = "))((";
        assertEquals("", testObject.minRemoveToMakeValid(s));

        s = "(a(b(c)d)";
        assertEquals("a(b(c)d)", testObject.minRemoveToMakeValid(s));
    }
}