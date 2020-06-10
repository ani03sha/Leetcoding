package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem10_SearchInsertPositionTest {

    private final Problem10_SearchInsertPosition testObject = new Problem10_SearchInsertPosition();

    @Test
    void testSearchInsert() {
        int[] numbers = {1, 3, 5, 6};
        assertEquals(2, testObject.searchInsert(numbers, 5));
        assertEquals(1, testObject.searchInsert(numbers, 2));
        assertEquals(4, testObject.searchInsert(numbers, 7));
        assertEquals(0, testObject.searchInsert(numbers, 0));
    }
}