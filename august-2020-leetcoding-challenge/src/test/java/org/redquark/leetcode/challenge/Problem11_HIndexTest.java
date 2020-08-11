package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem11_HIndexTest {

    private final Problem11_HIndex testObject = new Problem11_HIndex();

    @Test
    void testHIndex() {
        int[] citations = {3, 0, 6, 1, 5};
        assertEquals(3, testObject.hIndex(citations));
    }
}