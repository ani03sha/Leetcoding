package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem24_FindTheDifferenceTest {

    private final Problem24_FindTheDifference testObject = new Problem24_FindTheDifference();

    @Test
    void testFindTheDifference() {
        String s = "abcd";
        String t = "abcde";
        assertEquals('e', testObject.findTheDifference(s, t));

        s = "aa";
        t = "aaa";
        assertEquals('a', testObject.findTheDifference(s, t));
    }
}