package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem15_ReverseWordsInAStringTest {

    private final Problem15_ReverseWordsInAString testObject = new Problem15_ReverseWordsInAString();

    @Test
    void testReverseWords() {
        String input = "the sky is blue";
        String expected = "blue is sky the";
        assertEquals(expected, testObject.reverseWords(input));

        input = "  hello world!  ";
        expected = "world! hello";
        assertEquals(expected, testObject.reverseWords(input));
    }
}