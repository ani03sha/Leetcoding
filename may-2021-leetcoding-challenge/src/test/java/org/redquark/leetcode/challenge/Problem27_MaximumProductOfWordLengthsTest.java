package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem27_MaximumProductOfWordLengthsTest {

    private final Problem27_MaximumProductOfWordLengths testObject = new Problem27_MaximumProductOfWordLengths();

    @Test
    void testMaxProduct() {
        String[] words = new String[]{"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};
        assertEquals(16, testObject.maxProduct(words));

        words = new String[]{"a", "ab", "abc", "d", "cd", "bcd", "abcd"};
        assertEquals(4, testObject.maxProduct(words));

        words = new String[]{"a", "aa", "aaa", "aaaa"};
        assertEquals(0, testObject.maxProduct(words));
    }
}