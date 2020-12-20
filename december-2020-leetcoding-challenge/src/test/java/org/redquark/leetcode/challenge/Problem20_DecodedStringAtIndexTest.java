package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem20_DecodedStringAtIndexTest {

    private final Problem20_DecodedStringAtIndex testObject =
            new Problem20_DecodedStringAtIndex();

    @Test
    void testDecodeAtIndex() {
        String S = "leet2code3";
        int K = 10;
        assertEquals("o", testObject.decodeAtIndex(S, K));

        S = "ha22";
        K = 5;
        assertEquals("h", testObject.decodeAtIndex(S, K));

        S = "a2345678999999999999999";
        K = 1;
        assertEquals("a", testObject.decodeAtIndex(S, K));
    }
}