package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem22_LongestWordInDictionaryThroughDeletingTest {

    private final Problem22_LongestWordInDictionaryThroughDeleting testObject =
            new Problem22_LongestWordInDictionaryThroughDeleting();

    @Test
    void testFindLongestWord() {
        String s = "abpcplea";
        List<String> d = Arrays.asList("ale", "apple", "monkey", "plea");
        assertEquals("apple", testObject.findLongestWord(s, d));

        s = "abpcplea";
        d = Arrays.asList("a", "b", "c");
        assertEquals("a", testObject.findLongestWord(s, d));
    }
}