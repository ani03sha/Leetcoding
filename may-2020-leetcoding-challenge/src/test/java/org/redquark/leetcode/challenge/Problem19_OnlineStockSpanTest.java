package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem19_OnlineStockSpanTest {

    private final Problem19_OnlineStockSpan testObject = new Problem19_OnlineStockSpan();

    @Test
    void testNext() {
        assertEquals(1, testObject.next(100));
        assertEquals(1, testObject.next(80));
        assertEquals(1, testObject.next(60));
        assertEquals(2, testObject.next(70));
        assertEquals(1, testObject.next(60));
        assertEquals(4, testObject.next(75));
        assertEquals(6, testObject.next(85));
    }
}