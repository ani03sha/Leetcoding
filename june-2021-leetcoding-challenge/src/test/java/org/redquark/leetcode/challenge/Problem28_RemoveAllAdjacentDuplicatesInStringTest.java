package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem28_RemoveAllAdjacentDuplicatesInStringTest {

    private final Problem28_RemoveAllAdjacentDuplicatesInString testObject =
            new Problem28_RemoveAllAdjacentDuplicatesInString();

    @Test
    void testRemoveDuplicates() {
        String s = "abbaca";
        assertEquals("ca", testObject.removeDuplicates(s));

        s = "azxxzy";
        assertEquals("ay", testObject.removeDuplicates(s));
    }
}