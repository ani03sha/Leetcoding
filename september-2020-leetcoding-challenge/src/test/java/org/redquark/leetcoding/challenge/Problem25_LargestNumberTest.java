package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem25_LargestNumberTest {

    private final Problem25_LargestNumber testObject = new Problem25_LargestNumber();

    @Test
    void testLargestNumber() {
        int[] numbers = new int[]{10, 2};
        assertEquals("210", testObject.largestNumber(numbers));

        numbers = new int[]{3, 30, 34, 5, 9};
        assertEquals("9534330", testObject.largestNumber(numbers));
    }
}