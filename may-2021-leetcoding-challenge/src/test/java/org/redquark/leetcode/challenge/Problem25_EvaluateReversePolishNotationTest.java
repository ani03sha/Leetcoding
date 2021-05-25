package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem25_EvaluateReversePolishNotationTest {

    private final Problem25_EvaluateReversePolishNotation testObject = new Problem25_EvaluateReversePolishNotation();

    @Test
    void testEvalRPN() {
        String[] tokens = new String[]{"2", "1", "+", "3", "*"};
        assertEquals(9, testObject.evalRPN(tokens));

        tokens = new String[]{"4", "13", "5", "/", "+"};
        assertEquals(6, testObject.evalRPN(tokens));

        tokens = new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        assertEquals(22, testObject.evalRPN(tokens));
    }
}