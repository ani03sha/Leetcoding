package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.redquark.leetcode.challenge.Problem13_FlattenNestedListIterator.NestedIterator;

class Problem13_FlattenNestedListIteratorTest {

    @Test
    void test() {
        NestedIterator iterator = new NestedIterator(null);
        assertFalse(iterator.hasNext());
        assertNull(iterator.next());
    }

}