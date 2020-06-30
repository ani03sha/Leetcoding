package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem30_WordSearchIITest {

    private final Problem30_WordSearchII testObject = new Problem30_WordSearchII();

    @Test
    void testFindWords() {
        char[][] board = {
                {'o', 'a', 'a', 'n'},
                {'e', 't', 'a', 'e'},
                {'i', 'h', 'k', 'r'},
                {'i', 'f', 'l', 'v'}
        };
        String[] words = {"oath", "pea", "eat", "rain"};
        List<String> expected = Arrays.asList("eat", "oath");
        assertEquals(expected, testObject.findWords(board, words));
    }
}