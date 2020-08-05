package org.redquark.leetcode.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem05_AddAndSearchWordTest {

    private final Problem05_AddAndSearchWord testObject = new Problem05_AddAndSearchWord();

    @Test
    void test() {
        testObject.addWord("bad");
        testObject.addWord("mad");
        testObject.addWord("dad");
        assertTrue(testObject.search("bad"));
        assertFalse(testObject.search("pad"));
        assertTrue(testObject.search(".ad"));
        assertTrue(testObject.search("b.."));
    }

}