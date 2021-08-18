package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem18_DecodeWaysTest {

    private final Problem18_DecodeWays testObject = new Problem18_DecodeWays();

    @Test
    void testNumDecodings() {
        String s = "12";
        assertEquals(2, testObject.numDecodings(s));

        s = "226";
        assertEquals(3, testObject.numDecodings(s));

        s = "0";
        assertEquals(0, testObject.numDecodings(s));

        s = "06";
        assertEquals(0, testObject.numDecodings(s));
    }
}