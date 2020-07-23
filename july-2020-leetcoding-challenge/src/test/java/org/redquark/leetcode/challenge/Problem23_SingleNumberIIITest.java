package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem23_SingleNumberIIITest {

    private final Problem23_SingleNumberIII testObject = new Problem23_SingleNumberIII();

    @Test
    void testSingleNumber() {
        int[] numbers = new int[]{1, 2, 1, 3, 2, 5};
        int[] expected = new int[]{5, 3};
        assertArrayEquals(expected, testObject.singleNumber(numbers));
    }
}