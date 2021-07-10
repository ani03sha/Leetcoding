package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem10_DecodeWaysIITest {

    private final Problem10_DecodeWaysII testObject = new Problem10_DecodeWaysII();

    @Test
    void testNumDecodings() {
        String s = "*";
        assertEquals(9, testObject.numDecodings(s));

        s = "1*";
        assertEquals(18, testObject.numDecodings(s));

        s = "2*";
        assertEquals(15, testObject.numDecodings(s));
    }
}