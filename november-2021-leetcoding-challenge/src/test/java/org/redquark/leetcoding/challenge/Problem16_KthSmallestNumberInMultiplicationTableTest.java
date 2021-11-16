package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem16_KthSmallestNumberInMultiplicationTableTest {

    private final Problem16_KthSmallestNumberInMultiplicationTable testObject = new Problem16_KthSmallestNumberInMultiplicationTable();

    @Test
    void testFindKthNumber() {
        assertEquals(3, testObject.findKthNumber(3, 3, 5));
        assertEquals(6, testObject.findKthNumber(2, 3, 6));
    }
}