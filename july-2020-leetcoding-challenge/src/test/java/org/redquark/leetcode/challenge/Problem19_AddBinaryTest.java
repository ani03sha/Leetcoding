package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem19_AddBinaryTest {

    private final Problem19_AddBinary testObject = new Problem19_AddBinary();

    @Test
    void testAddBinary() {
        String a = "11";
        String b = "1";
        assertEquals("100", testObject.addBinary(a, b));

        a = "1010";
        b = "1011";
        assertEquals("10101", testObject.addBinary(a, b));
    }
}