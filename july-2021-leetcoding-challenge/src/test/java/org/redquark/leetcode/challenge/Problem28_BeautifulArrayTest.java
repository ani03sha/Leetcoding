package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem28_BeautifulArrayTest {

    private final Problem28_BeautifulArray testObject = new Problem28_BeautifulArray();

    @Test
    void testBeautifulArray() {
        int[] expected = new int[]{1, 3, 2, 4};
        assertArrayEquals(expected, testObject.beautifulArray(4));

        expected = new int[]{1, 5, 3, 2, 4};
        assertArrayEquals(expected, testObject.beautifulArray(5));
    }
}