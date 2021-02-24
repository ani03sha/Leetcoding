package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem24_ScoreOfParenthesesTest {

    private final Problem24_ScoreOfParentheses testObject = new Problem24_ScoreOfParentheses();

    @Test
    void testScoreOfParentheses() {
        assertEquals(1, testObject.scoreOfParentheses("()"));
        assertEquals(2, testObject.scoreOfParentheses("(())"));
        assertEquals(2, testObject.scoreOfParentheses("()()"));
        assertEquals(6, testObject.scoreOfParentheses("(()(()))"));
    }
}