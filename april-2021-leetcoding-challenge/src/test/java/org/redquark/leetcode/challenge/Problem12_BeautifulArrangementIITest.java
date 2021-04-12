package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem12_BeautifulArrangementIITest {

    private final Problem12_BeautifulArrangementII testObject = new Problem12_BeautifulArrangementII();

    @Test
    void testConstructArray() {
        int[] expected = new int[]{1, 2, 3};
        assertArrayEquals(expected, testObject.constructArray(3, 1));

        expected = new int[]{1, 3, 2};
        assertArrayEquals(expected, testObject.constructArray(3, 2));
    }
}