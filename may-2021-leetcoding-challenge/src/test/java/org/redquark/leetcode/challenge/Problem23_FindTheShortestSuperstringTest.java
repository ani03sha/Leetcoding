package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem23_FindTheShortestSuperstringTest {

    private final Problem23_FindTheShortestSuperstring testObject = new Problem23_FindTheShortestSuperstring();

    @Test
    void testShortestSuperstring() {
        String[] words = new String[]{"alex", "loves", "leetcode"};
        assertEquals("leetcodelovesalex", testObject.shortestSuperstring(words));

        words = new String[]{"catg", "ctaagt", "gcta", "ttca", "atgcatc"};
        assertEquals("gctaagttcatgcatc", testObject.shortestSuperstring(words));
    }
}