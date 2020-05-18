package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem18_PermutationInStringTest {

    private final Problem18_PermutationInString testObject = new Problem18_PermutationInString();

    @Test
    void testCheckInclusion() {
        String s1 = "ab";
        String s2 = "eidbaooo";
        assertTrue(testObject.checkInclusion(s1, s2));

        s1 = "ab";
        s2 = "eidboaoo";
        assertFalse(testObject.checkInclusion(s1, s2));
    }
}