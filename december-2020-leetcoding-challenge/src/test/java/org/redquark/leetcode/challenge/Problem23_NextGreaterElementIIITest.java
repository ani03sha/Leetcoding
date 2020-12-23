package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem23_NextGreaterElementIIITest {

    private final Problem23_NextGreaterElementIII testObject = new Problem23_NextGreaterElementIII();

    @Test
    void testNextGreaterElement() {
        assertEquals(21, testObject.nextGreaterElement(12));
        assertEquals(-1, testObject.nextGreaterElement(21));
    }
}