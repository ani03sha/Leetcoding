package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem22_SingleNumberIITest {

    private final Problem22_SingleNumberII testObject = new Problem22_SingleNumberII();

    @Test
    void testSingleNumber() {
        int[] numbers = new int[]{2, 2, 3, 2};
        assertEquals(3, testObject.singleNumber(numbers));

        numbers = new int[]{0, 1, 0, 1, 0, 1, 99};
        assertEquals(99, testObject.singleNumber(numbers));
    }
}