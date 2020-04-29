package org.redquark.leetcode.learn.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem07_RemoveDuplicatesFromSortedArrayTest {

    private final Problem07_RemoveDuplicatesFromSortedArray testObject = new Problem07_RemoveDuplicatesFromSortedArray();

    @Test
    void testRemoveDuplicates() {
        int[] numbers = new int[]{1, 1, 2};
        assertEquals(2, testObject.removeDuplicates(numbers));

        numbers = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        assertEquals(5, testObject.removeDuplicates(numbers));

        numbers = new int[]{1};
        assertEquals(1, testObject.removeDuplicates(numbers));

        numbers = new int[]{};
        assertEquals(0, testObject.removeDuplicates(numbers));

        numbers = new int[]{1, 1, 1, 1};
        assertEquals(1, testObject.removeDuplicates(numbers));
    }
}