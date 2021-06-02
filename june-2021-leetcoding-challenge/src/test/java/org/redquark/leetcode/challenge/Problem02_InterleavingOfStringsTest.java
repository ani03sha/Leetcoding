package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem02_InterleavingOfStringsTest {

    private final Problem02_InterleavingOfStrings testObject = new Problem02_InterleavingOfStrings();

    @Test
    void testIsInterleave() {
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";
        assertTrue(testObject.isInterleave(s1, s2, s3));

        s1 = "aabcc";
        s2 = "dbbca";
        s3 = "aadbbbaccc";
        assertFalse(testObject.isInterleave(s1, s2, s3));

        s1 = "";
        s2 = "";
        s3 = "";
        assertTrue(testObject.isInterleave(s1, s2, s3));
    }
}