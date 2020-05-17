package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem14_TrieTest {

    private final Problem14_Trie testObject = new Problem14_Trie();

    @Test
    void testTrieOperations() {
        String word = "anirudh";
        assertFalse(testObject.search(word));
        testObject.insert(word);
        assertTrue(testObject.search(word));
        assertTrue(testObject.startsWith("anir"));
    }
}