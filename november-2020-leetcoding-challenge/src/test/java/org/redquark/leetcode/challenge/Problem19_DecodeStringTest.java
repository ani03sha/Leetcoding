package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem19_DecodeStringTest {

    private final Problem19_DecodeString testObjet = new Problem19_DecodeString();

    @Test
    void testDecodeString() {
        assertEquals("aaabcbc", testObjet.decodeString("3[a]2[bc]"));
        assertEquals("accaccacc", testObjet.decodeString("3[a2[c]]"));
        assertEquals("abcabccdcdcdef", testObjet.decodeString("2[abc]3[cd]ef"));
        assertEquals("abccdcdcdxyz", testObjet.decodeString("abc3[cd]xyz"));
    }
}