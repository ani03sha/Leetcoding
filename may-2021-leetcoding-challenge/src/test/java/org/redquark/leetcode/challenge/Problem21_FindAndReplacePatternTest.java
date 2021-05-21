package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem21_FindAndReplacePatternTest {

    private final Problem21_FindAndReplacePattern testObject = new Problem21_FindAndReplacePattern();

    @Test
    void testFindAndReplacePattern() {
        String[] words = new String[]{"abc", "deq", "mee", "aqq", "dkd", "ccc"};
        String pattern = "abb";
        List<String> expected = Arrays.asList("mee", "aqq");
        assertEquals(expected, testObject.findAndReplacePattern(words, pattern));

        words = new String[]{"a", "b", "c"};
        pattern = "a";
        expected = Arrays.asList("a", "b", "c");
        assertEquals(expected, testObject.findAndReplacePattern(words, pattern));
    }
}