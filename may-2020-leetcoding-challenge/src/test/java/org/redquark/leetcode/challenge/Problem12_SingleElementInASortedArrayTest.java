package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem12_SingleElementInASortedArrayTest {

    private final Problem12_SingleElementInASortedArray testObject = new Problem12_SingleElementInASortedArray();

    @Test
    void testSingleNonDuplicate() {
        int[] numbers = new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8};
        assertEquals(2, testObject.singleNonDuplicate(numbers));

        numbers = new int[]{1, 1, 2};
        assertEquals(2, testObject.singleNonDuplicate(numbers));
    }
}