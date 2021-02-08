package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem08_PeekingIteratorTest {

    @Test
    void testPeek() {
        Iterator<Integer> iterator = Arrays.asList(1, 2, 3).iterator();
        Problem08_PeekingIterator testObject = new Problem08_PeekingIterator(iterator);
        assertEquals(1, testObject.peek());
    }
}