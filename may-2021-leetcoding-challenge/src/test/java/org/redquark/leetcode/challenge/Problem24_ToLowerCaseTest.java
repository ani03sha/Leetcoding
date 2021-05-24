package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem24_ToLowerCaseTest {

    private final Problem24_ToLowerCase testObject = new Problem24_ToLowerCase();

    @Test
    void testToLowerCase() {
        String s = "Hello";
        assertEquals("hello", testObject.toLowerCase(s));

        s = "here";
        assertEquals("here", testObject.toLowerCase(s));

        s = "LOVEly";
        assertEquals("lovely", testObject.toLowerCase(s));
    }
}