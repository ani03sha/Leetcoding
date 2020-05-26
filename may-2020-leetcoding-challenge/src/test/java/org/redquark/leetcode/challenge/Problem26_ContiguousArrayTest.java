package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem26_ContiguousArrayTest {

    private final Problem26_ContiguousArray testObject = new Problem26_ContiguousArray();

    @Test
    void testFindMaxLength() {

        int[] numbers = new int[]{0, 1};
        assertEquals(2, testObject.findMaxLength(numbers));

        numbers = new int[]{1, 0, 1};
        assertEquals(2, testObject.findMaxLength(numbers));
    }
}