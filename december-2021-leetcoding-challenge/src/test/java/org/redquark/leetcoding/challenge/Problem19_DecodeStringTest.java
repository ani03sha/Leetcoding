package org.redquark.leetcoding.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem19_DecodeStringTest {

    private final Problem19_DecodeString testObject = new Problem19_DecodeString();

    @Test
    void testDecodeString() {
        String s = "3[a]2[bc]";
        assertEquals("aaabcbc", testObject.decodeString(s));

        s = "3[a2[c]]";
        assertEquals("accaccacc", testObject.decodeString(s));

        s = "2[abc]3[cd]ef";
        assertEquals("abcabccdcdcdef", testObject.decodeString(s));

        s = "abc3[cd]xyz";
        assertEquals("abccdcdcdxyz", testObject.decodeString(s));
    }
}