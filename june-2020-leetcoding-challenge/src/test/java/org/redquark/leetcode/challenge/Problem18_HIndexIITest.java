package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem18_HIndexIITest {

    private final Problem18_HIndexII testObject = new Problem18_HIndexII();

    @Test
    void testHIndex() {
        int[] citations = new int[]{0, 1, 3, 5, 6};
        assertEquals(3, testObject.hIndex(citations));
    }
}