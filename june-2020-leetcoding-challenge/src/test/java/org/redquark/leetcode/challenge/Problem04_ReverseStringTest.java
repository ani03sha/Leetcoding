package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem04_ReverseStringTest {

    private final Problem04_ReverseString testObject = new Problem04_ReverseString();

    @Test
    void testReverseString() {
        char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] expected = new char[]{'o', 'l', 'l', 'e', 'h'};
        assertArrayEquals(expected, testObject.reverseString(s));

        s = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};
        expected = new char[]{'h', 'a', 'n', 'n', 'a', 'H'};
        assertArrayEquals(expected, testObject.reverseString(s));
    }
}