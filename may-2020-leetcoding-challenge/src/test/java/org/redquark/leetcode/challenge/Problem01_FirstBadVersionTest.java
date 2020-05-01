package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem01_FirstBadVersionTest {

    private final Problem01_FirstBadVersion testObject = new Problem01_FirstBadVersion();

    @Test
    void firstBadVersion() {
        assertEquals(4, testObject.firstBadVersion(5, 4));
        assertEquals(3, testObject.firstBadVersion(8, 3));
        assertEquals(4, testObject.firstBadVersion(4, 4));
        assertEquals(8, testObject.firstBadVersion(8, 11));
    }
}