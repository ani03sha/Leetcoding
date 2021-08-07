package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem07_PalindromePartitioningIITest {

    private final Problem07_PalindromePartitioningII testObject = new Problem07_PalindromePartitioningII();

    @Test
    void testMinCut() {
        String s = "aab";
        assertEquals(1, testObject.minCut(s));

        s = "a";
        assertEquals(0, testObject.minCut(s));

        s = "ab";
        assertEquals(1, testObject.minCut(s));
    }
}