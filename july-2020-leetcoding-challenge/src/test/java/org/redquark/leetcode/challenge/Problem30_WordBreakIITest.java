package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem30_WordBreakIITest {

    private final Problem30_WordBreakII testObject = new Problem30_WordBreakII();

    @Test
    void testWordBreak() {
        String s = "catsanddog";
        List<String> wordDict = Arrays.asList("cat", "cats", "and", "sand", "dog");
        List<String> expected = Arrays.asList("cat sand dog", "cats and dog");
        assertEquals(expected, testObject.wordBreak(s, wordDict));

        s = "pineapplepenapple";
        wordDict = Arrays.asList("apple", "pen", "applepen", "pine", "pineapple");
        expected = Arrays.asList("pine apple pen apple", "pine applepen apple", "pineapple pen apple");
        assertEquals(expected, testObject.wordBreak(s, wordDict));

        s = "catsandog";
        wordDict = Arrays.asList("cats", "dog", "sand", "and", "cat");
        expected = Collections.emptyList();
        assertEquals(expected, testObject.wordBreak(s, wordDict));
    }
}