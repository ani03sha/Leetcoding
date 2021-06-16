package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem16_GenerateParenthesesTest {

    private final Problem16_GenerateParentheses testObject = new Problem16_GenerateParentheses();

    @Test
    void testGenerateParenthesis() {
        int n = 3;
        List<String> expected = Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()");
        assertEquals(expected, testObject.generateParenthesis(n));

        n = 1;
        expected = Collections.singletonList("()");
        assertEquals(expected, testObject.generateParenthesis(n));
    }
}