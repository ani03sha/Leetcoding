package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem11_RemoveDuplicatesFromSortedArrayIITest {

    private final Problem11_RemoveDuplicatesFromSortedArrayII testObject =
            new Problem11_RemoveDuplicatesFromSortedArrayII();

    @Test
    void testRemoveDuplicates() {
        assertEquals(5, testObject.removeDuplicates(new int[]{1, 1, 1, 2, 2, 3}));
        assertEquals(7, testObject.removeDuplicates(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3}));
    }
}