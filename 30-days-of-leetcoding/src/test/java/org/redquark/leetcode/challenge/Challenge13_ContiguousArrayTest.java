package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Challenge13_ContiguousArrayTest {

    private Challenge13_ContiguousArray testObject = new Challenge13_ContiguousArray();

    @Test
    void findMaxLength() {
        int[] numbers = new int[]{0, 1};
        assertEquals(2, testObject.findMaxLength(numbers));

        numbers = new int[]{0, 1, 0};
        assertEquals(2, testObject.findMaxLength(numbers));

        numbers = new int[]{0, 0, 1, 0, 0, 0, 1, 1};
        assertEquals(6, testObject.findMaxLength(numbers));
    }
}