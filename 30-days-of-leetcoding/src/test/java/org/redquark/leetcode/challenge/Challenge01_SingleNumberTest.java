package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Challenge01_SingleNumberTest {

    private Challenge01_SingleNumber testObject = new Challenge01_SingleNumber();

    @Test
    void testFindSingleNumber() {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1};
        assertEquals(5, testObject.findSingleNumber(numbers));

        numbers = new int[]{-1, 2, 4, 7, 3, 4, 7, 2, 5, 3, 5, -3, -9, -3, -6, -9, -6};
        assertEquals(-1, testObject.findSingleNumber(numbers));
    }
}