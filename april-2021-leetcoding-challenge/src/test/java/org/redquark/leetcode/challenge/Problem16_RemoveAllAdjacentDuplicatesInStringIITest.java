package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem16_RemoveAllAdjacentDuplicatesInStringIITest {

    private final Problem16_RemoveAllAdjacentDuplicatesInStringII testObject =
            new Problem16_RemoveAllAdjacentDuplicatesInStringII();

    @Test
    void testRemoveDuplicates() {
        String s = "abcd";
        int k = 2;
        assertEquals("abcd", testObject.removeDuplicates(s, k));

        s = "deeedbbcccbdaa";
        k = 3;
        assertEquals("aa", testObject.removeDuplicates(s, k));

        s = "pbbcggttciiippooaais";
        k = 2;
        assertEquals("ps", testObject.removeDuplicates(s, k));
    }
}