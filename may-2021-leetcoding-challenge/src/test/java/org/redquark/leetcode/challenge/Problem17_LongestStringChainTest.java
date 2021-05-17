package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem17_LongestStringChainTest {

    private final Problem17_LongestStringChain testObject = new Problem17_LongestStringChain();

    @Test
    void testLongestStrChain() {
        String[] words = new String[]{"a", "b", "ba", "bca", "bda", "bdca"};
        assertEquals(4, testObject.longestStrChain(words));

        words = new String[]{"xbc", "pcxbcf", "xb", "cxbc", "pcxbc"};
        assertEquals(5, testObject.longestStrChain(words));
    }
}