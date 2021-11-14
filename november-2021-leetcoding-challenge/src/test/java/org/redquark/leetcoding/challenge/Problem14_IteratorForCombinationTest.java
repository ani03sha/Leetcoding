package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.redquark.leetcoding.challenge.Problem14_IteratorForCombination.CombinationIterator;

class Problem14_IteratorForCombinationTest {

    @Test
    void test() {
        CombinationIterator testObject = new CombinationIterator("abc", 2);
        assertEquals("ab", testObject.next());
        assertTrue(testObject.hasNext());
        assertEquals("ac", testObject.next());
        assertTrue(testObject.hasNext());
        assertEquals("bc", testObject.next());
        assertFalse(testObject.hasNext());
    }

}