package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem19_SequentialDigitsTest {

    private final Problem19_SequentialDigits testObject = new Problem19_SequentialDigits();

    @Test
    void testSequentialDigits() {
        int low = 100;
        int high = 300;
        assertEquals(Arrays.asList(123, 234), testObject.sequentialDigits(low, high));

        low = 1000;
        high = 13000;
        assertEquals(Arrays.asList(1234, 2345, 3456, 4567, 5678, 6789, 12345), testObject.sequentialDigits(low, high));
    }
}